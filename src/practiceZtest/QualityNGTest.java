package practiceZtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class QualityNGTest {
  @Test
  public void fQ() 
  {	  //Set up properties for driver	
	  System.setProperty( "webdriver.chrome.driver", 
				"C:\\Users\\HECTOR\\Downloads\\chromedriver.exe");
	  //initialize Webdriver
	  WebDriver driver = new ChromeDriver();
	  //create timer (implicit wait)
  }
}
