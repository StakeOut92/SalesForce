package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class AccountsPage extends BasePage {
    private By NEW_BUTTON = By.xpath("//div[text()='New']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public void OpenCreatedAccountModal() {
        driver.findElement(NEW_BUTTON).click();
    }
    public void openAccountsTab(){
        driver.get(WebUrls.SALESFORCE_ACCOUNT_URL);
    }
}
