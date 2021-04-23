import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\Desktop\\Chrome-Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		driver.findElement(By.xpath("//div[@id ='gb']/div/div/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Roger Federer");
		driver.findElement(By.xpath("//button[@class='Tg7LZd']")).click();
		

	}

}
