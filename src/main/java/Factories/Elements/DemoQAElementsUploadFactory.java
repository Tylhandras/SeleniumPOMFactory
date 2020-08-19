package Factories.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class DemoQAElementsUploadFactory {
    private WebDriver driver;

    @FindBy(css = "#downloadButton")
    private WebElement download;

    @FindBy(css = "#uploadFile")
    private WebElement upload;

    @FindBy(css = "#uploadedFilePath")
    private WebElement uploadPath;

    public DemoQAElementsUploadFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setDownload () {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.prompt_for_download", false);
        options.setExperimentalOption("prefs", prefs);

        download.click();
    }

    public void setUpload (String string) { upload.sendKeys(string); }

    public String getUploadPath () { return uploadPath.getText(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
