package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.UtilsClass;

public class RegisterPage extends BaseClass {
	
	@FindBy(name="firstName")
   private WebElement uname;
	
	@FindBy(name="lastName")
	   private WebElement lname;
	
	@FindBy(name="phone")
	   private WebElement phone;
	
	@FindBy(name="userName")
	   private WebElement email1s;
	
	@FindBy(name="addr")
	   private WebElement add;
	
	@FindBy(name="city")
	   private WebElement citys;
	
	@FindBy(name="state")
	   private WebElement states;
	
	@FindBy(name="postalCode")
	   private WebElement postalcode;
	
	@FindBy(name="country")
	   private WebElement Country;
	
	@FindBy(name="email")
	   private WebElement emails;
	
	@FindBy(name="password")
	   private WebElement passw;
	
	@FindBy(name="confirmPassword")
	   private WebElement Cpassword;
	
	@FindBy(name="submit")
	   private WebElement Click;
	
	public RegisterPage() {
		
		 PageFactory.initElements(driver,this);
	}

	public void registerNewUser(String firstName,String lastName,String Phone,String userName,String addr , 
			String city,String state,String postalCode,String country,String email,String password,String confirmPassword) {
		
		UtilsClass.sendKeys(uname, firstName);
		
		UtilsClass.sendKeys(lname, lastName);
		
		UtilsClass.sendKeys(phone, Phone);
		
		UtilsClass.sendKeys(email1s, userName);
		
		UtilsClass.sendKeys(add, addr);
		
		UtilsClass.sendKeys(citys, city);
		
		UtilsClass.sendKeys(states, state);
		
		UtilsClass.sendKeys(postalcode, postalCode);
		
		HandleDropDown.selectByVisibleText(Country, country);
		
		UtilsClass.sendKeys(emails, email);
		
		UtilsClass.sendKeys(passw, password);
		UtilsClass.sendKeys(Cpassword, confirmPassword);
		
		
		
	}
	
	

	
	
}
