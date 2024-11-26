package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Automation Task Running");

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("http://localhost:4200/");

        Thread.sleep(2000);





        WebElement p=driver.findElement(By.xpath("/html/body/app-root/app-login/button"));

        //p.sendKeys("Selenium Java");
        Thread.sleep(2000);


        p.click();

        Thread.sleep(2000);




    }
}