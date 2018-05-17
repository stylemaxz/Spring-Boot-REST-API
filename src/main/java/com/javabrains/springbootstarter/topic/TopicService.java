package com.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics =  new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring framework","Spring Desciptions"),
                new Topic("Test", "Test framework","Test Desciptions"),
                new Topic("Hi", "Hi framework","Hi Desciptions")
        ));
    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
