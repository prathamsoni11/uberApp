package com.prathamsoni.project.uber.uberApp.repositories;

import com.prathamsoni.project.uber.uberApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
