package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Demo_MRS_Pages.HomePage;
import Demo_MRS_Pages.LoginPage;
import Demo_MRS_Pages.ManageAppointPage;
import Package_Base.BaseClass;

public class ManageApointPageTest extends BaseClass {
	public LoginPage lp;
	public HomePage homePage;
	public ManageAppointPage ma;
	
	public ManageApointPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws IOException {
		setup();
		lp = new LoginPage();
	}
	
	@Test
	public void verify() throws InterruptedException, IOException {
		homePage = lp.login(prop.getProperty("username"),prop.getProperty("password"));
		ma=new ManageAppointPage();
		ma.clickOnNo();
		System.out.println("Successfully clicked on x Button on Dermatology");
	}
	
	@AfterTest
	public void TearDown() throws IOException {
		ma.teardown();
	}
}

