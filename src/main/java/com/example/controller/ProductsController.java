package com.example.controller;

import com.example.dao.ProductDao;
import com.example.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductsController {

    private ProductDao productDao = new ProductDao();

    @RequestMapping("/products")
    public String getProducts(Model model){
        List<Product> productList = productDao.getProductList();
        Product product = productList.get(0);
        model.addAttribute(product);

        return "products";
    }
}
