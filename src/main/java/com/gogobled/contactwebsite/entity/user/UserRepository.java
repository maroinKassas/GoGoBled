package com.gogobled.contactwebsite.entity.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findUserByEmail(final String email);

    void deleteByEmail(final String email);
}
