package com.example.headfirst.template_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GetUserResponseTest {

    @Autowired
    private UserService userService;

    @Test
    void responseTest_error() {
        //given
        GetUserResponse getUserResponse = new GetUserResponse(userService, 1L);

        //when
        ResponseEntity<UserDto> response = getUserResponse.execute();

        //then
        assertEquals(-1L, response.getBody().getId());
        assertEquals("Error", response.getBody().getError());
    }

    @Test
    void responseTest() throws Exception {
        //given
        User user = new User(1L, "문스터디", "moon@gmail.com");
        userService.save(user);

        //when
        GetUserResponse getUserResponse = new GetUserResponse(userService, 1L);
        UserDto result = getUserResponse.doAction();

        //then
        Assertions.assertThat(result.getName()).isEqualTo("문스터디");
        Assertions.assertThat(result.getEmail()).isEqualTo("moon@gmail.com");
    }

    @Test
    void responseHeaderTest() {
        //given
        GetUserResponse getUserResponse = new GetUserResponse(userService, -1L);

        //when
        List<String> headers = getUserResponse.execute().getHeaders().get("Content-Type");

        //then
        Assertions.assertThat(headers).containsExactly("application/json");
    }
}