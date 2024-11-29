package org.example.StatePattern;


import java.util.Arrays;
import java.util.List;

public class TransformState implements ETLState {
    @Override
    public void handle(State state, List<String> data) {
        String str1=String.join(" ", data);
        System.out.println("Transform process is going on...."+str1);
    }


}
