package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment3_DuplicateLead {

	public static void main(String[] args) {
		//Open the Chrome Browser
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");	
		option.addArguments("--remote--allow-origin*");
		ChromeDriver  driver = new ChromeDriver(option);
		
		//1.Load the URl
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// to maximize the window
		driver.manage().window().maximize();
		//2. EnterUsername and Password using id locator
		WebElement username = driver.findElement(By.id("username"))	;
		username.sendKeys("Demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		//3.Click on Log in button using class locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//4. Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//5.Click on Leads button
		driver.findElement(By.linkText("Leads")).click();
		//6.Click on CreateLead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//7.Enter company name field using id locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		
		//8.Enter FirstName using id locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suguna");
		
		
		//9.Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vadivel");
		
		//10.Enter Firstname(Local) using id locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sugu");
		
		//11.Enter Department filed using any locator of your choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		
		//12.Enter Description field using any locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Leaftabs lead creation");
		
		//13.Enter your email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sugunavadivelrs@gmail.com");
		
		//14.Select state/province as newyork using visible text
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateDD);
		state.selectByVisibleText("New York");
		
		///15. Click on create button
		driver.findElement(By.className("smallSubmit")).click();
		
		//16. get current page title
		System.out.println(driver.getTitle());
		
		//17.Cick on Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		///18. Clear the company name in duplicate lead and enter new name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
				
		
		//19.Clear the first name in duplicate lead page
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kalai");
		
		//20.Click on create lead button
		driver.findElement(By.className("smallSubmit")).click();

		//21. get current page title
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
