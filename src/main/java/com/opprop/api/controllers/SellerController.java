package com.opprop.api.controllers;

import com.opprop.api.models.Seller;
import com.opprop.api.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    SellerService service;

    @GetMapping({"", "/"})
    public List<Seller> getAll(){
        return service.getAll();
    }

    @PostMapping({"", "/"})
    public Seller create(@RequestBody Seller seller){
        return service.createSeller(seller);
    }

    @GetMapping("/{id}")
    public Seller getByID(@PathVariable("id") Long id){
        return service.getByID(id);
    }
    @DeleteMapping("/{id}")
    public Seller deleteByID(@PathVariable("id") Long id){
        return service.deleteByID(id);
    }

}
