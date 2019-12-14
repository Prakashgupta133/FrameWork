package com.hrms.TestScripts;


import com.hrms.lib.General;

public class TC_101 {

	public static void main(String[] args) throws InterruptedException {
		
		General g=new General();
		g.openApplication();
		g.login();
		g.addEmp();
		g.delEmp();
		g.logout();
		g.closeBrowser();

	}

}
