package org.example.DecoratorPattern;

public class EmailValidatorDecorator  extends  EmployeeValidatorDecorator{

    public EmailValidatorDecorator(InputValidator inputValidator) {
        super(inputValidator);
    }

    @Override
    public boolean validate(Employee employee) {
        boolean invalid=validateEmail(employee.getEmailId());
        if(!invalid){
            employee.getErrorMap().put("emailId","EmailId is not valid");
        }
        return invalid && super.validate(employee);
    }

    private boolean validateEmail(String emailId){
        return emailId.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
    }
}
