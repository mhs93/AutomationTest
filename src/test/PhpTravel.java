package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\momin\\Downloads\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.findElement(By.id("tours-tab")).click();
		driver.findElement(By.id("tours_city")).sendKeys("Johor Bahru");
		driver.findElement(By.id("date")).sendKeys("26-11-2021");
		driver.findElement(By.id("tours_adults")).sendKeys("2");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.xpath("//*[@id=\"legoland malaysia day pass\"]/div/div[2]/div/div[2]/div/a")).click();
		
		driver.findElement(By.xpath("/html/body/section[2]/div[2]/div/div/div[2]/div/div/div/form/div[3]/button")).click();
		driver.findElement(By.name("firstname")).sendKeys("Mominul Hasan");
		driver.findElement(By.name("lastname")).sendKeys("Sohag");
		driver.findElement(By.name("email")).sendKeys("mominulhasan93@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("01671343973");
		driver.findElement(By.name("address")).sendKeys("collage gate tongi");
		
		webElement country=driver.findElement(By.name("country_code"));
		Select sel=new Select(country);
		sel.selectByVisibleText("Bangladesh");
		
		webElement country=driver.findElement(By.name("nationality"));
		Select sel=new Select(country);
		sel.selectByVisibleText("Bangladesh");
		
		driver.findElement(By.name("title_1")).sendKeys("Mr");
		driver.findElement(By.name("firstname_1")).sendKeys("Mominul Hasan");
		driver.findElement(By.name("lastname_1")).sendKeys("Sohag");
		
		driver.findElement(By.name("title_2")).sendKeys("Mr");
		driver.findElement(By.name("firstname_2")).sendKeys("Mr Hasan");
		driver.findElement(By.name("lastname_2")).sendKeys("Khan");
		
		driver.findElement(By.id("gateway_paypal")).click();
		
		driver.findElement(By.id("agreechb")).click();
		
		driver.findElement(By.id("booking")).click();
		
		
		if(driver.getCurrentUrl().contentEquals("https://www.phptravels.net/tours/book")){
			System.out.println("Boking Successfull");
		}else {
			System.out.println("Boking Failed");
		}
	}

}
