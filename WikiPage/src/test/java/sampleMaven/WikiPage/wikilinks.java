package sampleMaven.WikiPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class wikilinks {
	@Test
	public  void main(){
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	/*DesiredCapabilities cap = DesiredCapabilities.firefox();
	cap.setBrowserName("firefox");
	cap.setPlatform(Platform.ANY);*/
 	/*RemoteWebDriver  driver =new RemoteWebDriver(cap); */
		driver.get("https://www.wikipedia.org");
		WebElement block = driver.findElement(By.xpath(".//*[@id='www-wikipedia-org']/div[6]"));
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getAttribute("href"));
			
		}
		
		driver.quit();

	}

}
