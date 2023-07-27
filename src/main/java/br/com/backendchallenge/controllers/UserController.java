package br.com.backendchallenge.controllers;

import br.com.backendchallenge.DTOs.UserDTO;
import br.com.backendchallenge.DTOs.UserRequestDTO;
import br.com.backendchallenge.models.User;
import br.com.backendchallenge.repositories.UserRepository;
import br.com.backendchallenge.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    private UserRepository repository;
    private UserService service;


    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable("id") Long id){
        User user = service.findById(id);
        return ResponseEntity.ok(new UserDTO(user));
    }
    @PostMapping (value = "/save")
    private ResponseEntity<UserRequestDTO> save(@RequestBody UserRequestDTO userRequestDTO){
        service.save(userRequestDTO);
        return ResponseEntity.ok(userRequestDTO);
    }
}
