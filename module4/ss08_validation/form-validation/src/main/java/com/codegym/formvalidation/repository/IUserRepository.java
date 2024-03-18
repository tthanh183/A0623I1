package com.codegym.formvalidation.repository;

import com.codegym.formvalidation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
