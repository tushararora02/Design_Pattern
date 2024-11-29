package org.example.BuilderPattern;

import org.example.AbstractFactoryPattern.AbstractLoggerFactory;
import org.example.AbstractFactoryPattern.ConsoleAbstractLoggerFactory;
import org.example.AbstractFactoryPattern.FileAbstractLoggerFactory;
import org.example.AbstractFactoryPattern.Logger;

public class SwaggerMain {
    public static void main(String[] args) {
        Swagger swagger1=new Swagger.Builder()
                                    .setUrl("localhost:8900")
                                    .setDescription("Swagger description")
                                    .setTitle("swagger title")
                                    .build();

        Swagger swagger2=new Swagger.Builder()
                .setUrl("localhost:8800")
                .setDescription("Swagger description 2")
                .setTitle("swagger title 2")
                .setTag("Swagger tag")
                .build();

        System.out.println("swagger1 :"+swagger1);
        System.out.println("swagger1 :"+swagger2);



    }
}