package Factories.Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQAElementsRadioFactory {
    private WebDriver driver;

    @FindBy(css = "#yesRadio")
    private WebElement yesBtn;

    @FindBy(css = "#impressiveRadio")
    private WebElement impressBtn;

    public DemoQAElementsRadioFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickYesBtn () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", yesBtn);
    }

    public void clickImpress () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", impressBtn);
    }

    public boolean getRadioYes () { return yesBtn.isSelected(); }

    public boolean getRadioImpressive () { return impressBtn.isSelected(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
