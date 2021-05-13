package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemDescriptionPage {

    @FindBy(xpath = "//*[@itemprop=\"name\"]")
    public WebElement itemName;

    @FindBy(id = "our_price_display")
    public WebElement itemPrice;

    @FindBy(name = "Submit")
    public WebElement addItemToCart;

    @FindBy(xpath = "//*[@id='layer_cart']/div[@class='clearfix']/div[1]/h2")
    public WebElement modalProductLabel;

    @FindBy(xpath = "//*[@title='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    public ItemDescriptionPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
