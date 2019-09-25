// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class LocationtestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void locationtest() {
    driver.get("https://perscholas.org/");
    driver.manage().window().setSize(new Dimension(1260, 662));
    driver.findElement(By.cssSelector(".dropdown > #mapToggle")).click();
    driver.findElement(By.cssSelector(".list-group-item:nth-child(1) > a")).click();
    assertThat(driver.findElement(By.cssSelector(".dropdown > #mapToggle")).getText(), is("ATLANTA"));
    vars.put("location", driver.findElement(By.cssSelector(".dropdown > #mapToggle")).getText());
    js.executeScript("window.scrollTo(0,926)");
    js.executeScript("window.scrollTo(0,1716.6666259765625)");
    js.executeScript("window.scrollTo(0,1951.3333740234375)");
    driver.findElement(By.cssSelector("address")).click();
    vars.put("address", driver.findElement(By.cssSelector("address")).getText());
    System.out.println("Content of address is: vars.get("address").toString()");
  }
}
