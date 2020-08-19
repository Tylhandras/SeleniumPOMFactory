package Factories.Widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAWidgetsMenuFactory {
    private WebDriver driver;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]")
    private WebElement mainItem1;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]")
    private WebElement mainItem2;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[1]")
    private WebElement Item2Sub1;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[2]")
    private WebElement Item2Sub2;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[3]")
    private WebElement Item2Sub3;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[1]")
    private WebElement Item2Leaf1;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[2]")
    private WebElement Item2Leaf2;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[3]")
    private WebElement mainItem3;

    public DemoQAWidgetsMenuFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void hoverMenu1 () {
        Actions action = new Actions(driver);

        action.moveToElement(mainItem1).build().perform();
    }

    public void hoverMenu2 () {
        Actions action = new Actions(driver);

        action.moveToElement(mainItem2).build().perform();
    }

    public void hoverMenu3 () {
        Actions action = new Actions(driver);

        action.moveToElement(mainItem3).build().perform();
    }

    public void hoverMenu2Sub1 () {
        Actions action = new Actions(driver);

        action.moveToElement(Item2Sub1).build().perform();
    }

    public void hoverMenu2Sub2 () {
        Actions action = new Actions(driver);

        action.moveToElement(Item2Sub2).build().perform();
    }

    public void hoverMenu2Sub3 () {
        Actions action = new Actions(driver);

        action.moveToElement(Item2Sub3).build().perform();
    }

    public void hoverMenu2Leaf1 () {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOf(Item2Leaf1));
        action.moveToElement(Item2Leaf1).build().perform();
    }

    public void hoverMenu2Leaf2 () {
        Actions action = new Actions(driver);

        action.moveToElement(Item2Leaf2).build().perform();
    }

    public String getBackgroundMenu1 () { return mainItem1.getCssValue("background-color"); }

    public String getBackgroundMenu2 () { return mainItem2.getCssValue("background-color"); }

    public String getBackgroundMenu3 () { return mainItem3.getCssValue("background-color"); }

    public String getBackgroundSub1 () { return Item2Sub1.getCssValue("background-color"); }

    public String getBackgroundSub2 () { return Item2Sub2.getCssValue("background-color"); }

    public String getBackgroundSub3 () { return Item2Sub3.getCssValue("background-color"); }

    public String getBackgroundLeaf1 () { return Item2Leaf1.getCssValue("background-color"); }

    public String getBackgroundLeaf2 () { return Item2Leaf2.getCssValue("background-color"); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
