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

WebUI.setText(findTestObject('Page_NEW CONFINS LOGIN PAGE/Username'), '18820817')

WebUI.setEncryptedText(findTestObject('Page_NEW CONFINS LOGIN PAGE/Password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('Page_NEW CONFINS LOGIN PAGE/Login'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_NEW CONFINS LOGIN PAGE/Select ROLE SURABAYA 2 CREDIT ADMIN'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Menu Confins'))

WebUI.selectOptionByValue(findTestObject('Page_New Confins - Main/Menu Gede'), '109', true)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Menu New App Multiguna Jasa'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik add untuk New App Multiguna jasa'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Product Offering'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/Klik untuk input_Product Offering Name'), 'INVESTASI MOTORCYCLE DIRECT')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik SEARCH'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Select Product offering name'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Num Of Collateral'), '1')

WebUI.click(findTestObject('Page_New Confins - Main/Klik Next NAP MULTIGUNA JASA'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Customer Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Customer Name'), 'HO HENDY')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik SEARCH untuk cutomer name'))

WebUI.click(findTestObject('Page_New Confins - Main/Select Customer name'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont tab customer'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont tab Guarantor'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont Referantor'))

