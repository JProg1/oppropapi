package com.opprop.api.services;

import com.opprop.api.models.Property;
import com.opprop.api.models.Seller;
import com.opprop.api.repositories.PropertyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyService {

    @Autowired
    PropertyInterface repo;

    public List<Property> getAll() {
        return repo.findAll();
    }

    public Property createProperty(Property property) {
        return repo.save(property);
    }

    public Property getByID(Long id) {
        Optional<Property> optionalProperty = repo.findById(id);

        return optionalProperty.orElse(null);
    }

    public Property deleteByID(Long id) {
        if(repo.findById(id).isPresent()){
            Property temp = repo.findById(id).get();
            repo.deleteById(id);
            return temp;
        }
        else
        {
            return null;
        }
    }
}
