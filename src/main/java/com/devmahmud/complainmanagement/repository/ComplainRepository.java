package com.devmahmud.complainmanagement.repository;

import com.devmahmud.complainmanagement.entity.Complain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplainRepository extends JpaRepository<Complain, Long> {
}
