package pompages;

import elements.DropDownList;
import elements.InputFields;
import elements.TextInputFileds;
import io.qameta.allure.Step;
import models.SalesForceAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.SalesForceAccountTest;

public class CreateAccountPage extends BasePage {

    private By SEARCH_INPUT = By.xpath("//article[contains(., 'New Account')]//label[contains(., 'Account Name')]/following-sibling::div//input");
    private By SAVE_BUTTON = By.xpath("//button[@title='Save']");
    private static final Logger LOGGER = LogManager.getLogger(SalesForceAccountTest.class.getName());


    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
    @Step("Input values in all fields and click 'Save Button'")
    public void saveNewAccountForm(SalesForceAccountModel accountModel) {
        LOGGER.info("saveNewAccountForm method started");
        driver.findElement(SEARCH_INPUT).sendKeys(accountModel.getAccountName());
        new InputFields(driver, "Phone").inputText(accountModel.getPhone());
        new InputFields(driver, "Fax").inputText(accountModel.getFax());
        new InputFields(driver, "Website").inputText(accountModel.getWebsite());
        new DropDownList(driver, "Type").selectOption(accountModel.getType());
        new DropDownList(driver, "Industry").selectOption(accountModel.getIndustry());
        new InputFields(driver, "Employees").inputText(accountModel.getEmployees());
        new InputFields(driver, "Annual Revenue").inputText(accountModel.getAnnualRevenue());
        new TextInputFileds(driver, "Description").textInputText(accountModel.getDescription());
        new TextInputFileds(driver, "Billing Street").textInputText(accountModel.getBillingStreet());
        new TextInputFileds(driver, "Shipping Street").textInputText(accountModel.getShippingStreet());
        new InputFields(driver, "Shipping City").inputText(accountModel.getShippingCity());
        new InputFields(driver, "Shipping Zip/Postal Code").inputText(accountModel.getShippingZipPostalCode());
        new InputFields(driver, "Shipping State/Province").inputText(accountModel.getShippingStateProvince());
        new InputFields(driver, "Shipping Country").inputText(accountModel.getShippingCountry());
        new InputFields(driver, "Billing City").inputText(accountModel.getBillingCity());
        new InputFields(driver, "Billing State/Province").inputText(accountModel.getBillingStateProvince());
        new InputFields(driver, "Billing Zip/Postal Code").inputText(accountModel.getBillingZipPostalCode());
        new InputFields(driver, "Billing Country").inputText(accountModel.getBillingCountry());
        driver.findElement(SAVE_BUTTON).click();
    }
    @Step("Check that 'Successful account creation' is displayed")
    public boolean isNewAccountSuccessfulCreated() {
        LOGGER.info("isNewAccountSuccessfulCreated method started");
        driver.findElement(By.xpath("//div[@data-aura-class='forceToastMessage']")).isDisplayed();
        return true;
    }

}
