package com.opprop.api.services;

import com.opprop.api.models.Buyer;
import com.opprop.api.models.Seller;
import com.opprop.api.repositories.BuyerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {
    @Autowired
    BuyerInterface repo;

    public List<Buyer> getAll() {
        return repo.findAll();
    }

    public Buyer createBuyer(Buyer buyer) {
        return repo.save(buyer);
    }

    public Buyer getByID(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Buyer deleteByID(Long id) {
        if(repo.findById(id).isPresent()){
            Buyer temp = repo.findById(id).get();
            repo.deleteById(id);
            return temp;
        }
        else
        {
            return null;
        }
    }
}
