package com.ecoooo.eco.com.ma.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequP {

    @NotBlank(message = " le name is note fundd")
    private String name;
    @NotBlank(message = "le descrption is note fund")
    private String descrption;

    @NotBlank(message = "image is note fund")
    private String image;
    @NotNull(message = "price is not fund")
     private Double price;
}
