package practice;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;

public class NewTest {
	WebDriver driver;
	@FindBy(id="ctl00_PlaceHolderMain_signInControl_UserName")

	WebElement username;
	
	@FindBy(id="ctl00_PlaceHolderMain_signInControl_password")
	WebElement password;
	
	@FindBy(id="ctl00_PlaceHolderMain_signInControl_login")
	WebElement login;
	
	@FindBy(xpath="//*[@id='main_Navigation']/li[4]/a")
	WebElement KnowRep;
	
	@FindBy(xpath="//input[contains(@id,'_btnAddKnowledgeDocument')]")
	WebElement AddKnow;
	
	@FindBy(xpath="//input[contains(@id,'_btnBrowseKnowledgeDocument')]")
	WebElement BrowKnow;
	
	@FindBy(xpath="//input[contains(@id,'_txtDocumentTitle')]")
	WebElement Title;
	
	@FindBy(xpath="//input[contains(@id,'_ddlKnowledgeTypeLookup_Input')]")
	WebElement Knowtype;
	  @FindAll({@FindBy(className="rcbItem")})
	  List<WebElement> Know_type;
	
	  @FindBy(xpath="//input[contains(@id,'_ddlRegionLookup_Input')]")
	  WebElement Region;
	  @FindAll({@FindBy(className="rcbItem")})
	  List<WebElement> Region_Value;
	  
	  @FindBy(xpath="//input[contains(@id,'_ddlCoverageGroupLookup_Input')]")
	  WebElement Coverage;
	  @FindAll({@FindBy(className="rcbItem")})
	  List<WebElement> CG_Value;
	  
	  @FindBy(xpath="//input[contains(@id,'_ddlSectorLookup_Input')]")
	  WebElement Sector;
	  @FindAll({@FindBy(className="rcbItem")})
	  List<WebElement> Sector_Value;
	  
	  @FindBy(xpath="//input[contains(@id,'_ddlSubSectorLookup_Input')]")
	  WebElement Sub_Sector;
	  @FindAll({@FindBy(className="rcbItem")})
	  List<WebElement> Sub_Sector_Value;
	  
	  @FindBy(xpath="//input[contains(@id,'_pplListBoxClientOwner_Input')]")
	  WebElement HR_Owner;
	
	  @FindBy(xpath="//input[contains(@id,'_pplListBoxEVSOwner_Input')]")
	  WebElement EVS_Owner;
	  
	  @FindBy(xpath="//input[contains(@id,'_ddlProfileTypeLookup_Input')]")
	  WebElement Profile_type;
	  @FindAll({@FindBy(className="rcbItem")})
	  List<WebElement> Profile_type_Value;
	  
	  @FindBy(xpath="//input[contains(@id,'_txtDocumentTags')]")
	  WebElement Tags;
	  
	  @FindBy(xpath="//input[contains(@id,'_txtDocumentCompany')]")
	  WebElement Company;
	  
	  @FindBy(xpath="//input[contains(@id,'_txtTextBox1')]")
	  WebElement Industry;
	  
	  @FindBy(xpath="//input[contains(@id,'_txtVolume')]")
	  WebElement Volume;
	  
	  @FindBy(id="dateDocumentLastUpdatedDateFrom")
	  WebElement From_Date;
	  
	  @FindBy(id="dateDocumentLastUpdatedDateTo")
	  WebElement To_Date;
	  
	  @FindBy(xpath="//input[contains(@id,'_chkIsSignedOff')]")
	  WebElement Signed_off;
	
	  @FindBy(xpath="//input[contains(@id,'_richTextDocumentSetDescription')]")
	  WebElement Desc;
	  
	  @FindBy(xpath="//input[contains(@id,'_richTextDocumentSetDescription_contentIframe')]")
	  WebElement Desc1;
	
	  @FindBy(xpath="//input[contains(@id,'BtnSearch')]")
		WebElement Search;
	  
	  @FindBy(xpath="//input[contains(@id,'btnCancel')]")
		WebElement Clear;
	  
	  @FindBy(xpath="//*[@id='main_Navigation']/li[5]/a')]")
		WebElement Feedback;
		
	  @FindBy(xpath="//*[@id='main_Navigation']/li[5]/ul/li/a")
		WebElement ViewFB;
	  
	  @FindBy(id="lblRequestTitle")
		WebElement Req_Title;
	  
	  @FindBy(id="dialogTitleSpan")
	    WebElement User_details;
	  

