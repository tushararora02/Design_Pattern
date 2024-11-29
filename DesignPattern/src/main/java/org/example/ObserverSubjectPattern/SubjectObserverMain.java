package org.example.ObserverSubjectPattern;

public class SubjectObserverMain {
    public static void main(String[] args) {


        YouTubeSubject youTubeSubject = new YouTubeSubject();

        Observer subscriber1 = new MrBeatSubscriber("ram");
        Observer subscriber2 =  new MrBeatSubscriber("sham");

        youTubeSubject.addSubscriber(subscriber1);
        youTubeSubject.addSubscriber(subscriber2);

        // Stock price updates
        youTubeSubject.uploadNewVideo("Goa trip");
        youTubeSubject.uploadNewVideo("dubai race");
    }
}