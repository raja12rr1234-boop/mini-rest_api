package com.ecoooo.eco.com.ma.controller;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecoooo.eco.com.ma.dto.RequP;
import com.ecoooo.eco.com.ma.dto.Responsee;
import com.ecoooo.eco.com.ma.service.Serviceinterface;

import java.util.List;

@RestController
@RequestMapping("api/v1/Product")
@CrossOrigin

public class ProductController {

    @Autowired
    private Serviceinterface serviceinterface;

    @GetMapping
    public List<Responsee> getAll() {
        return serviceinterface.findAll();
    }

    @GetMapping("/{id}")
    public Responsee findById(Integer id) {
        return serviceinterface.findById(id);
    }

    @PostMapping
    public Responsee save(@RequestBody RequP requP) {
        return serviceinterface.save(requP);
    }

    @DeleteMapping("/{id}")
    public Responsee delete(Integer id) {
        return serviceinterface.delete(id);
    }

    @PostMapping("/{id}")
    public Responsee update(@PathVariable("id") Integer id, @RequestBody @Valid RequP requP) {
        return serviceinterface.update(requP, id);
    }
}
