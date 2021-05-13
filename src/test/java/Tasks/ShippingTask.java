package Tasks;

import Framework.Waits;
import Validations.ShippingValidations;
import org.openqa.selenium.WebDriver;

public class ShippingTask extends ShippingValidations {

    private Waits waits;

    public ShippingTask(WebDriver driver) {
        super(driver);
        waits = new Waits(driver);
    }

    public void proceedToPayment(){
        shippingPage.termsOfServiceCheckbox.click();

        shippingPage.proceedToPaymentButton.click();

        waits.loadElement(paymentPage.paymentPageLabel);
        validateNextPage();
    }
}
