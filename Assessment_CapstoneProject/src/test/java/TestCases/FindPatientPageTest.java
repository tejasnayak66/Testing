package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Demo_MRS_Pages.FindPatientPage;
import Demo_MRS_Pages.HomePage;
import Demo_MRS_Pages.LoginPage;
import Package_Base.BaseClass;

public class FindPatientPageTest extends BaseClass {
	
	public LoginPage lp;
	public HomePage homePage;
	public FindPatientPage fap;
	
	public FindPatientPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws IOException {
		setup();
		lp = new LoginPage();
	}
	
	@Test
	public void verifyingID() throws InterruptedException, IOException {
		homePage = lp.login(prop.getProperty("username"),prop.getProperty("password"));
		fap=new FindPatientPage();
		fap.VerifyID();
	}
	
	@AfterTest
	public void TearDown() throws IOException {
		fap.teardown();
	}

}
