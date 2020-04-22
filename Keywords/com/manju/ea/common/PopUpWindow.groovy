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

public class PopUpWindow {
	@Keyword
	def static void popupWindowDetails (String title,String initial,String firstName,String middleName,String lastName,String country){
	WebUI.click(findTestObject('Object Repository/popup/a_HtmlPopup'))
	WebUI.switchToWindowIndex(1)
	WebUI.maximizeWindow()
	WebUI.delay(4)
	WebUI.selectOptionByLabel(findTestObject('Object Repository/popup/select_SelectMrMs'), title, true)
	WebUI.setText(findTestObject('Object Repository/popup/input_Initial_Initial'),initial)
	WebUI.setText(findTestObject('Object Repository/popup/input__FirstName'),firstName)
	WebUI.setText(findTestObject('Object Repository/popup/input_Middle Name_MiddleName'),middleName)
	WebUI.setText(findTestObject('Object Repository/popup/input__LastName'),lastName)
	WebUI.selectOptionByLabel(findTestObject('Object Repository/popup/select_SelectIndiaUSASingaporeUK'), country, true)
	WebUI.click(findTestObject('Object Repository/popup/input_Country_Save'))
}
}