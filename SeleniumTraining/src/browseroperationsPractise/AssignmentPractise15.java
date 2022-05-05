package browseroperationsPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.SeleniumUtility;

public class AssignmentPractise15 {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.cssSelector(".item.createNewTasks")).click();
		
		driver.findElement(By.cssSelector(".selectCustomerAndProject>table>tbody>tr>td>div>div>div>div>div")).click();
		WebElement Option=driver.findElement(By.cssSelector(".selectCustomerAndProject.newCustomer.newProject>table>tbody>tr>td>div>div>*:nth-child(2)>div>div>div>div"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(Option));
		Option.click();
		
	}

}
