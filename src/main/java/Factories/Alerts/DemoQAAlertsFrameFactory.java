package Factories.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQAAlertsFrameFactory {
    private WebDriver driver;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/iframe[1]")
    private WebElement frame1;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/iframe[1]")
    private WebElement frame2;

    public DemoQAAlertsFrameFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void switchToFrame1 () { driver.switchTo().frame(frame1); }

    public void switchToFrame2 () { driver.switchTo().frame(frame2); }

    public void returnToPage () { driver.switchTo().defaultContent(); }

    public String getFrame1Text () { return driver.findElement(By.cssSelector("#sampleHeading")).getText(); }

    public String getFrame2Text () { return driver.findElement(By.cssSelector("#sampleHeading")).getText(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
