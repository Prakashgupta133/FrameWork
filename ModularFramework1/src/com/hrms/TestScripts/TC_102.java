package com.hrms.TestScripts;

import org.junit.AfterClass;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_102 {
	General g1;

	@BeforeTest
	public void object() throws InterruptedException {

		g1 = new General();
		g1.openApplication();
		g1.login();
	}

	/*
	 * @Test(priority = 1) public void OpenApp() throws InterruptedException {
	 * General g1=new General(); g1.openapplication(); }
	 * 
	 * @Test(priority = 2) public void Login() throws InterruptedException { General
	 * g1=new General(); g1.login(); }
	 */
	@Test(priority = 3)
	public void AddEmp() throws InterruptedException {
		g1.addEmp();
	}

	@Test(priority = 4)
	public void DelEmp() throws InterruptedException {
//General g1=new General();
		g1.delEmp();
	}

	@AfterTest
	public void Logout() throws InterruptedException {
//General g1=new General();
		g1.logout();
		g1.closeBrowser();
	}

	/*
	 * @AfterClass public void close() throws InterruptedException { //General
	 * g1=new General(); g1.closeBrowser(); }
	 */
}
