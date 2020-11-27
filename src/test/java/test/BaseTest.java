package test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseTest {

	public AppiumDriver<MobileElement> driver;
	
	@BeforeClass
	public void startApp(){
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName","SM-J320F");
		caps.setCapability("platformName", "ANDROID");
		caps.setCapability("platformVersion", "5.1.1");
		caps.setCapability("udID", "420070c860b43400");
		caps.setCapability("appPackage", "com.dencreak.dlcalculator");
		caps.setCapability("appActivity", "com.dencreak.dlcalculator.DLCalculatorActivity");
		
			
			
					URL url = new URL ("http://0.0.0.0:4723/wd/hub");
					driver= new AppiumDriver<MobileElement>(url,caps);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
	}

	
	
}
