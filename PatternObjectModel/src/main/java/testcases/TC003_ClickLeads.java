package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC003_ClickLeads extends ProjectMethods {
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_Clickleads";
		testDescription = "MyHomePage click leads";
		category= "Smoke";
		authors	="Rajat";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void clickleadslnk(String uName,String pwd, String fname,String lname,String cname ){

		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.ClickCrtLead()
		.enterfirstName(fname)
		.enterlastName(lname)
		.entercompanyName(cname)
		.clicksource(9)
		.clickCreateLd()
		.verifycompname(cname);
		
	}
}
