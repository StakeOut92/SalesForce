package tests;

import io.qameta.allure.Description;
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
    @Description("Checking that the account was created, filling in all the fields when creating and receiving a message about the successful creation of the account")
    public void loginTest(){
        LOGGER.info("SalesForceAccountTest started");
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
