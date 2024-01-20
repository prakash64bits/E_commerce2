 
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.base.TestBase;
import com.pom.LoginFunctionality;
import com.pom.Register_user_functionality;
import com.utils.Util_login;


public class Reg_test extends TestBase {

	String Excelsheet_name = "Registration";
	Register_user_functionality register;
	LoginFunctionality login;

	@DataProvider

	public String[][] dataTest() throws Throwable {

		return Util_login.setdata(Excelsheet_name);// error diclaretion wised we change void to string

	}

	@BeforeMethod

	public void setup() {

		Initialization();
		register = new Register_user_functionality(driver);

	}

	@Test     
	
	//(priority = 1,dataProvider =   "dataTest",dataProviderClass = "Utils_reg")
	
	public void Verify_Registrationfunctionality(String fname,String lname,String mail,String ph_ph,String pass_ward,String con_passward, String Checkbox, String signupbutton ) {
		 {
		register.Register_user_functionality(fname, lname, mail, ph_ph, pass_ward, con_passward, Checkbox, signupbutton);

	}
	
		// @Test   (priority = 2,description = "Login  with newly created user")         //con_fig wise and file wise we added login functionality
		 
		//public void Verify_Login() {
		//	login.doLogin();
		 
//}
		 
		 
			 String homepageurl=driver.getCurrentUrl();
			 Assert.assertEquals("https://e-quarz.com/", homepageurl);//test case pass
			 
			 
			 
		 }
	@AfterMethod
	
	public void teardown() {
		driver.close();
	}
	}


