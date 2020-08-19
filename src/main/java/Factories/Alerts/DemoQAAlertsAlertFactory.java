package Factories.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAAlertsAlertFactory {
    private WebDriver driver;

    @FindBy(css = "#alertButton")
    private WebElement alertBtn;

    @FindBy(css = "#timerAlertButton")
    private WebElement delayBtn;

    @FindBy(css = "#confirmButton")
    private WebElement confirmBtn;

    @FindBy(css = "#promtButton")
    private WebElement promptBtn;

    public DemoQAAlertsAlertFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAlert() { alertBtn.click(); }

    public void clickDelay() { delayBtn.click(); }

    public void clickConfirm() { confirmBtn.click(); }

    public void clickPrompt() { promptBtn.click(); }

    public void ackAlert() {
        Alert alert = driver.switchTo().alert();

        alert.accept();
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();

        alert.dismiss();
    }

    public void setAlert(String string) {
        Alert alert = driver.switchTo().alert();

        alert.sendKeys(string);
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public boolean isAlertPresent() {
        WebDriverWait wait = new WebDriverWait (driver, 30);
        wait.until(ExpectedConditions.alertIsPresent());

        try {
            driver.switchTo().alert();
            return true;
        }
        catch (NoAlertPresentException Ex) { return false; }
    }
}
