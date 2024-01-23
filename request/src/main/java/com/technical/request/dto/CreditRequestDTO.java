package com.technical.request.dto;

import com.technical.request.entity.Customer;
import com.technical.request.entity.Request;
import com.technical.request.entity.CreditRequest;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class CreditRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String promoter;
    private String company;
    private String status;
    private CustomerDTO customerDTO;
    private RequestDTO requestDTO;

    public static CreditRequestDTO build(
            final CreditRequest creditRequest,
            final Customer customer,
            final Request request) {
        return CreditRequestDTO.builder()
                .promoter(creditRequest.getPromoter())
                .company(creditRequest.getCompany())
                .status(creditRequest.getStatus())
                .customerDTO(CustomerDTO.build(customer))
                .requestDTO(RequestDTO.build(request))
                .build();
    }
}
