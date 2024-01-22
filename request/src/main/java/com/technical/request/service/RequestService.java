package com.technical.request.service;

import com.technical.request.dto.ServiceRequestDTO;
import com.technical.request.entity.Customer;
import com.technical.request.entity.Request;
import com.technical.request.entity.ServiceRequest;
import com.technical.request.form.ServiceRequestForm;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RequestService {

    public ServiceRequestDTO createServiceRequest(ServiceRequestForm form) {
        final Customer customer = new Customer();
        final Request request = new Request();
        final ServiceRequest serviceRequest
                = new ServiceRequest(form, customer.getId(), request.getRequestId());

        return ServiceRequestDTO.build(serviceRequest, customer, request);
    }
}
