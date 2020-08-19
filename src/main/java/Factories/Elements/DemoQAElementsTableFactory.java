package Factories.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoQAElementsTableFactory {
    private WebDriver driver;

    @FindBy(css = "#addNewRecordButton")
    private WebElement addBtn;

    @FindBy(css = "#searchBox")
    private WebElement searchBox;

    @FindBy(xpath = "//span[@class='select-wrap -pageSizeOptions']//select")
    private WebElement displayRows;

    @FindBy(css = "#firstName")
    private WebElement firstName;

    @FindBy(css = "#lastName")
    private WebElement lastName;

    @FindBy(css = "#userEmail")
    private WebElement userEmail;

    @FindBy(css = "#age")
    private WebElement userAge;

    @FindBy(css = "#salary")
    private WebElement userPay;

    @FindBy(css = "#department")
    private WebElement department;

    @FindBy(css = "#submit")
    private WebElement submitBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement tableFirstName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]")
    private WebElement tableLastName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]")
    private WebElement tableAge;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]")
    private WebElement tableEmail;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[5]")
    private WebElement tableSalary;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]")
    private WebElement tableDepartment;

    public DemoQAElementsTableFactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAdd () { addBtn.click(); }

    public void clickSubmit () { submitBtn.click(); }

    public void searchTable (String string) { searchBox.sendKeys(string); }

    public void setFirstName (String string) { firstName.sendKeys(string); }

    public void setLastName (String string) { lastName.sendKeys(string); }

    public void setEmail (String string) { userEmail.sendKeys(string); }

    public void setAge (String string) { userAge.sendKeys(string); }

    public void setPay (String string) { userPay.sendKeys(string); }

    public void setDepartment (String string) { department.sendKeys(string); }

    public void setDisplayRows (String string) {
        Select drpRow = new Select(displayRows);

        drpRow.selectByVisibleText(string);
    }

    public String getTableFirst () { return tableFirstName.getText(); }

    public String getTableLast () { return tableLastName.getText(); }

    public String getTableAge () { return tableAge.getText(); }

    public String getTableEmail () { return tableEmail.getText(); }

    public String getTableSalary () { return tableSalary.getText(); }

    public String getTableDepartment () { return tableDepartment.getText(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
