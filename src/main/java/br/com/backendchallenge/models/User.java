package br.com.backendchallenge.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tb-user")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    private Double latitude;

    private Double longitude;

    public enum Gender {
        MALE, FEMALE, OTHER
    }
}
