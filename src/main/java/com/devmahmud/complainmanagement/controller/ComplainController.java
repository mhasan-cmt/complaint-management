package com.devmahmud.complainmanagement.controller;

import com.devmahmud.complainmanagement.entity.Complain;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/complain")
public class ComplainController {

    @PostMapping("/add")
    public Boolean addComplain(@RequestBody Complain complain){
        return null;
    };
}
