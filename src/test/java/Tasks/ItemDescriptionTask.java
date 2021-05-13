package Tasks;

import Framework.Waits;
import Utils.FileOperations;
import Validations.ItemDescriptionValidations;
import org.openqa.selenium.WebDriver;

public class ItemDescriptionTask extends ItemDescriptionValidations {
    private Waits waits;

    public ItemDescriptionTask(WebDriver driver) {
        super(driver);
        waits = new Waits(driver);
    }

    public void saveItemPrice(){
        String itemPrice = itemDescriptionPage.itemPrice.getText().substring(1);

        FileOperations.setProperties("data", "itemPrice", itemPrice);
    }

    public void addItemToCart(){
        itemDescriptionPage.addItemToCart.click();

        waits.loadElement(itemDescriptionPage.modalProductLabel);
        validateItemAddedToCart();

        itemDescriptionPage.proceedToCheckoutButton.click();

        waits.loadElement(cartSummaryPage.summaryPageLabel);
        validateNextPage();
    }
}
