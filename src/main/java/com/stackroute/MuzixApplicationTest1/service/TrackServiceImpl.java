package com.stackroute.MuzixApplicationTest1.service;
import com.stackroute.MuzixApplicationTest1.domain.Track;
import com.stackroute.MuzixApplicationTest1.exceptions.TrackAlreadyExits;
import com.stackroute.MuzixApplicationTest1.exceptions.TrackAlreadyUpdated;
import com.stackroute.MuzixApplicationTest1.exceptions.TrackNotFound;
import com.stackroute.MuzixApplicationTest1.trackrepository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;
@Service
public class TrackServiceImpl implements TrackService {
    TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    public TrackServiceImpl() {
        super();
    }

    @Override
    public Track savetrack(Track track) throws TrackAlreadyExits {
        if (trackRepository.existsById(track.getId())) {
            throw new TrackAlreadyExits("Track already exists");
        }
        Track savedTrack = trackRepository.save(track);
        if (savedTrack == null) {
            throw new TrackAlreadyExits("Track already exist");
        }
        return savedTrack;
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }


    @Override
    public Track updatetrack(Track track) throws TrackAlreadyUpdated {
        if (trackRepository.existsById(track.getId())) {
            track.setId(track.getId());
            track.setComments(track.getComments());
            track.setName(track.getName());
            return trackRepository.save(track);
        } else
            throw new TrackAlreadyUpdated("Track doesn't exists.");
    }

    @Override
    public boolean deletetrack(int id) throws TrackNotFound {
        boolean status = false;
        if (trackRepository.existsById(id)) {
            trackRepository.deleteById(id);
            status = true;
            return status;
        } else {
            throw new TrackNotFound("Track id not found");
        }
    }

    @Override
    public Track findByname(String name) {
        System.out.println("find by NAME CALL+++++++"+trackRepository.findByname(name));
        return trackRepository.findByname(name);
    }
}