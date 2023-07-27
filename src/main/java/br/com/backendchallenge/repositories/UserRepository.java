package br.com.backendchallenge.repositories;

import br.com.backendchallenge.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
