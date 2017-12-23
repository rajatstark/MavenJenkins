package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {



	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test) {

		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefirstname;

	public CreateLeadPage enterfirstName(String fName) {
		type(elefirstname, fName);
		return this;

	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelastname;

	public CreateLeadPage enterlastName(String lName) {
		type(elelastname, lName);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecompname;

	public CreateLeadPage entercompanyName(String cName) {
		type(elecompname, cName);
		return this;

	}
	
	@FindBy(how=How.ID, using="createLeadForm_dataSourceId")
	private WebElement eleclksrc;
	public CreateLeadPage clicksource(int num){
		Select s1 = new Select(eleclksrc);
		s1.selectByIndex(num);
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCldbtn;
	public ViewLeadPage clickCreateLd() {
		click(eleCldbtn);
		return new ViewLeadPage(driver, test);
	}

}
