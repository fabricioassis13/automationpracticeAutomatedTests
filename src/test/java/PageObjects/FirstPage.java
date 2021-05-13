package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")
    public WebElement fadedShortSleeveTShirts;

    public FirstPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
