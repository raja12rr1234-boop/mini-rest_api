package com.ecoooo.eco.com.ma.dto;


import com.ecoooo.eco.com.ma.entyte.Product;

public class Mapperrr {

    public Responsee toResponse(Product product){
        if (product == null){
            return null;
        }
        return new Responsee(
        product.getId(),
        product.getName(),
        product.getImage(),
        product.getPrice()
        );
    }
    public Product toEntyte(RequP requP){
        if (requP == null){
            return null;
        }
       Product product = new Product();

        product.setName(requP.getName());
        product.setImage(requP.getImage());
        product.setPrice(requP.getPrice());
        return product;
    }
}
