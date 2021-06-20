package com.errorhandling.basetemplate.exceptions;

import com.errorhandling.basetemplate.constants.ErrorEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * RestApiExceptionHandler handle all custom rest api exception
 */
@ControllerAdvice
public class RestApiExceptionHandler {

    @ExceptionHandler({BadRequestException.class})
    public ResponseEntity<Object> handleBadRequest(BadRequestException ex) {
        return new ResponseEntity<>(
                new Error(ErrorEnum.CD_BS_CL_BAD_REQUEST.getMessage(), ErrorEnum.BS_CL_BAD_REQUEST.getMessage()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({UnAuthorizeException.class})
    public ResponseEntity<Object> handleUnAutorizeRequest(UnAuthorizeException ex) {
        return new ResponseEntity<>(
                new Error(ErrorEnum.CD_BS_CL_NOT_AUTHORIZE.getMessage(), ErrorEnum.BS_CL_NOT_AUTHORIZE.getMessage()),
                HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler({ResourceAccesException.class})
    public ResponseEntity<Object> handleBadRequest(ResourceAccesException ex) {
        return new ResponseEntity<>(
                new Error(ErrorEnum.CD_BS_CL_NOT_FOUND.getMessage(), ErrorEnum.BS_CL_NOT_FOUND.getMessage()),
                HttpStatus.NOT_FOUND);
    }

}
