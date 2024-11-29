package org.example.AbstractFactoryPattern;

public class ConsoleAbstractLoggerFactory implements AbstractLoggerFactory {

    @Override
    public Logger create() {
        return new ConsoleLogger();
    }
}
