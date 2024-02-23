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

'User Credit Admin - Employee Loan'
WebUI.setText(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/1. Input User Name'), '32610918')

WebUI.setEncryptedText(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/2. Input Password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/3. Button Log In'))

WebUI.delay(3)

WebUI.click(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/4. Select Role CA Employee Loan'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/5. Main Menu'))

WebUI.selectOptionByValue(findTestObject('New APP KTA/Page_New Confins - Main/6. Sub Menu'), '109', true)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/7. New App KTA'))

WebUI.delay(3)

'Cek Skenario Flow normal no 2 & Negative Flow no 2'
WebUI.setText(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/1. Input Application Number'), 
    '501APP20210400023')

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/2 Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application/Page_New Confins - Main/3. Button Action'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/4 Referantor Data'))

WebUI.delay(6)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/5 Application Data'))

WebUI.delay(6)

'Check Skenario Flow Normal No 3 & Negative Flow No 1'
WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/20. Input Prospect No'), '501APP20210400023', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/21. Input Tenor'), '24')

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/22. td_Number Of Installment'))

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/23. Payment Frequency KTA'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/24. td_Fixed Rate'))

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/25. Marketing Officer'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/26. Application Source'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/27. Way Of Payment'), '8', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/28. Customer Notification By'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/29. Copy Address From'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/30. Button Copy Address'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('New APP KTA/Page_New Confins - Main/31. Customer Address Distance'), 'RANGE2', 
    true)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/32. Button SaveContinue Application Data'))

