package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@ControllerAdvice
public class ExeprtionTranslator {

    @Autowired
    private MessageBundle messageBundle;


    @ExceptionHandler(KianCreditBusinessException.class)
    public ResponseEntity<ErrorVM> processTransactionManagerException(HttpServletRequest httpServletRequest,
                                                                      KianCreditBusinessException ex) {


        ResponseEntity.BodyBuilder builder = ResponseEntity.badRequest();
        ErrorVM errorVM = new ErrorVM(ExceptionConstants.getExceptionMessage(ex.getClass()),
                messageBundle.getMessage(ex.getClass().getSimpleName()), httpServletRequest.getRequestURI());
        return builder.body(errorVM);
    }

}
