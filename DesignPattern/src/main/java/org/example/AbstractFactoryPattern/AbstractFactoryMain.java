package org.example.AbstractFactoryPattern;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractLoggerFactory loggerFactory1= new FileAbstractLoggerFactory();
        Logger log1= loggerFactory1.create();
        log1.log("File logs","Filename.csv");

        AbstractLoggerFactory loggerFactory2= new ConsoleAbstractLoggerFactory();
        Logger log2= loggerFactory2.create();
        log2.log("Console logs","{name:Tushar}");



    }
}