package seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPage {

	WebDriver driver;
	
	By searchBar= By.id("twotabsearchtextbox");
	
	By selectMobile= By.xpath("//*[@id=\"anonCarousel1\"]//li[3]//div[2]/h2");
	
	By addToCart= By.id("add-to-cart-button");
	
	By proceedToCheckOut=By.id("hlb-ptc-btn-native");
	
	public AmazonPage(WebDriver driver) {
		this.driver=driver;
	}

	public void searchBar() {
		driver.findElement(searchBar).sendKeys("cellphones");
		driver.findElement(searchBar).submit();;
	}
	
	public void selectingMobile() {
		driver.findElement(selectMobile).click();
	}
	
	public void addingToCart() {
		driver.findElement(addToCart).click();
	}
	
	public void checkOut() {
		driver.findElement(proceedToCheckOut).click();
	}
}
