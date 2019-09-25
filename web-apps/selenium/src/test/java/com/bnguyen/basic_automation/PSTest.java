package com.bnguyen.basic_automation;

//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

public class PSTest {
	private static WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Student/Desktop/Per-Scholas/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void perScholasTest() throws InterruptedException {
	    driver.get("https://perscholas.org/");
	    driver.manage().window().setSize(new Dimension(1280, 680));
	    driver.findElement(By.cssSelector(".dropdown > #mapToggle")).click();
	    driver.findElement(By.cssSelector(".list-group-item:nth-child(1) > a")).click();
	    js.executeScript("window.scrollTo(0,1076)");
	    Thread.sleep(250);
	    driver.findElement(By.cssSelector("h3:nth-child(1)")).click();
	    assertThat(driver.findElement(By.cssSelector("h3:nth-child(1)")).getText(), is("ATLANTA"));
	    driver.findElement(By.cssSelector("address")).click();
	    vars.put("address", driver.findElement(By.cssSelector("address")).getText());
	    driver.close();
	  }
}
