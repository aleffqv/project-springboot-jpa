package com.aleffmota.project_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aleffmota.project_spring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
