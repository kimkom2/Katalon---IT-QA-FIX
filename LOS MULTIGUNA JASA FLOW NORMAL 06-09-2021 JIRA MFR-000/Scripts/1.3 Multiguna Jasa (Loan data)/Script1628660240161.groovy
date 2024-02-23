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

WebUI.delay(3)

WebUI.delay(2)

WebUI.setText(findTestObject('Perbaikan application data spliting/Page_New Confins - Main/1.1 Application Number_ucSearchtxtAppNo_ltlAppAppNoSearch'), 
    '601APP20210400134')

WebUI.click(findTestObject('Perbaikan application data spliting/Page_New Confins - Main/1.2 Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan application data spliting/Page_New Confins - Main/1.3 Edit'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan application data spliting/Page_New Confins - Main/1 Referantor Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan loan data spliting/Page_New Confins - Main/a_Loan Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan loan data spliting/Page_New Confins - Main/Edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan loan data spliting/Page_New Confins - Main/4 Add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Select Loan Object (1)'), '5', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Disburse To'))

WebUI.setText(findTestObject('Page_New Confins - Main/input_Supplier Branch Name'), 'ANDI MOTOR, UD')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik SEARCH Supplier branch name'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Select Supplier Branch Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/input_Input Bank Account YES'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Bank Name'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Bank Name BANK BCA'), 'BANK BCA')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SEARCH BANK NAME'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Select BANK NAME (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.setText(findTestObject('Perbaikan loan data spliting/Page_New Confins - Main/Bank_branch'), 'JAKARTA')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Bank Branch BI Code Loan Data'), '1234')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Account Name Loan Data'), 'RICARD SIMANJUNTAK')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Account No Loan Data'), '1660104622')

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Perbaikan loan data spliting/Page_New Confins - Main/Budget Plan Amount'))

WebUI.sendKeys(findTestObject('Perbaikan loan data spliting/Page_New Confins - Main/Budget Plan Amount'), '50000000')

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan loan data spliting/Page_New Confins - Main/Financing Amount'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Perbaikan loan data spliting/Page_New Confins - Main/Financing Amount'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Perbaikan loan data spliting/Page_New Confins - Main/Financing Amount'), '25000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/Notes'), 'test')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/input_-_lb_Form_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont Loan Data (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

