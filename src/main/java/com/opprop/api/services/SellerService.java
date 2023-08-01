package com.opprop.api.services;

import com.opprop.api.models.Seller;
import com.opprop.api.repositories.SellerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellerService {

    @Autowired
    SellerInterface repo;

    public Seller createSeller(Seller seller){
        return repo.save(seller);
    }

    public Seller getByID(Long id){
        Optional<Seller> optionalSeller = repo.findById(id);

        return optionalSeller.orElse(null);
    }

    public List<Seller> getAll(){
        return repo.findAll();
    }

    public Seller deleteByID(Long id){
        if(repo.findById(id).isPresent()){
            Seller temp = repo.findById(id).get();
            repo.deleteById(id);
            return temp;
        }
        else
        {
            return null;
        }
    }

}
