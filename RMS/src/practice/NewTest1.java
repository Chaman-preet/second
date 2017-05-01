package practice;



//package com.pack.auto;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.util.List;

import practice.NewTest;
public class NewTest1 {
	WebDriver driver;
	NewTest objlogin;
	@Test
  public void login() throws InterruptedException, AWTException {
	  	
	  driver =new FirefoxDriver();
	  driver.get("http://demo2.rms.evalueserve.com/");
	  driver.manage().window().maximize();	
	  
	  NewTest objlogin=PageFactory.initElements(driver,NewTest.class);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  objlogin.enteruser("Teammanager.demo2@evalueserve.com");
	  Thread.sleep(2000);
	  objlogin.enterpswd("Evs1234$");
	  objlogin.log();
	  objlogin.OpenKnow();
	  objlogin.Feed_back();
	  objlogin.Know_Repo();
	  objlogin.New_Request();
	 							
	}}







