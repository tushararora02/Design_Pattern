package org.example.DecoratorPattern;

import java.util.HashMap;

public class StateMain {
    public static void main(String[] args) {
        InputValidator baseValidator= new EmployeeValidator();
        Employee employee=new Employee();
        employee.setEmailId("abc@gmail.com");
        employee.setAge(18);
        employee.setName("ram");
        employee.setErrorMap(new HashMap<>());

    InputValidator validator=new NameValidatorDecorator(
            new EmailValidatorDecorator(
                    new AgeValidatorDecorator(baseValidator)
            )
    );
    if(validator.validate(employee)){
        System.out.println("all validation are passed");
    }

    System.out.println("employee validation"+employee);
    }
}