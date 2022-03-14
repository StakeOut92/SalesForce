package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.AccountsPage;
import pompages.CreateAccountPage;
import pompages.LoginPage;
import testdata.GetNewAccountModel;


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
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.saveNewAccountForm(GetNewAccountModel.getAccountWithAllFields());
        Assert.assertTrue(createAccountPage.isNewAccountSuccessfulCreated(),"Account is not created");
    }
}
