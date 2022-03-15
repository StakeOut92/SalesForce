package pompages;

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

    public void OpenCreatedAccountModal() {
        LOGGER.info("OpenCreatedAccountModal method started");
        LOGGER.debug("Debug");
        LOGGER.trace("Trace");
        driver.findElement(NEW_BUTTON).click();
    }
    public void openAccountsTab(){
        LOGGER.info("openAccountsTab method started");
        LOGGER.debug("Debug");
        LOGGER.trace("Trace");
        driver.get(WebUrls.SALESFORCE_ACCOUNT_URL);
    }
}
