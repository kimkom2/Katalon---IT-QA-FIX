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

WebUI.click(findTestObject('Perbaikan Asuransi Life/Page_New Confins - Main/a_Life Insurance Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan Asuransi Life/Page_New Confins - Main/Clik life'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Asuransi Life/Page_New Confins - Main/Customer Insured'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Perbaikan Asuransi Life/Page_New Confins - Main/Life Insco'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Perbaikan Asuransi Life/Page_New Confins - Main/Payment method'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Perbaikan Asuransi Life/Page_New Confins - Main/SaveCont_life'))

