package Factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQAHomeFactory {
    private WebDriver driver;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement elements;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")
    private WebElement forms;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]")
    private WebElement alerts;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]")
    private WebElement widgets;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]")
    private WebElement interactions;

    public DemoQAHomeFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickElements () { elements.click(); }

    public void clickForms() { forms.click(); }

    public void clickAlerts() { alerts.click(); }

    public void clickWidgets() { widgets.click(); }

    public void clickInteractions() { interactions.click(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
