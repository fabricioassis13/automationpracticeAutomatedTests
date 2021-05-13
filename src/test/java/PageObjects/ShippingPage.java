package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {

    @FindBy(className = "page-heading")
    public WebElement shippingPageLabel;

    @FindBy(id = "cgv")
    public WebElement termsOfServiceCheckbox;

    @FindBy(name = "processCarrier")
    public WebElement proceedToPaymentButton;

    public ShippingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
