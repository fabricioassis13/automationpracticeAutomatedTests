package Validations;

import Tasks.TasksAbstraction;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class PaymentValidations extends TasksAbstraction {

    public PaymentValidations(WebDriver driver) {
        super(driver);
    }

    protected void validateNextPage(){
        String label = orderConfirmationPage.orderConfirmationPageLabel.getText();

        Assertions.assertEquals("ORDER CONFIRMATION", label);
    }
}
