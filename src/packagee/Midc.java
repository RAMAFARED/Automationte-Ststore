package packagee;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Midc {
	
	WebDriver driver = new ChromeDriver();
	String URL = "https://www.automationteststore.com/";
	
	
	String[] firstname = {"Rama", "Lina", "Sara", "Omar", "Zaid"};
    String[] lastname = {"Fared", "Ahmad", "Khalid", "Hassan", "Saleh"};
    
    Random rand = new Random();
    String username = " " ;
	
	
	@BeforeTest
	public void mySetup() {
		
		driver.get(URL);

		driver.manage().window().maximize();
		
		}
	
	
	@Test(priority = 1 ,enabled = true )
	public void SinUp() throws InterruptedException {
		driver.findElement(By.linkText("Login or register")).click();
		driver.findElement(By.xpath("//button[@title='Continue']")).click();
		int randomIndex = rand.nextInt(5);
		
	WebElement FirstName = driver.findElement(By.id("AccountFrm_firstname"));
	    String RandomFirstName =firstname[randomIndex];
	FirstName.sendKeys(RandomFirstName);
	 
	int randomIndex2 = rand.nextInt(5);
	
	WebElement LastName = driver.findElement(By.id("AccountFrm_lastname"));
		String randomLastName = lastname[randomIndex2];
	LastName.sendKeys(randomLastName);
	
	username = RandomFirstName + randomLastName ;
	
	int randomnumber =rand.nextInt(2345);
	
	WebElement Email = driver.findElement(By.id("AccountFrm_email"));
	
	String randomemail = RandomFirstName + randomLastName  + randomnumber + "@gmail.com";
	Email.sendKeys(randomemail);
	
	driver.findElement(By.id("AccountFrm_telephone")).sendKeys("0777212342");
	
	driver.findElement(By.id("AccountFrm_postcode")).sendKeys("077721");
	driver.findElement(By.id("AccountFrm_address_1")).sendKeys("Amman");
	driver.findElement(By.id("AccountFrm_city")).sendKeys("Jordan");
	
	Thread.sleep(1000);
	
	 WebElement Country = driver.findElement(By.id("AccountFrm_country_id"));
		
		Select Countryy = new Select(Country);
		Countryy.selectByValue("108");
	

	Thread.sleep(2000);
	WebElement Region = driver.findElement(By.id("AccountFrm_zone_id"));
	
	Select Regionn = new Select(Region);
	Regionn.selectByValue("1704");

	Thread.sleep(1000);

	
	
	//String username = RandomFirstName + randomLastName + randomnumber ;
	driver.findElement(By.id("AccountFrm_loginname")).sendKeys(username);
	driver.findElement(By.id("AccountFrm_password")).sendKeys("P@ssw0rd");
	driver.findElement(By.id("AccountFrm_confirm")).sendKeys("P@ssw0rd");
	
	
	driver.findElement(By.id("AccountFrm_newsletter1")).click();
	driver.findElement(By.id("AccountFrm_agree")).click();
	
	driver.findElement(By.xpath("//button[@title='Continue']")).click();
    

	driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[10]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div/section/a")).click();


		
		
	}
	
	
	@Test(priority = 2 , enabled = true )
	public void LoginTest() {
		driver.findElement(By.linkText("Login or register")).click();
		driver.findElement(By.id("loginFrm_loginname")).sendKeys(username);
		driver.findElement(By.id("loginFrm_password")).sendKeys("P@ssw0rd");
		
		driver.findElement(By.xpath("//button[@title='Login']")).click();
			
		
		
		
	}
	
	
	@Test(priority = 3  , enabled = true )
	public void RandomItems () throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"categorymenu\"]/nav/ul/li[4]/a")).click();
		Thread.sleep(3000);
		 List<WebElement> items = driver.findElements(By.cssSelector(".col-md-2.col-sm-2.col-xs-6.align_center"));
		 int randomitems = rand.nextInt(items.size());
		 items.get(randomitems).click();
		  Thread.sleep(3000);
		  
		  List<WebElement> items1 = driver.findElements(By.cssSelector(".col-md-3.col-sm-6.col-xs-12"));
			 int randomitems1 = rand.nextInt(items1.size());
			 items1.get(randomitems1).click();
		  
		WebElement quantity = driver.findElement(By.id("product_quantity"));
		quantity.clear();
		int randomquantity = rand.nextInt(5)+ 9;
		quantity.sendKeys((randomquantity)+ " ");
		
		driver.findElement(By.className("cart")).click();
		driver.findElement(By.id("cart_checkout1")).click();		 
		 
		}
	
	@Test (priority = 4, enabled = true)
	public void randomitemsandoutofstok () throws InterruptedException {
		Thread.sleep(1000);
		driver.get("https://automationteststore.com/index.php?rt=product/category&path=58");
		List<WebElement> Men = driver.findElements(By.cssSelector(".col-md-2.col-sm-2.col-xs-6.align_center"));
		int randomitemsmen = rand.nextInt(Men.size());
		Men.get(randomitemsmen).click();
		
		Thread.sleep(2000);
		if(!driver.findElements(By.className("nostock")).isEmpty() ) {
			Thread.sleep(2000);
			 System.out.println("No Stock"); 

			driver.get("https://automationteststore.com/index.php?rt=product/category&path=58");
		}
				
		else {
			  List<WebElement> items1 = driver.findElements(By.cssSelector(".col-md-3.col-sm-6.col-xs-12"));
				 int randomitems1 = rand.nextInt(items1.size());
				 items1.get(randomitems1).click();
			  
			WebElement quantity = driver.findElement(By.id("product_quantity"));
			quantity.clear();
			int randomquantity = rand.nextInt(5)+ 9;
			 System.out.println(randomquantity);
			quantity.sendKeys((randomquantity)+ " ");
			
			driver.findElement(By.className("cart")).click();
			Thread.sleep(1000);

			driver.findElement(By.id("cart_checkout1")).click();
			driver.findElement(By.id("checkout_btn")).click();
			
			
			
			 System.out.println("Your Order Has Been Processed!"); 

			
			
			
			
			
		}
		
		
		
	}
	
	

}
