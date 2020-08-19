package Factories.Widgets;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAWidgetsTipsFactory {
    private WebDriver driver;

    @FindBy(css = "#toolTipButton")
    private WebElement tipButton;

    @FindBy(css = "#toolTipTextField")
    private WebElement tipTextBox;

    @FindBy(xpath = "//a[contains(text(),'Contrary')]")
    private WebElement tipText1;

    @FindBy(xpath = "//a[contains(text(),'1.10.32')]")
    private WebElement tipText2;

    @FindBy(id = "buttonToolTip")
    private WebElement tipBtnContent;

    @FindBy(id = "textFieldToolTip")
    private WebElement tipBoxContent;

    @FindBy(id = "contraryTexToolTip")
    private WebElement text1Content;

    @FindBy(id = "sectionToolTip")
    private WebElement text2Content;

    public DemoQAWidgetsTipsFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void hoverButton () {
        Actions action = new Actions(driver);

        action.moveToElement(tipButton).build().perform();
    }

    public void hoverBox () {
        Actions action = new Actions(driver);

        action.moveToElement(tipTextBox).build().perform();
    }

    public void hoverTextOne () {
        Actions action = new Actions(driver);

        action.moveToElement(tipText1).build().perform();
    }

    public void hoverTextTwo () {
        Actions action = new Actions(driver);

        action.moveToElement(tipText2).build().perform();
    }

    public boolean getHoverButton () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOf(tipBtnContent));
        return tipBtnContent.isDisplayed();
    }

    public boolean getHoverBox () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOf(tipBoxContent));
        return tipBoxContent.isDisplayed();
    }

    public boolean getHoverText1 () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOf(text1Content));
        return text1Content.isDisplayed();
    }

    public boolean getHoverText2 () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOf(text2Content));
        return text2Content.isDisplayed();
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
