package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextInputFileds {
    WebDriver driver;
    String label;
    String textareaXpath = "//article[contains(., 'New Account')]//label[contains(., '%s')]/following-sibling::textarea";

    public TextInputFileds(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void textInputText(String text) {
        textareaXpath = String.format(textareaXpath, label);
        driver.findElement(By.xpath(textareaXpath)).sendKeys(text);
    }
}
