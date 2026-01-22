package com.healthify.opdservice.controllerAdvice;

import com.healthify.opdservice.api.apiErrors.ApiErrorResponse;
import com.healthify.opdservice.api.exceptions.OPDServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

@RestControllerAdvice
public class ExceptionHandlerControllerAdvice {
    //autowiring Message Source to get messages from messages.properties
    @Autowired
    MessageSource messageSource;

    @ExceptionHandler(OPDServiceException.class)
    public ResponseEntity<ApiErrorResponse> handleOPDException(OPDServiceException ex){
        ApiErrorResponse apiErrorResponse = createApiErrorResponse(ex);

        return ResponseEntity.status(apiErrorResponse.getStatusCode()).body(apiErrorResponse);
    }


    private ApiErrorResponse createApiErrorResponse(OPDServiceException ex){
        ApiErrorResponse apiErrorResponse = new ApiErrorResponse();
        //populate fields
        String errorCode = ex.getErrorCode();
        apiErrorResponse.setErrorCode(errorCode);
        apiErrorResponse.setErrorMessage(messageSource.getMessage(errorCode, ex.getArgs(), null));
        apiErrorResponse.setStatusCode(500);
        return apiErrorResponse;
    }
}
