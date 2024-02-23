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

WebUI.openBrowser('http://172.16.26.81/CONFINS_TRAIN/Main.aspx')

'User Credit Analyst'
WebUI.setText(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/1. Input User Name'), '37500914')

WebUI.setEncryptedText(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/2. Input Password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/3. Button Log In'))

WebUI.delay(3)

WebUI.click(findTestObject('Approval KTA/Page_NEW CONFINS LOGIN PAGE/Select Role Credit Analyst'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/5. Main Menu'))

WebUI.selectOptionByValue(findTestObject('New APP KTA/Page_New Confins - Main/6. Sub Menu'), '109', true)

WebUI.click(findTestObject('Approval KTA/Page_New Confins - Main/7. Credit Approval'))

WebUI.delay(2)

'Cek skenario Flow Normal no 37 & Negative flow no 2'
WebUI.setText(findTestObject('Approval KTA/Page_New Confins - Main/8. Input Application No - Approval'), '501APP2021020000IR1')

WebUI.click(findTestObject('Approval KTA/Page_New Confins - Main/9. Button Search Approval'))

WebUI.delay(2)

WebUI.click(findTestObject('Approval KTA/Page_New Confins - Main/10. Process - Approval'))

'Cek skenario Flow Normal no 38 & Negative Flow no 3 dan 4'
WebUI.selectOptionByIndex(findTestObject('Approval KTA/Page_New Confins - Main/11. Action Approval'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Approval KTA/Page_New Confins - Main/12. Notes - Approval'), 'TEST')

WebUI.click(findTestObject('Approval KTA/Page_New Confins - Main/13. Submit - Approval'))

