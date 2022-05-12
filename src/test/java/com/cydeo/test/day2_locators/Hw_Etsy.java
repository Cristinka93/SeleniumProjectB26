package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw_Etsy {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com ");
        Thread.sleep(3000);

        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("wooden spoon");

        Thread.sleep(3000);
        String actualTitle ="Wooden spoon | Etsy";
        String expectedTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title test verification passed!");
        }else{
            System.out.println("Title test verification failed");
        }
        driver.quit();
    }
}
