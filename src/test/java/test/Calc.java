package test;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Calc extends BaseTest {

	
	
	@Test
	public void OpenCalculator() {
		
		WebElement one = driver.findElement(By.id("com.dencreak.dlcalculator:id/2131297011"));
		WebElement plus= driver.findElement(By.id("com.dencreak.dlcalculator:id/2131297034"));
		WebElement nine = driver.findElement(By.id("com.dencreak.dlcalculator:id/2131297005"));
		WebElement equal = driver.findElement(By.id("com.dencreak.dlcalculator:id/2131297038"));
		WebElement result = driver.findElement(By.id("com.dencreak.dlcalculator:id/2131296738"));
		one.click();
		plus.click();
		nine.click();
		equal.click();
		String Results = result.getText();
		System.out.println(Results);
		System.out.println("Completed...");
	
		
	}
}
