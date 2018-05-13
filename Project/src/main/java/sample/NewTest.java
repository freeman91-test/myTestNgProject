package sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(priority=0)
  @Parameters({"username","password"})
  public void f(String username,String password) {
	  System.out.println("This is for----- TEST- f");
	  System.out.println(username+"    " +password);
  }
  @Test(priority=5)
  public void a() {
	  System.out.println("This is for----- TEST - a");
  }
  @Test(priority=2)
  public void k() {
	  System.out.println("This is for----- TEST - k");
  }
  @Test(priority=1)
  public void m() {
	  System.out.println("This is for----- TEST - m");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is for----- BEFORE METHOD");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is for----- AFTER METHOD");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is for----- BEFORE CLASS");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is for----- AFTER CLASS");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is for----- BEFORE TEST");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is for----- AFTER TEST");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is for----- BEFORE SUITE");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is for----- AFTER SUITE");

  }

}
