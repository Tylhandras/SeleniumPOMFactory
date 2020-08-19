package Factories.Interactions;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAInteractionsDropFactory {
    private WebDriver driver;

    @FindBy(css = "#droppableExample-tab-simple")
    private WebElement simpleTab;

    @FindBy(css = "#droppableExample-tab-accept")
    private WebElement acceptTab;

    @FindBy(css = "#droppableExample-tab-preventPropogation")
    private WebElement preventTab;

    @FindBy(css = "#droppableExample-tab-revertable")
    private WebElement revertTab;

    @FindBy(css = "#draggable")
    private WebElement simpleDrag;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")
    private WebElement simpleDrop;

    @FindBy(css = "#acceptable")
    private WebElement acceptDrag1;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
    private WebElement acceptDrag2;

    @FindBy(xpath = "//div[@id='acceptDropContainer']//div[@id='droppable']")
    private WebElement acceptDrop;

    @FindBy(css = "#dragBox")
    private WebElement preventDrag;

    @FindBy(css = "#notGreedyDropBox")
    private WebElement preventDropOuter1;

    @FindBy(css = "#notGreedyInnerDropBox")
    private WebElement preventDropInner1;

    @FindBy(css = "#greedyDropBox")
    private WebElement preventDropOuter2;

    @FindBy(css = "#greedyDropBoxInner")
    private WebElement preventDropInner2;

    @FindBy(css = "#revertable")
    private WebElement revertDrag1;

    @FindBy(css = "#notRevertable")
    private WebElement revertDrag2;

    @FindBy(xpath = "//div[@id='revertableDropContainer']//div[@id='droppable']")
    private WebElement revertDrop;

    public DemoQAInteractionsDropFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSimple () { simpleTab.click(); }

    public void clickAccept () { acceptTab.click(); }

    public void clickPrevent () { preventTab.click(); }

    public void clickRevert () { revertTab.click(); }

    public void moveSimple () {
        Actions action = new Actions(driver);

        action.dragAndDrop(simpleDrag, simpleDrop).build().perform();
    }

    public void moveAcceptOne () {
        Actions action = new Actions(driver);

        action.dragAndDrop(acceptDrag1, acceptDrop).build().perform();
    }

    public void moveAcceptTwo () {
        WebDriverWait wait = new WebDriverWait (driver, 30);
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOf(acceptDrag2));
        action.dragAndDrop(acceptDrag2, acceptDrop).build().perform();
    }

    public void movePrevent () {
        Actions action = new Actions(driver);

        action.dragAndDrop(preventDrag, preventDropInner1).build().perform();
    }

    public void movePreventGreedy () {
        Actions action = new Actions(driver);

        action.dragAndDrop(preventDrag, preventDropInner2).build().perform();
    }

    public void moveRevertOne () {
        Actions action = new Actions(driver);

        action.dragAndDrop(revertDrag1, revertDrop).build().perform();
    }

    public void moveRevertTwo () {
        WebDriverWait wait = new WebDriverWait (driver, 30);
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOf(revertDrag2));
        action.dragAndDrop(revertDrag2, revertDrop).build().perform();
    }

    public String getSimpleText () { return simpleDrop.getText(); }

    public String getAcceptText () { return acceptDrop.getText(); }

    public String getNotGreedyText () { return preventDropOuter1.getText(); }

    public String getGreedyText () { return preventDropOuter2.getText(); }

    public String getRevertText () { return revertDrop.getText(); }

    public String getUrl () { return driver.getCurrentUrl(); }

    public Point getSimplePosition () { return simpleDrag.getLocation(); }

    public Point getAcceptPositionOne () { return acceptDrag1.getLocation(); }

    public Point getAcceptPositionTwo () { return acceptDrag2.getLocation(); }

    public Point getPreventPosition () { return preventDrag.getLocation(); }

    public Point getRevertPositionOne () { return revertDrag1.getLocation(); }

    public Point getRevertPositionTwo () { return revertDrag2.getLocation(); }

    public void pageRefresh() { driver.navigate().refresh(); }

    public void movementWait () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.attributeToBe(revertDrag1, "class", "drag-box mt-4 ui-draggable ui-draggable-handle"));
    }
}
