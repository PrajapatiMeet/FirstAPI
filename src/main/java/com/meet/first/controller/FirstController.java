package com.meet.first.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("first")
public class FirstController {

    @GetMapping("getFirst")
    public ResponseEntity<String> getFirst() {
        return new ResponseEntity<>("First API", HttpStatus.OK);
    }
}
