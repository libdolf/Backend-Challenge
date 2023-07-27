package br.com.backendchallenge.handler;

import br.com.backendchallenge.exceptions.NotFoundExceptionDetails;
import br.com.backendchallenge.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<NotFoundExceptionDetails> handlerNotFoundException(NotFoundException notFoundException){
        return new ResponseEntity<>(
                NotFoundExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.NOT_FOUND.value())
                        .title("User not found!")
                        .details(notFoundException.getMessage())
                        .developerMessage(notFoundException.getClass().getName())
                        .build(),HttpStatus.NOT_FOUND);
    }
}
