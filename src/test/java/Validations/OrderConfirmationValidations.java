package Validations;

import Tasks.TasksAbstraction;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationValidations extends TasksAbstraction {

    public OrderConfirmationValidations(WebDriver driver) {
        super(driver);
    }

    public void validateOrderComplete(){
        String label = orderConfirmationPage.orderConfirmationMessage.getText();

        Assertions.assertEquals("Your order on My Store is complete.", label);
    }
}
