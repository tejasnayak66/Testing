package Demo_MRS_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Package_Base.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath = "//div[@id='content']/div[2]/div/h4")
	WebElement label;

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public ManageAppointPage VerifyLabel() throws IOException {
		boolean l = label.isDisplayed();
		if(l==true)
			System.out.println(label.getText()+" - Label is Dispalyed in HomePage");
		return new ManageAppointPage();
	}
}
