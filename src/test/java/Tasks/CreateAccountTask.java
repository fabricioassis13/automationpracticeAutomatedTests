package Tasks;

import Framework.Waits;
import Models.NewAccountModel;
import Utils.FakersGenerator;
import Utils.FileOperations;
import Utils.Sleeper;
import Validations.CreateAccountValidations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountTask extends CreateAccountValidations {

    private Waits waits;

    public CreateAccountTask(WebDriver driver) {
        super(driver);
        waits = new Waits(driver);
    }

    public void choiceCreateAccount(){
        String email = FakersGenerator.getEmail();

        createAccountPage.emailCreateTextField.sendKeys(email);
        FileOperations.setProperties("userData", "email", email);

        createAccountPage.creteAnAccountChoiceButton.click();
    }

    public void registerNewAccount(){
        NewAccountModel user = generateUser();

        //Fill the fields
        waits.loadElement(createAccountPage.maleRadioButton).click();

        createAccountPage.firstNameTextField.sendKeys(user.getFirstName());
        createAccountPage.lastNameTextField.sendKeys(user.getLastName());
        createAccountPage.passwordTextField.sendKeys(user.getPassword());

        select(createAccountPage.daysDateOfBirthDropdown).selectByValue("5");
        select(createAccountPage.monthsDateOfBirthDropdown).selectByValue("11");
        select(createAccountPage.yearsDateOfBirthDropdown).selectByValue("1998");
        createAccountPage.adressTextField.sendKeys(user.getAddress());
        createAccountPage.cityTextField.sendKeys(user.getCity());
        select(createAccountPage.stateDropdown).selectByValue("6");
        createAccountPage.postcodeTextField.sendKeys(user.getPostalCode());
        select(createAccountPage.countryDropdown).selectByValue("21");
        createAccountPage.phoneMobileTextField.sendKeys(user.getMobilePhone());
        createAccountPage.referenceTextField.sendKeys("AUTOMATED TESTS");

        saveUserData(user);

        createAccountPage.registerButton.click();

        waits.loadElement(addressPage.addressPageLabel);
        validateNextPage();
    }

    public NewAccountModel generateUser(){
        return new NewAccountModel(
                FakersGenerator.getFirstName(),
                FakersGenerator.getLastName(),
                FakersGenerator.getPassword(),
                FakersGenerator.getAddress(),
                FakersGenerator.getCity(),
                "12345",
                FakersGenerator.getMobilePhone()
        );
    }

    private void saveUserData(NewAccountModel user){
        FileOperations.setProperties("userData", "firstName", user.getFirstName());
        FileOperations.setProperties("userData", "lastName", user.getLastName());
        FileOperations.setProperties("userData", "password", user.getPassword());
        FileOperations.setProperties("userData", "adress", user.getAddress());
        FileOperations.setProperties("userData", "city", user.getCity());
        FileOperations.setProperties("userData", "postalCode", user.getPostalCode());
        FileOperations.setProperties("userData", "firstName", user.getMobilePhone());
    }

    private Select select(WebElement element){
        return new Select(element);
    }
}
