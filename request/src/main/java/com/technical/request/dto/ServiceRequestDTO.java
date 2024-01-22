package com.technical.request.dto;

import com.technical.request.entity.Customer;
import com.technical.request.entity.Request;
import com.technical.request.entity.ServiceRequest;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class ServiceRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String promoter;
    private String company;
    private CustomerDTO customerDTO;
    private RequestDTO requestDTO;

    public static ServiceRequestDTO build(
            final ServiceRequest serviceRequest,
            final Customer customer,
            final Request request) {
        return ServiceRequestDTO.builder()
                .id(serviceRequest.getId())
                .promoter(serviceRequest.getPromoter())
                .company(serviceRequest.getCompany())
                .customerDTO(CustomerDTO.build(customer))
                .requestDTO(RequestDTO.build(request))
                .build();
    }
}
