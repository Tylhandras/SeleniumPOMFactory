package Factories.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DemoQAInteractionsSortFactory {
    private WebDriver driver;

    @FindBy(css = "#demo-tab-list")
    private WebElement list;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
    private WebElement listContent;

    @FindBy(css = "#demo-tab-grid")
    private WebElement grid;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement gridContent ;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement listOne;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")
    private WebElement listTwo;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]")
    private WebElement listThree;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]")
    private WebElement listFour;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]")
    private WebElement listFive;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]")
    private WebElement listSix;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement gridOne;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
    private WebElement gridTwo;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]")
    private WebElement gridThree;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]")
    private WebElement gridFour;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]")
    private WebElement gridFive;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]")
    private WebElement gridSix;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]")
    private WebElement gridSeven;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]")
    private WebElement gridEight;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]")
    private WebElement gridNine;

    public DemoQAInteractionsSortFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSortList () { list.click(); }

    public void clickSortGrid () { grid.click(); }

    public void clickListOne (int offset) {
        Actions action = new Actions(driver);

        action.click(listOne).clickAndHold().moveByOffset(0, offset).release().build().perform();
    }

    public void clickListTwo (int offset) {
        Actions action = new Actions(driver);

        action.click(listTwo).clickAndHold().moveByOffset(0, offset).release().build().perform();
    }

    public void clickListThree (int offset) {
        Actions action = new Actions(driver);

        action.click(listThree).clickAndHold().moveByOffset(0, offset).release().build().perform();
    }

    public void clickListFour (int offset) {
        Actions action = new Actions(driver);

        action.click(listFour).clickAndHold().moveByOffset(0, offset).release().build().perform();
    }

    public void clickListFive (int offset) {
        Actions action = new Actions(driver);

        action.click(listFive).clickAndHold().moveByOffset(0, offset).release().build().perform();
    }

    public void clickListSix (int offset) {
        Actions action = new Actions(driver);

        action.click(listSix).clickAndHold().moveByOffset(0, offset).release().build().perform();
    }

    public void clickGridOne (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(gridOne).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridTwo (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(gridTwo).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridThree (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(gridThree).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridFour (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(gridFour).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridFive (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(gridFive).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridSix (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(gridSix).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridSeven (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(gridSeven).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridEight (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(gridEight).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridNine (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(gridNine).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public String getListOrder () {
        List<WebElement> order = driver.findElements(By.xpath("//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action']"));
        String output = "";

        for (WebElement element : order)
            output += (element.getText() + " ");

        return output;
    }

    public String getGridOrder () {
        List<WebElement> order = driver.findElements(By.xpath("//div[@class='create-grid']//div[@class='list-group-item list-group-item-action']"));
        String output = "";

        for (WebElement element : order)
            output += (element.getText() + " ");

        return output;
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
