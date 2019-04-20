
package Master;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.base.Predicate;
import EMS_Corporate_CampaignList_TestCases.*;



public class EMS_Corporate_CampaignList_Execution_Mirror_Prod  {

	private static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
    private static ExtentReports extent;
	private static ExtentTest test;
	public static WebDriverWait wait;
	protected static Predicate<WebDriver> pageLoaded;
	static WebDriver input;
	@Parameters("browser")
	@BeforeTest
	 public void Startup(String browser) throws InterruptedException, AWTException, IOException{

		 BrowserInitiation.StartBrowser(browser);
		 
		 }

	@Test(priority=0)
	  public void LoginApp() throws IOException, InterruptedException, AWTException{
		 
		 Login.login();
		 
	}

	  @Test(priority=1)
	  public void TenentConfig() throws IOException, InterruptedException, AWTException{
		 
		 TenentConfiguration.TenentSwitch();
		 
	}
	 
	 @Test(priority=2)
	  public void SettingsCorpChildValueStoring() throws IOException, InterruptedException, AWTException{
		 
		 Settings_CorporateParentChild_ValuesStore.SettingsCorpChildValues_Store();
	 }
	 
	 
	 @Test(priority=3)
	  public void CreateListVisibility_ToCampaignOwner() throws IOException, InterruptedException, AWTException{
		 
	   CreateListButton_OnlyDisplayCampaignOwner.CreateListButton_VisibilityToCampaignOwnerOnly();
		 
	}
   
   @Test(priority=4)
	  public void RestoreDefault_FromField_CamapignInfoVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.RestoreDefault_FromField_CamapignInfo_Verification ();
		 
	}
   @Test(priority=5)
	  public void Blank_TemplateCreation() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.Blank_Template_Creation ();
		 
	}
   @Test(priority=6)
	  public void RestoreDefault_HTMLLinkWebsite_LogoStepVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.RestoreDefault_HTMLLinkWebsite_LogoStep_Verification ();
		 
	}
   @Test(priority=7)
	  public void SocialLinks_Fields_RestoreDefaults_WithHTTPTextVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.SocialLinks_Fields_RestoreDefaults_WithHTTPText_Verification ();
		 
	}
   @Test(priority=8)
	  public void LinkTOURLButton_PopUpMessage_MergeCampaignVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.LinkTOURLButton_PopUpMessage_MergeCampaign_Verification ();
		 
	}
   @Test(priority=9)
	  public void ListCreation_FromCampaign() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.List_Creation_FromCampaign ();
		 
	}
   @Test(priority=10)
	  public void SendStep_SendMailDrop_WithMultipleTenentSelection_MergeCampaignVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.SendStep_SendMailDrop_WithMultipleTenentSelection_MergeCampaign_Verification ();
		 
	}
   @Test(priority=11)
	  public void MergeCampaignPreviewParentAddressVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.MergeCampaignPreview_ParentAddressVerification ();
		 
	}
   @Test(priority=12)
	  public void MergeCampaignPreviewChildAddressVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.MergeCampaignPreview_ChildAddressVerification ();
		 
	}
   @Test(priority=13)
	  public void MergeCampaignSendTestEmail() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.MergeCampaign_SendTestEmail ();
		 
	}
   @Test(priority=14)
	  public void MergeCampaign_Sent() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.MergeCampaignSent ();
		 
	}
  
	@AfterMethod
	public void getResult(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE){
			
			 test = extent.createTest(result.getName());
             test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed due to Below Issue", ExtentColor.RED));
			 test.fail(result.getThrowable());
			 extent.flush();
		}
		
		
		
		
	}

	@AfterTest
	public void teardown(){
	 	
	 	driver.close();
	 	
	}


	 public static WebDriver getDriver() {
			return driver;
		}


		public static void setDriver(WebDriver driver) {
			EMS_Corporate_CampaignList_Execution_Mirror_Prod.driver = driver;
		}


		public static ExtentReports getExtent() {
			return extent;
		}


		public static void setExtent(ExtentReports extent) {
			EMS_Corporate_CampaignList_Execution_Mirror_Prod.extent = extent;
		}


		public static ExtentTest getTest() {
			return test;
		}


		public static void setTest(ExtentTest test) {
			EMS_Corporate_CampaignList_Execution_Mirror_Prod.test = test;
		}

		 public static ExtentHtmlReporter getHtmlReporter() {
				return htmlReporter;
			}

		public static void setHtmlReporter(ExtentHtmlReporter htmlReporter) {
			EMS_Corporate_CampaignList_Execution_Mirror_Prod.htmlReporter = htmlReporter;
			
		}

}