	  @FindBy(className="ms-dlgCloseBtn")
	    WebElement Close;
	  
	  @FindBy(xpath="//*[@id='ctl00_SPWebPartManager1_g_3f4ddf89_0367_4945_bf13_02c1152f391f']/div[5]/table/tbody/tr[2]/td[2]/a")
	  WebElement Banker;

	  @FindBy(className="filterHeadAccordionHeaderClose")
		WebElement Expand;

	  @FindBy(id="ViewFeedbackDialogue")
	    WebElement ViewFeedback;
	  
//	********************************    NEW REQUEST *****************************************************************************  
//	*****************************************************************************************************************************
	  
		@FindBy(xpath="//*[@id='main_Navigation']/li[2]/a")
		WebElement NewReq;
		
		@FindBy(xpath="//input[contains(@id,'_ddlRegion_Input')]")
		WebElement Region_NR;
		  @FindAll({@FindBy(className="rcbItem")})
		  List<WebElement> Region_NR_Value;
		
		@FindBy(xpath="//input[contains(@id,'_ddlCoverageGroup_Input')]")
		WebElement CoverageGroup_NR;
		  @FindAll({@FindBy(className="rcbItem")})
		  List<WebElement> CoverageGroup_NR_Value;
		
		@FindBy(xpath="//input[contains(@id,'_ddlRequestor_Input')]")
		WebElement Banker_NR;
		
		@FindBy(xpath="//input[contains(@id,'_listBoxCoOwner_Input')]")
		WebElement CoOwner_NR;

		@FindBy(xpath="//input[contains(@id,'txtAdditionalCoOwnerEmail')]")
		WebElement AdditionalEmail_NR;
		
		@FindBy(xpath="//input[contains(@id,'_txtRequestTitle')]")
		WebElement Title_NR;
		
		@FindBy(xpath="//input[contains(@id,'_txtClientProjectCode')]")
		WebElement ProjectCode_NR;
		
		@FindBy(xpath="//input[contains(@id,'_ddlRequestPriority_Input')]")
		WebElement Priority_NR;
		 @FindAll({@FindBy(className="rcbItem")})
		  List<WebElement> Priority_NR_Value;
		 
		@FindBy(xpath="//input[contains(@id,'dateExpectedDeliveryDateTime')]")
		WebElement Originaldate_NR;
		
		@FindBy(xpath="//input[contains(@id,'timeExpectedDeliveryDateTime')]")
		WebElement Originaltime_NR;
		
		@FindBy(xpath="//input[contains(@id,'_ddlMemberFirm_Input')]")
		WebElement RequestCG_NR;
		 @FindAll({@FindBy(className="rcbItem")})
		  List<WebElement> RequestCG_NR_Value;
		
		@FindBy(xpath="//input[contains(@id,'_ddlRequestType_Input')]")
		WebElement RequestType_NR;
		 @FindAll({@FindBy(className="rcbItem")})
		  List<WebElement> RequestType_NR_Value;
		
		@FindBy(xpath="//input[contains(@id,'_ddlRequestSubType_Input')]")
		WebElement SubType_NR;
		 @FindAll({@FindBy(className="rcbItem")})
		  List<WebElement> SubType_NR_Value;
		
		@FindBy(xpath="//input[contains(@id,'txtVolume')]")
		WebElement Volume_NR;
	
		@FindBy(xpath="//iframe[contains(@id,'_richTextRequestDescription_contentIframe')]")
		WebElement Description1_NR;
		
		@FindBy(xpath="//*[@id='btnReq']")
		WebElement Submit_NR;
		
		@FindBy(xpath="//input[contains(@id,'btnReset']")
		WebElement Reset_NR;
		
		@FindBy(xpath="//input[contains(@id,'_radUpSupportingDocumentfile0')]")
		WebElement Upload_NR;
		private Object element;
		
		
		
	//   ************************************* New Request ******************************************************
	//   ********************************************************************************************************
	   
	   public void NewRequest()
	   {
		   NewReq.click();
	   }
	 
	   public void Region_NR() throws InterruptedException
	   {
		   Region_NR.click();
		   Region_NR_Value.get(1).click();
		   Thread.sleep(1000);
	   }
	   
	   public void Coverage_NR() throws InterruptedException
	   {
		   CoverageGroup_NR.click();
		   CoverageGroup_NR_Value.get(3).click();
		   Thread.sleep(1000);
	   }
	   
