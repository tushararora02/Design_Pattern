package org.example.ObserverSubjectPattern;

public class MrBeatSubscriber implements   Observer{
    private String name;

    MrBeatSubscriber(String name){
        this.name=name;
    }
    @Override
    public void notifySubscriber(String videoname) {
        System.out.println(name+" YouTube video is upload with name "+videoname);

    }
}
