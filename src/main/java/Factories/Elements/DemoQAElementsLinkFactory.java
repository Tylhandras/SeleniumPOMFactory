package Factories.Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class DemoQAElementsLinkFactory {
    private WebDriver driver;

    @FindBy(css = "#simpleLink")
    private WebElement home;

    @FindBy(css = "#dynamicLink")
    private WebElement dynamicHome;

    @FindBy(css = "#created")
    private WebElement created;

    @FindBy(css = "#no-content")
    private WebElement noContent;

    @FindBy(css = "#moved")
    private WebElement moved;

    @FindBy(css = "#bad-request")
    private WebElement badRequest;

    @FindBy(css = "#unauthorized")
    private WebElement unauthorized;

    @FindBy(css = "#forbidden")
    private WebElement forbidden;

    @FindBy(css = "#invalid-url")
    private WebElement notFound;

    @FindBy(css = "#linkResponse")
    private WebElement linkResponse;

    public DemoQAElementsLinkFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickHome () { home.click(); }

    public void clickDynamicHome () { dynamicHome.click(); }

    public void clickCreated () { created.click(); }

    public void clickNoContent () { noContent.click(); }

    public void clickMoved () { moved.click(); }

    public void clickBadRequest () { badRequest.click(); }

    public void clickUnauthorized () { unauthorized.click(); }

    public void clickForbidden () { forbidden.click(); }

    public void clickNotFound () { notFound.click(); }

    public void closeTab () {
        ArrayList<String> windowHandles;
        WebDriverWait wait = new WebDriverWait (driver, 30);
        JavascriptExecutor js = (JavascriptExecutor) driver;

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

    public String getUrl () { return driver.getCurrentUrl(); }

    public String getResponse () { return linkResponse.getText(); }

    public int getNumTabsOpen () { return new ArrayList<String>(driver.getWindowHandles()).size(); }

    public void refreshPage () { driver.navigate().refresh(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
