package com.errorhandling.basetemplate.constants;

public enum ErrorEnum {

    CD_BS_CL_BAD_REQUEST("100"),
    BS_CL_BAD_REQUEST("Bad Request!!"),

    CD_BS_CL_NOT_FOUND("101"),
    BS_CL_NOT_FOUND("Not Found!!"),

    CD_BS_CL_NOT_AUTHORIZE("103"),
    BS_CL_NOT_AUTHORIZE("Not Found!!");

    private String message;

    private ErrorEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
