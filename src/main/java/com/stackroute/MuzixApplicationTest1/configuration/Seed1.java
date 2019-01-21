/*package com.stackroute.MuzixApplicationTest1.configuration;

import com.stackroute.MuzixApplicationTest1.domain.Track;
import com.stackroute.MuzixApplicationTest1.trackrepository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
@Component
public class Seed1 implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private TrackRepository trackRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        trackRepository.save(new Track(1,"Ar.Rehman","Melody songs"));
        trackRepository.save(new Track(2,"Dsp","MassSongs"));

    }
}*/


