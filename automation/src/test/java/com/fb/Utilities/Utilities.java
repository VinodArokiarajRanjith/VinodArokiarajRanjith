package com.fb.Utilities;

import static org.testng.Assert.assertTrue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.manager.SeleniumManagerOutput;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import java.util.regex.Pattern;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.service.ExtentService;
import com.google.common.collect.ImmutableMap;
import com.aventstack.extentreports.util.Assert;
import com.fb.Utilities.Utilities.condition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Utilities implements IAutoConstant {

	public static Properties property;
	public static String getAppPackageInput;
	static String getAppActivityInput;
	public static int elementWaitInSeconds = 10;
	public static WebDriverWait wait;
	public static String getUserDeviceInput;
	public static RemoteWebDriver driver;
	static DesiredCapabilities caps;
	static URL url;
	static File app;
	static String apkpath;
	static SimpleDateFormat simpleformat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss");
	public static String getbrowserstackuserid;
	public static String getbrowserstackacesskey;
	public static String getbrowserstackappid_android;
	public static String getbrowserstackappid_ios;
	public static String getbrowserstackandroid_osversion;
	public static String getbrowserstackios_osversion;
	public static String getAppCenterUserName;
	public static String getAppCenterAPIKey;
	public static String getAppCenterAndroidAppName;
	public static String getAppCenteriOSAppName;
	public static ExcelReader reader = new ExcelReader();
	public static String bsAppURL = "";
	public static String platformName;
	public static String browserName;
	public static String environment;
	public static String WindowHeading;
	public static String osVersion;
	public static String deviceName;
	public static String testDataType;
	public static String SheetPath = "";
	public static String WebSheetPath = "";
	public static String testDataPath = "";
	public static String getIosBundleId;
	public static String getIosUdid;
	public static String getIosIpaPath;
	public static String buildVersion;
	public static String bsSessionId="";

	public static String webAppUrl;
	public static String environmentName;
	public static String opSystem;

	private static Logger logger = LogManager.getLogger(Utilities.class);
	public static void webinitiateApp() throws Exception {
		property = loadProperty(BROWSER_PATH);
		getbrowserstackuserid = property.getProperty("BROWSERSTACKUSERID");
		getbrowserstackacesskey = property.getProperty("BROWSERSTACKACESSKEY");
		environmentName = property.getProperty("ENVIRONMENT");
		browserName = property.getProperty("BROWSER");
		platformName = property.getProperty("PLATFORM");
		opSystem = property.getProperty("OPERATINGSYSTEM");
		SheetPath("Web");
		List<Map<String, String>> testData = reader.getData(SheetPath, "browser");
		String webAppUrl = testData.get(0).get("url");
		if (platformName.equalsIgnoreCase("Local")) {
			if (browserName.equalsIgnoreCase("CHROME")) {

				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				driver = new ChromeDriver(options);
				driver.manage().deleteAllCookies();
				driver.get(webAppUrl);
				System.out.println("Chrome browser is initiated");
			} else if (browserName.equalsIgnoreCase("FIREFOX")) {
				browserName = property.getProperty("IOSDEVICENAME");
			} else if (browserName.equalsIgnoreCase("EDGE")) {
				browserName = property.getProperty("BROWSERSTACKANDROIDDEVICE");
			} else if (browserName.equalsIgnoreCase("SAFARI")) {
				browserName = property.getProperty("BROWSERSTACKIOSDEVICE");
			}
		} else if (platformName.equalsIgnoreCase("BS_WEB")) {
			MutableCapabilities capabilities = new MutableCapabilities();
			HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
			capabilities.setCapability("browserName", browserName);
			if (opSystem.equalsIgnoreCase("Windows")) {
				browserstackOptions.put("os", "Windows");
				browserstackOptions.put("osVersion", "11");
			} else if (opSystem.equalsIgnoreCase("Mac")) {
				browserstackOptions.put("os", "OS X");
				browserstackOptions.put("osVersion", "Ventura");
			}
			browserstackOptions.put("browserVersion", "latest");
			browserstackOptions.put("local", "false");
			capabilities.setCapability("bstack:options", browserstackOptions);
			driver = new RemoteWebDriver(new URL("http://" + getbrowserstackuserid + ":"
					+ getbrowserstackacesskey + "@hub-cloud.browserstack.com/wd/hub"), capabilities);
			driver.get(webAppUrl);
		} else if (platformName.equalsIgnoreCase("BS_MOBILEWEB")) {
			MutableCapabilities capabilities = new MutableCapabilities();
			HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
			if (opSystem.equalsIgnoreCase("iOS")) {
				browserstackOptions.put("deviceName", "iPhone 14 Pro Max");
				browserstackOptions.put("osVersion", "16");
			} else if (opSystem.equalsIgnoreCase("Android")) {
				capabilities.setCapability("browserName", "chrome");
				browserstackOptions.put("deviceName", "Samsung Galaxy S22 Ultra");
				browserstackOptions.put("osVersion", "12.0");
			}
			browserstackOptions.put("local", "false");
			capabilities.setCapability("bstack:options", browserstackOptions);
			driver = new RemoteWebDriver(new URL("http://" + getbrowserstackuserid + ":"
					+ getbrowserstackacesskey + "@hub-cloud.browserstack.com/wd/hub"), capabilities);
			driver.get(webAppUrl);
		}
	}


	private static File getChromeLocation() {
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("stable");
		SeleniumManagerOutput.Result output =
				DriverFinder.getPath(ChromeDriverService.createDefaultService(), options);
		return new File(output.getBrowserPath());
	}
	public  void websiteLaunch(String SheetName, int RowNumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData = reader.getData(WebSheetPath, SheetName);
		String url = testData.get(RowNumber).get("url");
		System.out.println(url+"Url");
		driver.get(url);

	}

	public static void initiateApp() throws Exception {
		property = loadProperty(IOS_PATH);
		deviceName = System.getProperty("deviceName");
		osVersion = System.getProperty("osVersion");
		platformName = System.getProperty("platform");
		SheetPath("Mobile");
		WebSheetPath();
		testDataPath = property.getProperty("TESTDATA");
		if (platformName == null) {
			platformName = property.getProperty("PLATFORM");
		}

		if (deviceName == null) {
			if (platformName.equalsIgnoreCase("ANDROID")) {
				deviceName = property.getProperty("ANDROIDDEVICENAME");
			} else if (platformName.equalsIgnoreCase("IOS")) {
				deviceName = property.getProperty("IOSDEVICENAME");
			} else if (platformName.equalsIgnoreCase("BS_ANDROID")) {
				deviceName = property.getProperty("BROWSERSTACKANDROIDDEVICE");
			} else if (platformName.equalsIgnoreCase("BS_IOS")) {
				deviceName = property.getProperty("BROWSERSTACKIOSDEVICE");
			}
		}

		if (osVersion == null) {
			if (platformName.equalsIgnoreCase("ANDROID")) {
				osVersion = property.getProperty("ANDROIDOSVERSION");
			} else if (platformName.equalsIgnoreCase("IOS")) {
				osVersion = property.getProperty("IOSOSVERSION");
			} else if (platformName.equalsIgnoreCase("BS_ANDROID")) {
				osVersion = property.getProperty("BROWSERSTACKANDROID_OSVERSION");
			} else if (platformName.equalsIgnoreCase("IOS")) {
				osVersion = property.getProperty("BROWSERSTACKIOS_OSVERSION");
			}
		}

		if (platformName.equalsIgnoreCase("ANDROID") || platformName.equalsIgnoreCase("BS_ANDROID")) {
			getUserDeviceInput = "ANDROID";
		} else {
			getUserDeviceInput = "IOS";
		}

		ExtentService.getInstance().setSystemInfo("Platform", platformName);
		ExtentService.getInstance().setSystemInfo("Device", deviceName);
		ExtentService.getInstance().setSystemInfo("OS", osVersion);
		getAppPackageInput = property.getProperty("APPPACKAGE");
		getAppActivityInput = property.getProperty("APPACTIVTY");
		getbrowserstackuserid = property.getProperty("BROWSERSTACKUSERID");
		getbrowserstackacesskey = property.getProperty("BROWSERSTACKACESSKEY");
		getbrowserstackappid_android = property.getProperty("BROWSWESTACKAPPID-ANDROID");
		getbrowserstackappid_ios = property.getProperty("BROWSWESTACKAPPID-IOS");
		getbrowserstackios_osversion = property.getProperty("BROWSERSTACKIOS_OSVERSION");
		getAppCenterUserName = property.getProperty("APPCENTER_UNAME");
		getAppCenterAPIKey = property.getProperty("APPCENTER_API_KEY");
		getAppCenterAndroidAppName = property.getProperty("APPCENTER_ANDROID_APPNAME");
		getAppCenteriOSAppName = property.getProperty("APPCENTER_IOS_APPNAME");
		getIosBundleId = property.getProperty("BUNDLEID");
		getIosUdid = property.getProperty("UDID");
		getIosIpaPath = property.getProperty("IOSAPPPATH");
		buildVersion = property.getProperty("BUILDVERSION");
		caps = new DesiredCapabilities();
		String directory = System.getProperty("user.dir");
		try {
			if (platformName.equalsIgnoreCase("Android")) {
				apkpath = property.getProperty("ANDROIDAPKPATH");
				UiAutomator2Options options = new UiAutomator2Options();
				options.setDeviceName(deviceName);
				options.setPlatformName(platformName);
				options.setApp(apkpath);
				options.setPlatformVersion(osVersion);
				options.setNoReset(false);
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
			} else if (platformName.equalsIgnoreCase("IOS")) {

				XCUITestOptions options = new XCUITestOptions();
				options.setPlatformName("iOS");
				options.setPlatformVersion(osVersion);
				options.setDeviceName(deviceName);
				options.setUdid(getIosUdid);
				options.setFullReset(false);
				options.setApp(getIosIpaPath);
				options.setBundleId(getIosBundleId);
				url = new URL("http://127.0.0.1:4723/wd/hub");
				driver = new IOSDriver(url, options);
			} else if (platformName.equalsIgnoreCase("BS_ANDROID")) {

				getBSAppURL(getAppCenterAndroidAppName, buildVersion);
				UiAutomator2Options options = new UiAutomator2Options();
				options.setPlatformName("Android");
				options.setPlatformVersion(osVersion);
				options.setDeviceName(deviceName);
				options.setFullReset(false);
				options.setApp(bsAppURL);
				driver = new AndroidDriver(new URL("http://" + getbrowserstackuserid + ":" + getbrowserstackacesskey
						+ "@hub-cloud.browserstack.com/wd/hub"), options);

			} else if (platformName.equalsIgnoreCase("BS_IOS")) {
				getBSAppURL(getAppCenteriOSAppName, buildVersion);
				XCUITestOptions options = new XCUITestOptions();
				options.setPlatformName("iOS");
				options.setPlatformVersion(osVersion);
				options.setDeviceName(deviceName);
				options.setFullReset(false);
				options.setApp(bsAppURL);
				driver = new IOSDriver(new URL("http://" + getbrowserstackuserid + ":" + getbrowserstackacesskey
						+ "@hub-cloud.browserstack.com/wd/hub"), options);
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
			logging(condition.info, "Test is running in Device Name: "+deviceName+" Platform Name: "+platformName+" OS Version: "+osVersion);
			logging(condition.pass,"MoEs Mobile Application is started");
		} catch (Exception ex) {
			ex.printStackTrace();
			logging(condition.fail,"MoEs Mobile Application is not started");

		}
	}

	public static void terminateApp() {
		try {
			driver.quit();
			log("MoEs Mobile Application is closed");
		} catch (Exception ex) {
			//logger.error("MoEs Mobile Application is not closed");
		}
	}

	public static String executeCmd(String cmd) throws IOException {
		ProcessBuilder builder = new ProcessBuilder("/bin/bash", "-c", cmd);
		builder.redirectErrorStream(true);
		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		line = r.readLine();
		System.out.println(line);
		return line;
	}

	public static String getAppUrl(String appDownloadUrl) throws IOException {
		String username = getbrowserstackuserid;
		String password = getbrowserstackacesskey;
		String url = "https://api-cloud.browserstack.com/app-automate/upload";
		String path = appDownloadUrl;
		String result = "";

		String[] command = { "curl", "-u", username + ":" + password, "-X", "POST", "-F", "cmd=unlockPage", "-F",
				"url=" + path, "-F", "_charset_=utf-8", url };

		ProcessBuilder process = new ProcessBuilder(command);
		Process p;
		try {
			p = process.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			StringBuilder builder = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append(System.getProperty("line.separator"));
			}
			result = builder.toString();
			logging(condition.info,result);
		} catch (IOException e) {
			logging(condition.warning,"error");
			e.printStackTrace();
		}
		return result;
	}

	public static AppiumDriver getDriver() {
		return (AppiumDriver) driver;
	}

	public WebDriverWait webDriverWait() {
		return new WebDriverWait(driver, Duration.ofSeconds(elementWaitInSeconds));
	}

	public void WaitElementToBeClickable(WebElement element) {
		webDriverWait().until(ExpectedConditions.elementToBeClickable(element));
	}

	public void WaitVisibilityOfElement(WebElement element) {
		webDriverWait().until(ExpectedConditions.visibilityOf(element));
	}
	public void TapElement(WebElement element) {
	//	WaitVisibilityOfElement(element);
			try {
			
				element.click();
				
		} catch (Exception ex) {
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}
	}



	public void EnterInput(WebElement element, String inputText) {
		try {
			element.clear();
			element.sendKeys(inputText);
			log("Text: " + inputText + " is entered in text field");
		} catch (Exception ex) {
			//logger.error("Sending input gets failed");
		}
	}

	public void HidingKeyboard() {
		try {
			log("Hiding keyboard is passed");
		} catch (Exception ex) {
			//logger.error("Hiding keyboard gets failed");
		}
	}

	public static Properties loadProperty(String path) {
		try {
			property = new Properties();
			property.load(new FileInputStream(path));
			//logger.info("Properties are loaded successfully");
			return property;
		} catch (Exception ex) {
			ex.printStackTrace();
			//logger.error("Properties doesn't loaded");
		}
		return null;
	}

	public void ScrollToText(String element) {

		if (getUserDeviceInput.equalsIgnoreCase("IOS")) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			scrollObject.put("xpath", element);
			js.executeScript("mobile: scroll", scrollObject);
			log("IOS Scroll has been passed");
		} else {
			String scrollElement = "new UiScrollable(new UiSelector().scrollable(true))"
					+ ".scrollIntoView(new UiSelector().text(\"" + element + "\").instance(0))";
			driver.findElement(MobileBy.AndroidUIAutomator(scrollElement));

		}
	}

	public void ScrollAndClickText(String element) {

		if (getUserDeviceInput.equalsIgnoreCase("IOS")) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			scrollObject.put("xpath", element);
			js.executeScript("mobile: scroll", scrollObject);
			log("IOS Scroll has been passed");
		} else {
			String scrollElement = "new UiScrollable(new UiSelector().scrollable(true))"
					+ ".scrollIntoView(new UiSelector().text(\"" + element + "\").instance(0))";
			driver.findElement(MobileBy.AndroidUIAutomator(scrollElement)).click();

		}
	}

	public static String date() {
		simpleformat = new SimpleDateFormat("dd");
		String strDate = simpleformat.format(new Date());
		log("Get current date is passed");
		return strDate;
	}

	public static String getCurrentYear() {
		simpleformat = new SimpleDateFormat("yyyy");
		String strYear = simpleformat.format(new Date());
		log("Get current year passed");
		return strYear;
	}

	public void iOSDatePicker(String strDate, String input, List<WebElement> dateSelection) {
		try {
			if (getUserDeviceInput.equalsIgnoreCase("IOS")) {
				List<WebElement> values = (List<WebElement>) dateSelection;
				if (!strDate.equals(input)) {
					values.get(1).sendKeys(input);
					log("Date has been selected successfully");
				}
			}

			else {
				List<WebElement> GetList = dateSelection;

			}
		}

		catch (Exception ex) {
			log("Date couldn't be selected");
		}

	}

	public void IOSYearPicker(String strYear, String input, List<WebElement> dateSelection) {
		List<WebElement> values = (List<WebElement>) dateSelection;
		if (!strYear.equals(input)) {
			values.get(2).sendKeys(input);
			log("Year has been selected successfully");
		} else {
			log("Year couldn't be selected");
		}
	}

	public void WeekDayPicker(List<WebElement> DaySelection, String input) {
		try {
			if (getUserDeviceInput.equalsIgnoreCase("IOS")) {
				List<WebElement> DayList = DaySelection;
				DayList.get(0).sendKeys(input);

			} else {
				int i = 1;
				List<WebElement> DayList = DaySelection;
				for (WebElement actualDay : DayList) {
					String getDay = actualDay.getText();
					if (getDay.equalsIgnoreCase(input)) {
						actualDay.click();
						break;
					}
				}
				i++;
			}
			log("Day has been selected successfully");
		} catch (Exception ex) {
			log("Day couldn't be selected");
		}
	}

	public static String getTodayDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd");
		String desiredDateToSelect = formatter.format(date);
		return desiredDateToSelect;
	}

	// Removing leading zero from the date if available
	public static String replaceLeadingZero(String dateToSelect) {
		String str = dateToSelect;
		String removedLeadingZero = "^0+";
		String afterRemovedZero = str.replaceAll(removedLeadingZero, "");
		Reporter.log("String: " + afterRemovedZero, true);
		return afterRemovedZero;
	}

	public void ActionClick(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.click();
		action.perform();
	}

	/**
	 * This mtd is going to read the data from csv file just pass below parameters
	 * this is implemented from Apache Commons CSV, need to add this in pom.xml
	 * 
	 * @param rowNo(Row  Number) which starts from 1
	 * @param headername in inputdata, header name in Header1 and Header2 then
	 *                   Create a object of class and call the method for ex
	 *                   -System.out.println(util.getcsvdata(2, "password"
	 *                   ,"username","password"));
	 * @return data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static String getcsvdata(int rowNo, String inputdata, String Header1, String Header2) throws Throwable {
		String data = null;
		BufferedReader reader = Files.newBufferedReader(Paths.get(CSV_PATH));
		CSVParser csvparser = new CSVParser(reader,
				CSVFormat.DEFAULT.withHeader(Header1, Header2).withIgnoreHeaderCase().withTrim());
		for (CSVRecord csvrecord : csvparser) {
			if (csvrecord.getRecordNumber() == rowNo) {
				data = csvrecord.get(inputdata);
			}
		}
		return data;
	}

	public static void waitFor(int sleepTime) {
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static boolean isSelected(WebElement e) {
		boolean b = e.isSelected();
		return b;
	}

	public static boolean isEnabled(WebElement e) {
		boolean result = e.isEnabled();
		return result;
	}

	public static boolean isDisplayed(WebElement e) {
		boolean d = e.isDisplayed();
		return d;
	}

	public static void log(String message) {
		ExtentCucumberAdapter.addTestStepLog(message);
		//logger.info(message);
	}

	public enum condition {
		pass, fail, warning, info
	}

	public static void logging(condition status, String message) {
		switch (status) {
		case pass:
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, message);
			logger.info(message);
			break;
		case fail:
			logger.info(message);
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, message);
			assertTrue(false, message);
			break;
		case warning:
			ExtentCucumberAdapter.getCurrentStep().log(Status.WARNING, message);
			logger.info(message);
			break;
		case info:
			ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, message);
			logger.info(message);
			break;
		default:
			break;
		}
	}

	public static byte[] getByteScreenshot() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(src);
		return fileContent;
	}



	public  static String handleWindows()
	{
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		// System.out.println("Child window handle is" + s1);
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				String WindowHeading =  driver.switchTo().window(ChildWindow).getTitle();
				// logging(condition.pass, "User is navigated to "+WindowHeading+" "+"Successfully");
				driver.close();
				driver.switchTo().window(MainWindow);
				// System.out.println("Child window closed");
			}
		}

		return WindowHeading;

	}


	public void confirmPageNavigation() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(allWindows);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		String childWindowURL = driver.switchTo().window(li.get(1)).getCurrentUrl();
		logging(condition.pass, "Navigated to "+childWindowURL+" "+"Page successfully");
		driver.close();
		driver.switchTo().window(li.get(0));

	}

	public static void hoverElement(WebElement ele)
	{
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}

	/**
	 * This method verifies email format
	 * @param email
	 * @return
	 */
	public static boolean isValidEmail(String email) {
		// Regular expression to check if the email is in the correct format
		String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
		Pattern pattern = Pattern.compile(emailRegex);
		boolean m = Pattern.matches(emailRegex, email);
		return m;
	}

	/*
	 * This method srolls up using cordinates with help of javascript executor
	 */
	public void scrollUpGesture(RemoteWebDriver driver, int left, int top, int width, int height) {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of("left", left, "top", top,
				"width", width, "height", height, "direction", "up", "percent", 1.0));
	}

	/*
	 * This method will do the basic upwards scrolling
	 */

	public void scrollup() {
		scrollUpGesture(driver, 370, 446, 370, 1285);
	}

	public static void getBSAppURL(String appCenterName,String buildVersion) throws IOException {
		if (bsAppURL == "") {
			String appDownLoadUrl = "";
			String exeCmd = "";
			String readOutput ="";
			String releaseID ="";
			if (buildVersion.equalsIgnoreCase("LATEST")){
				exeCmd = "curl -sX GET  \"https://api.appcenter.ms/v0.1/apps/" + getAppCenterUserName + "/" + appCenterName
						+ "/releases/latest\" -H \"Content-Type: application/json\" -H \"X-Api-Token: " + getAppCenterAPIKey
						+ "\"";
			}
			else {
				exeCmd = "curl -sX GET  \"https://api.appcenter.ms/v0.1/apps/" + getAppCenterUserName + "/" + appCenterName
						+ "/releases\" -H \"Content-Type: application/json\" -H \"X-Api-Token: " + getAppCenterAPIKey
						+ "\"";
				readOutput = executeCmd(exeCmd);
				JSONArray jsonArray = new JSONArray(readOutput);
				for (int i = 0; i < jsonArray.length(); i++)
				{
					JSONObject jsonObj = jsonArray.getJSONObject(i);
					if(Integer.toString(jsonObj.getInt("version")).equalsIgnoreCase(buildVersion)) {
						releaseID =Integer.toString(jsonObj.getInt("id"));
						break;
					}

				}
				exeCmd = "curl -sX GET  \"https://api.appcenter.ms/v0.1/apps/" + getAppCenterUserName + "/" + appCenterName
						+ "/releases/" + releaseID + "\" -H \"Content-Type: application/json\" -H \"X-Api-Token: " + getAppCenterAPIKey
						+ "\"";
			}
			readOutput = executeCmd(exeCmd);
			String[] outputList = readOutput.split(",");
			for (String lst : outputList) {
				if (lst.contains("download_url")) {
					appDownLoadUrl = lst.replace("\"", "").replace("download_url:", "");
					break;
				}
			}
			readOutput = getAppUrl(appDownLoadUrl);
			bsAppURL = readOutput.replace("\"", "").replace("app_url:", "").replace("{", "").replace("}", "");
		}
	}


	/*
	 * public static void SheetPath() { testDataType =
	 * property.getProperty("TESTDATA"); if (testDataType.equalsIgnoreCase("Azure"))
	 * SheetPath = "TestData.xlsx"; else { String basePath = new
	 * File("").getAbsolutePath(); SheetPath =
	 * basePath+"/src/test/resources/TestData/TestData.xlsx"; } }
	 */
	public static void SheetPath(String testDataPlatform) {
		testDataType = property.getProperty("TESTDATA");
		if (testDataType.equalsIgnoreCase("Azure")) {
			if (testDataPlatform.equalsIgnoreCase("Mobile")) {
				SheetPath = "TestData.xlsx";
			} else {
				SheetPath = "WebTestData.xlsx";
			}
		} else {
			String basePath = new File("").getAbsolutePath();
			if (testDataPlatform.equalsIgnoreCase("Mobile")) {
				SheetPath = basePath + "/src/test/resources/TestData/TestData.xlsx";
			} else {
				SheetPath = basePath + "/src/test/resources/TestData/WebTestData.xlsx";
			}

		}
	}

	public String SheetPathValue() {
		testDataType = property.getProperty("TESTDATA");
		return testDataType;
	}

	//Test Data for Web application

	public static void WebSheetPath() {
		testDataType = property.getProperty("TESTDATA");
		if (testDataType.equalsIgnoreCase("Azure")) 
			WebSheetPath = "WebTestData.xlsx";
		else {
			String basePath = new File("").getAbsolutePath();
			WebSheetPath = basePath+"/src/test/resources/TestData/WebTestData.xlsx";
		}
	}

	public String WebSheetPathValue() {
		testDataType = property.getProperty("TESTDATA");
		return testDataType;
	}

	public void clickOnElement(WebElement element)
	{
		if (element.isDisplayed()==true && element.isEnabled()==true) {
			element.click();
		}

		else
		{

		}
	}





}


