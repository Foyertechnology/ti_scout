package com.tscout.selenium.api.base;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.WeekdayFunc;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.tscout.selenium.api.design.Browser;
import com.tscout.selenium.api.design.Element;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Reporter;

public class SeleniumBase extends Reporter implements Browser, Element {

	public static RemoteWebDriver driver;
	public WebDriverWait wait;
	protected static Properties prop;


	@Override
	public void click(WebElement ele) {
		String text = "";
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		
			text = ele.getText();
			ele.click();
			reportStep("The Element " + text + " clicked", "pass");
			// reportStep("The Element :" + ele + " Clicked Successfully", "pass");
		} catch (StaleElementReferenceException e) {
			reportStep("The Element " + text + " could not be clicked", "fail");
			throw new RuntimeException();
		}
	}

	public void loadObjects() {
		prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("src/main/java/Config.Properties")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setExplicitWaitClickByXpathusingJS(String xpathVal) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathVal)));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();", element);
			reportStep("The Element " + xpathVal + " clicked", "pass");
			// System.out.println(" The Element " + " " + xpathVal + " clicked Successfully"
			// + " Status - PASSED ");
		} catch (Exception e) {
			reportStep("The Element " + xpathVal + " could not be clicked", "Status - FAILED");
			throw new RuntimeException();
		}
	}
	public void clickWithdraganddrop(String elements) {
		String text = "";
		try {
	Actions act=new Actions(driver); 
	// find element which we need to drag
	WebElement drag=(driver.findElement(By.xpath(elements))); 
	// find element which we need to drop
	WebElement drop=(driver.findElement(By.xpath(elements))); 
	// this will drag element to destination
	act.dragAndDrop(drag, drop).build().perform();}
		catch (Exception e) {
			reportStep("The Element with text " + text + " could not be ", "Status - FAILED");
			throw new RuntimeException();
		}
	}

	public void clickWithNoSnap(WebElement ele) {
		String text = "";
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = ele.getText();
			ele.click();
			reportStep("The Element with text: " + text + " " + ele + "clicked Successfully", "pass", false);
		} catch (StaleElementReferenceException e) {
			reportStep("The Element " + ele + " could not be clicked", "fail");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println(e);
		}

	}

	@Override
	public void append(WebElement ele, String data) {
		ele.sendKeys(data);
	}

	@Override
	public void clear(WebElement ele) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.clear();
			reportStep("The field is cleared Successfully", "pass");
			// reportStep("The Element :" + ele + " Clicked Successfully", "pass");
		} catch (ElementNotInteractableException e) {
			reportStep("The field is not Interactable", "fail");
			throw new RuntimeException();
		}
	}

	@Override
	public void clearAndType(WebElement ele, String data) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.clear();
			ele.sendKeys(data);
			reportStep("The Data :" + data + " entered Successfully", "pass");
			// reportStep("The Element :" + ele + " Clicked Successfully", "pass");
		} catch (ElementNotInteractableException e) {
			reportStep("The Element " + ele + " is not Interactable", "fail");
			throw new RuntimeException();
		}

	}

	@Override
	public void Type(WebElement ele, String data) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.sendKeys(data);
			reportStep("The Data :" + data + " entered Successfully", "pass");
			// reportStep("The Element :" + ele + " Clicked Successfully", "pass");
		} catch (ElementNotInteractableException e) {
			reportStep("The Element " + ele + " is not Interactable", "fail");
			throw new RuntimeException();
		}

	}
	@Override
	public void clearAndTypeusingiframes(WebElement ele, String data) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			driver.switchTo().frame(0);
			ele.clear();
			ele.sendKeys(data);
			driver.switchTo().defaultContent();
			reportStep("The Data :" + data + " entered Successfully", "pass");
			// reportStep("The Element :" + ele + " Clicked Successfully", "pass");
		} catch (ElementNotInteractableException e) {
			reportStep("The Element " + ele + " is not Interactable", "fail");
			throw new RuntimeException();
		}

	}

	@Override
	public String getElementText(WebElement ele) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		String text = ele.getText();
		return text;
	}

	@Override
	public String getBackgroundColor(WebElement ele) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		String cssValue = ele.getCssValue("color");
		return cssValue;
	}

	@Override
	public String getTypedText(WebElement ele) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		String attributeValue = ele.getAttribute("value");
		return attributeValue;
	}

