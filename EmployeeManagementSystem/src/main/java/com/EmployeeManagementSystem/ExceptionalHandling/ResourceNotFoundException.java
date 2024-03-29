package com.EmployeeManagementSystem.ExceptionalHandling;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 7428051251365675318L;

    private HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

    public HttpStatus getHttpStatus(){
        return httpStatus;
    }

    public ResourceNotFoundException(HttpStatus httpStatus, String message){
        super(message);
        this.httpStatus=httpStatus;
    }
}
