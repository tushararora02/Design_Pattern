package org.example.SingletonPattern;

import org.example.SingletonPattern.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DatabaseConnection connection1= DatabaseConnection.getConnection();

        connection1.setUsername("root");
        connection1.setPassword("root");
        connection1.setUrl("db1:jdbc.org.connection");
        System.out.println("connection1"+connection1);

        DatabaseConnection connection2= DatabaseConnection.getConnection();
        System.out.println("connection2"+connection2);


    }
}