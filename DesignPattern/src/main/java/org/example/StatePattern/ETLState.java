package org.example.StatePattern;

import java.util.List;

public interface ETLState {

     void handle(State state, List<String> data);
}
