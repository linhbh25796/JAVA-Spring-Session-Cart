package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @ModelAttribute("products")
    public Iterable<Product> products() {
        return productService.findAll();
    }

    //Create product page controller
    @GetMapping("/create-product")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/product/create");
        modelAndView.addObject("productCreated", new Product());
        return modelAndView;
    }

    @PostMapping("/create-product")
//    @Transactional
    public ModelAndView saveProduct(@ModelAttribute("productCreated") Product product) {
        productService.save(product);

        ModelAndView modelAndView = new ModelAndView("/product/create");
        modelAndView.addObject("productCreated", new Product());
        modelAndView.addObject("message", "New product is added");

        return modelAndView;
    }

    //List product
    @GetMapping("/products")
    public ModelAndView listProducts() {
        System.out.println(">>> call product api");
        Iterable<Product> products = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("/product/listProduct");
        modelAndView.addObject("products",products);
        return modelAndView;
    }


}
