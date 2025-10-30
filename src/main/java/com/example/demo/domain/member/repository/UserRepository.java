package com.example.demo.domain.member.repository;

import com.example.demo.domain.member.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    List<User> findByCreatedAtAfterOrderByUsernameAsc(LocalDateTime dateTime);

    long countByName(String name);

    @Query("SELECT u FROM User u WHERE u.email = :email")
    Optional<User> findUserByEmail(@Param("email") String email);

    @Query(value = "SELECT * FROM user WHERE username = ?1", nativeQuery = true)
    User findByUsernameNative(String username);
}
