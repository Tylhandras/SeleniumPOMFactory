package Factories.Widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAWidgetsTabsFactory {
    private WebDriver driver;

    @FindBy(css = "#demo-tab-what")
    private WebElement tab1;

    @FindBy(css = "#demo-tabpane-what")
    private WebElement tab1Content;

    @FindBy(css = "#demo-tab-origin")
    private WebElement tab2;

    @FindBy(css = "#demo-tabpane-origin")
    private WebElement tab2Content;

    @FindBy(css = "#demo-tab-use")
    private WebElement tab3;

    @FindBy(css = "#demo-tabpane-use")
    private WebElement tab3Content;

    public DemoQAWidgetsTabsFactory (WebDriver driver) {
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

    public boolean getTab1Content () { return tab1Content.isDisplayed(); }

    public boolean getTab2Content () { return tab2Content.isDisplayed(); }

    public boolean getTab3Content () { return tab3Content.isDisplayed(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
