package Validations;

import Tasks.TasksAbstraction;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CreateAccountValidations extends TasksAbstraction {

    public CreateAccountValidations(WebDriver driver) {
        super(driver);
    }

    protected void validateNextPage(){
        String label = addressPage.addressPageLabel.getText();

        Assertions.assertEquals("ADDRESSES", label);
    }
}
