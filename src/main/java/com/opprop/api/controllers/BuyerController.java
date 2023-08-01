package com.opprop.api.controllers;

import com.opprop.api.models.Buyer;
import com.opprop.api.services.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buyers")
public class BuyerController {

    @Autowired
    BuyerService service;

    @GetMapping({"", "/"})
    public List<Buyer> getAll(){
        return service.getAll();
    }

    @PostMapping({"", "/"})
    public Buyer create(@RequestBody Buyer buyer){
        return service.createBuyer(buyer);
    }

    @PutMapping("/{id}") Buyer update(@PathVariable("id") Long id, @RequestBody Buyer buyer) { return null; }

    @GetMapping("/{id}")
    public Buyer getByID(@PathVariable("id") Long id){
        return service.getByID(id);
    }
    @DeleteMapping("/{id}")
    public Buyer deleteByID(@PathVariable("id") Long id){
        return service.deleteByID(id);
    }

}
