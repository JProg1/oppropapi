package com.opprop.api.repositories;

import com.opprop.api.models.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyInterface extends JpaRepository<Property, Long> {
}
