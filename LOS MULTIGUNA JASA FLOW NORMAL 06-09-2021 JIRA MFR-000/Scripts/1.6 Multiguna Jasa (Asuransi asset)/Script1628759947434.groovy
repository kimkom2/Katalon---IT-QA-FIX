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

WebUI.setText(findTestObject('Perbaikan application data spliting/Page_New Confins - Main/1.1 Application Number_ucSearchtxtAppNo_ltlAppAppNoSearch'), 
    '601APP20210400133')

WebUI.click(findTestObject('Perbaikan application data spliting/Page_New Confins - Main/1.2 Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan application data spliting/Page_New Confins - Main/1.3 Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan application data spliting/Page_New Confins - Main/1 Referantor Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan asuransi asset spliting/Page_New Confins - Main/a_Insurance Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Page_New Confins - Main/input Insurance Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Select Insco Branch Name'), '3', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Select Rate Type'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Select Main Coverage Type Name'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Page_New Confins - Main/Next Insurance Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(25)

WebUI.click(findTestObject('Page_New Confins - Main/Calculate Friday Insurance Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(35)

WebUI.scrollToElement(findTestObject('Perbaikan asuransi asset spliting/Page_New Confins - Main/Save'), 9)

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan asuransi asset spliting/Page_New Confins - Main/Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(25)

WebUI.click(findTestObject('Page_New Confins - Main/Next insData'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont InsData'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

