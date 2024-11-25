package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.out.print("Automation Task Running");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\SeleniumAutomation\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("http://localhost:4200/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        WebElement p=driver.findElement(By.xpath("/html/body/app-root/app-login/button"));

        //p.sendKeys("Selenium Java");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        p.click();



    }
}