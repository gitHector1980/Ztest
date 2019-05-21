package practiceZtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mytest 
{	//declarar WebDriver
	WebDriver driver;
	// this class will store all the locators & methods
	By username = By.name("firstname");
	By lastname = By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input");
	By sextype = By.name("sex");
	By yearsofexperience = By.id("exp-3");
	By date = By.id("datepicker");
	By profession = By.xpath("//*[@id='profession-1']");
	By automationtool = By.id("tool-2");
	By continent = By.id("continents");
	By continentselect = By.xpath("//*[@id='continents']/option[7]"); // click
	By comands = By.xpath("//*[@id='selenium_commands']/option[5]");
	By comandsselect = By.xpath("//*[@id='selenium_commands']/option[5]"); //click
	By selectbutton = By.id("submit");
	//constrctor para inizializar Web driver
	public Mytest(WebDriver driver)
	{
		this.driver = driver;
	}
	public void typeusername()
	{
		driver.findElement(username).sendKeys("Hector");
	}
	public void typelastname()
	{
		driver.findElement(lastname).sendKeys("Ochoa");
	}
	public void typesextype()
	{
		driver.findElement(sextype).click();
	}
	public void typeyearsofexperience()
	{
		driver.findElement(yearsofexperience).click();
	}
	public void typedate()
	{
		driver.findElement(date).sendKeys("01-08-1980");
	}
	public void typeprofession()
	{
		driver.findElement(profession).click();
	}
	public void typeautomationtool()
	{
		driver.findElement(automationtool).click();
	}
	public void typecontinent()
	{
		driver.findElement(continent).click();
	}
	public void typecontinentselect()
	{
		driver.findElement(continentselect).click();
	}
	public void typecomands()
	{
		driver.findElement(comands).click();
	}
	public void typecomandsselect()
	{
		driver.findElement(comandsselect).click();
	}
	public void typeselectbutton()
	{
		driver.findElement(selectbutton).submit();
	}

}
