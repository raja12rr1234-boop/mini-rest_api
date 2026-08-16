package com.ecoooo.eco.com.ma.service;

import java.util.List;

import com.ecoooo.eco.com.ma.dto.RequP;
import com.ecoooo.eco.com.ma.dto.Responsee;


public interface Serviceinterface  {
    public List<Responsee> findAll();
    public Responsee findById(Integer id);
    public Responsee save(RequP requP);
    public Responsee delete(int id);
    public Responsee update(RequP requP , Integer id);

}
