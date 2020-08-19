package Factories.Widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAWidgetsProgressFactory {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class='progress-bar bg-info']")
    private WebElement progressBar;

    @FindBy(xpath = "//button[@id='startStopButton']")
    private WebElement startStop;

    @FindBy(css = "#resetButton")
    private WebElement resetBtn;

    public DemoQAWidgetsProgressFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickStartStop () { startStop.click(); }

    public void clickReset () { resetBtn.click(); }

    public String getProgress () { return progressBar.getAttribute("aria-valuenow"); }

    public void progressWait (final String string) {
        WebDriverWait wait = new WebDriverWait(driver, 30, 5);

        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return progressBar.getAttribute("aria-valuenow").equals(string);
            }
        });
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
