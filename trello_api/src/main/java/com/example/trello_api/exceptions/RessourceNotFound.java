package com.example.trello_api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class RessourceNotFound extends  RuntimeException {
    public RessourceNotFound(String message) {
        super(message);
    }
}
