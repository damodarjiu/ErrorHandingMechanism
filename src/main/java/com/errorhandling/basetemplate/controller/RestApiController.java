package com.errorhandling.basetemplate.controller;

import com.errorhandling.basetemplate.constants.ErrorEnum;
import com.errorhandling.basetemplate.exceptions.BadRequestException;
import com.errorhandling.basetemplate.exceptions.ResourceAccesException;
import com.errorhandling.basetemplate.exceptions.UnAuthorizeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * com.errorhandling.basetemplate.controller.BaseTemplateController is used write controller method.
 */
@RestController
@RequestMapping(path = "/error-api")
public class RestApiController {

    private static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

    @GetMapping(value = "/errorcode/{code}", produces = "application/json")
    public Object getData(@PathVariable String code) {
        logger.info("@@ Started of getData Method @@");
        if (code.equals("400"))
            throw new BadRequestException(ErrorEnum.BS_CL_BAD_REQUEST.getMessage());
        if (code.equals("401"))
            throw new UnAuthorizeException(ErrorEnum.BS_CL_NOT_AUTHORIZE.getMessage());

        if (code.equals("404"))
            throw new ResourceAccesException(ErrorEnum.BS_CL_NOT_AUTHORIZE.getMessage());

        logger.info("@@ Ending of getData Method @@");
        return "Hello";
    }


}
