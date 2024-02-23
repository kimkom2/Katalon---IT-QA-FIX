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

'Cek skenario Flow normal no 19 & Negative flow no 2'
WebUI.setText(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/1. Input Application Number'), 
    '501APP20210400021')

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/2 Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/3 Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan insurance life/Page_New Confins - Main/7 Life Insurance Data'))

WebUI.delay(6)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/44. Cover Life Insurance'))

'Cek skenario Flow normal no 20'
WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/45. Life Insco Branch Name'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/46. Customer Insured'))

'Cek skenario Flow normal no 21'
WebUI.selectOptionByValue(findTestObject('New APP KTA/Page_New Confins - Main/47. Premium Payment Method'), 'FO', true)

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/48. Button SaveContinue Life Insurance'))

