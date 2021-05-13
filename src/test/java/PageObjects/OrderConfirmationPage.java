package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {

    @FindBy(className = "page-heading")
    public WebElement orderConfirmationPageLabel;

    @FindBy(xpath = "//*[@class='cheque-indent']/strong")
    public WebElement orderConfirmationMessage;

    public OrderConfirmationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
