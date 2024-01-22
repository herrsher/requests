package com.technical.request.entity;

import com.technical.request.form.ServiceRequestForm;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class ServiceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String promoter;
    private String company;
    private int customerId;
    private String requestId;

    public ServiceRequest(
            final ServiceRequestForm form,
            final int customerId,
            final String requestId) {
        this.promoter = form.getPromoter();
        this.company = form.getCompany();
        this.customerId = customerId;
        this.requestId = requestId;
    }
}
