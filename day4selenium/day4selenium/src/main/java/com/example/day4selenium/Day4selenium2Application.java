package com.example.day4selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day4selenium2Application {

	

	public static void main(String[] args) {
		WebDriver driverChrome=new ChromeDriver();
		 WebDriver driveredge=new EdgeDriver();
		 WebDriver driverfirefox=new FirefoxDriver();
		 driveredge.get("https://www.google.com");
		 driveredge.close();
		 driverfirefox.get("https://www.google.com");
		 driverfirefox.close();

        driverChrome.get("https://www.google.com");
		
		 driverChrome.manage().window().fullscreen();
		 driverChrome.close();
		SpringApplication.run(Day4selenium2Application.class, args);
	}

}
		