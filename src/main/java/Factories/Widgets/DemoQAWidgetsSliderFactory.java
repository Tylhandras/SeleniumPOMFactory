package Factories.Widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class DemoQAWidgetsSliderFactory {
    private WebDriver driver;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]")
    private WebElement slider;

    public DemoQAWidgetsSliderFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void moveSlider() {
        Random rand = new Random();
        Actions move = new Actions(driver);

        Action action = move.dragAndDropBy(slider, rand.nextInt(75), 0).build();
        action.perform();
    }

    public String getValue () { return slider.getAttribute("value"); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