//	@Override
//	public void selectDropDownUsingText(WebElement ele, String value) {
//		wait = new WebDriverWait(driver, Duration.ofSeconds(80));
//		wait.until(ExpectedConditions.elementToBeClickable(ele));
//		new Select(ele).selectByVisibleText(value);
//	}

//	@Override
//	public void selectDropDownUsingIndex(WebElement ele, int index) {
//		wait = new WebDriverWait(driver, Duration.ofSeconds(80));
//		wait.until(ExpectedConditions.elementToBeClickable(ele));
//		new Select(ele).selectByIndex(index);
//	}
//
//	@Override
//	public void selectDropDownUsingValue(WebElement ele, String value) {
//		wait = new WebDriverWait(driver, Duration.ofSeconds(80));
//		wait.until(ExpectedConditions.elementToBeClickable(ele));
//		new Select(ele).selectByValue(value);
//	}

	public void selectDropDownUsingText(String xpath, String Text) {
		try {
			Select se = new Select(driver.findElement(By.xpath(xpath)));
			se.selectByVisibleText(Text);
			reportStep("The expected text contains the actual " + Text, "pass");
		} catch (Exception e) {
			System.out.println("Unknown exception occured while verifying the" + Text);
		}

	}

	public void setExplicitWaitClickByXpathusingJSusingKeys(String xpathVal) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathVal)));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();", element);
			element.sendKeys(Keys.ESCAPE);
			reportStep("The Element " + xpathVal + " clicked", "pass");
			// System.out.println(" The Element " + " " + xpathVal + " clicked Successfully"
			// + " Status - PASSED ");
		} catch (Exception e) {
			reportStep("The Element " + xpathVal + " could not be clicked", "Status - FAILED");
			throw new RuntimeException();
		}
	}

	public void selectDropDownUsingValue(String xpath, String value) {
		try {
			Select se = new Select(driver.findElement(By.xpath(xpath)));
			se.selectByValue(value);
			reportStep("The expected text contains the actual " + value, "pass");
		} catch (Exception e) {
			System.out.println("Unknown exception occured while verifying the" + value);
		}

	}

	public void selectDropDownUsingIndex(String xpath, int index) {
		try {
			Select se = new Select(driver.findElement(By.xpath(xpath)));
			se.selectByIndex(index);
			reportStep("The expected text contains the actual " + index, "pass");
		} catch (Exception e) {
			System.out.println("Unknown exception occured while verifying the" + index);
		}

	}

	public void scrollPageViewElement(String xpath) {

		try {
			WebElement element = new WebDriverWait(driver, 80)
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public void selectDropDownUsingVisibleText(String xpath, String Text) {
		try {
			Select se = new Select(driver.findElement(By.xpath(xpath)));
			se.selectByVisibleText(Text);
			reportStep("The expected text contains the actual " + Text, "pass");
			System.out.println(" Select DropDown using VisibleText is Identified Successfully" + Text);
		} catch (WebDriverException e) {
			System.out.println("Unknown exception occured while verifying the" + Text);
		}
	}

	public void currentdate(String xpath) {
//		Calendar calendar = Calendar.getInstance();
//		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
//		// String datetobeSelected = format1.format(calendar.getTime());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DAY_OF_WEEK, 1);
	}

	public void Weekfromcurrentdate(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.WEEK_OF_YEAR, 1);
	
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		//format1.
//		//String datetobeSelected = format1.format(calendar.getTime());
//		element.sendKeys(format1);
//		element.sendKeys(datetobeSelected + Keys.ENTER);
	}

	public void setExplicitWaitEnterByXpathusingKey(String xpathVal, String value) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 80);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathVal)));
			driver.findElement(By.xpath(xpathVal));
			element.clear();
			element.sendKeys(value);
			element.sendKeys(Keys.ARROW_DOWN);
			reportStep("The Data :" + value + " entered Successfully", "pass");
			System.out.println(" The Data : " + value + " entered Successfully : " + "pass");
		} catch (Exception e) {
			reportStep("[INFO] element with id: " + xpathVal + " " + " could not be identified.", "FAIL");
		}
	}

	@Override
	public boolean verifyExactText(WebElement ele, String expectedText) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			if (ele.getText().equals(expectedText)) {
				reportStep("The expected text contains the actual " + expectedText, "pass");
				return true;
			} else {
				reportStep("The expected text doesn't contain the actual " + expectedText, "fail");
			}
		} catch (WebDriverException e) {
			System.out.println("Unknown exception occured while verifying the Text");
		}

		return false;
	}

	@Override
	public boolean verifyPartialText(WebElement ele, String expectedText) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			if (ele.getText().contains(expectedText)) {
				reportStep("The expected text contains the actual " + expectedText, "pass");
				return true;
			} else {
				reportStep("The expected text doesn't contain the actual " + expectedText, "fail");
			}
		} catch (WebDriverException e) {
			System.out.println("Unknown exception occured while verifying the Text");
		}

		return false;
	}

	@Override
	public boolean verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			if (ele.getAttribute(attribute).equals(value)) {
				reportStep("The expected attribute :" + attribute + " value contains the actual " + value, "pass");
				return true;
			} else {
				reportStep("The expected attribute :" + attribute + " value does not contains the actual " + value,
						"fail");
			}
		} catch (WebDriverException e) {
			System.out.println("Unknown exception occured while verifying the Attribute Text");
		}
		return false;
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			if (ele.getAttribute(attribute).contains(value)) {
				reportStep("The expected attribute :" + attribute + " value contains the actual " + value, "pass");
			} else {
				reportStep("The expected attribute :" + attribute + " value does not contains the actual " + value,
						"fail");
			}
		} catch (WebDriverException e) {
			System.out.println("Unknown exception occured while verifying the Attribute Text");
		}

	}

	@Override
	public boolean verifyDisplayed(WebElement ele) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			if (ele.isDisplayed()) {
				reportStep("The element " + ele + " is visible", "pass");
				return true;
			} else {
				reportStep("The element " + ele + " is not visible", "fail");
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : " + e.getMessage());
		}
		return false;

	}

	@Override
	public boolean verifyDisappeared(WebElement ele) {
		return false;

	}

	@Override
	public boolean verifyEnabled(WebElement ele) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			if (ele.isEnabled()) {
				reportStep("The element " + ele + " is Enabled", "pass");
				return true;
			} else {
				reportStep("The element " + ele + " is not Enabled", "fail");
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : " + e.getMessage());
		}
		return false;
	}

	@Override
	public void verifySelected(WebElement ele) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			if (ele.isSelected()) {
				reportStep("The element " + ele + " is selected", "pass");
				// return true;
			} else {
				reportStep("The element " + ele + " is not selected", "fail");
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : " + e.getMessage());
		}
		// return false;

	}

	@Override
	public RemoteWebDriver startApp(String url) {
		return startApp("chrome", url);
	}

	@Override
	public RemoteWebDriver startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				ChromeOptions handlingSSL = new ChromeOptions();
				handlingSSL.setAcceptInsecureCerts(true);
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(handlingSSL);
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			reportStep("The Browser Could not be Launched. Hence Failed", "fail");
			throw new RuntimeException();
		}
		return driver;

	}

	@Override
	public WebElement locateElement(String locatorType, String value) {
		try {
			switch (locatorType.toLowerCase()) {
			case "id":
				return driver.findElementById(value);
			case "name":
				return driver.findElementByName(value);
			case "class":
				return driver.findElementByClassName(value);
			case "link":
				return driver.findElementByLinkText(value);
			case "xpath":
				return driver.findElementByXPath(value);
			}
		} catch (NoSuchElementException e) {
			reportStep("The Element with locator:" + locatorType + " Not Found with value: " + value, "fail");
			throw new RuntimeException();
		} catch (Exception e) {
			reportStep("The Element with locator:" + locatorType + " Not Found with value: " + value, "fail");
		}
		return null;
	}

	@Override
	public WebElement locateElement(String value) {
		WebElement findElementById = driver.findElementById(value);
		return findElementById;
	}

	@Override
	public List<WebElement> locateElements(String type, String value) {
		try {
			switch (type.toLowerCase()) {
			case "id":
				return driver.findElementsById(value);
			case "name":
				return driver.findElementsByName(value);
			case "class":
				return driver.findElementsByClassName(value);
			case "link":
				return driver.findElementsByLinkText(value);
			case "xpath":
				return driver.findElementsByXPath(value);
			}
		} catch (NoSuchElementException e) {
			System.err.println("The Element with locator:" + type + " Not Found with value: " + value);
			throw new RuntimeException();
		}
		return null;
	}

	@Override
	public void switchToAlert() {
		driver.switchTo().alert();
	}

	@Override
	public void acceptAlert() {
		String text = "";
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
			alert.accept();
			reportStep("The alert " + text + " is accepted.", "pass");
		} catch (NoAlertPresentException e) {
			reportStep("There is no alert present.", "fail");
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : " + e.getMessage());
		}

	}

	@Override
	public void dismissAlert() {
		String text = "";
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
			alert.dismiss();
			System.out.println("The alert " + text + " is accepted.");
		} catch (NoAlertPresentException e) {
			System.out.println("There is no alert present.");
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : " + e.getMessage());
		}

	}

	@Override
	public String getAlertText() {
		String text = "";
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
		} catch (NoAlertPresentException e) {
			System.out.println("There is no alert present.");
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : " + e.getMessage());
		}
		return text;
	}

	@Override
	public void typeAlert(String data) {
		driver.switchTo().alert().sendKeys(data);

	}

	@Override
	public void switchToWindow(int index) {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> allhandles = new ArrayList<String>(allWindows);
			String exWindow = allhandles.get(index);
			driver.switchTo().window(exWindow);
			System.out.println("The Window With index: " + index + " switched successfully");
		} catch (NoSuchWindowException e) {
			System.err.println("The Window With index: " + index + " not found");
		}
	}

	@Override
	public void switchToWindow(String title) {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			for (String eachWindow : allWindows) {
				driver.switchTo().window(eachWindow);
				if (driver.getTitle().equals(title)) {
					break;
				}
			}
			System.out.println("The Window With Title: " + title + "is switched ");
		} catch (NoSuchWindowException e) {
			System.err.println("The Window With Title: " + title + " not found");
		} finally {
			takeSnap();
		}
	}

	@Override
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);

	}

	@Override
	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);

	}

	@Override
	public void switchToFrame(String idOrName) {
		driver.switchTo().frame(idOrName);

	}

	@Override
	public void defaultContent() {
		driver.switchTo().defaultContent();

	}

	@Override
	public boolean verifyUrl(String url) {
		if (driver.getCurrentUrl().equals(url)) {
			System.out.println("The url: " + url + " matched successfully");
			return true;
		} else {
			System.out.println("The url: " + url + " not matched");
		}
		return false;
	}

	@Override
	public boolean verifyTitle(String title) {
		if (driver.getTitle().equals(title)) {
			System.out.println("Page title: " + title + " matched successfully");
			return true;
		} else {
			System.out.println("Page url: " + title + " not matched");
		}
		return false;
	}

	public long takeSnap() {
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),
					new File("./reports/images/" + number + ".jpg"));
		} catch (WebDriverException e) {
			System.out.println("The browser has been closed.");
		} catch (IOException e) {
			System.out.println("The snapshot could not be taken");
		}
		return number;
	}

	@Override
	public void close() {
		driver.close();

	}

	@Override
	public void quit() {
		driver.quit();

	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub

	}
	
	public void UploadImageUsingRobotClass(String xpathVal, String PathLocation) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathVal)));
			element.click();
			// String PathLocation="C:\\Users\\Foyer Technology\\Downloads\\images.jpg";
			StringSelection Selection = new StringSelection(PathLocation);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			reportStep("The Element " + xpathVal + " clicked", "pass");
			reportStep("The Element " + PathLocation + " Entered Successfully ", "pass");
			System.out.println(" The Element " + " " + xpathVal + " clicked Successfully" + " Status - PASSED ");
			System.out.println(" The Element " + " " + PathLocation + " Entered Successfully " + " Status - PASSED ");
		} catch (Exception e) {
			reportStep("The Element " + xpathVal + " could not be clicked", "Status - FAILED");
			throw new RuntimeException();
		}
	}


}
