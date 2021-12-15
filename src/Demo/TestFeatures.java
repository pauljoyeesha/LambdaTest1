package Demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFeatures {

	public static List<String> tabs;
	
	  public RemoteWebDriver driver = null;
	  String username = "pauljoyeesha9";
	  String accessKey = "a4NF0JnHrYGrQJNNwJCZatlIGEZtdZ41k41BPyyurEjt6QKGN6";
		
  
		@BeforeTest
		public void setup() throws Exception {
		  DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("browserName", "Chrome");
	    capabilities.setCapability("version", "92.0");
	    capabilities.setCapability("platform", "Windows 10");
	    capabilities.setCapability("resolution","1024x768");
		  capabilities.setCapability("build", "MavenJava");
		  capabilities.setCapability("name", "DemoQA");
		  capabilities.setCapability("network", true); // To enable network logs
		  capabilities.setCapability("visual", true); // To enable step by step screenshot
		  capabilities.setCapability("video", true); // To enable video recording
		  capabilities.setCapability("console", true); // To capture console logs

		  try {
		    driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub"), capabilities);
		  } catch (MalformedURLException e) {
		    System.out.println("Invalid grid URL");
		  }
		}

		@Test(enabled = true)
		public void testScript() throws Exception {
			//setup();
		  try {
			  driver.get("https://www.lambdatest.com/automation-demos");
				//driver.wait();
					
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//*[@name='name']")).sendKeys("lambda");
					driver.findElement(By.xpath("//*[@name='password']")).sendKeys("lambda123");
					Thread.sleep(2000);
					
					
					Thread.sleep(2000);
					Robot b=new Robot();
					b.keyPress(KeyEvent.VK_TAB);
					Thread.sleep(2000);
					JavascriptExecutor j=(JavascriptExecutor)(driver);
					j.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[text()='Login' and @type='submit']")));
					Thread.sleep(2000);
					
				
					driver.switchTo().defaultContent();
					
					driver.findElement(By.xpath("//*[@name='email']")).sendKeys("pauljoyeesha9@gmail.com");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id='populate']")).click();
					Thread.sleep(2000);
					
					Alert a=driver.switchTo().alert();
					a.accept();
					Thread.sleep(2000);
					driver.switchTo().defaultContent();
					Thread.sleep(2000);
					
					
					
					
					JavascriptExecutor j11=(JavascriptExecutor)(driver);
					j11.executeScript("arguments[0].setAttribute('style', 'background:; border: 2px solid red;');",driver.findElement(By.xpath("//*[text()='How frequently do you make a purchase on an eCommerce website?']")));
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@type='radio' and @id='month']")).click();
					Thread.sleep(2000);
					j11.executeScript("arguments[0].setAttribute('style', 'background:; border: 2px solid red;');",driver.findElement(By.xpath("//*[text()='Which are the decisive factors before making an eCommerce purchase?']")));
					Thread.sleep(2000);
					List<WebElement> l=driver.findElements(By.xpath("//*[@class='checkbox pb-20']/p/label/input"));
					for(WebElement w:l)
					{
						w.click();
					}
					Thread.sleep(2000);
					j.executeScript("arguments[0].setAttribute('style', 'background:; border: 2px solid red;');",driver.findElement(By.xpath("//*[text()='What mode of payment do you prefer usually?']")));
					Thread.sleep(2000);
					Select s=new Select(driver.findElement(By.xpath("//*[@name='preferred-payment']")));
					s.selectByIndex(2);
					Thread.sleep(2000);
					if(!(driver.findElement(By.xpath("//*[@name='tried-ecom']"))).isSelected())
					{
						driver.findElement(By.xpath("//*[@name='tried-ecom']")).click();
						Thread.sleep(2000);
						
						if((driver.findElement(By.xpath("//div[@class='disablebar']"))).isEnabled())
						{
							Actions s1=new Actions(driver);
							WebElement f=driver.findElement(By.xpath("//*[@class='disablebar']/div/div/div/div[@role='slider']"));
							
							s1.dragAndDropBy(f,235,0).build().perform();
						}
						
					}
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id='comments']")).sendKeys("This is feedback !!!!! by user ");
					Thread.sleep(2000);
					//driver.findElement(By.xpath("//*[@name='file' and @type='file']")).sendKeys("C:\\selectorHUB");
					
					
		  
					
				
					JavascriptExecutor j5=(JavascriptExecutor)(driver);
					j5.executeScript("window.open()");
					tabs=new ArrayList<String>();
					Thread.sleep(3000);
					//driver.switchTo().window(tabs.get(1));
					driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
					  tabs = new ArrayList<String> (driver.getWindowHandles());
					    driver.switchTo().window(tabs.get(1)); 
					driver.get("https://www.lambdatest.com/selenium-automation");
					Thread.sleep(3000);
					Actions s1=new Actions(driver);
					s1.moveToElement(driver.findElement(By.xpath("//h2[text()='Integrations With CI/CD Tools']"))).build().perform();
					
					
					
					
					Thread.sleep(3000);
					
				    
					Actions s11=new Actions(driver);
					//s1.moveToElement(homepageobj.jenkinsImg).build().perform();
					Thread.sleep(3000);
					
						Thread.sleep(3000);
					s11.contextClick(driver.findElement(By.xpath("//img[@title='Jenkins']"))).build().perform();
					Thread.sleep(3000);
					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					//s1.sendKeys(Keys.SHIFT,"v").build().perform();
					Thread.sleep(3000);
				
					// To press C key.
					
					// To press "test" key one by one.
					robot.keyPress(KeyEvent.VK_J);
					robot.keyPress(KeyEvent.VK_E);
					robot.keyPress(KeyEvent.VK_N);
					robot.keyPress(KeyEvent.VK_K);
					robot.keyPress(KeyEvent.VK_I);
				robot.keyPress(KeyEvent.VK_N);
				robot.keyPress(KeyEvent.VK_S);
				
				
				     Thread.sleep(2000);
				     robot.keyPress(KeyEvent.VK_ENTER); 
				     
				     robot.keyRelease(KeyEvent.VK_ENTER); 
				     Thread.sleep(2000);
				     
				     
				     
				     
				     
				     
				     
				     Thread.sleep(2000);
						System.out.print("Hi image to upload");
						  Thread.sleep(2000);
				        driver.switchTo().window(tabs.get(0));
				        Thread.sleep(2000);
				        WebElement addFile = driver.findElement(By.xpath("//input[@type='file']"));
				        addFile.sendKeys("\\Downloads\\jenkins.svg");
				        Thread.sleep(2000);
				        Alert e=driver.switchTo().alert();
				        String alertText=e.getText();
				        Thread.sleep(2000);
				        System.out.print(alertText);
				   
				        e.accept();
				        Thread.sleep(2000);
				        driver.switchTo().defaultContent();
				        Thread.sleep(2000);
				        Actions s1u=new Actions(driver);
				        Thread.sleep(2000);
				        s1u.moveToElement(driver.findElement(By.xpath("//*[@id='submit-button']"))).build().perform();			
				        driver.findElement(By.xpath("//*[@id='submit-button']")).click();
						Thread.sleep(2000);
						s1u.moveToElement(driver.findElement(By.xpath("//*[text()='Thank you!']"))).build().perform();	
						JavascriptExecutor je=(JavascriptExecutor)(driver);
						je.executeScript("arguments[0].setAttribute('style', 'background:; border: 2px solid red;');",driver.findElement(By.xpath("//*[text()='Thank you!']")));
						Thread.sleep(2000);
						
						s1u.moveToElement(driver.findElement(RepositoryObject.formSubmitted)).build().perform();	
					 je=(JavascriptExecutor)(driver);
						j.executeScript("arguments[0].setAttribute('style', 'background:; border: 2px solid red;');",driver.findElement(By.xpath("//*[text()='Thank you!']/../p")));
						Thread.sleep(2000);
						if((driver.findElement(By.xpath("//*[text()='Thank you!']/../p"))).getText().contains("You have successfully submitted the form."))
							
						Thread.sleep(2000);
						
					
				
		  
		  } catch (Exception e) {
		    System.out.println(e.getMessage());
		  }
		}
		
		
		@AfterTest
		public void tearDown()
		{  
			driver.quit();
		}
			
		}
	



