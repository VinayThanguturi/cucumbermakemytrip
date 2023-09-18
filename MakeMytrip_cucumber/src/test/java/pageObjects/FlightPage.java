package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.BrowserDriver;

public class FlightPage extends BrowserDriver {
	
	static WebDriver driver;
	
	

    public static String flights_module_xpath = "//span[@class='chNavIcon appendBottom2 chSprite chFlights active']";
    public static String round_trip_xpath = "//li[@data-cy='roundTrip']//span[@class='tabsCircle appendRight5']";

    public static String click_from_location_xpath = "//span[normalize-space()='From']";

    public static String from_location_text_xpath = "//input[@placeholder='From']";

    public static String select_typed_form_text_xpath = "//li[@id='react-autowhatever-1-section-0-item-0']//p[@class='font14 appendBottom5 blackText'][normalize-space()='Hyderabad, India']";

    public static String click_to_location_xpath ="//span[normalize-space()='To']";

    public static String to_location_text_xpath= "//input[@placeholder='To']";

    public static String select_typed_to_text_xpath = "//p[normalize-space()='Chennai, India']";

    public static String click_search_btn = "//a[contains(@class,'primaryBtn font24 latoBold widgetSearchBtn')]";




    public static void click_flight_module() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(flights_module_xpath)).click();
    }
    public static void click_round_trip() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(round_trip_xpath)).click();
    }

    public static void click_on_from() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(click_from_location_xpath)).click();
    }

    public static void click_on_from_text() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(from_location_text_xpath)).sendKeys("HYD");
    }

    public static void click_on_from_typed_text() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(select_typed_form_text_xpath)).click();
    }
    public static void click_on_to() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(click_to_location_xpath)).click();
    }
    public static void click_on_to_text() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(to_location_text_xpath)).sendKeys("MAA");
    }

    public static void click_on_to_typed_text() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(select_typed_to_text_xpath)).click();
    }

    public static void click_on_search() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(click_search_btn)).click();
        Thread.sleep(20000);
    }

    public FlightPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver,this);
	}



}
