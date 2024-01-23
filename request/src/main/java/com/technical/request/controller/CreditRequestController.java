package com.technical.request.controller;

import com.technical.request.dto.CreditRequestDTO;
import com.technical.request.form.CreditRequestForm;
import com.technical.request.service.CreditRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
@RequiredArgsConstructor
public class CreditRequestController {

    private final CreditRequestService creditRequestService;

    @PostMapping
    public ResponseEntity<CreditRequestDTO> create(
            @RequestBody final CreditRequestForm form) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(creditRequestService.createCreditRequest(form));
    }
}
