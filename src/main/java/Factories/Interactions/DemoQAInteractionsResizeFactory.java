package Factories.Interactions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class DemoQAInteractionsResizeFactory {
    private WebDriver driver;

    @FindBy(css = "#resizableBoxWithRestriction")
    private WebElement restrictedResize;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]")
    private WebElement restrictedMove;

    @FindBy(css = "#resizable")
    private WebElement unrestrictedResize;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/span[1]")
    private WebElement unrestrictedMove;

    public DemoQAInteractionsResizeFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickResizeOne (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.clickAndHold(restrictedMove).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickResizeTwo (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.clickAndHold(unrestrictedMove).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public Point getSizeOne () {
        return new Point(restrictedResize.getSize().getHeight(), restrictedResize.getSize().getWidth());
    }

    public Point getSizeTwo () {
        return new Point(unrestrictedResize.getSize().getHeight(), unrestrictedResize.getSize().getWidth());
    }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
