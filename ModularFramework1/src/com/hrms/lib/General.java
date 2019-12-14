package com.hrms.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global {
	
	public void openApplication() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to(url);
		Thread.sleep(3000);
	}
	public void closeBrowser() {
		driver.quit();
	}

	public void login() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
	}
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Logout")).click();
	}
	public void addEmp() throws InterruptedException {
		System.out.println("Adding new employee");
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//div[@class='actionbuttons']/input[@value='Add']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='txtEmployeeId']")).sendKeys("006");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='txtEmpLastName']")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("XYZ");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("backbutton")).click();
		Thread.sleep(3000);
	}
	public void delEmp() throws InterruptedException {
		System.out.println("Delete Employee");
		//driver.switchTo().frame("rightMenu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/input")).click();
		driver.findElement(By.xpath("//div[@class='actionbuttons']/input[@value='Delete']")).click();
		Thread.sleep(3000);
		}
	

}
