package EMSTestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import Master.*;
import PageFactoryandTestData.EMS_TestData;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserInitiation extends EMS_Execution {
	@Parameters("browser")
	public static void StartBrowser(String browser){
		
if(browser.equalsIgnoreCase("firefox")) {
	        WebDriverManager.firefoxdriver().setup();
			FirefoxProfile customProfile = new FirefoxProfile();
			customProfile.setPreference("dom.disable_beforeunload", true);
			setDriver(new FirefoxDriver());
		    setHtmlReporter(new ExtentHtmlReporter(System.getProperty("user.dir")+"/FireFoxReports/EmailMarketing_Report"+".html"));
			setExtent(new ExtentReports());
			getExtent().attachReporter(getHtmlReporter());
			getExtent().setSystemInfo("HostName", "Bilal Mubarik");
			getExtent().setSystemInfo("Environment", EMS_TestData.CRMandOrders_URL);
			getHtmlReporter().config().setDocumentTitle("Automation Testing Report");
			getHtmlReporter().config().setReportName("Email Marketing");
			getHtmlReporter().config().setTestViewChartLocation(ChartLocation.TOP);
			getHtmlReporter().config().setTheme(Theme.DARK);
			getHtmlReporter().getStartTime();
			getHtmlReporter().getEndTime();
		   
			
	  }
		 else if(browser.equalsIgnoreCase("chrome")) {
			    WebDriverManager.chromedriver().setup();
				setDriver(new ChromeDriver());
				setHtmlReporter(new ExtentHtmlReporter(System.getProperty("user.dir")+"/ChromeReports/EmailMarketing_Report"+".html"));
				setExtent(new ExtentReports());
				getExtent().attachReporter(getHtmlReporter());
				getExtent().setSystemInfo("HostName", "Bilal Mubarik");
				getExtent().setSystemInfo("Environment", EMS_TestData.CRMandOrders_URL);
				getHtmlReporter().config().setDocumentTitle("Automation Testing Report");
				getHtmlReporter().config().setReportName("Email Marketing");
				getHtmlReporter().config().setTestViewChartLocation(ChartLocation.TOP);
				getHtmlReporter().config().setTheme(Theme.DARK);
				getHtmlReporter().getStartTime();
				getHtmlReporter().getEndTime();
				
				}
		
		 
		  else if(browser.equalsIgnoreCase("edge"))
	   		{
	   			System.setProperty("webdriver.edge.driver",EMS_TestData.sEdgePath);
	   			setDriver(new EdgeDriver());
	   			setHtmlReporter(new ExtentHtmlReporter(System.getProperty("user.dir")+"/EdgeReports/EmailMarketing_Report"+".html"));
				setExtent(new ExtentReports());
				getExtent().attachReporter(getHtmlReporter());
				getExtent().setSystemInfo("HostName", "Bilal Mubarik");
				getExtent().setSystemInfo("Environment", EMS_TestData.CRMandOrders_URL);
				getHtmlReporter().config().setDocumentTitle("Automation Testing Report");
				getHtmlReporter().config().setReportName("Email Marketing");
				getHtmlReporter().config().setTestViewChartLocation(ChartLocation.TOP);
				getHtmlReporter().config().setTheme(Theme.DARK);
				getHtmlReporter().getStartTime();
				getHtmlReporter().getEndTime();
	   			}
				
	     getDriver().get(EMS_TestData.CRMandOrders_URL);
	     getDriver().manage().window().maximize();
		 getDriver().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		 getDriver().manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
	}
	
	}