package com.example.dao;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){
        Product prod = new Product();

        prod.setProdName("box");
        prod.setProdCategory("misc");
        prod.setProdCondition("perfect");
        prod.setProdDescription("very good, booii");
        prod.setProdManufacturer("Lenovo");
        prod.setProdPrice(69.69);
        prod.setProdStatus("Good");
        prod.setProdUnitInStock(69);

        productList = new ArrayList<Product>();
        productList.add(prod);

        return productList;
    }
}
