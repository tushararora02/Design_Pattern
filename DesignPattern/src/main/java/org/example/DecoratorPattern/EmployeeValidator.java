package org.example.DecoratorPattern;

public class EmployeeValidator  implements  InputValidator{
    @Override
    public boolean validate(Employee employee) {
        return true;
    }
}
