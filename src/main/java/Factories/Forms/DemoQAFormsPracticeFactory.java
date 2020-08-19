package Factories.Forms;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAFormsPracticeFactory {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;

    @FindBy(css = "#userEmail")
    private WebElement userEmail;

    @FindBy(css = "#gender-radio-1")
    private WebElement userGenderMale;

    @FindBy(css = "#gender-radio-2")
    private WebElement userGenderFemale;

    @FindBy(css = "#gender-radio-3")
    private WebElement userGenderOther;

    @FindBy(css = "#userNumber")
    private WebElement phone;

    @FindBy(css = "#dateOfBirthInput")
    private WebElement birthDate;

    @FindBy(css = "#subjectsInput")
    private WebElement subjects;

    @FindBy(css = "#hobbies-checkbox-1")
    private WebElement hobbySports;

    @FindBy(css = "#hobbies-checkbox-2")
    private WebElement hobbyReading;

    @FindBy(css = "#hobbies-checkbox-3")
    private WebElement hobbyMusic;

    @FindBy(css = "#uploadPicture")
    private WebElement picUpload;

    @FindBy(css = "#currentAddress")
    private WebElement currentAddress;

    @FindBy(css = "#react-select-3-input")
    private WebElement userState;

    @FindBy(css = "#react-select-4-input")
    private WebElement userCity;

    @FindBy(css = "#submit")
    private WebElement submitBtn;

    @FindBy(css = "#closeLargeModal")
    private WebElement closeBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
    private WebElement submitName;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")
    private WebElement submitEmail;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")
    private WebElement submitGender;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]")
    private WebElement submitPhone;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[2]")
    private WebElement submitBirthday;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[2]")
    private WebElement submitSubjects;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[7]/td[2]")
    private WebElement submitHobbies;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[8]/td[2]")
    private WebElement submitPicture;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[2]")
    private WebElement submitAddress;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[10]/td[2]")
    private WebElement submitCityState;

    private By submittedForm = By.xpath("//div[@class='modal-content']");

    public DemoQAFormsPracticeFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickGenderMale () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", userGenderMale);
    }

    public void clickGenderFemale () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", userGenderFemale);
    }

    public void clickGenderOther () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", userGenderOther);
    }

    public void clickHobbySports () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", hobbySports);
    }

    public void clickHobbyReading () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", hobbyReading);
    }

    public void clickHobbyMusic () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", hobbyMusic);
    }

    public void clickSubmitBtn () { submitBtn.click(); }

    public void clickCloseBtn () { closeBtn.click(); }

    public void setFirstName (String string) { firstName.sendKeys(string); }

    public void setLastName (String string) { lastName.sendKeys(string); }

    public void setUserEmail (String string) { userEmail.sendKeys(string); }

    public void setPhone (String string) { phone.sendKeys(string); }

    public void setBirthDate (String string) {
        birthDate.sendKeys(Keys.CONTROL + "a");
        birthDate.sendKeys(string);
    }

    public void setSubjects (String string) { subjects.sendKeys(string); }

    public void setUploadPic (String string) { picUpload.sendKeys(string); }

    public void setCurrentAddress (String string) { currentAddress.sendKeys(string); }

    public void setUserState (String string) {
        WebElement stateDrpDown = userState;
        stateDrpDown.sendKeys(string);
        stateDrpDown.sendKeys(Keys.RETURN);
    }

    public void setUserCity (String string) {
        WebElement cityDrpDown = userCity;
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(userCity));
        cityDrpDown.sendKeys(string);
        cityDrpDown.sendKeys(Keys.RETURN);
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public void pageLoadWait () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(submittedForm));
    }

    public String getSubmitName () { return submitName.getText(); }

    public String getSubmitEmail () { return submitEmail.getText(); }

    public String getSubmitGender () { return submitGender.getText(); }

    public String getSubmitPhone () { return submitPhone.getText(); }

    public String getSubmitDate () { return submitBirthday.getText(); }

    public String getSubmitSubjects () { return submitSubjects.getText(); }

    public String getSubmitHobbies () { return submitHobbies.getText(); }

    public String getSubmitPicture () { return submitPicture.getText(); }

    public String getSubmitAddress () { return submitAddress.getText(); }

    public String getSubmitCityState () { return submitCityState.getText(); }
}
