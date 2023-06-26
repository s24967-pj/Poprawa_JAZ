package com.example.jazs24967nbp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

public class FirstController {

    @GetMapping("/gold")
    public ResponseEntity<> getWalutabyId(@RequestParam Date date_from, @RequestParam Date date_to) {
        Bank bank = bankService.getWalutaById(date_from);
        if (bank != null) {
        return ResponseEntity.ok(bank);
    } else {
        return ResponseEntity.notFound().build();
    }
}
