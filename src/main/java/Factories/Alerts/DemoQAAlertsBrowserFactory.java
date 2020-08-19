package Factories.Alerts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class DemoQAAlertsBrowserFactory {
    private WebDriver driver;

    @FindBy (css = "#tabButton")
    private WebElement tabBtn;

    @FindBy (css = "#windowButton")
    private WebElement windowBtn;

    @FindBy (css = "#messageWindowButton")
    private WebElement msgWindowBtn;

    public DemoQAAlertsBrowserFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickTab () { tabBtn.click(); }

    public void clickWindow () { windowBtn.click(); }

    public void clickMessage () { msgWindowBtn.click(); }

    public int getNumTabsOpen () { return new ArrayList<String>(driver.getWindowHandles()).size(); }

    public int getNumWindowsOpen () { return new ArrayList<String>(driver.getWindowHandles()).size(); }

    public void closeTab () {
        ArrayList<String> windowHandles;
        WebDriverWait wait = new WebDriverWait (driver, 30);

        windowHandles = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
            }
        });
        driver.close();
        driver.switchTo().window(windowHandles.get(0));
    }

    public void closeWindow(boolean delay) {
        ArrayList<String> windowHandles;
        WebDriverWait wait = new WebDriverWait (driver, 30);
        String base = driver.getWindowHandle();

        windowHandles = new ArrayList<String>(driver.getWindowHandles());
        windowHandles.remove(base);
        driver.switchTo().window(windowHandles.get(0));
        if (delay) {
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
                }
            });
            driver.close();
        }
        else
            driver.close();

        driver.switchTo().window(base);
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
