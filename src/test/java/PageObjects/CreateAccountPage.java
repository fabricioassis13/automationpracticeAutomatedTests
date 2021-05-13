package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

    @FindBy(xpath = "//*[@id='create-account_form']/h3")
    public WebElement createAccountLabel;

    @FindBy(id = "SubmitCreate")
    public WebElement creteAnAccountChoiceButton;

    @FindBy(id = "email_create")
    public WebElement emailCreateTextField;

    //Form
    @FindBy(id = "id_gender1")
    public WebElement maleRadioButton;

    @FindBy(id = "id_gender2")
    public WebElement femaleRadioButton;

    @FindBy(id = "customer_firstname")
    public WebElement firstNameTextField;

    @FindBy(id = "customer_lastname")
    public WebElement lastNameTextField;

    @FindBy(id = "passwd")
    public WebElement passwordTextField;

    @FindBy(id = "days")
    public WebElement daysDateOfBirthDropdown;

    @FindBy(id = "months")
    public WebElement monthsDateOfBirthDropdown;

    @FindBy(id = "years")
    public WebElement yearsDateOfBirthDropdown;

    @FindBy(id = "address1")
    public WebElement adressTextField;

    @FindBy(id = "city")
    public WebElement cityTextField;

    @FindBy(id = "id_state")
    public WebElement stateDropdown;

    @FindBy(id = "postcode")
    public WebElement postcodeTextField;

    @FindBy(id = "id_country")
    public WebElement countryDropdown;

    @FindBy(id = "phone_mobile")
    public WebElement phoneMobileTextField;

    @FindBy(id = "alias")
    public WebElement referenceTextField;

    @FindBy(id = "submitAccount")
    public WebElement registerButton;

    public CreateAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
