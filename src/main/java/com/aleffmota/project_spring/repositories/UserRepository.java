package com.aleffmota.project_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aleffmota.project_spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
