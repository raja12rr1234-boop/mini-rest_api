package com.ecoooo.eco.com.ma.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoooo.eco.com.ma.dto.Mapperrr;
import com.ecoooo.eco.com.ma.dto.RequP;
import com.ecoooo.eco.com.ma.dto.Responsee;
import com.ecoooo.eco.com.ma.entyte.Product;
import com.ecoooo.eco.com.ma.repository.ProductRepository;

import java.util.List;

@Service
public class Serviceimplimentation  implements Serviceinterface{

     @Autowired
    private ProductRepository productRepository;
     private Mapperrr mapperrr ;
@Override
     public List<Responsee> findAll(){
         return productRepository.findAll()
                 .stream()
                 .map(mapperrr::toResponse)
                 .toList();
     }
@Override
     public Responsee findById(Integer id){
         Product product = productRepository.findById(id)
                 .orElseThrow(()-> new RuntimeException("product is not found"));

         return mapperrr.toResponse(product);

     }
     @Override
     public Responsee save(RequP requP){

         Product product = mapperrr.toEntyte(requP);
         Product savedProduct = productRepository.save(product);
         return  mapperrr.toResponse(savedProduct);
     }
     @Override

      public  Responsee delete(int id){
          Product product = productRepository.findById(id)
                  .orElseThrow(()-> new RuntimeException("product is double"+ id));

           productRepository.deleteById(id);
           return mapperrr.toResponse(product);

      }
      @Override
      public Responsee update(RequP requP , Integer id){
          Product product = productRepository.findById(id)
                  .orElseThrow(()-> new RuntimeException("product is  double "+ id));
         Product pro = mapperrr.toEntyte(requP);
         pro.setName(requP.getName());
         pro.setDescription(requP.getDescrption());
         pro.setImage(requP.getImage());
         pro.setPrice(requP.getPrice());
         Product updatedProduct = productRepository.save(pro);


          return mapperrr.toResponse(updatedProduct);
      }
}
