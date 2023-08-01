package com.opprop.api.repositories;

import com.opprop.api.models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerInterface extends JpaRepository<Seller, Long> {
}
