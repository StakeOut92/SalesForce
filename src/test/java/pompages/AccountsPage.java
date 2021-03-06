package pompages;

import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;
import tests.SalesForceAccountTest;

public class AccountsPage extends BasePage {
    private By NEW_BUTTON = By.xpath("//div[text()='New']");
    private static final Logger LOGGER = LogManager.getLogger(SalesForceAccountTest.class.getName());

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click to 'New Button'")
    public void OpenCreatedAccountModal() {
        LOGGER.info("OpenCreatedAccountModal method started");
        driver.findElement(NEW_BUTTON).click();
    }
    @Step("Open url to creation account tab")
    public void openAccountsTab(){
        LOGGER.info("openAccountsTab method started");
        driver.get(WebUrls.SALESFORCE_ACCOUNT_URL);
    }
}
