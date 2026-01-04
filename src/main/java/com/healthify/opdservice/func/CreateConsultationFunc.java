package com.healthify.opdservice.func;

import com.healthify.opdservice.DTO.request.CreateConsultationRequest;
import com.healthify.opdservice.dataLayer.ConsultationData;
import com.healthify.opdservice.dataLayer.DoctorData;
import com.healthify.opdservice.dataLayer.PatientData;
import com.healthify.opdservice.entities.Consultation;
import com.healthify.opdservice.util.UuidUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CreateConsultationFunc {
    @Autowired
    private DoctorData doctorData;
    @Autowired
    private PatientData patientData;
    @Autowired
    private ConsultationData consultationData;

    private static Logger logger =  LoggerFactory.getLogger(CreateConsultationFunc.class);

    public String createConsultation(CreateConsultationRequest consultation){
        logger.info("in CreateConsultationFunc.class");
        //create uuid
        String uuid = UuidUtils.getnewUuid();
        logger.info("created uuid: {}",uuid);

        //get doc uuid from db
        String docUuid = doctorData.getDoctorDataByName(consultation.getDoctorName());
        logger.info("git docs info {}",docUuid);

        //get patientID from db
        String patientUuid = patientData.getPatientDataByName(consultation.getPatientName());
        logger.info("got patient info {}",patientUuid);

        // create Consultation obj
        Consultation consultationBuilder = new Consultation.Builder().setFirstConsultation(true)
                .setUuid(uuid)
                .setParentConsultationId(null)
                .setMeds(null)
                .setNotes(null)
                .setDoctorId(docUuid)
                .setPatientId(patientUuid)
                .setRooms(null)
                .setPaymentId(consultation.getPaymentId())
                .setSymptoms(consultation.getSymptoms())
                .setTime(LocalDateTime.now())
                .setTestsIds(null)
                .setMeds(null)
                .setParentConsultationId(null)
                .build();
        logger.info("created consultation for uuid: {}",consultationBuilder.getUuid());
        //call db to add
            String consultationUuid = consultationData.addConsultation(consultationBuilder);
        logger.info("added consultation to db consultationUuid: {}",consultationUuid);

        return consultationUuid;
    }

}
