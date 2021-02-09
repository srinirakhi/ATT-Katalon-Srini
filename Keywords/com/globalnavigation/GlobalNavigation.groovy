package com.globalnavigation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testobject.ConditionType

import internal.GlobalVariable

//Creating custom keyword for getting all global nav menu option xpath

public class GlobalNavigation {
	
	//Getting xpath of global nav menu item runtime
	private String getGlobalnavItemXpath(String GlobalnavmenuName) {
		return ".//*[@id='HEADBAND0']//a/span[text()='" + GlobalnavmenuName + "']"
		
	}
	
	//Creating Test Object runtime
	
	private TestObject getGlobalnavMenuTestObject(String GlobalnavmenuName) {
		
		TestObject GlobalnavMenuItem = new TestObject(GlobalnavmenuName);
		GlobalnavMenuItem.addProperty("xpath", ConditionType.EQUALS, getGlobalnavItemXpath(GlobalnavmenuName), true);
		return GlobalnavMenuItem
		
	}
	
	//Verify if element present on the webpage
	@Keyword
	public void checkGlobalnavMenuItemPresent(String GlobalnavmenuName) {
		TestObject GlobalnavMenuItem = getGlobalnavMenuTestObject(GlobalnavmenuName)
		//WebUI.waitForElementVisible(GlobalnavMenuItem, GlobalVariable.TimeOut)
		WebUI.verifyElementPresent(GlobalnavMenuItem, GlobalVariable.DelayTime)
		
	}
	
	
	
}
