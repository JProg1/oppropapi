package com.opprop.api.repositories;

import com.opprop.api.models.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerInterface extends JpaRepository<Buyer, Long> {
}
