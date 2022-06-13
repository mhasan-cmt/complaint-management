package com.devmahmud.complainmanagement.controller;

import com.devmahmud.complainmanagement.entity.Complain;
import com.devmahmud.complainmanagement.service.ComplainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/complain")
public class ComplainController {

    private final ComplainService complainService;

    public ComplainController(ComplainService complainService) {
        this.complainService = complainService;
    }

    @PostMapping("/add")
    public Boolean addComplain(@RequestBody Complain complain){
        return null;
    };

    @GetMapping("/all")
    @ResponseBody
    public List<Complain> getAllComplain(){
        return complainService.getAllComplains();
    }
}
