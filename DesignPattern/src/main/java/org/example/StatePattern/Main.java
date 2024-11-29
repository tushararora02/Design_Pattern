package org.example.StatePattern;

import org.example.SingletonPattern.DatabaseConnection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        State etlState = new State();

        // Simulate Traffic Light Changes
        for (int i = 0; i < 3; i++) {
            etlState.changeState();
        }
        System.out.println("Transform process is completed....");
        System.out.println("ETL process is completed");

    }
}