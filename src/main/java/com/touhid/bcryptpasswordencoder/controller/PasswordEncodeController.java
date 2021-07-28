package com.touhid.bcryptpasswordencoder.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class PasswordEncodeController {
    private final PasswordEncoder passwordEncoder;

    public PasswordEncodeController(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping(value = "{plaintext}")
    public String encodePassword(@PathVariable("plaintext") String plainText) {
        return passwordEncoder.encode(plainText);
    }
}
