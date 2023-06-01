package com.libdolf.challenge.repositories;

import com.libdolf.challenge.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Inventory findByUser(UUID id);
    Integer findFijiWaterQuantity();
}
