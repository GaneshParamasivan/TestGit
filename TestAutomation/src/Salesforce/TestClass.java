package Salesforce;
import java.util.List;
import java.lang.*;
import java.lang.Thread;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

public class TestClass {
	
@SuppressWarnings("deprecation")
public static void main(String[] args) throws Exception
{
	
	
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver.get("https://planinternationalcanada--uat.sandbox.my.salesforce.com");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	driver.findElement(By.id("username")).sendKeys("con_gparamasivan@plancanada.ca");
	driver.findElement(By.id("password")).sendKeys("Ganeshparamasivan@14");
	driver.findElement(By.id("Login")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/div/div/div/one-app-launcher-header/button")).click();
	//driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/div[2]/one-app-launcher-menu/div/one-app-launcher-search-bar/lightning-input/div/div/input")).sendKeys("Philanthropy");
	driver.findElement(By.xpath("//one-app-launcher-menu/div/one-app-launcher-search-bar/lightning-input/div/div/input")).sendKeys("Philanthropy");
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/div[2]/one-app-launcher-menu/div/div[1]/one-app-launcher-menu-item/a/div/lightning-formatted-rich-text/span/p")).click();
	System.out.println("Done for the day");
	//Thread.sleep(15000);
	Thread.sleep(15000);
	//driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]/a/span")).click();
	WebElement element1 = driver.findElement(By.xpath("//span[text()='Leads']"));
	js.executeScript("arguments[0].click();", element1);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(text(),'Auto-test Fname Auto-test Lname')]")).click();
	List<WebElement> elements = driver.findElements(By.xpath("//*[starts-with(@id, 'sectionContent')]/div/slot/records-record-layout-row[4]/slot/records-record-layout-item[1]/div/div/div[2]/button"));
	for (int i=0; i<elements.size();i++){
	   System.out.println("Button is" + elements.get(i).getAttribute("title"));
	}
	
}

}
