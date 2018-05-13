package utility;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(dataProvider = "getData", dataProviderClass = DataProviderConverter.class)
	public void login(String testcaseName, String userName, String password,
			String url) {
		System.out.println(testcaseName + "  " + userName + "  " + password
				+ " " + url);

	}

}
