package org.example.StatePattern;

import java.util.List;
import java.util.stream.Collectors;

public class ExtractState implements  ETLState{

    @Override
    public void handle(State state, List<String> data) {
        String str1="This is ram";
        data.addAll(List.of(str1.split(" ")));
        System.out.println("Extract process is going on...."+ str1);
        state.setState(new LoadState(),data);
        System.out.println("Extract process is completed.."+ data);
    }
}
