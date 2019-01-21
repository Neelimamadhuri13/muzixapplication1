package com.stackroute.MuzixApplicationTest1.trackrepository;

import com.stackroute.MuzixApplicationTest1.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {
    //crud operations
  //  @Query(value = "select * from track t where trackName = t.track1")
    public Track findByname(String name);
}
