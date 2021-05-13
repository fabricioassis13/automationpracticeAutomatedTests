package Validations;

import Tasks.TasksAbstraction;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ShippingValidations extends TasksAbstraction {

    public ShippingValidations(WebDriver driver) {
        super(driver);
    }

    protected void validateNextPage(){
        String label = shippingPage.shippingPageLabel.getText();

        Assertions.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", label);
    }
}
