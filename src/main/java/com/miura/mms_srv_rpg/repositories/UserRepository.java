package com.miura.mms_srv_rpg.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miura.mms_srv_rpg.domain.user.User;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);

}
