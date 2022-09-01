package com.sookshmas.ecommerce.controller;

import com.sookshmas.ecommerce.dao.OrderDAO;
import com.sookshmas.ecommerce.dao.ProductDAO;
import com.sookshmas.ecommerce.form.CustomerForm;
import com.sookshmas.ecommerce.model.CartInfo;
import com.sookshmas.ecommerce.model.ProductInfo;
import com.sookshmas.ecommerce.pagination.PaginationResult;
import com.sookshmas.ecommerce.validator.CustomerFormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@Transactional
public class MainController {
    @Autowired
    private OrderDAO orderDAO;
    @Autowired
    private ProductDAO productDAO;
    @Autowired
    private CustomerFormValidator customerFormValidator;
    @InitBinder
    public void myInitBinder(WebDataBinder dataBinder) {
        Object target = dataBinder.getTarget();
        if (target == null) {
            return;
        }
        System.out.println("Target = " + target);
        if (target.getClass() == CartInfo.class) {

        }
        else if (target.getClass() == CustomerForm.class) {
            dataBinder.setValidator(customerFormValidator);
        }
    }

    public String accessDenied() {
        return "/403";
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping({"/productList"})
    public String listProductHandler(Model model,
                                     @RequestParam(value = "name", defaultValue = "") String likeName,
                                     @RequestParam(value = "page", defaultValue = "1") int page) {
        final int maxResult = 5;
        final int maxNavigationPage = 10;
        PaginationResult<ProductInfo> result = productDAO.queryProducts(page,
                maxResult,
                maxNavigationPage,
                likeName);
        model.addAttribute("paginationProducts", result);
        return "productList";
    }

    @RequestMapping({"/buyProduct"})
    public String listProductHandler(HttpServletRequest request,
                                     Model model,
                                     @RequestParam(value = "code", defaultValue = "")String code) {

    }
}
