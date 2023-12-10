package com.ensa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// 10 : 
// ce code permet au représenant d'ajouter une autre décision concernant le dossier de recolement

public class Main {

	public static void main(String[] args) throws InterruptedException{
	     System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://127.0.0.1:5173/login");
	        driver.manage().window().maximize();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        Thread.sleep(2000);
	        WebElement inputEmail = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
	        inputEmail.sendKeys("orange@gmail.com");
	        Thread.sleep(500);
	        
	        WebElement inputPasswd = driver.findElement(By.xpath("//input[@id='passwdInput']"));
	        inputPasswd.sendKeys("123456789");
	        Thread.sleep(1000);
	        
	        WebElement ButtonLogin = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]"));
	        ButtonLogin.click();
	        Thread.sleep(4000);
	        
	        driver.findElement(By.cssSelector(".w-20")).click();
	        Thread.sleep(1500);
	        
	        String targetElement = "27S11T";
	        
	        driver.findElement(By.xpath("//button[@id='"+targetElement+"']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector(".gap-5")).click();
	        driver.findElement(By.cssSelector(".border-2:nth-child(2)")).click();
	        Thread.sleep(500);
	        driver.findElement(By.cssSelector(".border-2:nth-child(2)")).sendKeys("favorable");
	        driver.findElement(By.cssSelector(".h-20")).click();
	        Thread.sleep(500);
	        driver.findElement(By.cssSelector(".h-20")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/form[1]/button[1]")).click();
	        Thread.sleep(4000);	
	        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")).click();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/p[1]")).click();
	        Thread.sleep(3000);
	        driver.close();
	        

	}

}
