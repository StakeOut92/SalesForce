package pompages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.NamesAndPasswords;
import staticdata.WebUrls;
import tests.SalesForceAccountTest;

public class LoginPage extends BasePage {

    private By USERNAME_INPUT = By.id("username");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("Login");
    private static final Logger LOGGER = LogManager.getLogger(SalesForceAccountTest.class.getName());

    public void openPage() {
        LOGGER.info("openPage method started");
        driver.get(WebUrls.SALESFORCE_LOGIN_URL);
    }

    public void makeLogin(){
        LOGGER.info("makeLogin method started");
        driver.findElement(USERNAME_INPUT).sendKeys(NamesAndPasswords.NAME);
        driver.findElement(PASSWORD_INPUT).sendKeys(NamesAndPasswords.PASSWORD);
        driver.findElement(LOGIN_BUTTON).click();
    }


    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
