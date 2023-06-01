package com.libdolf.challenge.services;

//import com.libdolf.challenge.repositories.ItemRepository;
import com.libdolf.challenge.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppService {
    UserRepository userRepository;
//    ItemRepository inventoryRepository;
}
