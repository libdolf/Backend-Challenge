package br.com.backendchallenge.DTOs;

import br.com.backendchallenge.models.User;
import br.com.backendchallenge.models.User.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
    protected Long id;
    protected String name;
    protected Integer age;
    protected Gender gender;
    protected Double latitude;
    protected Double longitude;


    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.age = user.getAge();
        this.gender = user.getGender();
        this.latitude = user.getLatitude();
        this.longitude = user.getLongitude();
    }
}
