package com.example.jazs24967nbp.controller;

import com.example.jazs24967nbp.model.NbpModel;
import com.example.jazs24967nbp.service.NbpService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("/exchange_rate")
public class FirstController {

    private final NbpService nbpService;


    public FirstController(NbpService nbpService) {
        this.nbpService = nbpService;
    }


    @Operation(summary = "Get exchange rate")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "404", description = "Brak danych dla prawidłowo określonego zakresu czasowego",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = NbpModel.class)) }),
            @ApiResponse(responseCode = "400", description = "Nieprawidłowe zapytania",
                    content = @Content),
            @ApiResponse(responseCode = "400", description = "Przekroczono limit zwracanych danych",
                    content = @Content) })

    @GetMapping("/gold")
    public ResponseEntity<NbpModel> getExchangeRate(@RequestParam NbpModel.Material material, @RequestParam Date date_from, @RequestParam Date date_to) {
        return ResponseEntity.ok(new NbpModel());
    }
}
