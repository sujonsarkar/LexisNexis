package LexisNexis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        String url = "https://www.google.com";

        System.setProperty("webdriver.chrome.driver","/Users/sujonsarkar/IdeaProjects/LexisNexis/driver/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("LexisNexis");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[3]/div/div[2]/div/span")).click();
        System.out.println("Page title: " +driver.getTitle());

        Thread.sleep(5000);
        driver.quit();

    }
}
