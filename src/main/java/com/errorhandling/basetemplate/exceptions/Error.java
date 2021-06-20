package com.errorhandling.basetemplate.exceptions;

import lombok.Data;

/**
 * Error class containe
 */
@Data
public class Error {

    private String err_code;
    private String err_message;

    public Error(String code, String message) {
        err_code = code;
        err_message = message;
    }

}
