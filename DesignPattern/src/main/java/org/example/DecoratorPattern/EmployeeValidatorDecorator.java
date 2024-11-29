package org.example.DecoratorPattern;

public abstract class EmployeeValidatorDecorator implements InputValidator {
    
    private InputValidator inputValidator;
    
    public EmployeeValidatorDecorator(InputValidator inputValidator){
        this.inputValidator=inputValidator;
    }
    @Override
    public boolean validate(Employee employee) {
        return inputValidator.validate(employee);
    }
    
}
