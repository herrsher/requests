package com.technical.request.controller;

import com.technical.request.dto.ServiceRequestDTO;
import com.technical.request.form.ServiceRequestForm;
import com.technical.request.service.ServiceRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
@RequiredArgsConstructor
public class ServiceRequestController {

    private final ServiceRequestService serviceRequestService;

    @PostMapping
    public ResponseEntity<ServiceRequestDTO> create(
            @RequestBody final ServiceRequestForm form) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(serviceRequestService.createServiceRequest(form));
    }
}
