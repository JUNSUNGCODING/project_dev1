package com.seb39.pre32.MyStackOverFlow.exception;

import lombok.Getter;

public enum ExceptionCode {
    USER_NOT_FOUND(404, "Member not found"),
    USER_EXISTS(409, "Member exists");

    @Getter
    private int status;

    @Getter
    private String message;

    ExceptionCode(int code, String message) {
        this.status = code;
        this.message = message;
    }
}
