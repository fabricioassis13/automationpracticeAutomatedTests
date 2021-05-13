package Validations;

import Framework.Waits;
import Tasks.TasksAbstraction;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class FirstPageValidations extends TasksAbstraction {

    private WebDriver driver;

    public FirstPageValidations(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    protected void validateNextPage(){
        String label = itemDescriptionPage.itemName.getText();
        Assertions.assertEquals("Faded Short Sleeve T-shirts", label);
    }
}
