package com.devmahmud.complainmanagement.service;

import com.devmahmud.complainmanagement.entity.Complain;

import java.util.List;

public interface ComplainService {
    Boolean add(Complain complain);

    List<Complain> getAllComplains();

    Complain getComplainById(Long id);
}
