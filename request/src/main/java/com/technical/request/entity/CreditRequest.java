package com.technical.request.entity;

import com.technical.request.form.CreditRequestForm;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class CreditRequest {
    @Id
    private String requestId;
    private String promoter;
    private String company;
    private String status;
    private int customerId;

    public CreditRequest(
            final CreditRequestForm form,
            final int customerId,
            final String requestId) {
        this.promoter = form.getPromoter();
        this.company = form.getCompany();
        this.status = "NEW";
        this.customerId = customerId;
        this.requestId = requestId;
    }
}
