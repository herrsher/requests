package com.technical.request.service;

import com.technical.request.dto.CreditRequestDTO;
import com.technical.request.entity.Customer;
import com.technical.request.entity.Request;
import com.technical.request.entity.CreditRequest;
import com.technical.request.form.CreditRequestForm;
import com.technical.request.repository.CreditRequestRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CreditRequestService {
    private final CreditRequestRepository creditRequestRepository;

    public CreditRequestDTO createServiceRequest(CreditRequestForm form) {
        final Customer customer = new Customer();
        final Request request = new Request();
        final CreditRequest creditRequest
                = new CreditRequest(form, customer.getId(), request.getRequestId());
        

        creditRequestRepository.save(creditRequest);

        return CreditRequestDTO.build(creditRequest, customer, request);
    }
}
