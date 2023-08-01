package com.opprop.api.controllers;

import com.opprop.api.models.Property;
import com.opprop.api.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    PropertyService service;

    @GetMapping({"", "/"})
    public List<Property> getAll(){
        return service.getAll();
    }

    @PostMapping({"", "/"})
    public Property create(@RequestBody Property property){
        return service.createProperty(property);
    }

    @GetMapping("/{id}")
    public Property getByID(@PathVariable("id") Long id){
        return service.getByID(id);
    }
    @DeleteMapping("/{id}")
    public Property deleteByID(@PathVariable("id") Long id){
        return service.deleteByID(id);
    }

}
