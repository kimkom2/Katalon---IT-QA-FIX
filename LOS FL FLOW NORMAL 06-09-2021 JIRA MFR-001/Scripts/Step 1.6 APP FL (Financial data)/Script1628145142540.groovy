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

WebUI.openBrowser('http://172.16.26.81/CONFINS_Train/Main.aspx')

WebUI.setText(findTestObject('Application data/1 NRK'), '67420314')

WebUI.setEncryptedText(findTestObject('Application data/2 Pass'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('Application data/3 Login'))

WebUI.click(findTestObject('Application data/4 role'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/5 Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Application data/6 LOS 109'), '109', true)

WebUI.click(findTestObject('Application data/7 New App Financial Lease'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.delay(2)

WebUI.setText(findTestObject('Perbaikan Application data/Page_New Confins - Main/1 Application Number'), '558APP20210400017')

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data/Page_New Confins - Main/2 Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data/Page_New Confins - Main/3 Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data/Page_New Confins - Main/4 Referantor Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan Financial data/Page_New Confins - Main/14 Financial Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Application data/70 Cal'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/71 Rate'), FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Application data/71 Rate'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Application data/71 Rate'), '50')

WebUI.delay(2)

WebUI.click(findTestObject('Application data/72 Cal installment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Application data/73 SaveCont Financial'), 4)

WebUI.click(findTestObject('Application data/73 SaveCont Financial'), FailureHandling.STOP_ON_FAILURE)

