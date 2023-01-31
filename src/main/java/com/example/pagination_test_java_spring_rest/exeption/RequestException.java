package com.example.pagination_test_java_spring_rest.exeption;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Not found")
public class RequestException extends RuntimeException {

    public RequestException(String message) {
        super(message);
    }

}