	   public void Banker_NR () throws InterruptedException 
	 		{
	 		Banker_NR.sendKeys("req");
	 		Thread.sleep(6000);
	 		driver.findElement(By.className("racItem")).click(); 
	 		}
	   
	   public void CoOwner_NR () throws InterruptedException 
		{
		   CoOwner_NR.sendKeys("Gate");
		Thread.sleep(4000);
		driver.findElement(By.className("racItem")).click(); 
		}
	   
	   public void AdditionalEmail_NR(String pswd)
	   {
		 AdditionalEmail_NR.click();
		 AdditionalEmail_NR.sendKeys(pswd);
	   }
	   
	   public void Title_NR(String pswd)
	   {
	 	 Title_NR.click();
	 	 Title_NR.sendKeys(pswd);
	   }
	   
	   public void ProjectCode_NR(String pswd)
	   {
		   ProjectCode_NR.click();
		   ProjectCode_NR.sendKeys(pswd);
	   }
	   
	   public void Priority_NR()
	   {
		   Priority_NR.click();
		   Priority_NR_Value.get(1).click();
	   }
	   
	   public void Originaldate_NR(String pswd)
	   {
		   Originaldate_NR.click();
		   Originaldate_NR.sendKeys(pswd);
	   }
	   
	   public void Originaltime_NR(String pswd)
	   {
		   Originaltime_NR.click();
		   Originaltime_NR.sendKeys(pswd);
	   }
	   
	   public void RequestCG_NR()
	   {
		   RequestCG_NR.click();
		   RequestCG_NR_Value.get(1).click();
	   }
	   
	   
	   public void RequstType_NR()
	   {
		   RequestType_NR.click();
		   RequestType_NR_Value.get(1).click();
	   }
	   
	   public void SubType_NR()
	   {
		   SubType_NR.click();
		   SubType_NR_Value.get(0).click();
	   }
	   
	   public void Volume_NR(String pswd)
	   {
		   Volume_NR.click();
		   Volume_NR.sendKeys(pswd);
	   }
	   
	   public void Description1_NR(String pswd)
	   {
		   driver.switchTo().frame(Description1_NR);
		   driver.findElement(By.tagName("body")).sendKeys(pswd);
		   driver.switchTo().defaultContent();
		 
	   }
	   
	   public void Submit_NR()
	   {
		   Submit_NR.click();
		}
	   
	   public void Reset_NR()
	   {
		   Reset_NR.click();
		}
	   
