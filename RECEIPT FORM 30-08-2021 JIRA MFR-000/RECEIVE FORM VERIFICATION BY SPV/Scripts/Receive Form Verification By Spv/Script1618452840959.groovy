import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://172.16.26.81/CONFINS_TRAIN/HTML5Login.aspx')

WebUI.setText(findTestObject('Page_NEW CONFINS LOGIN PAGE/1 Username'), '43730712')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Page_NEW CONFINS LOGIN PAGE/2 Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.delay(2)

WebUI.click(findTestObject('Page_NEW CONFINS LOGIN PAGE/3 Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_NEW CONFINS LOGIN PAGE/4 Select ROLE BOS'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/5 Menu Confins'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_New Confins - Main/6 Menu Gede'), '80', true)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/7 Menu Receipt Form'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/8 Receipt Form Verification By Spv'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_New Confins - Main/9 Office Source'), '1', true)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/10 Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/11 Klik Action Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/12 Count Receive'), '100')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/13 Submit'), FailureHandling.STOP_ON_FAILURE)

