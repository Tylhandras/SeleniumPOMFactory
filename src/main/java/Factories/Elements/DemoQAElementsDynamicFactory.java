package Factories.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAElementsDynamicFactory {
    private WebDriver driver;

    @FindBy(css = "#enableAfter")
    private WebElement enableBtn;

    @FindBy(css = "#colorChange")
    private WebElement colorBtn;

    @FindBy(css = "#visibleAfter")
    private WebElement invisibleBtn;

    public DemoQAElementsDynamicFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void runInvisible () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(invisibleBtn));
    }

    public boolean getVisible () { return invisibleBtn.isDisplayed(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
