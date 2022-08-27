package com.seb39.pre32.MyStackOverFlow.users.repository;

import com.seb39.pre32.MyStackOverFlow.users.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email);
}
