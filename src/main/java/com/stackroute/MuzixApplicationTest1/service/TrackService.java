package com.stackroute.MuzixApplicationTest1.service;

import com.stackroute.MuzixApplicationTest1.domain.Track;
import com.stackroute.MuzixApplicationTest1.exceptions.TrackAlreadyExits;
import com.stackroute.MuzixApplicationTest1.exceptions.TrackAlreadyUpdated;
import com.stackroute.MuzixApplicationTest1.exceptions.TrackNotFound;

import java.util.List;

public interface TrackService  {
    public Track savetrack(Track track) throws TrackAlreadyExits;
    public List<Track> getAllTracks();
    public Track updatetrack(Track track) throws TrackAlreadyUpdated;
    public boolean deletetrack(int id) throws TrackNotFound;
}
