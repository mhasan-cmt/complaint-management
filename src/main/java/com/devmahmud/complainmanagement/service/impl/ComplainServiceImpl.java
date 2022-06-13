package com.devmahmud.complainmanagement.service.impl;

import com.devmahmud.complainmanagement.entity.Complain;
import com.devmahmud.complainmanagement.repository.ComplainRepository;
import com.devmahmud.complainmanagement.service.ComplainService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplainServiceImpl implements ComplainService {
    private final ComplainRepository complainRepository;

    public ComplainServiceImpl(ComplainRepository complainRepository) {
        this.complainRepository = complainRepository;
    }

    @Override
    public Boolean add(Complain complain) {
        return complainRepository.save(complain)!=null;
    }

    @Override
    public List<Complain> getAllComplains() {
        return complainRepository.findAll();
    }

    @Override
    public Complain getComplainById(Long id) {
        return complainRepository.findById(id).orElseThrow();
    }
}
