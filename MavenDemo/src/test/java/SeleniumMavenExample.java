import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMavenExample {
	@Test
	public void method1() {
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver_win32/chromedriver.exe");
		WebDriver driv1 =new ChromeDriver();
		driv1.get("https://www.futurecae.com/");
		driv1.findElement(By.linkText("Contact Us")).click();
		driv1.findElement(By.name("FirstName")).sendKeys("Jothi");
		driv1.findElement(By.name("LastName")).sendKeys("Hari");
		driv1.findElement(By.name("Email")).sendKeys("jothi1233@gmail.com");
		driv1.findElement(By.name("Mobile")).sendKeys("07896543217");
		WebElement dropElement = driv1.findElement(By.id("Country"));
		Select ee =  new Select(dropElement);
		ee.selectByIndex(5);
		driv1.findElement(By.name("Company")).sendKeys("Future CAE");
		WebElement existingClient = driv1.findElement(By.id("IsExistingClient"));
		existingClient.click();
		driv1.findElement(By.name("Description")).sendKeys("Hello Everyone Welcome to FutureCAE! Thanks for"
				+ " joining. Introduction to Selenium, Java and Manual Testing.");
		driv1.findElement(By.xpath("//button[contains(text(),'Send')]")).click();
		driv1.close();
		
	}
				

	}