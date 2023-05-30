package com.libdolf.challenge.repositories;

import com.libdolf.challenge.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
