package com.example.day4selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day4selenium3Application {

	public static void main(String[] args) {

		
		WebDriver driverChrome=new ChromeDriver();
		
		driverChrome.get("https://www.shoppersstop.com");
		driverChrome.findElement(By.className("user-icon")).click();
		driverChrome.close();
		SpringApplication.run(Day4selenium3Application.class, args);
	}

}
		