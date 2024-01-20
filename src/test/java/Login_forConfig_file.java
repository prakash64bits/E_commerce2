import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.Utils;



import com.base.TestBase;
import com.pom.Config_log_functionality;
import com.utils.Util_login;


public class Login_forConfig_file extends TestBase {

	String Excelsheet_name = "Login";
	Config_log_functionality login;

	@DataProvider
	
	public String[][] testdata() throws Throwable{
			
			return Util_login.setdata(Excelsheet_name) ;
		}

	@BeforeMethod

	public void setup() {
		Initialization();
		login = new Config_log_functionality(driver);

	}

	@Test // login verification

	public void loginverification() {
		login.doLogin();
		String homepageurl = driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/", homepageurl);
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
