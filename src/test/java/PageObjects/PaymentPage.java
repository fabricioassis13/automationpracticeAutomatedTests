package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    @FindBy(className = "page-heading")
    public WebElement paymentPageLabel;

    @FindBy(className = "bankwire")
    public WebElement bankWirePaymentOption;

    @FindBy(xpath = "//*[@id='cart_navigation']/button")
    public WebElement confirmOrderButton;


    public  PaymentPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
