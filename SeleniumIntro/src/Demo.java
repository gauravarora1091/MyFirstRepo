import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\Desktop\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		// System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456");
		driver.findElement(By.id("u_0_b")).click();

	}

}
