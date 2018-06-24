import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.TearDownIfFailed
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.shiksha.com/')

WebUI.click(findTestObject('Registration/Page_Registration/a_Sign Up'))

WebUI.click(findTestObject('Registration/Page_Registration/div_Education_Stream'))

WebUI.click(findTestObject('Registration/Page_Registration/span_Engineering'))

WebUI.click(findTestObject('Registration/Page_Registration/div_Course_Type'))

WebUI.click(findTestObject('Registration/Page_Registration/label_BE_BTech'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Registration/a_Course_Done'))

WebUI.click(findTestObject('Registration/Page_Registration/div_Education_Type'))

WebUI.click(findTestObject('Registration/Page_Registration/label_Full_Time_Course'))

WebUI.click(findTestObject('Registration/Page_Registration/a_Done'))

WebUI.click(findTestObject('Registration/Page_Registration/a_Next'))

WebUI.setText(findTestObject('Registration/Page_Registration/input_email'), 'anuraggambhir58@yahoo.com')

//WebUI.setText(findTestObject('Registration/Page_Registration/input_password'), 'anurag881')

WebUI.setText(findTestObject('Registration/Page_Registration/input_firstName'), 'anurag')

WebUI.setText(findTestObject('Registration/Page_Registration/input_lastName'), 'gambhir')

WebUI.setText(findTestObject('Registration/Page_Registration/input_mobile'), '9899920881')

WebUI.click(findTestObject('Registration/Page_Registration/div_residenceCityLocality_inpu'))

WebUI.setText(findTestObject('Registration/Page_Registration/input_ssLayerSch'), 'noida')

WebUI.click(findTestObject('Registration/Page_Registration/span_Noida'))

WebUI.click(findTestObject('Registration/Page_Registration/a_Sign Up'))

WebUI.click(findTestObject('Registration/Page_Registration/a_Verify'))

WebUI.closeBrowser()

@TearDownIfFailed
void tearDownifFailed(){
	String path = WebUI.takeScreenshot()
	println path
}

