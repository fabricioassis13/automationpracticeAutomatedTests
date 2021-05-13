package Validations;

import Tasks.TasksAbstraction;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ItemDescriptionValidations extends TasksAbstraction {

    public ItemDescriptionValidations(WebDriver driver) {
        super(driver);
    }

    public void validateItemAddedToCart(){
        String label = itemDescriptionPage.modalProductLabel.getText();

        Assertions.assertEquals("Product successfully added to your shopping cart", label);
    }

    public void validateNextPage(){
        String fullLabel = cartSummaryPage.summaryPageLabel.getText();
        String[] labelVet = fullLabel.split("Your");
        String label = labelVet[0].replace("\n", "");

        Assertions.assertEquals("SHOPPING-CART SUMMARY", label);
    }
}
