package com.lftechnology.paykii.exception;

public class PaykiiException extends RuntimeException {
    private String message;
    private String code;


    public PaykiiException(String message) {
        super(message);
    }

    public PaykiiException(String code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
