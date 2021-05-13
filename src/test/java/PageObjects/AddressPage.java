package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

    @FindBy(className = "page-heading")
    public WebElement addressPageLabel;

    @FindBy(name = "processAddress")
    public WebElement proceedToShippingButton;

    public AddressPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
