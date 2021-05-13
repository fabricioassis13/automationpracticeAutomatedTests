package Tasks;

import Framework.Waits;
import Utils.FileOperations;
import Validations.CartSummaryValidations;
import org.openqa.selenium.WebDriver;

public class CartSummaryTask extends CartSummaryValidations {
    private Waits waits;

    public CartSummaryTask(WebDriver driver) {
        super(driver);
        waits = new Waits(driver);
    }

    public void proceedToSignIn(){
        validateTotalPrice();

        cartSummaryPage.proceedToCheckoutButton.click();

        waits.loadElement(createAccountPage.createAccountLabel);
        validateNextPage();
    }
}
