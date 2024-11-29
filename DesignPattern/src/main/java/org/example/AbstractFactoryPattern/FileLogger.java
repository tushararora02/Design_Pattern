package org.example.AbstractFactoryPattern;

public class FileLogger implements Logger {
    @Override
    public void log(String message, Object variable) {
        System.out.println("FileLogger: "+message+" "+variable);
    }
}
