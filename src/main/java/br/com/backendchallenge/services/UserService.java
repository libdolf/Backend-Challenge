package br.com.backendchallenge.services;

import br.com.backendchallenge.DTOs.UserDTO;
import br.com.backendchallenge.DTOs.UserRequestDTO;
import br.com.backendchallenge.exceptions.NotFoundException;
import br.com.backendchallenge.models.User;
import br.com.backendchallenge.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository repository;


    public User findById(Long id){
        Optional<User> optional = repository.findById(id);
        return optional.orElseThrow(()-> new NotFoundException("User Not Found"));
    }
    public void save(UserRequestDTO userRequestDTO){
        User user = userRequestDTO.toEntity();
        repository.save(user);
    }


}
