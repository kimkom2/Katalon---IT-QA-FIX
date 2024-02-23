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

WebUI.click(findTestObject('Page_New Confins - Main/Klik add untuk New App Multiguna jasa'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Product Offering'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/Klik untuk input_Product Offering Name'), 'INVESTASI MOTORCYCLE DIRECT')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik SEARCH'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Select Product offering name'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Num Of Collateral'), '1')

WebUI.click(findTestObject('Page_New Confins - Main/Klik Next NAP MULTIGUNA JASA'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Customer Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Customer Name'), 'HO HENDY')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik SEARCH untuk cutomer name'))

WebUI.click(findTestObject('Page_New Confins - Main/Select Customer name'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont tab customer'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont tab Guarantor'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont Referantor'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Prospect No'), '601RC202102000090')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Tenor'), '36')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/td_Fixed Rate'))

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Payment Frequency'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Installment Scheme'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Marketing Officer'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/App Source'), '6', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/WOP'), '8', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Customer Notification By'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Copy Address From'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Button Copy Address'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Customer Address Distance'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont APP Data'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_NEW CONFINS LOGIN PAGE/Page_New Confins - Main/Klik Add Loan DATA'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Select Loan Object (1)'), '5', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Disburse To'))

WebUI.setText(findTestObject('Page_New Confins - Main/input_Supplier Branch Name'), 'ANDI MOTOR, UD')

WebUI.click(findTestObject('Page_New Confins - Main/Klik SEARCH Supplier branch name'))

WebUI.click(findTestObject('Page_New Confins - Main/Select Supplier Branch Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/input_Input Bank Account YES'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Bank Name'))

WebUI.setText(findTestObject('Page_New Confins - Main/input_Bank Name BANK BCA'), 'BANK BCA')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SEARCH BANK NAME'))

WebUI.click(findTestObject('Page_New Confins - Main/Select BANK NAME (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_NEW CONFINS LOGIN PAGE/Page_New Confins - Main/input_Bank Branch Loan Data'), 'JAKARTA')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Bank Branch BI Code Loan Data'), '1234')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Account Name Loan Data'), 'RICARD SIMANJUNTAK')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Account No Loan Data'), '1660104622')

WebUI.doubleClick(findTestObject('Page_NEW CONFINS LOGIN PAGE/Page_New Confins - Main/input_Budget Plan Amount Loan Data'))

WebUI.sendKeys(findTestObject('Page_NEW CONFINS LOGIN PAGE/Page_New Confins - Main/input_Budget Plan Amount Loan Data'), 
    '50000000')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/input_Financing Amount Loan Data'))

WebUI.doubleClick(findTestObject('Page_NEW CONFINS LOGIN PAGE/Page_New Confins - Main/input_Financing Amount Loan Data'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Page_NEW CONFINS LOGIN PAGE/Page_New Confins - Main/input_Financing Amount Loan Data'), '25000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/Notes'), 'test')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/input_-_lb_Form_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont Loan Data (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Add Collacteral Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Klik Collacteral Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Asset Name Collacteral Data'), 'HONDA ALL NEW BRIO E CVT')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SEARCH Collacteral Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Select Collacteral Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_Manufacturing Year Collacteral Data'), '2020')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/input_Collateral Price'), FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Page_New Confins - Main/input_Collateral Price'))

WebUI.sendKeys(findTestObject('Page_New Confins - Main/input_Collateral Price'), '50000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/Notes Collacteral data'), 'TEST')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_SERIAL NO'), 'ABC12345DEXX')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_NO. MESIN'), 'XXX4321ZZZXX')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_License Plate No'), 'B 4321 XZX')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/input_Bpkb City'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/input_City Name'), 'Surabaya, Kota.')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SEARCH City'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Select City'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Select Asset Usage'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/Color'), 'BLACK')

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Save Collacteral Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Collacteral Registration'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/input_Self Usage_cbSelfUsage'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_New Confins - Main/Input Tax Date'), '02/02/2021')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_New Confins - Main/FREE TEXT - TEST'), 'TEST')

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Address Coll Data'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Copy Address Coll Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/input BPKB'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Page_New Confins - Main/input DocNo'), FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Page_New Confins - Main/input DocNo'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Page_New Confins - Main/input DocNo'), 'DC 01')

WebUI.delay(3)

WebUI.click(findTestObject('Page_New Confins - Main/Save COLLDATA'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont Collacteral Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/input Insurance Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Select Insco Branch Name'), '3', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Select Rate Type'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Select Main Coverage Type Name'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Next Insurance Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Page_New Confins - Main/Calculate Friday Insurance Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Page_New Confins - Main/Save Friday Insurance Data (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Next insData'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont InsData'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont InsData 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Calculate Friday'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Save Friday Insurance Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Next Friday Insurance Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont Friday Insurance Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont Friday Life Insurance'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/CalculateFees Friday Financial Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_New Confins - Main/Select Rate FridayFinancial Data'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Page_New Confins - Main/Input Rate Friday Financial Data'), '50', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Page_New Confins - Main/Calculate Amortization Friday Financial Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Page_New Confins - Main/SaveCont Friday Financial Data'), FailureHandling.STOP_ON_FAILURE)

