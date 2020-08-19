package Factories.Widgets;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAWidgetsAccordianFactory {
    private WebDriver driver;

    @FindBy(css = "#section1Heading")
    private WebElement tab1;

    @FindBy(css = "#section1Content")
    private WebElement tab1Content;

    @FindBy(css = "#section2Heading")
    private WebElement tab2;

    @FindBy(css = "#section2Content")
    private WebElement tab2Content;

    @FindBy(css = "#section3Heading")
    private WebElement tab3;

    @FindBy(css = "#section3Content")
    private WebElement tab3Content;

    public DemoQAWidgetsAccordianFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickTab1 () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        tab1.click();
        wait.until(ExpectedConditions.visibilityOf(tab1Content));
    }

    public void clickTab2 () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        tab2.click();
        wait.until(ExpectedConditions.visibilityOf(tab2Content));
    }

    public void clickTab3 () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        tab3.click();
        wait.until(ExpectedConditions.visibilityOf(tab3Content));
    }

    public boolean getTab1 () { return tab1Content.isDisplayed(); }

    public boolean getTab2 () { return tab2Content.isDisplayed(); }

    public boolean getTab3 () { return tab3Content.isDisplayed(); }

    public String getUrl () { return driver.getCurrentUrl(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
