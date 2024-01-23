package com.technical.request.service;

import com.technical.request.dto.CreditRequestDTO;
import com.technical.request.entity.CreditRequest;
import com.technical.request.form.CreditRequestForm;
import com.technical.request.repository.CreditRequestRepository;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class CreditRequestServiceTest {

    @Mock
    private CreditRequestRepository creditRequestRepository;

    @InjectMocks
    private CreditRequestService creditRequestService;

    public CreditRequestServiceTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createCreditRequestTest() {
        final CreditRequestForm form
                = new CreditRequestForm("promoter", "company");
        final CreditRequest creditRequest = new CreditRequest(form, 1,"1");

        when(creditRequestRepository.save(any(CreditRequest.class))).thenReturn(creditRequest);

        final CreditRequestDTO result = creditRequestService.createCreditRequest(form);

        verify(creditRequestRepository, times(1)).save(any());
        assertNotNull(result);
    }
}
