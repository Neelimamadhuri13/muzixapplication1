package com.stackroute.MuzixApplicationTest1.controller;

import com.stackroute.MuzixApplicationTest1.domain.Track;
import com.stackroute.MuzixApplicationTest1.exceptions.TrackNotFound;
import com.stackroute.MuzixApplicationTest1.service.TrackService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1")
public class Controller {
    TrackService trackservice;
    ResponseEntity responseEntity;

    public Controller(TrackService trackservice) {
        this.trackservice = trackservice;
    }

    //handler mapping
    @PostMapping("track")
    public ResponseEntity<?> savetrack(@RequestBody Track track) {
        ResponseEntity responseEntity;
        try {
            trackservice.savetrack(track);
            responseEntity = new ResponseEntity<String>("Succesfully created", HttpStatus.CREATED);
        } catch (Exception ex) {
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;


    }

    @GetMapping("track")
    public ResponseEntity<?> getAllTracks() {
        return new ResponseEntity<List<Track>>(trackservice.getAllTracks(), HttpStatus.OK);

    }

    @PutMapping("track")
    public ResponseEntity<?> updateTrack(@RequestBody Track track) {
        try {
            trackservice.updatetrack(track);
            responseEntity = new ResponseEntity<String>("Succesfully created", HttpStatus.CREATED);
        } catch (Exception ex) {
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;

    }

    @DeleteMapping("track/{id}")
    public ResponseEntity<?> delTrack(@PathVariable("id") int id) throws TrackNotFound {
        try {
            trackservice.deletetrack(id);
            responseEntity = new ResponseEntity<String>("Deleted successfully", HttpStatus.OK);
        }
       catch(TrackNotFound exception){
            responseEntity=new ResponseEntity<String>(exception.getMessage(),HttpStatus.CONFLICT);
        }
        return responseEntity;
    }
}