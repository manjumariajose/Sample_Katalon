package com.manju.ea.common

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

import internal.GlobalVariable

public class Personal_Details {
	@Keyword
	def static void userForm(String title,String initial,String firstName,String middleName ){
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Details/Page_Execute Automation/select_SelectMrMs'), title, true)
		WebUI.setText(findTestObject('Object Repository/Details/Page_Execute Automation/input_Initial_Initial'), initial)
		WebUI.setText(findTestObject('Object Repository/Details/Page_Execute Automation/input__FirstName'), firstName)
		WebUI.setText(findTestObject('Object Repository/Details/Page_Execute Automation/input_Middle Name_MiddleName'), middleName)
		//WebUI.click(language)
		//WebUI.click(findTestObject('Object Repository/Details/input_EnglishHindi_english'),"English")
		//WebUI.click(findTestObject('Object Repository/Details/input_EnglishHindi_Hindi'),"Hindi")
		WebUI.click(findTestObject('Object Repository/Details/input_EnglishHindi_Save'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/Details/Page_Execute Automation/input_Click for Generating JavaScript Alert_generate'))
		WebUI.delay(4)
		WebUI.acceptAlert()
		WebUI.delay(4)
		WebUI.acceptAlert()

	}
}
