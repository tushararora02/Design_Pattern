package org.example.StatePattern;

import java.util.ArrayList;
import java.util.List;

public class State {

    private ETLState currentState;
    private List<String> listofstring;


    State(){
        listofstring=new ArrayList<>();
        this.currentState=new ExtractState();
    }
    public void setState(ETLState state, List<String> listofString ){
        this.currentState=state;
        this.listofstring=listofString;



    }
    public void changeState(){
        currentState.handle(this, this.listofstring);
    }


}
