package com.stackroute.MuzixApplicationTest1.feedcomponent;
import com.stackroute.MuzixApplicationTest1.domain.Track;
import com.stackroute.MuzixApplicationTest1.service.TrackService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Data
@PropertySource("application.properties")
public class FeedCommandRunner implements CommandLineRunner {
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
    Environment env;
    @Autowired
    private TrackService trackServices;

    @Override
    public void run(String... args) throws Exception {
        //TODO: Add all feeder data to a file, don't let it be hardcoded
        //TODO: Find a better way to write expressions for @Value tag

    }
}
