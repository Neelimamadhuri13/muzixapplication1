package com.stackroute.MuzixApplicationTest1.trackrepository;

import com.stackroute.MuzixApplicationTest1.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {
    //crud operations
}
