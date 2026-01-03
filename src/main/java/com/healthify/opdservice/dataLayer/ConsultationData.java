package com.healthify.opdservice.dataLayer;

import com.healthify.opdservice.entities.Consultation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ConsultationData {
    List<Consultation> consultationList = new ArrayList<>();

    public String  addConsultation(Consultation consultation){
        consultationList.add(consultation);
        return consultation.getUuid();
    }
}
