package com.stackroute.MuzixApplicationTest1.controller;

import com.stackroute.MuzixApplicationTest1.exceptions.TrackAlreadyExits;
import com.stackroute.MuzixApplicationTest1.exceptions.TrackAlreadyUpdated;
import com.stackroute.MuzixApplicationTest1.exceptions.TrackNotFound;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Log4j
public class GlobalExceptionHandler {

    @ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Not all mandatory fields are filled")
    @ExceptionHandler(TrackAlreadyUpdated.class)
    public void handleTrackAlreadyExits(TrackAlreadyUpdated e)
    {
        log.error("Not all mandatory fields are filled", e);
    }

    @ResponseStatus(value= HttpStatus.CONFLICT, reason="User already exists")
    @ExceptionHandler(TrackAlreadyExits.class)
    public void handleTrackAlreadyExists(TrackAlreadyExits e){
        log.error("User already exists", e);
    }

    @ResponseStatus(value= HttpStatus.NOT_FOUND, reason="User does not exist")
    @ExceptionHandler(TrackNotFound.class)
    public void TrackNotFound(TrackNotFound e)
    {
        log.error("User does not exist", e);
    }
}
