package EMS_Corporate_CampaignList_TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import EMSTestCases.CampaignEditor;
import FunctionsLibrary.Reuse_Functions_Corp_CampaignsList;
import Master.EMS_Corporate_CampaignList_Execution;



import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;


public class AdManagement_Feature extends EMS_Corporate_CampaignList_Execution {  
	static EMS_Locators Ads = PageFactory.initElements(getDriver(), EMS_Locators.class);
	public static String[] dateval;
	public static DateFormat formatdate;
	public static Calendar cal;
	 public static String newDate;
	 public static void CreateAd_ImageUpload() throws IOException, InterruptedException, AWTException{
		try{
	 
	    //Goto Settings Page
			Ads.SettingsTab.click();
			
			 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		     
		//Go to Ad Management Page
		     Ads.Settings_AdmanagementLink.click();
		     
             Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		     
		 //Press the Create Ad Button
		     Ads.Admanagement_CreateAd_Button.click();
		     
             Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		     
		 //Enter all the Manadatory fields to Create the Ad
		     Ads.CreateAd_NameField.sendKeys(EMS_TestData.AdManagementName);
		     
		     Ads.CreateAd_UploadFile_Button.click();
		     
		     Thread.sleep(3000);
		     
		  //Upload the file through windows popup
		    /* Robot rb =new Robot();
	    		
		    	// pressing keys with the help of keyPress and keyRelease events
		    		
		    		rb.keyPress(KeyEvent.VK_C);
		    		
		    		rb.keyRelease(KeyEvent.VK_C);
		    		
		    		Thread.sleep(1000);
		    		
		    		rb.keyPress(KeyEvent.VK_SHIFT);
		    		
		    		rb.keyPress(KeyEvent.VK_SEMICOLON);
		    		
		    		rb.keyRelease(KeyEvent.VK_SEMICOLON);
		    		
		    		rb.keyRelease(KeyEvent.VK_SHIFT);
		    		
		    		 
		    		
		    		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		    		
		    		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		    		
		    		Thread.sleep(1000);
		    		
		    		rb.keyPress(KeyEvent.VK_A);
		    		
		    		rb.keyRelease(KeyEvent.VK_A);
		    		
		    	    rb.keyPress(KeyEvent.VK_D);
		    		
		    		rb.keyRelease(KeyEvent.VK_D);
		     
			        Thread.sleep(1000);
			        
			        rb.keyPress(KeyEvent.VK_ENTER);
		    		
		    		rb.keyRelease(KeyEvent.VK_ENTER);*/
		     CampaignEditor.Projectpath=System.getProperty("user.dir");
		   	 System.out.println(CampaignEditor.Projectpath);
		      	 
		     Runtime.getRuntime().exec(CampaignEditor.Projectpath+"/Img/Ad.exe");
		    		
		    		Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		   	     
		   	        Thread.sleep(3000);
		   	        
		   	    //Validating if the image is uploaded successfully or not
		   	       if(Ads.AdImageUpload_Verification.getText().contains("Ad"))
		   	       {
		   	    	   System.out.println("Ad Image Uploaded Successfully");
		   	    	   
		   	    	   Reuse_Functions_Corp_CampaignsList.resultPass("AdCreation_ImageUpload_Verification","Ad Image Uploaded Successfully");
		   	       }
		   	       else{
		   	    	System.out.println("Ad Image Uploaded UnSuccessfully");
		   	    	   
		   	    	Reuse_Functions_Corp_CampaignsList.resultFail("AdCreation_ImageUpload_Verification","Ad Image Uploaded UnSuccessfully");
		   	       }
		   	        
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	finally {
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
	}
	
	
	}

public static void AdRemoveImage_Verification() throws InterruptedException, IOException{
	try{
		
	//Press the Remove Button
		Ads.RemoveImage_Button.click();
		
		Thread.sleep(2000);
		
    //Validating if the Image is removed Successfully or not
		if(Ads.AdImageRemove_Verification.isDisplayed())
		{
			System.out.println("Ad Image Removed Successfully");
			
			Reuse_Functions_Corp_CampaignsList.resultPass("Ad_Image_Remove_Verification","Ad Image Removed Successfully");
		}
		else{
            System.out.println("Ad Image Removed UnSuccessfull");
			
			Reuse_Functions_Corp_CampaignsList.resultFail("Ad_Image_Remove_Verification","Ad Image Removed UnSuccessfull");
		}
	
	
	
	}catch(NoSuchElementException e){
		e.getMessage();
	}
}

 public static void FutureDate_BannerAdCreation_WithSearchVerification() throws InterruptedException, AWTException, IOException{
	 try{
		 
	 //Upload the Image again
		 Ads.CreateAd_UploadFile_Button.click();
	     
	     Thread.sleep(3000);
	     
	  //Upload the file through windows popup
	    /* Robot rb =new Robot();
    		
	    	// pressing keys with the help of keyPress and keyRelease events
	    		
	    		rb.keyPress(KeyEvent.VK_C);
	    		
	    		rb.keyRelease(KeyEvent.VK_C);
	    		
	    		Thread.sleep(1000);
	    		
	    		rb.keyPress(KeyEvent.VK_SHIFT);
	    		
	    		rb.keyPress(KeyEvent.VK_SEMICOLON);
	    		
	    		rb.keyRelease(KeyEvent.VK_SEMICOLON);
	    		
	    		rb.keyRelease(KeyEvent.VK_SHIFT);
	    		
	    		 
	    		
	    		rb.keyPress(KeyEvent.VK_BACK_SLASH);
	    		
	    		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
	    		
	    		Thread.sleep(1000);
	    		
	    		rb.keyPress(KeyEvent.VK_A);
	    		
	    		rb.keyRelease(KeyEvent.VK_A);
	    		
	    	    rb.keyPress(KeyEvent.VK_D);
	    		
	    		rb.keyRelease(KeyEvent.VK_D);
	     
		        Thread.sleep(1000);
		        
		        rb.keyPress(KeyEvent.VK_ENTER);
	    		
	    		rb.keyRelease(KeyEvent.VK_ENTER);*/
	     CampaignEditor.Projectpath=System.getProperty("user.dir");
	   	 System.out.println(CampaignEditor.Projectpath);
	      	 
	     Runtime.getRuntime().exec(CampaignEditor.Projectpath+"/Img/Ad.exe");
	    		
	    		Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	   	     
	   	        Thread.sleep(3000);
	   	        
	   	    //Enter the Advertiser Name
	   	        Ads.CreateAd_AdvertiserField.sendKeys("Corporate Ad");
	   	        
	   	    //Enter the Descriptyion For Ad
	   	        Ads.CreateAd_DescriptionTextArea.sendKeys("This is a Test Ad");
	   	        
	   	        
	   	    //Enter the Valid URL for Banner ad
	   	       Ads.CreateAd_BannerURLField.sendKeys("https://www.google.com/");
	   	        
	   	   //Insert the Future Start date
	   	      formatdate=new SimpleDateFormat("MM/dd/yyyy");
			   cal = Calendar.getInstance();
			  cal.setTime(new Date());
			  cal.add(Calendar.DATE, 2);
			  newDate = formatdate.format(cal.getTime());
			  System.out.println(newDate);
			  
		    dateval= newDate.split("/");
			System.out.println(dateval[0]);
			System.out.println(dateval[1]);
			System.out.println(dateval[2]);
			
			Ads.CreateAdStartDate_DatePickerIcon.click();
			
			Thread.sleep(2000);
			  
			System.out.println("//span[contains(text(), '"+dateval[1]+"')][contains(@class,'ng-binding')]");
		   
		    getDriver().findElement(By.xpath("//span[contains(text(), '"+dateval[1]+"')][contains(@class,'ng-binding')]")).click();
			  
			 
			//Press the Save Button To Complete the Ad Creation with Future Date
			Ads.CorporateSaveButton_SettingsCorporate.click();
			
			Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	   	     
   	        
			Thread.sleep(4000);
   	        
   	      //Search the which is created with Future Date
   	        Ads.SearchAddField.sendKeys(EMS_TestData.AdManagementName);
   	        
   	        Thread.sleep(3000);
   	        
   	        if(Ads.AdPage_AddedRecordDetails_Link.getText().contains(EMS_TestData.AdManagementName))
   	        {
   	        	System.out.println("BannerAd Create  with Future Date and Searched Successfully");
   	        	
   	        	Reuse_Functions_Corp_CampaignsList.resultPass("FutureDate_BannerAdCreation_WithSearchVerification","BannerAd Create  with Future Date and Searched Successfully");
   	        	
   	        }
   	        else{
                System.out.println("BannerAd Create  with Future Date and Searched UnSuccessfully");
   	        	
   	        	Reuse_Functions_Corp_CampaignsList.resultFail("FutureDate_BannerAdCreation_WithSearchVerification","BannerAd Create  with Future Date and Searched UnSuccessfully");
   	        }
   	        
   	        
	 
	 
	 }catch(NoSuchElementException e){
		 e.getMessage();
	 }
 
 
 }
 public static void EditBannerAd_Details() throws InterruptedException, IOException{
	 try{
		 //Press the Created Ad and goto details screen
		 Ads.AdPage_AddedRecordDetails_Link.click();
	 
		 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
   	     
	     Thread.sleep(1000);
	     
	     Ads.CreateAd_NameField.clear();
	     
	     Ads.CreateAd_NameField.sendKeys(EMS_TestData.AdManagementUpdated);
	     
	     Ads.CreateAd_AdvertiserField.clear();
	     
	     Ads.CreateAd_AdvertiserField.sendKeys("Updated Corporate Ad");
	     
	     //Press the Save Button
	     Ads.CorporateSaveButton_SettingsCorporate.click();
			
	     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	   	     
	     Thread.sleep(4000);
	        
	     Ads.SearchAddField.clear();
	     
	     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(2000);
	      //Search the which is created with Future Date
	     Ads.SearchAddField.sendKeys(EMS_TestData.AdManagementUpdated);
	        
	     Thread.sleep(3000);
	     
	     if(Ads.AdPage_AddedRecordDetails_Link.getText().contains(EMS_TestData.AdManagementUpdated) & Ads.AdvertiserDetails_AdList_Verification.getText().contains("Updated Corporate Ad"))
	        {
	        	System.out.println("BannerAd Updated with Future Date and Searched Successfully");
	        	
	        	Reuse_Functions_Corp_CampaignsList.resultPass("EditBannerAd_Details","BannerAd Updated with Future Date and Searched Successfully");
	        	
	        }
	        else{
             System.out.println("BannerAd Updated with Future Date and Searched UnSuccessfully");
	        	
	        Reuse_Functions_Corp_CampaignsList.resultFail("EditBannerAd_Details","BannerAd Updated with Future Date and Searched UnSuccessfully");
	        }
	 
	 }catch(NoSuchElementException e){
		 e.getMessage();
	 }
 
 
 }

 public static void DeleteAd() throws InterruptedException, IOException{
	 try{
		 
		 //Select the checkbox for ad
		 Ads.NewAdCreated_Verification_AdmanagementPage.click();
		 
		 Thread.sleep(2000);
		 
		 //Press the Delete button and confirm it and validate as if the Ad Deleted Successfully or not
		 Ads.AdManagementPage_DeleteButton.click();
		 
		 Thread.sleep(1000);
		 
		 Ads.Ad_DeleteConfirm.click();
		 
		 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
   	     
	     Thread.sleep(2000);
	     
	     //Validate as if the Ad deleted or not
	     if(Ads.DeleteAdd_SuccessfullVerification.getText().contains("No results found"))
	     {
	    	 System.out.println("Ad Deleted Successfully");
	    	 
	    	 Reuse_Functions_Corp_CampaignsList.resultPass("DeleteAd","Ad Deleted UnSuccessfully");
	     }
	     else{
             System.out.println("Ad Deleted Successfully");
	    	 
	    	 Reuse_Functions_Corp_CampaignsList.resultFail("DeleteAd","Ad Deleted UnSuccessfully");
	     }
		 
	 }catch(NoSuchElementException e){
		 e.getStackTrace();
	 }
 }
 public static void CurrentDate_BannerAdCreation_WithAdCheckboxDisable_WithSearchVerification_ActiveAd() throws InterruptedException, AWTException, IOException{
	 try{
		//Press the Create Ad Button
	     Ads.Admanagement_CreateAd_Button.click();
	     
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
	     
	 //Enter all the Manadatory fields to Create the Ad
	     Ads.CreateAd_NameField.sendKeys(EMS_TestData.AdManagementName);
		 
	 //Upload the Image again
		 Ads.CreateAd_UploadFile_Button.click();
	     
	     Thread.sleep(3000);
	     
	  //Upload the file through windows popup
	     /*Robot rb =new Robot();
    		
	    	// pressing keys with the help of keyPress and keyRelease events
	    		
	    		rb.keyPress(KeyEvent.VK_C);
	    		
	    		rb.keyRelease(KeyEvent.VK_C);
	    		
	    		Thread.sleep(1000);
	    		
	    		rb.keyPress(KeyEvent.VK_SHIFT);
	    		
	    		rb.keyPress(KeyEvent.VK_SEMICOLON);
	    		
	    		rb.keyRelease(KeyEvent.VK_SEMICOLON);
	    		
	    		rb.keyRelease(KeyEvent.VK_SHIFT);
	    		
	    		 
	    		
	    		rb.keyPress(KeyEvent.VK_BACK_SLASH);
	    		
	    		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
	    		
	    		Thread.sleep(1000);
	    		
	    		rb.keyPress(KeyEvent.VK_A);
	    		
	    		rb.keyRelease(KeyEvent.VK_A);
	    		
	    	    rb.keyPress(KeyEvent.VK_D);
	    		
	    		rb.keyRelease(KeyEvent.VK_D);
	     
		        Thread.sleep(1000);
		        
		        rb.keyPress(KeyEvent.VK_ENTER);
	    		
	    		rb.keyRelease(KeyEvent.VK_ENTER);*/
	     CampaignEditor.Projectpath=System.getProperty("user.dir");
	   	 System.out.println(CampaignEditor.Projectpath);
	      	 
	     Runtime.getRuntime().exec(CampaignEditor.Projectpath+"/Img/Ad.exe");
	    		
	    		Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	   	     
	   	        Thread.sleep(3000);
	   	        
	   	    //Enter the Advertiser Name
	   	        Ads.CreateAd_AdvertiserField.sendKeys("Corporate Ad");
	   	        
	   	    //Enter the Descriptyion For Ad
	   	        Ads.CreateAd_DescriptionTextArea.sendKeys("This is a Test Ad");
	   	        
	   	        
	   	    //Enter the Valid URL for Banner ad
	   	       Ads.CreateAd_BannerURLField.sendKeys("https://www.google.com/");
	   	        
	   	   //Insert the Future Start date
	   	    DateFormat formatdate=new SimpleDateFormat("MM/dd/yyyy");
			  
			  Date systemDate=new Date();
			  
			 String dateval=formatdate.format(systemDate);
		
			 System.out.println(dateval);
		    String[] datevalue= dateval.split("/");
			System.out.println(datevalue[0]);
			System.out.println(datevalue[1]);
			System.out.println(datevalue[2]);
			
			Ads.CreateAdStartDate_DatePickerIcon.click();
			
			Thread.sleep(2000);
			  
			System.out.println("//span[contains(text(), '"+datevalue[1]+"')][contains(@class,'ng-binding')]");
		   
		    getDriver().findElement(By.xpath("//span[contains(text(), '"+datevalue[1]+"')][contains(@class,'ng-binding')]")).click();
			  
			 
			//Press the Save Button To Complete the Ad Creation with Future Date
			Ads.CorporateSaveButton_SettingsCorporate.click();
			
			Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	   	     
   	        
			Thread.sleep(4000);
			
			 Ads.SearchAddField.clear();
		     
		     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(2000);
		      //Search the which is created with Future Date
		     Ads.SearchAddField.sendKeys(EMS_TestData.AdManagementName);
		     
		     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(3000);
		     
		    if(Ads.AdPage_AddedRecordDetails_Link.getText().contains(EMS_TestData.AdManagementName) & !Ads.NewAdCreated_Verification_AdmanagementPage.isEnabled() & Ads.ActiveAd_Verification.isDisplayed())
   	        {
   	        	System.out.println("BannerAd Create  with Current Date and Searched Successfully with Ad Checkbox is not Enabled and Ad is Active Success ");
   	        	
   	        	Reuse_Functions_Corp_CampaignsList.resultPass("CurrentDate_BannerAdCreation_WithAdCheckboxDisable_WithSearchVerification_ActiveAd","BannerAd Create  with Current Date and Searched Successfully with Ad Checkbox is not Enabled and Ad is Active Success");
   	        	
   	        }
   	        else{
                System.out.println("BannerAd Create  with Current Date and Searched UnSuccessfully with Ad Checkbox is Enabled and Ad is Active Unsuccessfull");
   	        	
   	        	Reuse_Functions_Corp_CampaignsList.resultFail("CurrentDate_BannerAdCreation_WithAdCheckboxDisable_WithSearchVerification","BannerAd Create  with Current Date and Searched UnSuccessfully with Ad Checkbox is Enabled and Ad is Active Unsuccessfull");
   	        }
   	        
   	        
	 
	 
	 }catch(NoSuchElementException e){
		 e.getMessage();
	 }
 

 }

public static void InactiveAd() throws InterruptedException, IOException{
	try{
	 Ads.AdPage_AddedRecordDetails_Link.click();
	 
	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
    Thread.sleep(1000);
    
    //Click the status bootstrap dropdown and select the Inactive option
    Ads.Ad_Status_ChangeDropdown.click();
    
    Ads.CreateAd_StatusSelection.click();
    
    Thread.sleep(3000);
    
    //Press the Save Button
    Ads.CorporateSaveButton_SettingsCorporate.click();
		
    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
  	     
    Thread.sleep(4000);
    
    //Validate if the Inactive icon occur or not
    if(Ads.InactiveAd_Verification.isDisplayed()){
    	System.out.println("Ad Inactive Successfully");
    	Reuse_Functions_Corp_CampaignsList.resultPass("InactiveAd", "Ad Inactive Successfully");
    }
    else{
    	System.out.println("Ad Inactive UnSuccessfully");
    	Reuse_Functions_Corp_CampaignsList.resultFail("InactiveAd", "Ad Inactive UnSuccessfully");
    }
    
	}catch(NoSuchElementException e){
		e.getMessage();
	}


}



}