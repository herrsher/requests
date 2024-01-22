package com.technical.request.form;

import lombok.Data;

import java.io.Serializable;

@Data
public class ServiceRequestForm implements Serializable {
    private static final long serialVersionUID = 1L;

    private String promoter;
    private String company;
}