	   public void Upload_NR()
	   {
		   Upload_NR.click();
		   Upload_NR.sendKeys("C:\\Users\\amit.aswani\\Desktop\\Bulk Upload Template.xlsx");
		   Robot rob = null;
			try {
				rob = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 rob.keyPress(java.awt.event.KeyEvent.VK_ESCAPE);
			    rob.keyRelease(java.awt.event.KeyEvent.VK_ESCAPE);
		}
	   
		public void New_Request() throws InterruptedException
		{
		  NewRequest();
 		  Thread.sleep(6000);
 		  Region_NR();
 		  Thread.sleep(4000);
 		  Coverage_NR();
		  Thread.sleep(5000);
		  Banker_NR();
		  Thread.sleep(8000);
		  CoOwner_NR();
		  Thread.sleep(8000);
		  AdditionalEmail_NR("Test123@evalueserve.com");
		  Title_NR("Title");
		  ProjectCode_NR("Project Code");
		  Thread.sleep(1000);
		  Priority_NR();
 		  Thread.sleep(2000);
 		  Originaldate_NR("10/27/2017");Thread.sleep(2000);
 		  Originaltime_NR("12:12");Thread.sleep(2000);
 		  RequestCG_NR();
 		  Thread.sleep(1000);
 		  RequstType_NR();
 		  Thread.sleep(2000);
 		  SubType_NR();
 		  Thread.sleep(1000);
 		  Volume_NR("12");
 		  Description1_NR("Description");
 		  Thread.sleep(2000);
// 		  Reset_NR();
 		  Upload_NR();
 		 Thread.sleep(4000);
 		  Submit_NR();
		  Thread.sleep(2000);
 	   }
	
//	  @FindBy(id="BtnSearch")
//	  WebElement Search;
	

  public NewTest (WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  }
    
  // Methods to login to application
  public void enteruser(String user)
  {
	 username.click();
	 username.sendKeys(user);

   }
  
  public void enterpswd(String pswd)
  {
	 password.click();
	 password.sendKeys(pswd);
  }
  
   public void log()
  {
	  login.click();
  }
   
   public void OpenKnow()
   {
	   KnowRep.click();
   }
   
   public void AddKnow()
   {
	   AddKnow.click();
   }
      
   public void Browse()
   {
	   BrowKnow.click();
   }
   
   public void Knowtype_Comp()
   {
	   Knowtype.click();
	   Know_type.get(0).click();
   }
      
   public void Knowtype_Trad()
   {
	   Knowtype.click();
	   Know_type.get(1).click();
   }
   
   public void Title(String pswd)
   {
 	 Title.click();
 	 Title.sendKeys(pswd);
   }
       
   public void Region()
   {
	   Region.click();
	   Region_Value.get(1).click();
   }
   
   public void Coverage()
   {
	   Coverage.click();
	   CG_Value.get(4).click();
   }
   
   public void Sector()
   {
	   Sector.click();
	   Sector_Value.get(1).click();
   }
   
   public void Tags(String pswd)
   {
 	 Tags.click();
 	 Tags.sendKeys(pswd);
   }
   
   public void Company(String pswd)
   {
	   Company.click();
	   Company.sendKeys(pswd);
   }
   
   public void Industry(String pswd)
   {
	   Industry.click();
	   Industry.sendKeys(pswd);
   }
   
   public void Volume(String pswd)
   {
	   Volume.click();
	   Volume.sendKeys(pswd);
   }
   
   public void From(String pswd)
   {
	   From_Date.click();
	   From_Date.sendKeys(pswd);
   }
   
   public void To(String pswd)
   {
	   To_Date.click();
	   To_Date.sendKeys(pswd);
   }
   
   public void Description(String pswd)
   {
	   Desc.click();
	   Desc1.sendKeys(pswd);
   }
   
   public void Signed_off()
   {
	   Signed_off.click();
	   }
   public void Apply()
   {
	   Search.click();
	   }
   
   public void Clear_all()
   {
	   Clear.click();
	   }
   public void Expand()
   {
	   Expand.click();
	   }
   
   public void Request_Title()
   {
	   Req_Title.click();
	   }
   
   public void Banker()
   {
	   Banker.click();
	   }
  
   public void Close_dialogue()
   {
	   Close.click();
	   }
   public void ViewFB()
   {
	   ViewFeedback.click();
   }
   

   
   
       public void Allfieldsempty() throws InterruptedException
       {
    	Thread.sleep(2000);
    	
    	String Empty_Knowtype = Knowtype.getAttribute("value");
    	if(Empty_Knowtype.contentEquals("Select")) { }
     	else {  System.out.println("Knowledge type field is NOT cleared"); }

    	String Empty_Title = Title.getAttribute("value");
    	if(Empty_Title.isEmpty()) { }
    	else { System.out.println("Title field is NOT cleared"); }

       	String Empty_Region = Region.getAttribute("value");
    	if(Empty_Region.contentEquals("Select")) { }
  	    else { System.out.println("Region field is NOT cleared"); }
    	
    	String Empty_Coverage = Coverage.getAttribute("value");
     	if(Empty_Coverage.contentEquals("Select")) { }
   	    else { System.out.println("Coverage field is NOT cleared"); }
     	
     	String Empty_Sector = Sector.getAttribute("value");
     	if(Empty_Sector.contentEquals("Select")) { }
   	    else { System.out.println("Sector field is NOT cleared"); }
     	
     	String Empty_Sub_Sector = Sub_Sector.getAttribute("value");
     	if(Empty_Sub_Sector.contentEquals("Select")) { }
   	    else { System.out.println("Sub_Sector field is NOT cleared"); }
     	
     	String Empty_Profile_type = Profile_type.getAttribute("value");
     	if(Empty_Profile_type.contentEquals("Select")) { }
   	    else { System.out.println("Profile_type field is NOT cleared"); }
     	
     	String Empty_Tags = Tags.getAttribute("value");
    	if(Empty_Tags.isEmpty()) { }
    	else { System.out.println("Tags field is NOT cleared"); }
     	
    	String Empty_Company = Company.getAttribute("value");
    	if(Empty_Company.isEmpty()) { }
    	else { System.out.println("Company field is NOT cleared"); }
     	
    	String Empty_Industry = Industry.getAttribute("value");
    	if(Empty_Industry.isEmpty()) { }
    	else { System.out.println("Industry field is NOT cleared"); }
    	
    	String Empty_From_Date = From_Date.getAttribute("value");
    	if(Empty_From_Date.isEmpty()) { }
    	else { System.out.println("From_Date field is NOT cleared"); }
    	
    	String Empty_To_Date = To_Date.getAttribute("value");
    	if(Empty_To_Date.isEmpty()) { }
    	else { System.out.println("To_Date field is NOT cleared"); }
    	
       }
       public void HROwner () throws InterruptedException 
		{
		HR_Owner.sendKeys("req");
		Thread.sleep(1000);
		driver.findElement(By.className("racItem")).click(); 
		}
		
		public void EVSOwner () throws InterruptedException 
		{
		EVS_Owner.sendKeys("tea");
		Thread.sleep(1000);
		driver.findElement(By.className("racItem")).click(); 
		}
    	   @SuppressWarnings("unused")
		private void assertEquals(String empty_Knowtype, String string) {
		// TODO Auto-generated method stub
		
	}

		public void Browse_Know() throws InterruptedException
    	   {
    		  Browse();
    		  Thread.sleep(2000);
    		  
//    		  Knowledge type as Company Profile
    		  Knowtype_Comp();
    		  Thread.sleep(3000);
    		  Title("Enter Title");
    		  Region();
    		  Thread.sleep(2000);
    		  Coverage();
    		  Thread.sleep(2000);
    		  HROwner();
    		  Thread.sleep(1000);
    		  EVSOwner();
    		  Thread.sleep(1000);
    		  Tags("Enter Tags");
    		  Company("Enter Company");
    		  Industry("Enter Industry");
    		  From("06/01/2016");
    		  To("06/20/2016");
    		  Apply();
    		  Thread.sleep(2000);
    		  
//    		  Knowledge type as Trading Comps
    		  Expand();
    		  Thread.sleep(1000);
    		  Clear_all();
    		  Thread.sleep(3000);
    		  Knowtype_Trad();
    		  Thread.sleep(2000);
    		  Title("Enter Title");
    	  	  Thread.sleep(1000);
    		  Region();
    		  Thread.sleep(1000);
    		  Coverage();
    		  Thread.sleep(2000);
    		  Sector();
    		  Thread.sleep(1000);
    		  HROwner();
    		  Thread.sleep(1000);
    		  EVSOwner();
    		  Thread.sleep(1000);
    		  Tags("Enter Tags");
    		  Company("Enter Company");
    		  Industry("Enter Industry");
    	      From("06/01/2016");
    		  To("06/20/2016");
    		  Apply();
    		  Thread.sleep(3000);
    		  Expand();
    		  Clear_all();
    		  Thread.sleep(2000);
    		  Allfieldsempty();
    		  }
		
		public void Add_Know() throws InterruptedException
 	   {
		  AddKnow();
 		  Thread.sleep(2000);
// 		 Knowledge type as Company Profile
 		  Knowtype_Comp();
		  Thread.sleep(3000);
		  Title("Enter Title");
		  Region();
		  Thread.sleep(2000);
		  Coverage();
		  HROwner();
		  Thread.sleep(1000);
		  EVSOwner();
		  Thread.sleep(1000);
		  Thread.sleep(2000);
		  Tags("Enter Tags");
		  Company("Enter Company");
		  Industry("Enter Industry");
		  Volume("123");
		  From("06/01/2016");
		  To("06/20/2016");
		  Apply();
		  Thread.sleep(2000);
		  Signed_off();
		  Description("Test description");    
		     
//		  Knowledge type as Trading Comps
		  Expand();
		  Thread.sleep(1000);
		  Clear_all();
		  Thread.sleep(3000);
		  Knowtype_Trad();
		  Thread.sleep(2000);
		  Title("Enter Title");
	  	  Thread.sleep(1000);
		  Region();
		  Thread.sleep(1000);
		  Coverage();
		  Thread.sleep(2000);
		  Sector();
		  Thread.sleep(1000);
		  HROwner();
		  Thread.sleep(1000);
		  EVSOwner();
		  Thread.sleep(1000);
		  Tags("Enter Tags");
		  Company("Enter Company");
		  Industry("Enter Industry");
	      From("06/01/2016");
		  To("06/20/2016");
		  Apply();
		  Thread.sleep(3000);
		  Expand();
		  Clear_all();
		  Thread.sleep(2000);
		  Allfieldsempty();
		  Signed_off();
		  Description("Test description");  
		  Volume("123");
               }
		
		public void Know_Repo() throws InterruptedException, AWTException 
	 	   {
				 Browse_Know();
//				 Feed_back ();

				 Add_Know();
		  }
	 	   	
			@SuppressWarnings("null")
			public <IWebElement> void Feed_back() throws InterruptedException
		   {
			 Actions action = new Actions(driver);
			 WebElement feedback = driver.findElement(By.linkText("Feedback"));
			 action.moveToElement(feedback).moveToElement(driver.findElement(By.xpath("//*[@id='main_Navigation']/li[5]/ul/li/a"))).click().build().perform();
			 
			 if(driver.getPageSource().contains("Request Title")) { }
			 else { System.out.println("Title mismatch / missing");  }
			 if(driver.getPageSource().contains("Banker")) { }
			 else { System.out.println("Banker is mismatch / missing");  }
			 if(driver.getPageSource().contains("Request Date")) { }
			 else { System.out.println("Request Date is mismatch / missing");  }
			 if(driver.getPageSource().contains("Expected Deadline")) { }
			 else { System.out.println("Expected Deadline is mismatch / missing");  }
			 if(driver.getPageSource().contains("Completed Date")) { }
			 else { System.out.println("Completed Date is mismatch / missing");  }
			 if(driver.getPageSource().contains("Proposed Date")) { }
			 else { System.out.println("Proposed Date is mismatch / missing");  }
			 if(driver.getPageSource().contains("View feedback")) { }
			 else { System.out.println("View feedback is mismatch / missing");  }
			 
			 Request_Title();
			 Thread.sleep(2000);
			 if(driver.getPageSource().contains("Request details")) { }
			 else { System.out.println("Request details page mismatch / missing");  }
			 
			 Robot rob = null;
			try {
				rob = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(2000);
			 rob.keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
			    rob.keyRelease(java.awt.event.KeyEvent.VK_BACK_SPACE);
			    
			    Banker();
			    Thread.sleep(3000);
			    
			    String popup_name = User_details.getAttribute("title");
		     	if(popup_name.contentEquals("User details")) { }
		   	    else { System.out.println("User details is mismatch / missing"); }
		     	Close_dialogue();	
		     	Thread.sleep(1000);
		     	
		     	ViewFB();
		     	Thread.sleep(3000);
		     	rob.keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
				rob.keyRelease(java.awt.event.KeyEvent.VK_BACK_SPACE);
		     	
//		     	if(driver.getPageSource().contentEquals("Viw feedba")) {
//		     		System.out.println("View feedback appears");   }
//				 else { System.out.println("View feedback is mismatch / missing");  }
//		     	
//		     	if(driver.getPageSource().contentEquals("Request ID")) { }
//				 else { System.out.println("Request ID is mismatch / missing");  }
//		     	
//		     	if(driver.getPageSource().contentEquals("Completed Dat")) { }
//				 else { System.out.println("Completed Date is mismatch / missing");  }
//		     	
//		     	if(driver.getPageSource().contentEquals("Request Title")) { }
//				 else { System.out.println("Request Title is mismatch / missing");  }
//		     	
//		     	if(driver.getPageSource().contentEquals("Request Typ")) { }
//				 else { System.out.println("Request Type is mismatch / missing");  }
//		     	
//		     	if(driver.getPageSource().contentEquals("Timeliness")) { }
//				 else { System.out.println("Timeliness is mismatch / missing");  }
//		     	
//		     	if(driver.getPageSource().contentEquals("Consistenc")) { }
		     	
//				 else { System.out.println("Consistency is mismatch / missing");  }
//		     	
//		     	if(driver.getPageSource().contentEquals("Quality")) { }
//				 else { System.out.println("Quality is mismatch / missing");  }
//		     	
//		     	if(driver.getPageSource().contentEquals("Laungag")) { }
//				 else { System.out.println("Laungage is mismatch / missing");  }
//		     	
//		     	if(driver.getPageSource().contentEquals("Accuracy")) { }
//				 else { System.out.println("Accuracy is mismatch / missing");  }
		     	
//		     	if(driver.getPageSource().contentEquals("Comments")) { }
//				 else { System.out.println("Comments is mismatch / missing");  }

//				**************************************************************************************************
//				**************************************************************************************************
				

				
		   
		   }}


       
