package org.example.ObserverSubjectPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeSubject {

    List<Observer> observers=new ArrayList<>();
    String videoName;

    public void addSubscriber(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void uploadNewVideo(String videoName){
        this.videoName=videoName;
        notifyObservers();
    }

    private void notifyObservers() {

        for(Observer observer:observers){
            observer.notifySubscriber(videoName);
        }
    }
}
