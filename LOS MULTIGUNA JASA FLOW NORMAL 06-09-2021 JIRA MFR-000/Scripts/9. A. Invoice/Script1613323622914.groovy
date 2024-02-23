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

WebUI.scrollToElement(findTestObject('Page_New Confins - Main/Menu Invoice'), 0)

WebUI.click(findTestObject('Page_New Confins - Main/Menu Invoice'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/Input APP number Invoice'), '601RC202102000090')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Search APP num Invoice'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Action Invoice'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Select Currency Code Invoice'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/Input APP num invoice 2'), '601RC202102000090')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Search APP num Invoice 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Ceklis Invoice'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Add To Temp Invoice'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Next Invoice'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/Invoice Number'), 'RC1996')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/Invoice Date'), '10/02/2020')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Save Invoice'))

