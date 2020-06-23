package cool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CopyfromGIT {

	@Test
	public void signupFacebook() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mahfuj Tuhin\\eclipse-workspace\\NAN2020\\drivers\\geckodriver.exe");
		
		 WebDriver driver=new FirefoxDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Mahfuj");//input first name
			driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("Tuhin");//input last name
			driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("mahfujbp@gmail.com");//input email address
			driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).sendKeys("mahfujbp@gmail.com");//re-enter email address
			driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).sendKeys("Mypasswordis917");//input password
			
			//select date of birth
			
			WebElement web=driver.findElement(By.xpath("//*[@id=\"month\"]"));
			WebElement webd=driver.findElement(By.xpath("//*[@id=\"day\"]"));
			WebElement weby=driver.findElement(By.xpath("//*[@id=\"year\"]"));
			
			Select sel=new Select(web);
			Select seld=new Select(webd);
		    Select sely=new Select(weby);

			sel.selectByVisibleText("Dec");
			seld.selectByIndex(16);
			sely.selectByValue("1971");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();//click male button
			driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();//click SIGNUP button

	}

}
