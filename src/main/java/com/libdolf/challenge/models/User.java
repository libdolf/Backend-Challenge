package com.libdolf.challenge.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private int age;

    private char sex;

    private String[] location = new String[2];

    private boolean baned;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Inventory inventory;
}
