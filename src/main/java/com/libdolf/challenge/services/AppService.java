package com.libdolf.challenge.services;

import com.libdolf.challenge.models.Inventory;
import com.libdolf.challenge.models.User;
import com.libdolf.challenge.repositories.InventoryRepository;
import com.libdolf.challenge.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppService {
    UserRepository userRepository;
    InventoryRepository inventoryRepository;
    public void trade(User user1, User user2,){
        Inventory inventoryUser1 = inventoryRepository.findByUser(user1.getId());
        Inventory inventoryUser2 = inventoryRepository.findByUser(user2.getId());
        inventoryUser1.

    }



}
