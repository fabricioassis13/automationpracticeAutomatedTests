package Tasks;

import Framework.Waits;
import Validations.PaymentValidations;
import org.openqa.selenium.WebDriver;

public class PaymentTask extends PaymentValidations {

    private Waits waits;

    public PaymentTask(WebDriver driver) {
        super(driver);
        waits = new Waits(driver);
    }

    public void choosePayByBankWire(){
        paymentPage.bankWirePaymentOption.click();
    }

    public void confirmMyOrder(){
        waits.loadElement(paymentPage.confirmOrderButton);
        paymentPage.confirmOrderButton.click();

        waits.loadElement(orderConfirmationPage.orderConfirmationPageLabel);
        validateNextPage();
    }
}