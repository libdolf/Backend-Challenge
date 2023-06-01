package com.libdolf.challenge.inventory;

import com.libdolf.challenge.repositories.InventoryRepository;
import lombok.Data;

@Data
public class FijiWater {
    InventoryRepository repository;
    private static final String NAME = "Fiji Water";
    private static final int VALUE = 14;
    private int quantity = repository.findByFijiWater();
}
