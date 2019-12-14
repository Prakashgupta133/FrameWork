package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//---Variable
	public WebDriver driver;
	public String url="http://localhost:8012/orangehrm/index.php";
	public String un="Admin";
	public String pw="admin";
	
	//---Objects
	public String txt_loginname="txtUserName";
			public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
}