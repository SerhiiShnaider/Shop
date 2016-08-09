package com.gmail.shnapi007.controllers;

import com.gmail.shnapi007.entity.Product;
import com.gmail.shnapi007.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/newProduct", method = RequestMethod.GET)
    private String newProduct(){
        return "newProduct";
    }

    @RequestMapping(value = "/allProducts", method = RequestMethod.GET)
    private String productsAll(Model model){
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "allProducts";
    }
    @RequestMapping(value = "createProduct", method = RequestMethod.POST)
    private String createNewProdact(@RequestParam("productName") String productName, @RequestParam("model") String model, @RequestParam("cost") int cost, @RequestParam("description") String description){
        productService.add(productName,model,description,cost);
        return "redirect:/allProducts";
    }

    @RequestMapping(value = "/product={id}", method = RequestMethod.GET)
    private String productInfo(Model model, @PathVariable String id){
        Product product = productService.findById(Integer.parseInt(id));
        model.addAttribute("product", product);
        return "product-page";
    }
}
