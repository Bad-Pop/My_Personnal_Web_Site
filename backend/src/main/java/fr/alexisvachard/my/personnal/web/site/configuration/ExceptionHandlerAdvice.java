package fr.alexisvachard.my.personnal.web.site.configuration;

import fr.alexisvachard.my.personnal.web.site.exception.ApplicationException;
import fr.alexisvachard.my.personnal.web.site.exception.HomePageException;
import fr.alexisvachard.my.personnal.web.site.model.homepage.dto.ExceptionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = {HomePageException.class})
    public ResponseEntity handleException(ApplicationException e) {
        return ResponseEntity
                .status(INTERNAL_SERVER_ERROR)
                .body(new ExceptionDto(e.getMessage(), e.toString()));
    }
}