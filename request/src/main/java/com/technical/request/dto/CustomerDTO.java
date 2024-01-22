package com.technical.request.dto;

import com.technical.request.entity.Customer;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class CustomerDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String lastName;
    private String maternalLastName;

    public static CustomerDTO build(final Customer customer) {
        return CustomerDTO.builder()
                .id(customer.getId())
                .name(customer.getName())
                .lastName(customer.getLastName())
                .maternalLastName(customer.getMaternalLastName())
                .build();
    }
}
