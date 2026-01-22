package com.healthify.opdservice.Controller;

import com.healthify.opdservice.DTO.request.CreateConsultationRequest;
import com.healthify.opdservice.controller.ConsultationController;
import com.healthify.opdservice.entities.Consultation;
import com.healthify.opdservice.func.CreateConsultationFunc;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class ConsultationTest {

    @Mock
    ConsultationController consultationController;

    @Mock
    CreateConsultationFunc createConsultationFunc;



    @Test
    public void testCreateConsultation(){
        Consultation consultation = new Consultation.Builder()
                .setUuid("test-uuid-1234").build();

        when(createConsultationFunc.createConsultation(new CreateConsultationRequest())).thenReturn(consultation.getUuid());

        String result = consultationController.createConsultation(new CreateConsultationRequest());

        assertEquals("test-uuid-1234", result);
    }
}
