package TastLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class TestClass extends BaseClass{
	
	private RegisterPage registerPage;
	
	@BeforeTest
	
	public void setUp()
	{
		BaseClass.intialization();
	}
	
	@Test
	
	public void validateRegisterUserFunctionality() {
		
		registerPage =new RegisterPage();
		registerPage.registerNewUser("snehal","chavan","9082320472","snehal@gmail.com",
		"palus","sangli","maharashtra","410310","AUSTRALIA","aboli","aboli123","aboli123");
	}

	@AfterTest
	public void tearDown() {
		
		//driver.quit();
	}
}
