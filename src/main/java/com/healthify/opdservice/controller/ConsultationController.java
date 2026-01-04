package com.healthify.opdservice.controllers;

import com.healthify.opdservice.DTO.request.CreateConsultationRequest;
import com.healthify.opdservice.func.CreateConsultationFunc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultation")
public class ConsultationController {

    @Autowired
    private CreateConsultationFunc createConsultationFunc;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createConsultation(@RequestBody  CreateConsultationRequest request){
        String result = createConsultationFunc.createConsultation(request);
        return  result;

    }
}
