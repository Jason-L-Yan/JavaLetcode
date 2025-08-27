package org.example.order.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

//@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String error(Exception e) {
        return "";
    }
}
