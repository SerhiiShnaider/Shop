package com.gmail.shnapi007.controllers;

import com.gmail.shnapi007.entity.Product;
import com.gmail.shnapi007.services.OrderService;
import com.gmail.shnapi007.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Elvis on 03.08.2016.
 */
@Controller
public class OrderController {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/basket={id}", method = RequestMethod.GET)
    private String addToBasket(@PathVariable String id, HttpSession httpSession) {
        List<Product> productList = (List<Product>) httpSession.getAttribute("products");
        Product product = productService.findById(Integer.parseInt(id));
        if (productList == null)
            productList = new ArrayList<Product>();
        productList.add(product);
        httpSession.setAttribute("products", productList);
        return "redirect:/allProducts";
    }

    @RequestMapping(value = "/basket", method = RequestMethod.GET)
    private String basket(Model model, HttpSession httpSession) {
        List<Product> productList = (List<Product>) httpSession.getAttribute("products");
        model.addAttribute("products", productList);
        return "basket";
    }

    @RequestMapping(value = "/basketdel={product_id}", method = RequestMethod.GET)
    private String removeFromBasket(@PathVariable String product_id, HttpSession httpSession) {
        List<Product> productList =(List<Product>) httpSession.getAttribute("products");
        Product product = productService.findById(Integer.parseInt(product_id));
        Iterator<Product> iter = productList.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId()==product.getId()){
                iter.remove();
            }
            productList = (List<Product>) httpSession.getAttribute("products");
        }
        return "redirect:/basket";
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    private String addToOrder(HttpSession httpSession, Model model, Principal principal) {
        System.out.println(1);
        List<Product> productList = (List<Product>) httpSession.getAttribute("products");
        System.out.println(2);
        System.out.println(productList);
        System.out.println(principal.getName());
        orderService.add(productList, principal.getName());
        System.out.println(3);
        model.addAttribute("products", productList);
        return "order";
    }

}
