package Factories.Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAAlertsModalFactory {
    private WebDriver driver;

    @FindBy (css = "#showSmallModal")
    private WebElement smallModal;

    @FindBy (css = "#showLargeModal")
    private WebElement largeModal;

    @FindBy (css = "#closeSmallModal")
    private WebElement closeSmall;

    @FindBy (css = "#closeLargeModal")
    private WebElement closeLarge;

    @FindBy (xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]")
    private WebElement modalBody;

    public DemoQAAlertsModalFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSmallModal () { smallModal.click(); }

    public void clickLargeModal () { largeModal.click(); }

    public void closeSmallModal () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.visibilityOf(closeSmall));
        closeSmall.click();
    }

    public void closeLargeModal () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.visibilityOf(closeLarge));
        closeLarge.click();
    }

    public String getModalText () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.visibilityOf(modalBody));
        return modalBody.getText();
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
