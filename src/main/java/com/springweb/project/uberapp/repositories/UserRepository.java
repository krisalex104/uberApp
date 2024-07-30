package com.springweb.project.uberapp.repositories;

import com.springweb.project.uberapp.enities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
