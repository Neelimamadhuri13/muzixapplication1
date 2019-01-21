/*package com.stackroute.MuzixApplicationTest1.configuration;

import com.stackroute.MuzixApplicationTest1.domain.Track;
import com.stackroute.MuzixApplicationTest1.trackrepository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component

public class Seed implements CommandLineRunner {
    @Autowired
    private TrackRepository trackRepository;

    @Override
    public void run(String... args) throws Exception {
        seedStart();
    }

    //This method adds seed data into the database
    public void seedStart() {
        trackRepository.save(new Track(1,"Ar.Rehman","Melody songs"));
        trackRepository.save(new Track(2,"Dsp","MassSongs"));
    }
}*/