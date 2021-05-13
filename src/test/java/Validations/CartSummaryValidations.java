package Validations;

import Tasks.TasksAbstraction;
import Utils.FileOperations;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CartSummaryValidations extends TasksAbstraction {

    public CartSummaryValidations(WebDriver driver) {
        super(driver);
    }

    protected void validateTotalPrice(){
        float unitPrice = Float.parseFloat(FileOperations.getProperties("data").getProperty("itemPrice"));
        float totalShipping = Float.parseFloat(cartSummaryPage.totalShipping.getText().substring(1));
        float tax = Float.parseFloat(cartSummaryPage.totalTax.getText().substring(1));
        int quantity = Integer.parseInt(cartSummaryPage.itemQuantity.getAttribute("value"));

        float totalPriceExpected = (unitPrice * quantity) + totalShipping + tax;
        float totalPriceActual = Float.parseFloat(cartSummaryPage.totalPrice.getText().substring(1));

        Assertions.assertEquals(totalPriceExpected, totalPriceActual);
    }

    protected void validateNextPage(){
        String label = createAccountPage.createAccountLabel.getText();

        Assertions.assertEquals("CREATE AN ACCOUNT", label);
    }
}
