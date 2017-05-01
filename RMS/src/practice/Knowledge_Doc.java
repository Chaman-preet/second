//
//package practice;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.util.List;
//import org.openqa.selenium.support.FindAll;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class Knowledge_Doc {	
//	 
//	  WebDriver driver;
//	  
//	  @FindBy(id="ctl00_PlaceHolderMain_signInControl_UserName")
//	  WebElement Username;	
//	  
//	  @FindBy(id="ctl00_PlaceHolderMain_signInControl_password")
//	  WebElement Password;	
//	
//	  @FindBy(id="ctl00_PlaceHolderMain_signInControl_login")
//	  WebElement Login;	  
//	  
//	  @FindBy(linkText="Knowledge repository")
//	  WebElement Knowledge_type;
//	  	    
//	  @FindAll({@FindBy(className="rcbItem")})
//	  List<WebElement> value;
//	
//	  @FindBy(id="ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_txtDocumentTitle")
//	  WebElement Title;
//	  
//	  @FindBy(id="ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_ddlRegionLookup_Arrow")
//	  WebElement Region;
//	  @FindAll({@FindBy(className="rcbItem")})
//	  List<WebElement> Region_Value;
//	  
//	  @FindBy(id="ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_ddlCoverageGroupLookup_Arrow")
//	  WebElement Coverage_Group;
//	  @FindAll({@FindBy(className="rcbItem")})
//	  List<WebElement> CG_Value;
//	  
//	  @FindBy(id="ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_ddlSectorLookup_Arrow")
//	  WebElement Sector;
//	  @FindAll({@FindBy(className="rcbItem")})
//	  List<WebElement> Sector_Value;
//	  
//	  @FindBy(id="ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_ddlSubSectorLookup_Arrow")
//	  WebElement Sub_Sector;
//	  @FindAll({@FindBy(className="rcbItem")})
//	  List<WebElement> Sub_Sector_Value;
//	  
//	  @FindBy(id="ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_ddlProfileTypeLookup_Arrow")
//	  WebElement Profile_type;
//	  @FindAll({@FindBy(className="rcbItem")})
//	  List<WebElement> Profile_type_Value;
//	  
//	  @FindBy(id="ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_txtDocumentTags")
//	  WebElement Tags;
//	  
//	  @FindBy(id="ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_txtDocumentCompany")
//	  WebElement Company;
//	  
//	  @FindBy(id="ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_txtTextBox1")
//	  WebElement Ticker;
//	  
//	  @FindBy(id="ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_txtVolume")
//	  WebElement Volume;
//	  
//	  @FindBy(id="dateDocumentLastUpdatedDate")
//	  WebElement Update_Date;
//	  
//	  @FindBy(id="ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_chkIsSignedOff")
//	  WebElement Signed_off;
//	  	 
//  @Test
//  public void Call() throws AWTException, InterruptedException {
//	 driver= new FirefoxDriver();
//	  driver.get("http://client1.rms.evalueserve.com/");
//	  driver.manage().window().maximize();
//		
//
//		//Username.sendKeys("kamaljeet.verma@evalueserve.com");
//		//Password.sendKeys("Evs1234$");
//		
////		driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_UserName")).sendKeys("kamaljeet.verma@evalueserve.com");
////		driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_password")).sendKeys("Evs1234$");
////		driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_login")).click();
//		
//		Robot rob = new Robot();
//		rob.keyPress(java.awt.event.KeyEvent.VK_TAB);
//	    rob.keyRelease(java.awt.event.KeyEvent.VK_TAB);
//	    rob.keyPress(java.awt.event.KeyEvent.VK_TAB);
//	    rob.keyRelease(java.awt.event.KeyEvent.VK_TAB);
//	    rob.keyPress(java.awt.event.KeyEvent.VK_ENTER);
//	    rob.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
//	    rob.keyPress(java.awt.event.KeyEvent.VK_TAB);
//	    rob.keyRelease(java.awt.event.KeyEvent.VK_TAB);
//	    rob.keyPress(java.awt.event.KeyEvent.VK_TAB);
//	    rob.keyRelease(java.awt.event.KeyEvent.VK_TAB);
//	    rob.keyPress(java.awt.event.KeyEvent.VK_TAB);
//	    rob.keyRelease(java.awt.event.KeyEvent.VK_TAB);
//	    rob.keyPress(java.awt.event.KeyEvent.VK_TAB);
//	    rob.keyRelease(java.awt.event.KeyEvent.VK_TAB);
//		
//		Thread.sleep(3000);
//		
////		driver.findElement(By.id("ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_ddlKnowledgeTypeLookup_Arrow")).click();
//		driver.findElement(By.linkText("Knowledge repository")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("ctl00_SPWebPartManager1_g_51e75f6a_2387_48bb_b7a7_37f5eab87a06_btnAddKnowledgeDocument")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_txtDocumentTitle")).sendKeys("Title");
//		driver.findElement(By.id("ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_txtDocumentTags")).sendKeys("Tags");
//		driver.findElement(By.id("ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_txtDocumentCompany")).sendKeys("Company");
//		driver.findElement(By.id("ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_txtTextBox1")).sendKeys("Ticker");
//		driver.findElement(By.id("ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_txtVolume")).sendKeys("20");
//		driver.findElement(By.id("dateDocumentLastUpdatedDate")).sendKeys("14-Mar-16");
//		rob.keyPress(java.awt.event.KeyEvent.VK_TAB);
//	    rob.keyRelease(java.awt.event.KeyEvent.VK_TAB);
//	    driver.findElement(By.id("ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_ddlRegionLookup_Arrow")).click();
//	    
//	    driver.findElement(By.id("ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_ddlRegionLookup_Arrow")).sendKeys(Keys.DOWN);
//	  //search.sendKeys(Keys.TAB);
//	    
//	    
////	    Select region = new Select(driver.findElement(By.id("ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_ddlRegionLookup_Arrow")));
////	    region.selectByIndex(1);
//	    
////	    Select DropDown = new Select(driver.findElement(By.id("ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_ddlRegionLookup_Arrow")));
////      DropDown.selectByVisibleText("APAC");
//        
//	    /*new Select (driver.findElement(By.id("ctl00_SPWebPartManager1_g_453bf049_b749_4afb_abcc_dc95305f4920_ddlRegionLookup_Arrow"))).selectByVisibleText("Americas");
//
////	    @FindAll({@FindBy(className="rcbItem")})
////		List<WebElement> Region_Value;
////		
////		Knowledge_type.click();*/
////		
////		value.get(1).click();
//		
//	    Title.sendKeys("Title");
//	    
//	    Region.click();
//		value.get(1).click();
//		
//		Coverage_Group.click();
//		value.get(1).click();
//		
//		Sector.click();
//		value.get(1).click();
//		
//		Sub_Sector.click();
//		value.get(1).click();
//		
//		Profile_type.click();
//		value.get(1).click();
//		
//		Tags.sendKeys("Tags");
//		
//		Company.sendKeys("Company");
//		
//		Volume.sendKeys("Volume");
//		
//		Update_Date.sendKeys("14-Mar-16");
//		
//		Signed_off.click();
//		
//		}
//}
