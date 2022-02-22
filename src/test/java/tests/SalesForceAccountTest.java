package tests;

import org.testng.annotations.Test;
import pompages.AccountsPage;
import pompages.CreateAccountPage;
import pompages.LoginPage;

public class SalesForceAccountTest extends BaseTest {
    LoginPage loginPage;

    @Test
    public void loginTest(){
        loginPage = new LoginPage(driver);
        loginPage.OpenPage();
        loginPage.makeLogin();
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.openAccountsTab();
        accountsPage.OpenCreatedAccountModal();
        System.out.println("");
    }
}
