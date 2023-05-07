package com.example.headfirst.template_method;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class ApiResponseTemplate<T> {

    public ResponseEntity<T> execute() {
        HttpHeaders headers = addHeaders();
        HttpStatus status;
        T body;

        try {
            body = doAction();
            status = HttpStatus.OK;
        } catch (Exception e) {
            body = handleException(e);
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return new ResponseEntity<>(body, headers, status);
    }

    private HttpHeaders addHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        return headers;
    }

    protected abstract T doAction() throws Exception;

    protected abstract T handleException(Exception e);
}
