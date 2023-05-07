package com.example.headfirst.template_method;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class ApiResponseTemplateTest {

    @Test
    void testHandleException() {
        ApiResponseTemplate<UserDto> customTemplateMethod = new ApiResponseTemplate<UserDto>() {
            @Override
            protected UserDto doAction() throws Exception {
                throw new RuntimeException("Test exception");
            }

            @Override
            protected UserDto handleException(Exception e) {
                System.out.println("Error occurred: " + e.getMessage());
                return new UserDto(-1L, "Error");
            }
        };

        ResponseEntity<UserDto> response = customTemplateMethod.execute();
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
        assertEquals(-1L, response.getBody().getId());
        assertEquals("Error", response.getBody().getError());
    }

}