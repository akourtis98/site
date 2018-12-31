package com.example.dao;

import com.example.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){
        Product prod = new Product();

        prod.setProdId("P123");
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

    public Product getProductById(String productId) throws IOException {
        for (Product product: getProductList()) {
            if(product.getProdId().equals(productId)) {
                return product;
            }
        }

        throw new IOException("No product found.");
    }
}
