package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSummaryPage {

    @FindBy(id = "cart_title")
    public WebElement summaryPageLabel;

    @FindBy(name = "quantity_1_1_0_0")
    public WebElement itemQuantity;

    @FindBy(id = "total_shipping")
    public WebElement totalShipping;

    @FindBy(id = "total_tax")
    public WebElement totalTax;

    @FindBy(id = "total_price")
    public WebElement totalPrice;

    @FindBy(css = ".button.btn.btn-default.standard-checkout.button-medium")
    public WebElement proceedToCheckoutButton;

    public CartSummaryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
