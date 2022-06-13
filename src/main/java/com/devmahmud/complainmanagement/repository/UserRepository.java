package com.devmahmud.complainmanagement.repository;

import com.devmahmud.complainmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long > {
}
