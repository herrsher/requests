package com.technical.request.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
public class Request {
    @Id
    private String requestId;
    private BigDecimal amount;
    private String product;
    private String requestType;
    private String requestTypeId;
    private int rate;
    private int term;
    private String frequency;
    private Date requestDate;

    public Request() {
        this.requestId = "110102044798";
        this.amount = new BigDecimal(167000);
        this.product = "IMSS";
        this.requestType = "CREDITO NUEVO";
        this.requestTypeId = "394";
        this.rate = 39;
        this.term = 0;
        this.frequency = "Semanal/Mensual/Catorcenal";
        this.requestDate = new Date(2022,07,27);
    }
}
