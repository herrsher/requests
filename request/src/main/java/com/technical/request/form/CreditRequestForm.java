package com.technical.request.form;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CreditRequestForm implements Serializable {
    private static final long serialVersionUID = 1L;

    private String promoter;
    private String company;
}
