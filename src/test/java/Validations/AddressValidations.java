package Validations;

import Tasks.TasksAbstraction;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AddressValidations extends TasksAbstraction {

    public AddressValidations(WebDriver driver) {
        super(driver);
    }

    protected void validateNextPage(){
        String label = shippingPage.shippingPageLabel.getText();

        Assertions.assertEquals("SHIPPING", label);
    }
}
