package org.example.DecoratorPattern;

public class AgeValidatorDecorator extends EmployeeValidatorDecorator{

    public AgeValidatorDecorator(InputValidator inputValidator) {
        super(inputValidator);
    }
    @Override
    public boolean validate(Employee employee) {
        boolean invalid=validateAge(employee.getAge());
        if(!invalid){
            employee.getErrorMap().put("age","age is not greater than or equal to 18");
        }
        return invalid && super.validate(employee);
    }

    private boolean validateAge(Integer age) {
        return age>=18;
    }


}
