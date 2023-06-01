package com.libdolf.challenge.models;

import com.libdolf.challenge.repositories.UserRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer fijiWater;
    private Integer campbellSoup;
    private Integer firstAidPouch;
    private Integer ak47;

    @OneToOne(mappedBy = "id")
    private User user;
}

