package Factories.Widgets;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoQAWidgetsSelectFactory {
    private WebDriver driver;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement valueSelect;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement valueContent;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]")
    private WebElement singleSelect;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement singleContent;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/select[1]")
    private WebElement oldSelect;

    @FindBy(css = "#react-select-2-option-0-0")
    private WebElement valueOption1;

    @FindBy(css = "#react-select-2-option-0-1")
    private WebElement valueOption2;

    @FindBy(css = "#react-select-2-option-1-0")
    private WebElement valueOption3;

    @FindBy(css = "#react-select-2-option-1-1")
    private WebElement valueOption4;

    @FindBy(css = "#react-select-2-option-2")
    private WebElement valueOption5;

    @FindBy(css = "#react-select-2-option-3")
    private WebElement valueOption6;

    @FindBy(css = "#react-select-3-option-0-0")
    private WebElement singleOption1;

    @FindBy(css = "#react-select-3-option-0-1")
    private WebElement singleOption2;

    @FindBy(css = "#react-select-3-option-0-2")
    private WebElement singleOption3;

    @FindBy(css = "#react-select-3-option-0-3")
    private WebElement singleOption4;

    @FindBy(css = "#react-select-3-option-0-4")
    private WebElement singleOption5;

    @FindBy(css = "#react-select-3-option-0-5")
    private WebElement singleOption6;

    public DemoQAWidgetsSelectFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickValueSelect () { valueSelect.click(); }

    public void clickSingleSelect () { singleSelect.click(); }

    public void clickValueOption1 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", valueOption1);
    }

    public void clickValueOption2 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", valueOption2);
    }

    public void clickValueOption3 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", valueOption3);
    }

    public void clickValueOption4 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", valueOption4);
    }

    public void clickValueOption5 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", valueOption5);
    }

    public void clickValueOption6 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", valueOption6);
    }

    public void clickSingleOption1 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", singleOption1);
    }

    public void clickSingleOption2 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", singleOption2);
    }

    public void clickSingleOption3 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", singleOption3);
    }

    public void clickSingleOption4 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", singleOption4);
    }

    public void clickSingleOption5 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", singleOption5);
    }

    public void clickSingleOption6 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", singleOption6);
    }

    public void clickOldSelect (int index) {
        Select drpColor = new Select(oldSelect);

        drpColor.selectByIndex(index);
    }

    public String getValueSelected () { return valueContent.getText(); }

    public String getSingleSelected () { return singleContent.getText(); }

    public String getOldSelected () {
        Select drpColor = new Select(oldSelect);

        return drpColor.getFirstSelectedOption().getText();
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
