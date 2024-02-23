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

'Cek Skenario Flow Normal no 12 & Negative flow no 2'
WebUI.setText(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/1. Input Application Number'), 
    '501APP20210400023')

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/2 Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application/Page_New Confins - Main/3. Button Action'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Loan data spliting/Page_New Confins - Main/5 Loan Data'))

WebUI.delay(6)

WebUI.delay(4)

'Cek skenario Flow Normal no 13'
WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/33. Loan Object'), '5', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/34. Bank Name Loan Data'))

'Cek Skenario Flow Normal no 14'
WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/35. Input Bank Name'), 'BANK BCA')

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/36. Button Search Bank Name'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/37. Select Bank Name'))

'Cek Skenario Flow Normal no 15'
WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/38. Input Bank Branch'), 'JAKARTA')

'Cek Skenario Flow normal no 16'
WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/39. Input Account Name'), 'INTANI TEST')

'Cek skenario Flow normal no 17'
WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/40. Input Account No'), '12762818278728')

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/41. Input Financing Amount'))

WebUI.doubleClick(findTestObject('New APP KTA/Page_New Confins - Main/41. Input Financing Amount'))

'Cek Skenario Flow Normal no 18'
WebUI.sendKeys(findTestObject('New APP KTA/Page_New Confins - Main/41. Input Financing Amount'), '1000000')

WebUI.delay(2)

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/42. Input Notes'), 'TEST')

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/43. Button SaveCountinue Loan Data'))

