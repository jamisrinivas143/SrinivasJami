/*
@Author SrinivasJami

*/
package guru99.gittest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sampleTest {

		 static WebDriver driver;
		 public static void main(String[] args) throws InterruptedException, IOException {
				System.setProperty("webdriver.gecko.driver", "D:\\Automation\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
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
