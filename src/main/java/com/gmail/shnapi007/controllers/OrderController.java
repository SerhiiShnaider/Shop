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

    @RequestMapping(value = "/basketdel={productId}", method = RequestMethod.GET)
    private String removeFromBasket(@PathVariable String productId, HttpSession httpSession) {
        List<Product> productList = (List<Product>) httpSession.getAttribute("products");
        Product product = productService.findById(Integer.parseInt(productId));
        Iterator<Product> iter = productList.iterator();
        int count = 0;
        while (iter.hasNext()) {
            if (iter.next().getId() == product.getId() && (count == 0)) {
                iter.remove();
                count++;
            }
            productList = (List<Product>) httpSession.getAttribute("products");
        }

        return "redirect:/basket";
    }

    @RequestMapping(value = "/basketdelall",method = RequestMethod.GET)
    private String removeAllFromBasket(HttpSession httpSession){
        List<Product> productList = (List<Product>)httpSession.getAttribute("products");
        productList.clear();
        return "redirect:/basket";
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    private String addToOrder(HttpSession httpSession, Model model, Principal principal) {
        List<Product> productList = (List<Product>) httpSession.getAttribute("products");
        orderService.add(productList, principal.getName());
        model.addAttribute("products", productList);
        return "order";
    }
}
