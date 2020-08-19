package Factories.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DemoQAAlertsNestedFactory {
    private WebDriver driver;
    private List<WebElement> frameContent;

    public DemoQAAlertsNestedFactory (WebDriver driver) { this.driver = driver; }

    public String getFrameText () {
        String output = "";

        for (int i = 0; i<frameContent.size(); i++)
            output += frameContent.get(i).getText();

        return output;
    }

    public void switchFrame (WebDriver driver) {
        int size = driver.findElements(By.tagName("iFrame")).size();

        if (size > 0) {
            driver.switchTo().frame(0);
            switchFrame(driver);
        }
        else
            frameContent = driver.findElements(By.cssSelector("*"));
    }

    public void returnToPage () { driver.switchTo().defaultContent(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
