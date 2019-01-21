package com.stackroute.MuzixApplicationTest1.controller;

import com.stackroute.MuzixApplicationTest1.domain.Track;
import com.stackroute.MuzixApplicationTest1.exceptions.TrackAlreadyExits;
import com.stackroute.MuzixApplicationTest1.exceptions.TrackAlreadyUpdated;
import com.stackroute.MuzixApplicationTest1.exceptions.TrackNotFound;
import com.stackroute.MuzixApplicationTest1.service.TrackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.element.Name;
import java.util.List;

@RestController
@RequestMapping(value="/api/v1/")
@Api(value="Track", description="All music tracks")
public class Controller {
    TrackService trackservice;
    ResponseEntity responseEntity;
@Autowired
    public Controller(TrackService trackservice) {
        this.trackservice = trackservice;
    }
    @ApiOperation(value = "Save new track")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )

    @DeleteMapping("track/{id}")
    public ResponseEntity<?> deletetrack(@PathVariable("id") int id) throws TrackNotFound{
        trackservice.deletetrack(id);
        return new ResponseEntity<String>("deleted",HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity changeUser(@RequestBody Track track) throws TrackAlreadyUpdated{
        trackservice.updatetrack(track);
        return new ResponseEntity(HttpStatus.OK);
    }

    //handler mapping
    @PostMapping("track")
    public ResponseEntity<?> savetrack(@RequestBody Track track) throws TrackAlreadyExits {
        ResponseEntity responseEntity;

            responseEntity = new ResponseEntity<String>("Succesfully created", HttpStatus.CREATED);

        return responseEntity;


    }

    @GetMapping("track")
    public ResponseEntity<?> getAllTracks() {
        return new ResponseEntity<List<Track>>(trackservice.getAllTracks(), HttpStatus.OK);

    }

    @PutMapping("track")
    public ResponseEntity<?> updateTrack(@RequestBody Track track) throws TrackAlreadyUpdated {

            responseEntity = new ResponseEntity<String>("Succesfully created", HttpStatus.CREATED);


        return responseEntity;

    }



    @GetMapping("track/{name}")
    public ResponseEntity<?> findByName(@PathVariable("name") String name) {
        trackservice.findByname(name);
        responseEntity = new ResponseEntity<Track>(trackservice.findByname(name),HttpStatus.OK);
        return responseEntity;
    }
}