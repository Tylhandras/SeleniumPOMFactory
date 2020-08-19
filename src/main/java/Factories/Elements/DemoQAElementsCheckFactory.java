package Factories.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DemoQAElementsCheckFactory {
    private WebDriver driver;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement expand;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[2]")
    private WebElement collapse;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/button[1]")
    private WebElement rootToggle;

    @FindBy(css = "#tree-node-home")
    private WebElement rootNode;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]")
    private WebElement branch1Toggle;

    @FindBy(css = "#tree-node-desktop")
    private WebElement branch1Node;

    @FindBy(css = "#tree-node-notes")
    private WebElement branch1Leaf1Node;

    @FindBy(css = "#tree-node-commands")
    private WebElement branch1Leaf2Node;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]")
    private WebElement branch2Toggle;

    @FindBy(css = "#tree-node-documents")
    private WebElement branch2Node;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/button[1]")
    private WebElement branch2Sub1Toggle;

    @FindBy(css = "#tree-node-workspace")
    private WebElement branch2Sub1Node;

    @FindBy(css = "#tree-node-react")
    private WebElement branch2Sub1Leaf1Node;

    @FindBy(css = "#tree-node-angular")
    private WebElement branch2Sub1Leaf2Node;

    @FindBy(css = "#tree-node-veu")
    private WebElement branch2Sub1Leaf3Node;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/button[1]")
    private WebElement branch2Sub2Toggle;

    @FindBy(css = "#tree-node-office")
    private WebElement branch2Sub2Node;

    @FindBy(css = "#tree-node-public")
    private WebElement branch2Sub2Leaf1Node;

    @FindBy(css = "#tree-node-private")
    private WebElement branch2Sub2Leaf2Node;

    @FindBy(css = "#tree-node-classified")
    private WebElement branch2Sub2Leaf3Node;

    @FindBy(css = "#tree-node-general")
    private WebElement branch2Sub2Leaf4Node;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/button[1]")
    private WebElement branch3Toggle;

    @FindBy(css = "#tree-node-downloads")
    private WebElement branch3Node;

    @FindBy(css = "#tree-node-wordFile")
    private WebElement branch3Leaf1Node;

    @FindBy(css = "#tree-node-excelFile")
    private WebElement branch3Leaf2Node;

    public DemoQAElementsCheckFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickExpand () { expand.click(); }

    public void clickCollapse () { collapse.click(); }

    public void clickHomeTog () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", rootToggle);
    }

    public void clickHomeCheck () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", rootNode);
    }

    public void clickDeskTog () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch1Toggle);
    }

    public void clickDeskCheck () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch1Node);
    }

    public void clickNotes () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch1Leaf1Node);
    }

    public void clickCommands () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch1Leaf2Node);
    }

    public void clickDocTog () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Toggle);
    }

    public void clickDocCheck () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Node);
    }

    public void clickWorkTog () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Sub1Toggle);
    }

    public void clickWorkCheck () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Sub1Node);
    }

    public void clickReact () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Sub1Leaf1Node);
    }

    public void clickAngular () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Sub1Leaf2Node);
    }

    public void clickVeu () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Sub1Leaf3Node);
    }

    public void clickOfficeTog () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Sub2Toggle);
    }

    public void clickOfficeCheck () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Sub2Node);
    }

    public void clickPublic () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Sub2Leaf1Node);
    }

    public void clickPrivate () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Sub2Leaf2Node);
    }

    public void clickClassified () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Sub2Leaf3Node);
    }

    public void clickGeneral () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch2Sub2Leaf4Node);
    }

    public void clickDownTog () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch3Toggle);
    }

    public void clickDownCheck () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch3Node);
    }

    public void clickWordFile () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch3Leaf1Node);
    }

    public void clickExcelFile () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", branch3Leaf2Node);
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public String getBoxesList() {
        List<WebElement> elementList = driver.findElements(By.tagName("input"));
        String output = "";

        for (WebElement element : elementList) {
            if (element.isSelected())
                output += element.getAttribute("id");
        }

        return output;
    }
}
