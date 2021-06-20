package com.errorhandling.basetemplate.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ResourceAccesException is a custom exception class for http status type 404.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceAccesException extends  RuntimeException{
    public ResourceAccesException(String message) {
        super(message);
    }
}
