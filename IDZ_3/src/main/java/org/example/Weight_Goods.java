package org.example;


public class Weight_Goods extends Product {
    public Weight_Goods(Product product) {
        super(product.GetProductName(), product.GetProductDescription());
    }
}
