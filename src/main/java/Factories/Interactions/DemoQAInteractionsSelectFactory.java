package Factories.Interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;

public class DemoQAInteractionsSelectFactory {
    private WebDriver driver;

    @FindBy(css = "#demo-tab-list")
    private WebElement list;

    @FindBy(css = "#demo-tab-grid")
    private WebElement grid;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]")
    private WebElement listOne;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]")
    private WebElement listTwo;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]")
    private WebElement listThree;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]")
    private WebElement listFour;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/li[1]")
    private WebElement gridOne;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/li[2]")
    private WebElement gridTwo;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/li[3]")
    private WebElement gridThree;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/li[1]")
    private WebElement gridFour;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/li[2]")
    private WebElement gridFive;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/li[3]")
    private WebElement gridSix;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/li[1]")
    private WebElement gridSeven;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/li[2]")
    private WebElement gridEight;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/li[3]")
    private WebElement gridNine;

    public DemoQAInteractionsSelectFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSelectList () { list.click(); }

    public void clickSelectGrid () { grid.click(); }

    public void clickList1 () { listOne.click(); }

    public void clickList2 () { listTwo.click(); }

    public void clickList3 () { listThree.click(); }

    public void clickList4 () { listFour.click(); }

    public void clickGrid1 () { gridOne.click(); }

    public void clickGrid2 () { gridTwo.click(); }

    public void clickGrid3 () { gridThree.click(); }

    public void clickGrid4 () { gridFour.click(); }

    public void clickGrid5 () { gridFive.click(); }

    public void clickGrid6 () { gridSix.click(); }

    public void clickGrid7 () { gridSeven.click(); }

    public void clickGrid8 () { gridEight.click(); }

    public void clickGrid9 () { gridNine.click(); }

    public boolean elementHasClass(WebElement element) {
        return Arrays.asList(element.getAttribute("class").split(" ")).contains("active");
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public String getSelectList () {
        String output = "";

        if (elementHasClass(listOne))
            output += "1 ";
        if (elementHasClass(listTwo))
            output += "2 ";
        if (elementHasClass(listThree))
            output += "3 ";
        if (elementHasClass(listFour))
            output += "4 ";
        System.out.println(output);

        return output;
    }

    public String getSelectGrid () {
        String output = "";

        if (elementHasClass(gridOne))
            output += "1 ";
        if (elementHasClass(gridTwo))
            output += "2 ";
        if (elementHasClass(gridThree))
            output += "3 ";
        if (elementHasClass(gridFour))
            output += "4 ";
        if (elementHasClass(gridFive))
            output += "5 ";
        if (elementHasClass(gridSix))
            output += "6 ";
        if (elementHasClass(gridSeven))
            output += "7 ";
        if (elementHasClass(gridEight))
            output += "8 ";
        if (elementHasClass(gridNine))
            output += "9 ";

        return output;
    }
}
