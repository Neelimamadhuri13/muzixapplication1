package com.stackroute.MuzixApplicationTest1.feedcomponent;
import com.stackroute.MuzixApplicationTest1.domain.Track;
import com.stackroute.MuzixApplicationTest1.service.TrackService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Primary;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Data
@Primary
public class FeedApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    Environment env;
    @Autowired
    TrackService trackServices;
    Track feedTrackData = new Track();

    @Override public void onApplicationEvent(ContextRefreshedEvent event) {
  }


}
