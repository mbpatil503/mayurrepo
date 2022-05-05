package browseroperationsPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentParctise13 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		String ActualHomePageTitle=driver.getTitle();
		System.out.println("ActualHomePageTitle is = "+ActualHomePageTitle);
		String ExpectedHomePageTitle="Facebook – log in or sign up";
		if(ExpectedHomePageTitle.equals(ActualHomePageTitle)) {
			System.out.println("The Page Is Verified");
		}else {
			System.out.println("The page is wrong");
		}
		
		WebElement CreatAcctbtn=driver.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(CreatAcctbtn));
		CreatAcctbtn.click();
		
		WebElement Day=driver.findElement(By.id("day"));
		Select DayOption=new Select(Day);
		
		WebElement Month=driver.findElement(By.id("month"));
		Select MonthOption=new Select(Month);
		
		WebElement Year=driver.findElement(By.id("year"));
		Select YearOption=new Select(Year);
		
//operations for Day dropdown
		
		System.out.println("Is displayed..= "+Day.isDisplayed());
		System.out.println("Is enabled..= "+Day.isEnabled());
		System.out.println("Is MultiSelect dropDown..= "+DayOption.isMultiple());
		System.out.println("Total No. options = "+DayOption.getOptions().size());
		System.out.println("Is displayed..= "+DayOption.getFirstSelectedOption().getText());
		
		List<WebElement> DayOptions=DayOption.getOptions();
		for(int i=0;i<=DayOptions.size();i++) {
			System.out.println("All Options Are = "+DayOptions.get(i).getText());
		}
		

//operations for Month dropdown
				
				System.out.println("Is displayed..= "+Month.isDisplayed());
				System.out.println("Is enabled..= "+Month.isEnabled());
				System.out.println("Is MultiSelect dropDown..= "+MonthOption.isMultiple());
				System.out.println("Total No. options = "+MonthOption.getOptions().size());
				
				List<WebElement> MonthOptions=MonthOption.getOptions();
				for(int i=0;i<=MonthOptions.size();i++) {
					System.out.println("All Options Are = "+MonthOptions.get(i).getText());
				}
				
				
//operations for Year dropdown
				
				System.out.println("Is displayed..= "+Year.isDisplayed());
				System.out.println("Is enabled..= "+Year.isEnabled());
				System.out.println("Is MultiSelect dropDown..= "+YearOption.isMultiple());
				System.out.println("Total No. options = "+YearOption.getOptions().size());
				
				List<WebElement> YearOptions=YearOption.getOptions();
				for(int i=0;i<=YearOptions.size();i++) {
					System.out.println("All Options Are = "+YearOptions.get(i).getText());
				}
	}

}
