package browseroperationsPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtility;

public class AssignmentPractise14 {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		driver.findElement(By.cssSelector(".homeSearch>*:nth-child(3)")).click();
		
		driver.findElement(By.id("dest")).sendKeys("Goa");
		WebElement dest=driver.findElement(By.cssSelector(".homeSearch>*:nth-child(4)"));
		
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.cssSelector(".next>button")).click();
		driver.findElement(By.cssSelector(".rb-monthTable>tbody>*:nth-child(5)>*:nth-child(1)")).click();
		
		driver.findElement(By.id("search_btn")).click();
		
		driver.findElement(By.cssSelector(".details>*:nth-child(3)>*:nth-child(4)>label")).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		
		driver.findElement(By.cssSelector(".details>*:nth-child(5)>*:nth-child(3)>label")).click();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.COMMAND,Keys.END));
		
		List<WebElement> busList=driver.findElements(By.cssSelector(".bus-item-details>div.row-one>div:nth-of-type(1)>*:first-child"));
		List<WebElement> busPrice=driver.findElements(By.cssSelector(".bus-item-details>div.row-one>div:nth-of-type(6)>div>div.fare>span"));
		//print bus name and price 
		
		System.out.println("The Total Count Of Buses is = "+busList.size());
		
		for(int i=0;i<busList.size();i++) {
			
			System.out.println(busList.get(i).getText()+ ":--->"+busPrice.get(i).getText());
//			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
//			busList=driver.findElements(By.cssSelector(".bus-item-details>div.row-one>div:nth-of-type(1)>*:first-child"));
		}
		
	}

}
