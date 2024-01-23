package com.technical.request.controller;

import com.technical.request.dto.CreditRequestDTO;
import com.technical.request.entity.CreditRequest;
import com.technical.request.entity.Customer;
import com.technical.request.entity.Request;
import com.technical.request.form.CreditRequestForm;
import com.technical.request.service.CreditRequestService;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class CreditRequestControllerTest {

    @Mock
    private CreditRequestService creditRequestService;

    @InjectMocks
    private CreditRequestController creditRequestController;

    public CreditRequestControllerTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createTest() {
        final CreditRequestForm form
                = new CreditRequestForm("promoter", "company");
        final Customer customer = new Customer();
        final Request request = new Request();
        final CreditRequest creditRequest
                = new CreditRequest(form, customer.getId(), request.getRequestId());

        final CreditRequestDTO expectedResult
                = CreditRequestDTO.build(creditRequest, customer, request);
        when(creditRequestService.createCreditRequest(form)).thenReturn(expectedResult);

        ResponseEntity<CreditRequestDTO> responseEntity = creditRequestController.create(form);

        assertNotNull(responseEntity);
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());

        final CreditRequestDTO result = responseEntity.getBody();
        assertNotNull(result);

        verify(creditRequestService, times(1)).createCreditRequest(form);
    }
}
