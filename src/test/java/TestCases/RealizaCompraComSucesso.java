package TestCases;

import Framework.BaseTest;
import PageObjects.ShippingPage;
import Tasks.*;
import Utils.Sleeper;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizaCompraComSucesso extends BaseTest {
    private WebDriver driver = getDriver();

    private FirstPageTask firstPageTask = new FirstPageTask(driver);
    private ItemDescriptionTask itemDescriptionTask = new ItemDescriptionTask(driver);
    private CartSummaryTask cartSummaryTask = new CartSummaryTask(driver);
    private CreateAccountTask createAccountTask = new CreateAccountTask(driver);
    private AddressTask addressTask = new AddressTask(driver);
    private ShippingTask shippingTask = new ShippingTask(driver);
    private PaymentTask paymentTask = new PaymentTask(driver);
    private OrderConfirmationTask orderConfirmationTask = new OrderConfirmationTask(driver);

    @Test
    public void realizaCompraComSucesso(){
        firstPageTask.selectFadedShortShortSleeveTShirts();
        itemDescriptionTask.saveItemPrice();
        itemDescriptionTask.addItemToCart();
        cartSummaryTask.proceedToSignIn();
        createAccountTask.choiceCreateAccount();
        createAccountTask.registerNewAccount();
        addressTask.proceedToShipping();
        shippingTask.proceedToPayment();
        paymentTask.choosePayByBankWire();
        paymentTask.confirmMyOrder();
        orderConfirmationTask.validateOrderComplete();
    }
}
