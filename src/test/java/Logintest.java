import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.LoginFunctionality;

public class Logintest extends TestBase {

	// this is for con_fig,test base,loginfunctionality,Login test.

	LoginFunctionality login;

	@BeforeMethod

	public void Setup() {
		Initialization();
		login = new LoginFunctionality(driver); // add public for driver in test base

	}

	@Test
	public void verifyLogin() {
		login.doLogin();
		String homepageurl=driver.getCurrentUrl();    //create first current then store in url
		Assert.assertEquals("https://e-quarz.com/", homepageurl);
		
			
		}
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}
	}

