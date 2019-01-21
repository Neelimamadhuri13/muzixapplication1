package com.stackroute.MuzixApplicationTest1.feedcomponent;


import com.stackroute.MuzixApplicationTest1.domain.Track;
import com.stackroute.MuzixApplicationTest1.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class FeedApplicationRunner implements ApplicationRunner {

    private Track feedTrackData = new Track();

     @Value("${song.total}")
     private int totalSongs;
    @Value("${song.1.id}")
    private int id1;
    @Value("${song.1.name}")
    private String name1;
    @Value("${song.1.comment}")
    private String comment1;
    @Value("${song.2.id}")
    private int id2;
    @Value("${song.2.name}")
    private String name2;
    @Value("${song.2.comment}")
    private String comment2;
    @Value("${song.3.id}")
    private int id3;
    @Value("${song.3.name}")
    private String name3;
    @Value("${song.3.comment}")
    private String comment3;

    @Autowired
    private TrackService trackServices;

    public FeedApplicationRunner(TrackService trackServices) {
        this.trackServices = trackServices;
    }

    //TODO: Add all feeder data to a file, don't let it be hardcoded
    @Override
    public void run(ApplicationArguments args) throws Exception {
        feedTrackData.setId(id1);
        feedTrackData.setName(name1);
        feedTrackData.setComments(comment1);
        trackServices.savetrack(feedTrackData);

        feedTrackData.setId(id2);
        feedTrackData.setName(name2);
        feedTrackData.setComments(comment2);
        trackServices.savetrack(feedTrackData);

        feedTrackData.setId(id3);
        feedTrackData.setName(name3);
        feedTrackData.setComments(comment3);
        trackServices.savetrack(feedTrackData);



    }
}