import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownIfError
import com.kms.katalon.core.annotation.TearDownIfFailed
import com.kms.katalon.core.annotation.TearDownIfPassed
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.sun.jna.platform.win32.SetupApi
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys




@SetUp
void setupCase(){
	WebUI.openBrowser('https://www.shiksha.com')
	
}
//WebUI.openBrowser('https://www.shiksha.com')

WebUI.click(findTestObject('Login/Page_Login/a_Login'))

WebUI.setText(findTestObject('Login/Page_Login/input_email'), 'anuraggambhir58@yahoo.com')

WebUI.setText(findTestObject('Login/Page_Login/input_password'), 'anurag881')

WebUI.click(findTestObject('Login/Page_Login/a_Submit'))

WebUI.click(findTestObject('Login/Page_Login/div_Email addressPlease enter'))

@TearDown
void tearDownCase(){
	WebUI.closeBrowser()
	
}

@TearDownIfFailed
void tearDownifFailed(){
	System.out.println("Failed")
}


@TearDownIfPassed
void tearDownifPassed(){
	
	System.out.println("Passed")
}

@TearDownIfError
void tearDownifError(){
	
	println "Error"
}

