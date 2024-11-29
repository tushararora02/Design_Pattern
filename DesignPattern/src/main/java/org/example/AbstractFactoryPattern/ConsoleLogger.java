package org.example.AbstractFactoryPattern;

public class ConsoleLogger implements  Logger {


    @Override
    public void log(String message, Object variable) {
        System.out.println("ConsoleLogger: "+message+" "+variable);
    }
}
