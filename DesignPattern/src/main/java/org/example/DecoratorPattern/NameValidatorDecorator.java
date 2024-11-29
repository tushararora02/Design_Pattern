package org.example.DecoratorPattern;

public class NameValidatorDecorator extends  EmployeeValidatorDecorator{

    public NameValidatorDecorator(InputValidator inputValidator) {
        super(inputValidator);
    }
    @Override
    public boolean validate(Employee employee) {
        boolean invalid=validateName(employee.getName());
        if(!invalid){
            employee.getErrorMap().put("name","name cannot be empty");
        }
        return invalid && super.validate(employee);
    }

    private boolean validateName(String name) {
        return name!="" && name!= null;

    }
}
