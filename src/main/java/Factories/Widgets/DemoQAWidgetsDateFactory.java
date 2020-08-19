package Factories.Widgets;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQAWidgetsDateFactory {
    private WebDriver driver;

    @FindBy(css = "#datePickerMonthYearInput")
    private WebElement date;

    @FindBy(css = "#dateAndTimePickerInput")
    private WebElement dateTime;

    public DemoQAWidgetsDateFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setDate (String string) {
        date.sendKeys(Keys.CONTROL + "a");
        date.sendKeys(string);
        date.sendKeys(Keys.RETURN);
    }

    public void setDayAndTime (String string) {
        dateTime.sendKeys(Keys.CONTROL + "a");
        dateTime.sendKeys(string);
        dateTime.sendKeys(Keys.RETURN);
    }

    public String getDate () { return date.getAttribute("value"); }

    public String getDayAndTime () { return dateTime.getAttribute("value"); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
