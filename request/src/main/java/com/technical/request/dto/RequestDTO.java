package com.technical.request.dto;

import com.technical.request.entity.Request;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Builder
public class RequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String requestId;
    private BigDecimal amount;
    private String product;
    private String requestType;
    private String requestTypeId;
    private int rate;
    private int term;
    private String frequency;
    private Date requestDate;

    public static RequestDTO build(final Request request) {
        return RequestDTO.builder()
                .requestId(request.getRequestId())
                .amount(request.getAmount())
                .product(request.getProduct())
                .requestType(request.getRequestType())
                .requestTypeId(request.getRequestTypeId())
                .rate(request.getRate())
                .term(request.getTerm())
                .frequency(request.getFrequency())
                .requestDate(request.getRequestDate())
                .build();
    }
}
