package com.technical.request.service;

import com.technical.request.dto.ServiceRequestDTO;
import com.technical.request.entity.Customer;
import com.technical.request.entity.Request;
import com.technical.request.entity.ServiceRequest;
import com.technical.request.form.ServiceRequestForm;
import com.technical.request.repository.ServiceRequestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceRequestService {
    private final ServiceRequestRepository serviceRequestRepository;

    public ServiceRequestDTO createServiceRequest(ServiceRequestForm form) {
        final Customer customer = new Customer();
        final Request request = new Request();
        final ServiceRequest serviceRequest
                = new ServiceRequest(form, customer.getId(), request.getRequestId());

        serviceRequestRepository.save(serviceRequest);

        return ServiceRequestDTO.build(serviceRequest, customer, request);
    }
}
