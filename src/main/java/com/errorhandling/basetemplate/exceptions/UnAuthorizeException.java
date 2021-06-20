package com.errorhandling.basetemplate.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * UnAuthorizeException is a custom exception class for http type 401.
 */
@ResponseStatus
public class UnAuthorizeException extends RuntimeException {
    public UnAuthorizeException(String message) {
        super(message);
    }
}
