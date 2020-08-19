package Factories.Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAElementsTextFactory {
    private WebDriver driver;

    @FindBy(css = "#userName")
    private WebElement name;

    @FindBy(css = "#userEmail")
    private WebElement email;

    @FindBy(css = "#currentAddress")
    private WebElement curAddr;

    @FindBy(css = "#permanentAddress")
    private WebElement permAddr;

    @FindBy(css = "#submit")
    private WebElement submitBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]")
    private WebElement submittedForm;

    @FindBy(css = "#name")
    private WebElement submitName;

    @FindBy(css = "#email")
    private WebElement submitEmail;

    @FindBy(xpath = "//p[@id='currentAddress']")
    private WebElement submitCurrentAddress;

    @FindBy(xpath = "//p[@id='permanentAddress']")
    private WebElement submitPermanentAddress;

    public DemoQAElementsTextFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setName (String string) { name.sendKeys(string); }

    public void setEmail (String string) { email.sendKeys(string); }

    public void setCurrent (String string) { curAddr.sendKeys(string); }

    public void setPermanent (String string) { permAddr.sendKeys(string); }

    public void clickSubmit () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", submitBtn);
    }

    public String getSubmitName () { return submitName.getText(); }

    public String getSubmitEmail () { return submitEmail.getText(); }

    public String getSubmitCurrentAddress () { return submitCurrentAddress.getText(); }

    public String getSubmitPermanentAddress () { return submitPermanentAddress.getText(); }

    public void pageLoadWait () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.visibilityOf(submittedForm));
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
