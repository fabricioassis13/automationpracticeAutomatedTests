package Tasks;

import Framework.Waits;
import Utils.Sleeper;
import Validations.FirstPageValidations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstPageTask extends FirstPageValidations {
    private WebDriver driver;
    private Waits waits;

    public FirstPageTask(WebDriver driver) {
        super(driver);
        this.driver = driver;
        waits = new Waits(driver);
    }

    public void selectFadedShortShortSleeveTShirts(){

        waits.loadElement(firstPage.fadedShortSleeveTShirts).click();

        waits.loadElement(itemDescriptionPage.itemName);
        validateNextPage();
    }
}
