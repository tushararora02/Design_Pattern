package org.example.AbstractFactoryPattern;

public class FileAbstractLoggerFactory implements AbstractLoggerFactory {

    @Override
    public Logger create() {
        return new FileLogger();
    }
}
