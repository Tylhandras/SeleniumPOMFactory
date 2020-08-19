package Factories.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAElementsButtonFactory {
    private WebDriver driver;

    @FindBy(css = "#doubleClickBtn")
    private WebElement doubleClick;

    @FindBy(css = "#rightClickBtn")
    private WebElement rightClick;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]")
    private WebElement singleClick;

    @FindBy(css = "#doubleClickMessage")
    private WebElement doubleMessage;

    @FindBy(css = "#rightClickMessage")
    private WebElement rightMessage;

    @FindBy(css = "#dynamicClickMessage")
    private WebElement singleMessage;

    public DemoQAElementsButtonFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDouble() {
        Actions action = new Actions(driver);

        action.doubleClick(doubleClick).perform();
    }

    public void clickRight() {
        Actions action = new Actions(driver);

        action.contextClick(rightClick).perform();
    }

    public void clickSingle() { singleClick.click(); }

    public String getDoubleMessage () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(doubleMessage));

        return doubleMessage.getText();
    }

    public String getRightMessage () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(rightMessage));

        return rightMessage.getText();
    }

    public String getSingleMessage () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(singleMessage));

        return singleMessage.getText();
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
