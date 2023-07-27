package br.com.backendchallenge.DTOs;

import br.com.backendchallenge.models.User;

public class UserRequestDTO extends UserDTO{
    public User toEntity(){
        return User.builder()
                .name(super.name)
                .age(super.age)
                .gender(super.gender)
                .latitude(super.latitude)
                .longitude(super.longitude)
                .build();
    }
}
