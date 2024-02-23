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

WebUI.click(findTestObject('Application data/8 Add APPNO'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/9 CARI'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Application data/10 input_Product Offering'), 'INHENRP01')

WebUI.delay(2)

WebUI.click(findTestObject('Application data/11 SEARCH Product offering'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/12 Select Product offering'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Application data/13 input_Num asset'), '3')

WebUI.delay(2)

WebUI.click(findTestObject('Application data/14 Next App_no'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/15 CARI Customer Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Application data/16 input_Customer Name'), 'Ho Hendy')

WebUI.click(findTestObject('Application data/17 SEARCH Customer Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/18 Select Customer name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/19 SaveCont customer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/20 SaveCont guarantor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/21 SaveCont Referantor'), FailureHandling.CONTINUE_ON_FAILURE)

