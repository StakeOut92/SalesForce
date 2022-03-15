package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.AccountsPage;
import pompages.CreateAccountPage;
import pompages.LoginPage;
import testdata.GetNewAccountModel;


public class SalesForceAccountTest extends BaseTest {
    LoginPage loginPage;
    private static final Logger LOGGER = LogManager.getLogger(SalesForceAccountTest.class.getName());
    @Test
    public void loginTest(){
        LOGGER.info("SalesForceAccountTest started");
        LOGGER.debug("Debug");
        LOGGER.trace("Trace");
        loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.makeLogin();
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.openAccountsTab();
        accountsPage.OpenCreatedAccountModal();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.saveNewAccountForm(GetNewAccountModel.getAccountWithAllFields());
        Assert.assertTrue(createAccountPage.isNewAccountSuccessfulCreated(),"Account is not created");
    }
}
