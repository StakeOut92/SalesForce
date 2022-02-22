package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.NamesAndPasswords;
import staticdata.WebUrls;

public class LoginPage extends BasePage {

    private By USERNAME_INPUT = By.id("username");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("Login");

    public void OpenPage() {
        driver.get(WebUrls.SALESFORCE_LOGIN_URL);
    }

    public void makeLogin(){
        driver.findElement(USERNAME_INPUT).sendKeys(NamesAndPasswords.NAME);
        driver.findElement(PASSWORD_INPUT).sendKeys(NamesAndPasswords.PASSWORD);
        driver.findElement(LOGIN_BUTTON).click();
    }


    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
