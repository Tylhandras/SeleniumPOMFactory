package Factories.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DemoQAWidgetsAutoFactory {
    private WebDriver driver;

    @FindBy(css = "#autoCompleteMultipleInput")
    private WebElement multiIn;

    private By multiInValue = By.className("css-12jo7m5");

    @FindBy(css = "#autoCompleteSingleInput")
    private WebElement singleIn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement singleInValue;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    private WebElement deleteAll;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
    private WebElement deleteItem;

    public DemoQAWidgetsAutoFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setMultipleInput (String string) {
        multiIn.sendKeys(string);
        multiIn.sendKeys(Keys.RETURN);
    }

    public void setSingleInput (String string) {
        singleIn.sendKeys(string);
        singleIn.sendKeys(Keys.RETURN);
    }

    public String getMultipleInput () {
        List<WebElement> temp = driver.findElements(multiInValue);
        String output = "";

        for (WebElement iter : temp)
            output += (iter.getText() + " ");

        return output;
    }

    public String getSingleInput () { return singleInValue.getText(); }

    public void clearEntry () { deleteItem.click(); }

    public void clearALl() { deleteAll.click(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
