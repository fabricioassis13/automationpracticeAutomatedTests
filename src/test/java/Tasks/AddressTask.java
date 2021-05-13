package Tasks;

import Framework.Waits;
import Validations.AddressValidations;
import org.openqa.selenium.WebDriver;

public class AddressTask extends AddressValidations {
    private Waits waits;

    public AddressTask(WebDriver driver) {
        super(driver);
        waits = new Waits(driver);
    }

    public void proceedToShipping(){
        addressPage.proceedToShippingButton.click();

        waits.loadElement(shippingPage.shippingPageLabel);
        validateNextPage();
    }
}
