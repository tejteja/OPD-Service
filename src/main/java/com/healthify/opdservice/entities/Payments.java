package com.healthify.opdservice.entities;

import com.healthify.opdservice.enums.ModeOfPayment;
import com.healthify.opdservice.enums.PaymentFor;
import com.healthify.opdservice.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payments {
    private String uuid;
    private ModeOfPayment mode;
    String payee;
    PaymentFor payedFor;
    PaymentStatus status;
    LocalDateTime time;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ModeOfPayment getMode() {
        return mode;
    }

    public void setMode(ModeOfPayment mode) {
        this.mode = mode;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public PaymentFor getPayedFor() {
        return payedFor;
    }

    public void setPayedFor(PaymentFor payedFor) {
        this.payedFor = payedFor;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
