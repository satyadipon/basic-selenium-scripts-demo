package setup;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestSetup
{
	protected WebDriver driver = null;


	@BeforeSuite(alwaysRun = true)
	public void setUp() {

	}

	@BeforeClass(alwaysRun = true)
	public synchronized void beforeClass() {

	}

	@BeforeMethod(alwaysRun = true)
	public synchronized void beforeMethod(Method method) {

		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}

	}

	@AfterMethod(alwaysRun = true)
	public synchronized void afterMethod(ITestResult result) {

		driver.quit();

	}
}
