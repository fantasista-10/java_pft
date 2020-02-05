package addressbook.web.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupCreationTests {
  ChromeDriver WebDriver;

  @BeforeMethod
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver_win32\\chromedriver.exe");
    WebDriver = new ChromeDriver();
    WebDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

  @Test
  public void testGroupCreation() {
    WebDriver.get("http://addressbook/addressbook/group.php");
    WebDriver.manage().window().maximize();
    WebDriver.findElement(By.name("user")).click();
    WebDriver.findElement(By.name("user")).clear();
    WebDriver.findElement(By.name("user")).sendKeys("admin");
    WebDriver.findElement(By.name("pass")).click();
    WebDriver.findElement(By.name("pass")).clear();
    WebDriver.findElement(By.name("pass")).sendKeys("secret");
    WebDriver.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    WebDriver.findElement(By.linkText("groups")).click();
    WebDriver.findElement(By.name("new")).click();
    WebDriver.findElement(By.name("group_name")).click();
    WebDriver.findElement(By.name("group_name")).clear();
    WebDriver.findElement(By.name("group_name")).sendKeys("test1");
    WebDriver.findElement(By.name("group_header")).click();
    WebDriver.findElement(By.name("group_header")).clear();
    WebDriver.findElement(By.name("group_header")).sendKeys("test2");
    WebDriver.findElement(By.name("group_footer")).click();
    WebDriver.findElement(By.name("group_footer")).clear();
    WebDriver.findElement(By.name("group_footer")).sendKeys("test3");
    WebDriver.findElement(By.name("submit")).click();
    WebDriver.findElement(By.linkText("group page")).click();
  }

  @AfterMethod
  public void tearDown() {
    WebDriver.quit();
  }

  public static boolean isAlertPresent(ChromeDriver Webdriver) {
    try {
      Webdriver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
