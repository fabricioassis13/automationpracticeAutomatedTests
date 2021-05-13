package Tasks;

import PageObjects.*;
import org.openqa.selenium.WebDriver;

public class TasksAbstraction {

    protected FirstPage firstPage;
    protected ItemDescriptionPage itemDescriptionPage;
    protected CartSummaryPage cartSummaryPage;
    protected CreateAccountPage createAccountPage;
    protected AddressPage addressPage;
    protected ShippingPage shippingPage;
    protected PaymentPage paymentPage;
    protected OrderConfirmationPage orderConfirmationPage;

    public TasksAbstraction(WebDriver driver) {
        firstPage = new FirstPage(driver);
        itemDescriptionPage = new ItemDescriptionPage(driver);
        cartSummaryPage = new CartSummaryPage(driver);
        createAccountPage = new CreateAccountPage(driver);
        addressPage = new AddressPage(driver);
        shippingPage = new ShippingPage(driver);
        paymentPage = new PaymentPage(driver);
        orderConfirmationPage = new OrderConfirmationPage(driver);
    }
}
