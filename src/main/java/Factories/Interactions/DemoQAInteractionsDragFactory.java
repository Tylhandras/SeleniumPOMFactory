package Factories.Interactions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQAInteractionsDragFactory {
    private WebDriver driver;

    @FindBy(css = "#draggableExample-tab-simple")
    private WebElement simpleTab;

    @FindBy(css = "#draggableExample-tab-axisRestriction")
    private WebElement axisTab;

    @FindBy(css = "#draggableExample-tab-containerRestriction")
    private WebElement containerTab;

    @FindBy(css = "#draggableExample-tab-cursorStyle")
    private WebElement cursorTab;

    @FindBy(css = "#dragBox")
    private WebElement simpleDrag;

    @FindBy(css = "#restrictedX")
    private WebElement axisDragX;

    @FindBy(css = "#restrictedY")
    private WebElement axisDragY;

    @FindBy(xpath = "//div[@class='draggable ui-widget-content ui-draggable ui-draggable-handle']")
    private WebElement containerDrag1;

    @FindBy(xpath = "//span[@class='ui-widget-header ui-draggable ui-draggable-handle']")
    private WebElement containerDrag2;

    @FindBy(css = "#cursorCenter")
    private WebElement cursorDrag1;

    @FindBy(css = "#cursorTopLeft")
    private WebElement cursorDrag2;

    @FindBy(css = "#cursorBottom")
    private WebElement cursorDrag3;

    public DemoQAInteractionsDragFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSimple () { simpleTab.click(); }

    public void clickAxis () { axisTab.click(); }

    public void clickContainer () { containerTab.click(); }

    public void clickCursorTab () { cursorTab.click(); }

    public void moveSimple (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(simpleDrag, xOffset, yOffset).build().perform();
    }
    public void moveAxisX (int offset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(axisDragX, offset, 0).build().perform();
    }
    public void moveAxisY (int offset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(axisDragY, 0, offset).build().perform();
    }
    public void moveContainerOne (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(containerDrag1, xOffset, yOffset).build().perform();
    }
    public void moveContainerTwo (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(containerDrag2, xOffset, yOffset).build().perform();
    }
    public void moveCursorCenter (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(cursorDrag1, xOffset, yOffset).build().perform();
    }
    public void moveCursorLeft (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(cursorDrag2, xOffset, yOffset).build().perform();
    }
    public void moveCursorBottom (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(cursorDrag3, xOffset, yOffset).build().perform();
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public Point getSimplePosition () { return simpleDrag.getLocation(); }

    public Point getAxisXPosition () { return axisDragX.getLocation(); }

    public Point getAxisYPosition () { return axisDragY.getLocation(); }

    public Point getBoxPosition () { return containerDrag1.getLocation(); }

    public Point getParentPosition () { return containerDrag2.getLocation(); }

    public Point getCursorCenterPosition () { return cursorDrag1.getLocation(); }

    public Point getCursorLeftPosition () { return cursorDrag2.getLocation(); }

    public Point getCursorBottomPosition () { return cursorDrag3.getLocation(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
