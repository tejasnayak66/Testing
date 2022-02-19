package Demo_MRS_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Package_Base.BaseClass;

public class ManageAppointPage extends BaseClass {


	@FindBy(xpath = "//a[contains(@id,'appointmentschedulingui')]")
	WebElement AS_btn;

	@FindBy(xpath = "//a[@id='appointmentschedulingui-manageAppointmentTypes-app']//i")
	WebElement MST_btn;

	@FindBy(xpath = "//i[@id='appointmentschedulingui-delete-Dermatology']")
	WebElement DA_btn;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/button[2]")
	WebElement NO_btn;

	public ManageAppointPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public FindPatientPage clickOnNo() throws IOException, InterruptedException {
		AS_btn.click();
		MST_btn.click();
		DA_btn.click();
		Thread.sleep(2000); 
		NO_btn.click();
		Thread.sleep(2000);
		return new FindPatientPage();
	}
}
