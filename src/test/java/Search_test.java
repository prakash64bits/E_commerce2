
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.base.TestBase;
import com.pom.LoginFunctionality;
import com.pom.Register_user_functionality;
import com.pom.SearchFunctionality;
import com.utils.Util_login;


public class Search_test extends TestBase {
	String Excelsheet_name = "product";
	SearchFunctionality search;
	LoginFunctionality login;

	public String[][] dataTest() throws Throwable {

		return Util_login.setdata(Excelsheet_name);// error diclaretion wised we change void to string
	}

	@BeforeMethod

	public void setup() {

		Initialization();
		search = new SearchFunctionality(driver);

	}

	@Test

	public void verify_SearchFunctionality(String sno, String pruduct) {
		search.SearchFunctionality(sno, pruduct);
	}

	@AfterMethod

	public void teardown() {
		 driver.close();

	}

}