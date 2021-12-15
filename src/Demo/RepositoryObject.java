package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RepositoryObject {

	
		public static By userName=By.xpath("//*[@name='name']");
	
		public static By userPwd=By.xpath("//*[@name='password']");
		
		public static By loginBtn=By.xpath("//button[text()='Login' and @type='submit']");
		
		public static By emailInput=By.xpath("//*[@name='email'");
		
		public static By populateBtn=By.xpath("//*[@id='populate'");
		
		public static By firsRadio1Question =By.xpath("//*[text()='How frequently do you make a purchase on an eCommerce website?']");
		
		public static By firstAnswer=By.xpath("//input[@type='radio' and @id='month']");
		
		public static By dropdwnQuestion=By.xpath("//*[text()='What mode of payment do you prefer usually?']");
	
		public static By thirdAnswer=By.xpath("//*[@name='preferred-payment'");
	
		public static By checkedAnswer=By.xpath("//*[@name='tried-ecom'");
	
		public static By disabledScroll=By.xpath("//div[@class='disablebar']");
		
		public static By checkboxQuestion=By.xpath("//*[text()='Which are the decisive factors before making an eCommerce purchase?']");
		
		public static By checkedCheckbox=By.xpath("//*[@name='tried-ecom']");
	
		public static By slideBardiv=By.xpath("//*[@class='disablebar']/div/div/div/div[@role='slider']");
		
		public static By commentBox=By.xpath("//*[@id='comments']");
	
		public static By submitBtn=By.xpath("//*[@id='submit-button']");
		
		public static By cicdHeading=By.xpath("//h2[text()='Integrations With CI/CD Tools']");
		
		
		public static By jenkinsImg=By.xpath("//img[@title='Jenkins']");
		
		
		public static By thankYouText=By.xpath("//*[text()='Thank you!']");
		
		
		public static By formSubmitted=By.xpath("//*[text()='Thank you!']/../p");
		
		
		
		
		
	}


