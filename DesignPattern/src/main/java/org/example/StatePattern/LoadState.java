package org.example.StatePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class LoadState implements ETLState {
    @Override
    public void handle(State state, List<String> data) {
        List<String> newdata=data.stream().map(var-> var.toUpperCase()).collect(Collectors.toList());
        System.out.println("Load process is going on....");
        state.setState(new TransformState(),newdata);
        System.out.println("Load process is completed...."+ newdata);



    }
}
