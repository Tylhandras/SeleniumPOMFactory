import Factories.DemoQAHomeFactory;
import Factories.Alerts.*;
import Factories.Elements.*;
import Factories.Forms.*;
import Factories.Interactions.*;
import Factories.Widgets.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SeleniumPOMFactory {
    String driverPath = "C:\\Users\\sxo85\\Documents\\chromedriver_win32\\chromedriver.exe";
    WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testFactoryHomePage () {
        driver.get("https://demoqa.com/");

        String expectedUrl = "https://demoqa.com/";
        DemoQAHomeFactory home = new DemoQAHomeFactory(driver);

        assertEquals(home.getUrl(), expectedUrl);

        home.clickElements();
        assertEquals(home.getUrl(), "https://demoqa.com/elements");
        driver.navigate().back();
        assertEquals(home.getUrl(), expectedUrl);

        home.clickForms();
        assertEquals(home.getUrl(), "https://demoqa.com/forms");
        driver.navigate().back();
        assertEquals(home.getUrl(), expectedUrl);

        home.clickAlerts();
        assertEquals(home.getUrl(), "https://demoqa.com/alertsWindows");
        driver.navigate().back();
        assertEquals(home.getUrl(), expectedUrl);

        home.clickWidgets();
        assertEquals(home.getUrl(), "https://demoqa.com/widgets");
        driver.navigate().back();
        assertEquals(home.getUrl(), expectedUrl);

        home.clickInteractions();
        assertEquals(home.getUrl(), "https://demoqa.com/interaction");
        driver.navigate().back();
        assertEquals(home.getUrl(), expectedUrl);
    }

    @Test
    public void testFactoryElementsPage () {
        driver.get("https://demoqa.com/elements");

        String expectedUrl = "https://demoqa.com/elements";
        DemoQAElementsFactory elements = new DemoQAElementsFactory(driver);

        Assert.assertEquals(elements.getUrl(), expectedUrl);

        elements.clickText();
        Assert.assertEquals(elements.getUrl(), "https://demoqa.com/text-box");
        driver.navigate().back();
        Assert.assertEquals(elements.getUrl(), expectedUrl);

        elements.clickCheck();
        Assert.assertEquals(elements.getUrl(), "https://demoqa.com/checkbox");
        driver.navigate().back();
        Assert.assertEquals(elements.getUrl(), expectedUrl);

        elements.clickRadio();
        Assert.assertEquals(elements.getUrl(), "https://demoqa.com/radio-button");
        driver.navigate().back();
        Assert.assertEquals(elements.getUrl(), expectedUrl);

        elements.clickWebTab();
        Assert.assertEquals(elements.getUrl(), "https://demoqa.com/webtables");
        driver.navigate().back();
        Assert.assertEquals(elements.getUrl(), expectedUrl);

        elements.clickButtons();
        Assert.assertEquals(elements.getUrl(), "https://demoqa.com/buttons");
        driver.navigate().back();
        Assert.assertEquals(elements.getUrl(), expectedUrl);

        elements.clickLinks();
        Assert.assertEquals(elements.getUrl(), "https://demoqa.com/links");
        driver.navigate().back();
        Assert.assertEquals(elements.getUrl(), expectedUrl);

        elements.scrollPage();

        elements.clickUpDown();
        Assert.assertEquals(elements.getUrl(), "https://demoqa.com/upload-download");
        driver.navigate().back();
        Assert.assertEquals(elements.getUrl(), expectedUrl);

        elements.clickDynamic();
        Assert.assertEquals(elements.getUrl(), "https://demoqa.com/dynamic-properties");
        driver.navigate().back();
        Assert.assertEquals(elements.getUrl(), expectedUrl);
    }

    @Test
    public void testFactoryElementsTextPage () {
        driver.get("https://demoqa.com/text-box");

        String expectedUrl = "https://demoqa.com/text-box";
        DemoQAElementsTextFactory textBox = new DemoQAElementsTextFactory(driver);

        Assert.assertEquals(textBox.getUrl(), expectedUrl);

        textBox.setName("Sean O'Brien");
        textBox.setEmail("phanin@example.com");
        textBox.setCurrent("555 Locut Ln. \n City, MO 55555");
        textBox.setPermanent("762 Elm St. \n Town, MO 33333");
        textBox.clickSubmit();
        textBox.pageLoadWait();

        Assert.assertEquals(textBox.getSubmitName(), "Name:Sean O'Brien");
        Assert.assertEquals(textBox.getSubmitEmail(), "Email:phanin@example.com");
        Assert.assertEquals(textBox.getSubmitCurrentAddress(), "Current Address :555 Locut Ln. City, MO 55555");
        Assert.assertEquals(textBox.getSubmitPermanentAddress(), "Permananet Address :762 Elm St. Town, MO 33333");
    }

    @Test
    public void testFactoryElementsCheckPage () {
        driver.get("https://demoqa.com/checkbox");

        String expectedUrl = "https://demoqa.com/checkbox";
        DemoQAElementsCheckFactory check = new DemoQAElementsCheckFactory(driver);

        Assert.assertEquals(check.getUrl(), expectedUrl);

        Random rand = new Random();
        String test = "";
        switch (rand.nextInt(2)) {
            case 0:
                check.clickHomeCheck();
                test += check.getBoxesList();
                break;
            case 1:
                check.clickHomeTog();
                switch (rand.nextInt(6)) {
                    case 0:
                        check.clickDeskCheck();
                        test += check.getBoxesList();
                        break;
                    case 1:
                        check.clickDeskTog();
                        switch (rand.nextInt(2)) {
                            case 0:
                                check.clickNotes();
                                test += check.getBoxesList();
                                break;
                            case 1:
                                check.clickCommands();
                                test += check.getBoxesList();
                                break;
                        }
                        break;
                    case 2:
                        check.clickDocCheck();
                        test = check.getBoxesList();
                        break;
                    case 3:
                        check.clickDocTog();
                        switch (rand.nextInt(4)) {
                            case 0:
                                check.clickWorkCheck();
                                test += check.getBoxesList();
                                break;
                            case 1:
                                check.clickWorkTog();
                                switch (rand.nextInt(3)) {
                                    case 0:
                                        check.clickReact();
                                        test += check.getBoxesList();
                                        break;
                                    case 1:
                                        check.clickAngular();
                                        test += check.getBoxesList();
                                        break;
                                    case 2:
                                        check.clickVeu();
                                        test += check.getBoxesList();
                                        break;
                                }
                                break;
                            case 2:
                                check.clickOfficeCheck();
                                test += check.getBoxesList();
                                break;
                            case 3:
                                check.clickOfficeTog();
                                switch (rand.nextInt(4)) {
                                    case 0:
                                        check.clickPublic();
                                        test += check.getBoxesList();
                                        break;
                                    case 1:
                                        check.clickPrivate();
                                        test += check.getBoxesList();
                                        break;
                                    case 2:
                                        check.clickClassified();
                                        test += check.getBoxesList();
                                        break;
                                    case 3:
                                        check.clickGeneral();
                                        test += check.getBoxesList();
                                        break;
                                }
                                break;
                        }
                    case 4:
                        check.clickDownCheck();
                        test += check.getBoxesList();
                        break;
                    case 5:
                        check.clickDownTog();
                        switch (rand.nextInt(2)) {
                            case 0:
                                check.clickWordFile();
                                test += check.getBoxesList();
                                break;
                            case 1:
                                check.clickExcelFile();
                                test += check.getBoxesList();
                                break;
                        }
                        break;
                }
        }

        Assert.assertEquals(check.getBoxesList(), test);
    }

    @Test
    public void testFactoryElementsRadioPage () {
        driver.get("https://demoqa.com/radio-button");

        String expectedUrl = "https://demoqa.com/radio-button";
        DemoQAElementsRadioFactory radio = new DemoQAElementsRadioFactory(driver);

        Assert.assertEquals(radio.getUrl(), expectedUrl);

        radio.clickYesBtn();
        Assert.assertEquals(radio.getRadioYes(), true);

        radio.clickImpress();
        Assert.assertEquals(radio.getRadioImpressive(), true);
    }

    @Test
    public void testFactoryElementsTablePage () {
        driver.get("https://demoqa.com/webtables");

        String expectedUrl = "https://demoqa.com/webtables";
        DemoQAElementsTableFactory table = new DemoQAElementsTableFactory(driver);

        Assert.assertEquals(table.getUrl(), expectedUrl);

        table.clickAdd();
        table.setFirstName("Sean");
        table.setLastName("O'Brien");
        table.setEmail("phanin@example.com");
        table.setAge("34");
        table.setPay("50000");
        table.setDepartment("IT");
        table.clickSubmit();

        table.searchTable("Sean");

        Assert.assertEquals(table.getTableEmail(), "phanin@example.com");
    }

    @Test
    public void testFactoryElementsButtonPage () {
        driver.get("https://demoqa.com/buttons");

        String expectedUrl = "https://demoqa.com/buttons";
        DemoQAElementsButtonFactory button = new DemoQAElementsButtonFactory(driver);

        Assert.assertEquals(button.getUrl(), expectedUrl);

        button.clickDouble();
        Assert.assertEquals(button.getDoubleMessage(), "You have done a double click");

        button.clickRight();
        Assert.assertEquals(button.getRightMessage(), "You have done a right click");

        button.clickSingle();
        Assert.assertEquals(button.getSingleMessage(), "You have done a dynamic click");
    }

    @Test
    public void testFactoryElementsLinkPage () {
        driver.get("https://demoqa.com/links");

        String expectedUrl = "https://demoqa.com/links";
        DemoQAElementsLinkFactory link = new DemoQAElementsLinkFactory(driver);

        Assert.assertEquals(link.getUrl(), expectedUrl);

        link.clickHome();
        Assert.assertEquals(link.getNumTabsOpen(), 2);
        link.closeTab();

        link.clickDynamicHome();
        Assert.assertEquals(link.getNumTabsOpen(), 2);
        link.closeTab();

        link.clickCreated();
        Assert.assertEquals(link.getResponse(), "Link has responded with staus 201 and status text Created");
        link.refreshPage();

        link.clickNoContent();
        Assert.assertEquals(link.getResponse(), "Link has responded with staus 204 and status text No Content");
        link.refreshPage();

        link.clickMoved();
        Assert.assertEquals(link.getResponse(), "Link has responded with staus 301 and status text Moved Permanently");
        link.refreshPage();

        link.clickBadRequest();
        Assert.assertEquals(link.getResponse(), "Link has responded with staus 400 and status text Bad Request");
        link.refreshPage();

        link.scrollPage();

        link.clickUnauthorized();
        Assert.assertEquals(link.getResponse(), "Link has responded with staus 401 and status text Unauthorized");
        link.refreshPage();

        link.scrollPage();

        link.clickForbidden();
        Assert.assertEquals(link.getResponse(), "Link has responded with staus 403 and status text Forbidden");
        link.refreshPage();

        link.scrollPage();

        link.clickNotFound();
        Assert.assertEquals(link.getResponse(), "Link has responded with staus 404 and status text Not Found");
        link.refreshPage();
    }

    @Test
    public void testFactoryElementsUploadPage () {
        driver.get("https://demoqa.com/upload-download");

        String expectedUrl = "https://demoqa.com/upload-download";
        DemoQAElementsUploadFactory upDown = new DemoQAElementsUploadFactory(driver);

        Assert.assertEquals(upDown.getUrl(), expectedUrl);

        upDown.setDownload();

        upDown.setUpload("C:\\Users\\sxo85\\Downloads\\sampleFile.jpeg");
        Assert.assertEquals(upDown.getUploadPath(), "C:\\fakepath\\sampleFile.jpeg");
    }

    @Test
    public void testFactoryElementsDynamicPage () {
        driver.get("https://demoqa.com/dynamic-properties");

        String expectedUrl = "https://demoqa.com/dynamic-properties";
        DemoQAElementsDynamicFactory dynamic = new DemoQAElementsDynamicFactory(driver);

        Assert.assertEquals(dynamic.getUrl(), expectedUrl);

        dynamic.runInvisible();
        Assert.assertEquals(dynamic.getVisible(), true);
    }

    @Test
    public void testFactoryFormsPage () {
        driver.get("https://demoqa.com/forms");

        String expectedUrl = "https://demoqa.com/forms";
        DemoQAFormsFactory forms = new DemoQAFormsFactory(driver);

        Assert.assertEquals(forms.getUrl(), expectedUrl);

        forms.clickPracticeForm();
        Assert.assertEquals(forms.getUrl(), "https://demoqa.com/automation-practice-form");
        driver.navigate().back();
        Assert.assertEquals(forms.getUrl(), expectedUrl);
    }

    @Test
    public void testFactoryFormsPracticePage () {
        driver.get("https://demoqa.com/automation-practice-form");

        String expectedUrl = "https://demoqa.com/automation-practice-form";
        DemoQAFormsPracticeFactory form = new DemoQAFormsPracticeFactory(driver);

        Assert.assertEquals(form.getUrl(), expectedUrl);

        form.setFirstName("Sean");
        form.setLastName("O'Brien");
        form.setUserEmail("phanin@example.com");
        form.clickGenderMale();
        form.setPhone("5558675309");
        form.setBirthDate("10/30/80");
        form.clickHobbyMusic();
        form.clickHobbyReading();
        form.setUploadPic("C:\\Users\\sxo85\\Downloads\\sampleFile.jpeg");
        form.setCurrentAddress("1024 Qwerty Ln.");
        form.setUserState("Haryana");
        form.setUserCity("Karnal");
        form.clickSubmitBtn();
        form.pageLoadWait();

        Assert.assertEquals(form.getSubmitName(), "Sean O'Brien");
        Assert.assertEquals(form.getSubmitEmail(), "phanin@example.com");
        Assert.assertEquals(form.getSubmitGender(), "Male");
        Assert.assertEquals(form.getSubmitPhone(), "5558675309");
        Assert.assertEquals(form.getSubmitDate(), "30 October,1980");
        Assert.assertEquals(form.getSubmitSubjects(), "");
        Assert.assertEquals(form.getSubmitHobbies(), "Music, Reading");
        Assert.assertEquals(form.getSubmitPicture(), "sampleFile.jpeg");
        Assert.assertEquals(form.getSubmitAddress(), "1024 Qwerty Ln.");
        Assert.assertEquals(form.getSubmitCityState(), "Haryana Karnal");
        form.clickCloseBtn();

        driver.navigate().back();
    }

    @Test
    public void testFactoryAlertsPage () {
        driver.get("https://demoqa.com/alertsWindows");

        String expectedUrl = "https://demoqa.com/alertsWindows";
        DemoQAAlertsFactory alerts = new DemoQAAlertsFactory(driver);

        Assert.assertEquals(alerts.getUrl(), expectedUrl);

        alerts.clickBrowser();
        Assert.assertEquals(alerts.getUrl(), "https://demoqa.com/browser-windows");
        driver.navigate().back();
        Assert.assertEquals(alerts.getUrl(), expectedUrl);

        alerts.clickAlerts();
        Assert.assertEquals(alerts.getUrl(), "https://demoqa.com/alerts");
        driver.navigate().back();
        Assert.assertEquals(alerts.getUrl(), expectedUrl);

        alerts.clickFrames();
        Assert.assertEquals(alerts.getUrl(), "https://demoqa.com/frames");
        driver.navigate().back();
        Assert.assertEquals(alerts.getUrl(), expectedUrl);

        alerts.clickNested();
        Assert.assertEquals(alerts.getUrl(), "https://demoqa.com/nestedframes");
        driver.navigate().back();
        Assert.assertEquals(alerts.getUrl(), expectedUrl);

        alerts.scrollPage();

        alerts.clickModal();
        Assert.assertEquals(alerts.getUrl(), "https://demoqa.com/modal-dialogs");
        driver.navigate().back();
        Assert.assertEquals(alerts.getUrl(), expectedUrl);
    }

    @Test
    public void testFactoryAlertsBrowserPage () {
        driver.get("https://demoqa.com/browser-windows");

        String expectedUrl = "https://demoqa.com/browser-windows";
        DemoQAAlertsBrowserFactory browser = new DemoQAAlertsBrowserFactory(driver);

        Assert.assertEquals(browser.getUrl(), expectedUrl);

        browser.clickTab();
        int tabCount = browser.getNumTabsOpen();
        browser.closeTab();
        Assert.assertEquals(tabCount, 2);

        browser.clickWindow();
        int winCount = browser.getNumWindowsOpen();
        browser.closeWindow(true);
        Assert.assertEquals(winCount, 2);

        browser.clickMessage();
        int msgCount = browser.getNumWindowsOpen();
        browser.closeWindow(false);
        Assert.assertEquals(msgCount, 2);

        driver.navigate().back();
    }

    @Test
    public void testFactoryAlertsAlertPage () {
        driver.get("https://demoqa.com/alerts");

        String expectedUrl = "https://demoqa.com/alerts";
        DemoQAAlertsAlertFactory alerts = new DemoQAAlertsAlertFactory(driver);

        Assert.assertEquals(alerts.getUrl(), expectedUrl);

        alerts.clickAlert();
        Assert.assertEquals(alerts.isAlertPresent(), true);
        alerts.ackAlert();

        alerts.clickDelay();
        Assert.assertEquals(alerts.isAlertPresent(), true);
        alerts.ackAlert();

        alerts.clickConfirm();
        Assert.assertEquals(alerts.isAlertPresent(), true);
        alerts.dismissAlert();

        alerts.clickPrompt();
        Assert.assertEquals(alerts.isAlertPresent(), true);
        alerts.setAlert("Sean");
        alerts.ackAlert();
    }

    @Test
    public void testFactoryAlertsFramePage () {
        driver.get("https://demoqa.com/frames");

        String expectedUrl = "https://demoqa.com/frames";
        DemoQAAlertsFrameFactory frame = new DemoQAAlertsFrameFactory(driver);

        Assert.assertEquals(frame.getUrl(), expectedUrl);

        frame.switchToFrame1();
        Assert.assertEquals(frame.getFrame1Text(), "This is a sample page");
        frame.returnToPage();

        frame.switchToFrame2();
        Assert.assertEquals(frame.getFrame2Text(), "This is a sample page");
        frame.returnToPage();
    }

    @Test
    public void testFactoryAlertsNestedPage () {
        driver.get("https://demoqa.com/nestedframes");

        String expectedUrl = "https://demoqa.com/nestedframes";
        DemoQAAlertsNestedFactory frame = new DemoQAAlertsNestedFactory(driver);

        Assert.assertEquals(frame.getUrl(), expectedUrl);

        frame.switchFrame(driver);
        Assert.assertEquals(frame.getFrameText(), "Child IframeChild IframeChild Iframe");
        frame.returnToPage();
    }

    @Test
    public void testFactoryAlertsModalPage () {
        driver.get("https://demoqa.com/modal-dialogs");

        String expectedUrl = "https://demoqa.com/modal-dialogs";
        DemoQAAlertsModalFactory modal = new DemoQAAlertsModalFactory(driver);

        Assert.assertEquals(modal.getUrl(), expectedUrl);

        modal.clickSmallModal();
        Assert.assertEquals(modal.getModalText(), "This is a small modal. It has very less content");
        modal.closeSmallModal();

        modal.clickLargeModal();
        Assert.assertEquals(modal.getModalText(), "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        modal.closeLargeModal();
    }

    @Test
    public void testFactoryWidgetsPage () {
        driver.get("https://demoqa.com/widgets");

        String expectedUrl = "https://demoqa.com/widgets";
        DemoQAWidgetsFactory widgets = new DemoQAWidgetsFactory(driver);

        Assert.assertEquals(widgets.getUrl(), expectedUrl);

        widgets.clickAccordian();
        Assert.assertEquals(widgets.getUrl(), "https://demoqa.com/accordian");
        driver.navigate().back();
        Assert.assertEquals(widgets.getUrl(), expectedUrl);

        widgets.scrollPage();

        widgets.clickAutoComplete();
        Assert.assertEquals(widgets.getUrl(), "https://demoqa.com/auto-complete");
        driver.navigate().back();
        Assert.assertEquals(widgets.getUrl(), expectedUrl);

        widgets.clickDatePick();
        Assert.assertEquals(widgets.getUrl(), "https://demoqa.com/date-picker");
        driver.navigate().back();
        Assert.assertEquals(widgets.getUrl(), expectedUrl);

        widgets.clickSlide();
        Assert.assertEquals(widgets.getUrl(), "https://demoqa.com/slider");
        driver.navigate().back();
        Assert.assertEquals(widgets.getUrl(), expectedUrl);

        widgets.clickProgress();
        Assert.assertEquals(widgets.getUrl(), "https://demoqa.com/progress-bar");
        driver.navigate().back();
        Assert.assertEquals(widgets.getUrl(), expectedUrl);

        widgets.scrollPage();

        widgets.clickTabs();
        Assert.assertEquals(widgets.getUrl(), "https://demoqa.com/tabs");
        driver.navigate().back();
        Assert.assertEquals(widgets.getUrl(), expectedUrl);

        widgets.clickToolTip();
        Assert.assertEquals(widgets.getUrl(), "https://demoqa.com/tool-tips");
        driver.navigate().back();
        Assert.assertEquals(widgets.getUrl(), expectedUrl);

        widgets.clickMenu();
        Assert.assertEquals(widgets.getUrl(), "https://demoqa.com/menu");
        driver.navigate().back();
        Assert.assertEquals(widgets.getUrl(), expectedUrl);

        widgets.clickSelectMenu();
        Assert.assertEquals(widgets.getUrl(), "https://demoqa.com/select-menu");
        driver.navigate().back();
        Assert.assertEquals(widgets.getUrl(), expectedUrl);
    }

    @Test // Intermittent Failure
    public void testFactoryWidgetsAccordianPage () {
        driver.get("https://demoqa.com/accordian");

        String expectedUrl = "https://demoqa.com/accordian";
        DemoQAWidgetsAccordianFactory accordian = new DemoQAWidgetsAccordianFactory(driver);

        Assert.assertEquals(accordian.getUrl(), expectedUrl);

        accordian.scrollPage();

        accordian.clickTab3();
        Assert.assertEquals(accordian.getTab3(), true);

        accordian.clickTab2();
        Assert.assertEquals(accordian.getTab2(), true);

        accordian.clickTab1();
        Assert.assertEquals(accordian.getTab1(), true);
    }

    @Test
    public void testFactoryWidgetsAutoPage () {
        driver.get("https://demoqa.com/auto-complete");

        String expectedUrl = "https://demoqa.com/auto-complete";
        DemoQAWidgetsAutoFactory auto = new DemoQAWidgetsAutoFactory(driver);

        Assert.assertEquals(auto.getUrl(), expectedUrl);

        auto.setMultipleInput("Red");
        auto.setMultipleInput("Black");
        Assert.assertEquals(auto.getMultipleInput(), "Red Black ");
        auto.clearEntry();
        Assert.assertEquals(auto.getMultipleInput(), "Black ");

        auto.setSingleInput("Blue");
        Assert.assertEquals(auto.getSingleInput(), "Blue");
    }

    @Test
    public void testFactoryWidgetsDatePage () {
        driver.get("https://demoqa.com/date-picker");

        String expectedUrl = "https://demoqa.com/date-picker";
        DemoQAWidgetsDateFactory date = new DemoQAWidgetsDateFactory(driver);

        Assert.assertEquals(date.getUrl(), expectedUrl);

        date.setDate("10/31/2010");
        Assert.assertEquals(date.getDate(), "10/31/2010");

        date.setDayAndTime("10/31/2010 19:00");
        Assert.assertEquals(date.getDayAndTime(), "October 31, 2010 7:00 PM");
    }

    @Test
    public void testFactoryWidgetsSliderPage () {
        driver.get("https://demoqa.com/slider");

        String expectedUrl = "https://demoqa.com/slider";
        DemoQAWidgetsSliderFactory slide = new DemoQAWidgetsSliderFactory(driver);

        Assert.assertEquals(slide.getUrl(), expectedUrl);

        String move = slide.getValue();
        slide.moveSlider();
        Assert.assertNotEquals(slide.getValue(), move);
    }

    @Test
    public void testFactoryWidgetsProgressPage () {
        driver.get("https://demoqa.com/progress-bar");

        String expectedUrl = "https://demoqa.com/progress-bar";
        DemoQAWidgetsProgressFactory progress = new DemoQAWidgetsProgressFactory(driver);

        Assert.assertEquals(progress.getUrl(), expectedUrl);

        progress.clickStartStop();
        progress.progressWait("42");
        progress.clickStartStop();

        Assert.assertEquals(progress.getProgress(), "42");
    }

    @Test
    public void testFactoryWidgetsTabsPage () {
        driver.get("https://demoqa.com/tabs");

        String expectedUrl = "https://demoqa.com/tabs";
        DemoQAWidgetsTabsFactory tab = new DemoQAWidgetsTabsFactory(driver);

        Assert.assertEquals(tab.getUrl(), expectedUrl);

        tab.clickTab3();
        Assert.assertEquals(tab.getTab3Content(), true);

        tab.clickTab2();
        Assert.assertEquals(tab.getTab2Content(), true);

        tab.clickTab1();
        Assert.assertEquals(tab.getTab1Content(), true);
    }

    @Test
    public void testFactoryWidgetsTipsPage () {
        driver.get("https://demoqa.com/tool-tips");

        String expectedUrl = "https://demoqa.com/tool-tips";
        DemoQAWidgetsTipsFactory tip = new DemoQAWidgetsTipsFactory(driver);

        Assert.assertEquals(tip.getUrl(), expectedUrl);

        tip.hoverButton();
        Assert.assertEquals(tip.getHoverButton(), true);

        tip.hoverBox();
        Assert.assertEquals(tip.getHoverBox(), true);

        tip.hoverTextOne();
        Assert.assertEquals(tip.getHoverText1(), true);

        tip.scrollPage();

        tip.hoverTextTwo();
        Assert.assertEquals(tip.getHoverText2(), true);
    }

    @Test
    public void testFactoryWidgetsMenuPage () {
        driver.get("https://demoqa.com/menu");

        String expectedUrl = "https://demoqa.com/menu";
        DemoQAWidgetsMenuFactory menu = new DemoQAWidgetsMenuFactory(driver);

        Assert.assertEquals(menu.getUrl(), expectedUrl);

        String color = "";

        color = menu.getBackgroundMenu1();
        menu.hoverMenu1();
        Assert.assertNotEquals(menu.getBackgroundMenu1(), color);

        color = menu.getBackgroundMenu2();
        menu.hoverMenu2();
        Assert.assertNotEquals(menu.getBackgroundMenu2(), color);

        color = menu.getBackgroundSub1();
        menu.hoverMenu2Sub1();
        Assert.assertNotEquals(menu.getBackgroundSub1(), color);

        color = menu.getBackgroundSub2();
        menu.hoverMenu2Sub2();
        Assert.assertNotEquals(menu.getBackgroundSub2(), color);

        color = menu.getBackgroundSub3();
        menu.hoverMenu2Sub3();
        Assert.assertNotEquals(menu.getBackgroundSub3(), color);

//        color = menu.getBackgroundLeaf1();
//        menu.hoverMenu2Leaf1();
//        Assert.assertNotEquals(menu.getBackgroundLeaf1(), color);
//
//        color = menu.getBackgroundLeaf2();
//        menu.hoverMenu2Leaf2();
//        Assert.assertNotEquals(menu.getBackgroundLeaf2(), color);

        color = menu.getBackgroundMenu3();
        menu.hoverMenu3();
        Assert.assertNotEquals(menu.getBackgroundMenu3(), color);
    }

    @Test
    public void testFactoryWidgetsSelectPage () {
        driver.get("https://demoqa.com/select-menu");

        String expectedUrl = "https://demoqa.com/select-menu";
        DemoQAWidgetsSelectFactory select = new DemoQAWidgetsSelectFactory(driver);

        Assert.assertEquals(select.getUrl(), expectedUrl);

        Random rand = new Random();
        String selected = "";

        select.clickValueSelect();
        switch(rand.nextInt(6)) {
            case 0:
                select.clickValueOption1();
                selected = select.getValueSelected();
                break;
            case 1:
                select.clickValueOption2();
                selected = select.getValueSelected();
                break;
            case 2:
                select.clickValueOption3();
                selected = select.getValueSelected();
                break;
            case 3:
                select.clickValueOption4();
                selected = select.getValueSelected();
                break;
            case 4:
                select.clickValueOption5();
                selected = select.getValueSelected();
                break;
            case 5:
                select.clickValueOption6();
                selected = select.getValueSelected();
                break;
        }
        Assert.assertEquals(select.getValueSelected(), selected);

        select.clickSingleSelect();
        switch(rand.nextInt(6)) {
            case 0:
                select.clickSingleOption1();
                selected = select.getSingleSelected();
                break;
            case 1:
                select.clickSingleOption2();
                selected = select.getSingleSelected();
                break;
            case 2:
                select.clickSingleOption3();
                selected = select.getSingleSelected();
                break;
            case 3:
                select.clickSingleOption4();
                selected = select.getSingleSelected();
                break;
            case 4:
                select.clickSingleOption5();
                selected = select.getSingleSelected();
                break;
            case 5:
                select.clickSingleOption6();
                selected = select.getSingleSelected();
                break;
        }
        Assert.assertEquals(select.getSingleSelected(), selected);

        switch(rand.nextInt(10)) {
            case 0:
                select.clickOldSelect(1);
                selected = select.getOldSelected();
                break;
            case 1:
                select.clickOldSelect(2);
                selected = select.getOldSelected();
                break;
            case 2:
                select.clickOldSelect(3);
                selected = select.getOldSelected();
                break;
            case 3:
                select.clickOldSelect(4);
                selected = select.getOldSelected();
                break;
            case 4:
                select.clickOldSelect(5);
                selected = select.getOldSelected();
                break;
            case 5:
                select.clickOldSelect(6);
                selected = select.getOldSelected();
                break;
            case 6:
                select.clickOldSelect(7);
                selected = select.getOldSelected();
                break;
            case 7:
                select.clickOldSelect(8);
                selected = select.getOldSelected();
                break;
            case 8:
                select.clickOldSelect(9);
                selected = select.getOldSelected();
                break;
            case 9:
                select.clickOldSelect(10);
                selected = select.getOldSelected();
                break;
        }
        Assert.assertEquals(select.getOldSelected(), selected);
    }

    @Test // Intermittent Failure
    public void testFactoryInteractionsPage () {
        driver.get("https://demoqa.com/interaction");

        String expectedUrl = "https://demoqa.com/interaction";
        DemoQAInteractionsFactory interactions = new DemoQAInteractionsFactory(driver);

        Assert.assertEquals(interactions.getUrl(), expectedUrl);

        interactions.scrollPage();

        interactions.clickSortable();
        Assert.assertEquals(interactions.getUrl(), "https://demoqa.com/sortable");
        driver.navigate().back();
        Assert.assertEquals(interactions.getUrl(), expectedUrl);

        interactions.clickSelect();
        Assert.assertEquals(interactions.getUrl(), "https://demoqa.com/selectable");
        driver.navigate().back();
        Assert.assertEquals(interactions.getUrl(), expectedUrl);

        interactions.clickResize();
        Assert.assertEquals(interactions.getUrl(), "https://demoqa.com/resizable");
        driver.navigate().back();
        Assert.assertEquals(interactions.getUrl(), expectedUrl);

        interactions.clickDrop();
        Assert.assertEquals(interactions.getUrl(), "https://demoqa.com/droppable");
        driver.navigate().back();
        Assert.assertEquals(interactions.getUrl(), expectedUrl);

        interactions.scrollPage();

        interactions.clickDrag();
        Assert.assertEquals(interactions.getUrl(), "https://demoqa.com/dragabble");
        driver.navigate().back();
        Assert.assertEquals(interactions.getUrl(), expectedUrl);
    }

    @Test // Intermittent Failure
    public void testFactoryInteractionsSortPage () {
        driver.get("https://demoqa.com/sortable");

        String expectedUrl = "https://demoqa.com/sortable";
        DemoQAInteractionsSortFactory sort = new DemoQAInteractionsSortFactory(driver);

        Assert.assertEquals(sort.getUrl(), expectedUrl);

        Random rand = new Random(); //instance of random class

        sort.clickSortList();
        String startOrder = sort.getListOrder();
        sort.scrollPage();
        switch (rand.nextInt(6)) {
            case 0:
                sort.clickListOne(rand.nextInt(100)+100);
                break;
            case 1:
                if (rand.nextBoolean())
                    sort.clickListTwo(rand.nextInt(75)+100);
                else
                    sort.clickListTwo(-rand.nextInt(50)+100);
                break;
            case 2:
                if (rand.nextBoolean())
                    sort.clickListThree(rand.nextInt(75)+100);
                else
                    sort.clickListThree(-rand.nextInt(75)+100);
                break;
            case 3:
                if (rand.nextBoolean())
                    sort.clickListFour(rand.nextInt(75)+100);
                else
                    sort.clickListFour(-rand.nextInt(75)+100);
                break;
            case 4:
                if (rand.nextBoolean())
                    sort.clickListFive(rand.nextInt(25)+100);
                else
                    sort.clickListFive(-rand.nextInt(75)+100);
                break;
            case 5:
                sort.clickListSix(-rand.nextInt(100)+100);
                break;
        }
        String endOrder = sort.getListOrder();
        Assert.assertNotEquals(startOrder, endOrder);

        sort.scrollPage();

        sort.clickSortGrid();
        startOrder = sort.getGridOrder();
        switch (rand.nextInt(9)) {
            case 0:
                switch (rand.nextInt(3)) {
                    case 0:
                        sort.clickGridOne(rand.nextInt(150)+200, 0);
                        break;
                    case 1:
                        sort.clickGridOne(rand.nextInt(150)+200, 0);
                        sort.clickGridOne(0, rand.nextInt(150)+200);
                        break;
                    case 2:
                        sort.clickGridOne(0, rand.nextInt(150)+200);
                        break;
                }
                break;
            case 1:
                switch (rand.nextInt(5)) {
                    case 0:
                        sort.clickGridTwo(-rand.nextInt(100)+200, 0);
                        break;
                    case 1:
                        sort.clickGridTwo(-rand.nextInt(100)+200, 0);
                        sort.clickGridTwo(0, rand.nextInt(150)+200);
                        break;
                    case 2:
                        sort.clickGridTwo(0, rand.nextInt(150)+200);
                        break;
                    case 3:
                        sort.clickGridTwo(rand.nextInt(100)+200, 0);
                        sort.clickGridTwo(0, rand.nextInt(150)+200);
                        break;
                    case 4:
                        sort.clickGridTwo(rand.nextInt(100)+200, 0);
                        break;
                }
                break;
            case 2:
                switch (rand.nextInt(3)) {
                    case 0:
                        sort.clickGridThree(-rand.nextInt(150)+200, 0);
                        break;
                    case 1:
                        sort.clickGridThree(-rand.nextInt(150)+200, 0);
                        sort.clickGridThree(0, rand.nextInt(150)+200);
                        break;
                    case 2:
                        sort.clickGridThree(0, rand.nextInt(150)+200);
                        break;
                }
                break;
            case 3:
                switch (rand.nextInt(5)) {
                    case 0:
                        sort.clickGridFour(0, -rand.nextInt(100)+200);
                        break;
                    case 1:
                        sort.clickGridFour(rand.nextInt(150)+200, 0);
                        sort.clickGridFour(0, -rand.nextInt(100)+200);
                        break;
                    case 2:
                        sort.clickGridFour(rand.nextInt(150)+200, 0);
                        break;
                    case 3:
                        sort.clickGridFour(rand.nextInt(150)+200, 0);
                        sort.clickGridFour(0, rand.nextInt(100)+200);
                        break;
                    case 4:
                        sort.clickGridFour(0, rand.nextInt(100)+200);
                        break;
                }
                break;
            case 4:
                switch (rand.nextInt(8)) {
                    case 0:
                        sort.clickGridFive(-rand.nextInt(100)+150, 0);
                        sort.clickGridFive(0, -rand.nextInt(100)+150);
                        break;
                    case 1:
                        sort.clickGridFive(0, -rand.nextInt(100)+150);
                        break;
                    case 2:
                        sort.clickGridFive(rand.nextInt(100)+150, 0);
                        sort.clickGridFive(0, -rand.nextInt(100)+150);
                        break;
                    case 3:
                        sort.clickGridFive(rand.nextInt(100)+150, 0);
                        break;
                    case 4:
                        sort.clickGridFive(rand.nextInt(100)+150, 0);
                        sort.clickGridFive(0, rand.nextInt(100)+150);
                        break;
                    case 5:
                        sort.clickGridFive(0, rand.nextInt(100)+150);
                        break;
                    case 6:
                        sort.clickGridFive(-rand.nextInt(100)+150, 0);
                        sort.clickGridFive(0, rand.nextInt(100)+150);
                        break;
                    case 7:
                        sort.clickGridFive(-rand.nextInt(100)+150, 0);
                        break;
                }
                break;
            case 5:
                switch (rand.nextInt(5)) {
                    case 0:
                        sort.clickGridSix(0, -rand.nextInt(100)+150);
                        break;
                    case 1:
                        sort.clickGridSix(-rand.nextInt(150)+150, 0);
                        sort.clickGridSix(0, -rand.nextInt(100)+150);
                        break;
                    case 2:
                        sort.clickGridSix(-rand.nextInt(150)+150, 0);
                        break;
                    case 3:
                        sort.clickGridSix(-rand.nextInt(150)+150, 0);
                        sort.clickGridSix(0, rand.nextInt(100)+150);
                        break;
                    case 4:
                        sort.clickGridSix(0, rand.nextInt(100)+150);
                        break;
                }
                break;
            case 6:
                switch (rand.nextInt(3)) {
                    case 0:
                        sort.clickGridSeven(rand.nextInt(150)+150, 0);
                        break;
                    case 1:
                        sort.clickGridSeven(rand.nextInt(150)+150, 0);
                        sort.clickGridSeven(0, -rand.nextInt(150)+150);
                        break;
                    case 2:
                        sort.clickGridSeven(0, -rand.nextInt(150)+150);
                        break;
                }
                break;
            case 7:
                switch (rand.nextInt(5)) {
                    case 0:
                        sort.clickGridEight(-rand.nextInt(100)+150, 0);
                        break;
                    case 1:
                        sort.clickGridEight(-rand.nextInt(100)+150, 0);
                        sort.clickGridEight(0, -rand.nextInt(150)+150);
                        break;
                    case 2:
                        sort.clickGridEight(0, -rand.nextInt(150)+150);
                        break;
                    case 3:
                        sort.clickGridEight(rand.nextInt(100)+150, 0);
                        sort.clickGridEight(0, -rand.nextInt(150)+150);
                        break;
                    case 4:
                        sort.clickGridEight(rand.nextInt(100)+150, 0);
                        break;
                }
                break;
            case 8:
                switch (rand.nextInt(3)) {
                    case 0:
                        sort.clickGridNine(-rand.nextInt(150)+150, 0);
                        break;
                    case 1:
                        sort.clickGridNine(-rand.nextInt(150)+150, 0);
                        sort.clickGridNine(0, -rand.nextInt(150)+150);
                        break;
                    case 2:
                        sort.clickGridNine(0, -rand.nextInt(150)+150);
                        break;
                }
                break;
        }
        endOrder = sort.getGridOrder();
        Assert.assertNotEquals(startOrder, endOrder);
    }

    @Test
    public void testFactoryInteractionsSelectPage () {
        driver.get("https://demoqa.com/selectable");

        String expectedUrl = "https://demoqa.com/selectable";
        DemoQAInteractionsSelectFactory select = new DemoQAInteractionsSelectFactory(driver);

        Assert.assertEquals(select.getUrl(), expectedUrl);

        select.clickSelectList();
        Random rand = new Random();
        String randOutput = "";
        switch (rand.nextInt(4)) {
            case 0:
                switch (rand.nextInt(4)) {
                    case 0:
                        select.clickList1();
                        randOutput += "1 ";
                        break;
                    case 1:
                        select.clickList2();
                        randOutput += "2 ";
                        break;
                    case 2:
                        select.clickList3();
                        randOutput += "3 ";
                        break;
                    case 3:
                        select.clickList4();
                        randOutput += "4 ";
                        break;
                }
                break;
            case 1:
                switch (rand.nextInt(6)) {
                    case 0:
                        select.clickList1();
                        select.clickList2();
                        randOutput += "1 2 ";
                        break;
                    case 1:
                        select.clickList1();
                        select.clickList3();
                        randOutput += "1 3 ";
                        break;
                    case 2:
                        select.clickList1();
                        select.clickList4();
                        randOutput += "1 4 ";
                        break;
                    case 3:
                        select.clickList2();
                        select.clickList3();
                        randOutput += "2 3 ";
                        break;
                    case 4:
                        select.clickList2();
                        select.clickList4();
                        randOutput += "2 4 ";
                        break;
                    case 5:
                        select.clickList3();
                        select.clickList4();
                        randOutput += "3 4 ";
                        break;
                }
                break;
            case 2:
                switch (rand.nextInt(4)) {
                    case 0:
                        select.clickList1();
                        select.clickList2();
                        select.clickList3();
                        randOutput += "1 2 3 ";
                        break;
                    case 1:
                        select.clickList1();
                        select.clickList2();
                        select.clickList4();
                        randOutput += "1 2 4 ";
                        break;
                    case 2:
                        select.clickList1();
                        select.clickList3();
                        select.clickList4();
                        randOutput += "1 3 4 ";
                        break;
                    case 3:
                        select.clickList2();
                        select.clickList3();
                        select.clickList4();
                        randOutput += "2 3 4 ";
                        break;
                }
                break;
            case 3:
                select.clickList1();
                select.clickList2();
                select.clickList3();
                select.clickList4();
                randOutput += "1 2 3 4 ";
                break;
        }
        Assert.assertEquals(select.getSelectList(), randOutput);

        select.clickSelectGrid();
        randOutput = "";
        switch (rand.nextInt(2)) {
            case 0:
                switch (rand.nextInt(9)) {
                    case 0:
                        select.clickGrid1();
                        randOutput += "1 ";
                        break;
                    case 1:
                        select.clickGrid2();
                        randOutput += "2 ";
                        break;
                    case 2:
                        select.clickGrid3();
                        randOutput += "3 ";
                        break;
                    case 3:
                        select.clickGrid4();
                        randOutput += "4 ";
                        break;
                    case 4:
                        select.clickGrid5();
                        randOutput += "5 ";
                        break;
                    case 5:
                        select.clickGrid6();
                        randOutput += "6 ";
                        break;
                    case 6:
                        select.clickGrid7();
                        randOutput += "7 ";
                        break;
                    case 7:
                        select.clickGrid8();
                        randOutput += "8 ";
                        break;
                    case 8:
                        select.clickGrid9();
                        randOutput += "9 ";
                        break;
                }
                break;
            case 1:
                select.clickGrid1();
                select.clickGrid2();
                select.clickGrid3();
                select.clickGrid4();
                select.clickGrid5();
                select.clickGrid6();
                select.clickGrid7();
                select.clickGrid8();
                select.clickGrid9();
                randOutput = "1 2 3 4 5 6 7 8 9 ";
                break;
        }
        Assert.assertEquals(select.getSelectGrid(), randOutput);
    }

    @Test
    public void testFactoryInteractionsResizePage () {
        driver.get("https://demoqa.com/resizable");

        String expectedUrl = "https://demoqa.com/resizable";
        DemoQAInteractionsResizeFactory resize = new DemoQAInteractionsResizeFactory(driver);

        Assert.assertEquals(resize.getUrl(), expectedUrl);

        Random rand = new Random();
        Point point = resize.getSizeOne();
        switch (rand.nextInt(4)) {
            case 0:
                resize.clickResizeOne(rand.nextInt(199)+1, rand.nextInt(99)+1);
                break;
            case 1:
                resize.clickResizeOne(-(rand.nextInt(49)+1), rand.nextInt(99)+1);
                break;
            case 2:
                resize.clickResizeOne(rand.nextInt(199)+1, -(rand.nextInt(49)+1));
                break;
            case 3:
                resize.clickResizeOne(-(rand.nextInt(49)+1), -(rand.nextInt(49)+1));
                break;
            }
        Assert.assertNotEquals(resize.getSizeOne(), point);

        resize.scrollPage();

        point = resize.getSizeTwo();
        switch (rand.nextInt(4)) {
            case 0:
                resize.clickResizeTwo(rand.nextInt(199)+1, rand.nextInt(199)+1);
                break;
            case 1:
                resize.clickResizeTwo(-(rand.nextInt(199)+1), rand.nextInt(199)+1);
                break;
            case 2:
                resize.clickResizeTwo(rand.nextInt(199)+1, -(rand.nextInt(199)+1));
                break;
            case 3:
                resize.clickResizeTwo(-(rand.nextInt(199)+1), -(rand.nextInt(199)+1));
                break;
        }
       Assert.assertNotEquals(resize.getSizeTwo(), point);
    }

    @Test
    public void testFactoryInteractionsDropPage () {
        driver.get("https://demoqa.com/droppable");

        String expectedUrl = "https://demoqa.com/droppable";
        DemoQAInteractionsDropFactory drop = new DemoQAInteractionsDropFactory(driver);

        Assert.assertEquals(drop.getUrl(), expectedUrl);

        drop.clickSimple();
        drop.moveSimple();
        Assert.assertEquals(drop.getSimpleText(), "Dropped!");

        drop.clickAccept();
        drop.moveAcceptOne();
        Assert.assertEquals(drop.getAcceptText(), "Dropped!");
        drop.pageRefresh();
        drop.clickAccept();
        drop.moveAcceptTwo();
        Assert.assertEquals(drop.getAcceptText(), "Drop here");

        drop.clickPrevent();
        drop.movePrevent();
        Assert.assertEquals(drop.getNotGreedyText(), "Dropped!\n" +
                    "Dropped!");
        drop.movePreventGreedy();
        Assert.assertEquals(drop.getGreedyText(), "Outer droppable\n" +
                    "Dropped!");

        drop.clickRevert();
        org.openqa.selenium.Point pointOne = drop.getRevertPositionOne();
        drop.moveRevertOne();
        Assert.assertEquals(drop.getRevertText(), "Dropped!");
        drop.movementWait();
        Assert.assertEquals(drop.getRevertPositionOne(), pointOne);
        drop.pageRefresh();
        drop.clickRevert();
        pointOne = drop.getRevertPositionTwo();
        drop.moveRevertTwo();
        Assert.assertEquals(drop.getRevertText(), "Dropped!");
        Assert.assertNotEquals(drop.getRevertPositionOne(), pointOne);
    }

    @Test
    public void testFactoryInteractionsDragPage () {
        driver.get("https://demoqa.com/dragabble");

        String expectedUrl = "https://demoqa.com/dragabble";
        DemoQAInteractionsDragFactory drag = new DemoQAInteractionsDragFactory(driver);

        Assert.assertEquals(drag.getUrl(), expectedUrl);

        Random rand = new Random();

        drag.clickSimple();
        org.openqa.selenium.Point start = drag.getSimplePosition();
        drag.moveSimple(rand.nextInt(150), 0);
        drag.moveSimple(0, rand.nextInt(150));
        org.openqa.selenium.Point end = drag.getSimplePosition();
        Assert.assertNotEquals(end, start);

        drag.clickAxis();
        start = drag.getAxisXPosition();
        drag.moveAxisX(rand.nextInt(100));
        end = drag.getAxisXPosition();
        Assert.assertNotEquals(end, start);
        start = drag.getAxisYPosition();
        drag.moveAxisY(rand.nextInt(100));
        end = drag.getAxisYPosition();
        Assert.assertNotEquals(end, start);

        drag.clickContainer();
        start = drag.getBoxPosition();
        drag.moveContainerOne(rand.nextInt(100), 0);
        drag.moveContainerOne(0, rand.nextInt(100));
        end = drag.getBoxPosition();
        Assert.assertNotEquals(end, start);
        drag.scrollPage();
        start = drag.getParentPosition();
        drag.moveContainerTwo(rand.nextInt(10), 0);
        drag.moveContainerTwo(0, rand.nextInt(30));
        end = drag.getParentPosition();
        Assert.assertNotEquals(end, start);

        drag.clickCursorTab();
        start = drag.getCursorCenterPosition();
        drag.moveCursorCenter(rand.nextInt(100), 0);
        drag.moveCursorCenter(0, rand.nextInt(100));
        end = drag.getCursorCenterPosition();
        Assert.assertNotEquals(end, start);
        start = drag.getCursorLeftPosition();
        drag.moveCursorLeft(rand.nextInt(100), 0);
        drag.moveCursorLeft(0, rand.nextInt(100));
        end = drag.getCursorLeftPosition();
        Assert.assertNotEquals(end, start);
        drag.scrollPage();
        start = drag.getCursorBottomPosition();
        drag.moveCursorBottom(rand.nextInt(100), 0);
        drag.moveCursorBottom(0, rand.nextInt(100));
        end = drag.getCursorBottomPosition();
        Assert.assertNotEquals(end, start);
    }

    @AfterTest
    public void endSession() { driver.quit(); }
}
