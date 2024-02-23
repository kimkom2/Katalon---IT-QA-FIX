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

WebUI.openBrowser('http://172.16.26.81/CONFINS_TRAIN/HTML5LOGIN.ASPX')

WebUI.delay(3)

'Input user yang memiliki role sebagai admin credit'
WebUI.setText(findTestObject('Form Login/field username'), '52081212')

WebUI.setEncryptedText(findTestObject('Form Login/field password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('Form Login/button login'))

WebUI.delay(3)

WebUI.click(findTestObject('Form Login/Select role user 52081212'))

WebUI.click(findTestObject('Komponen form Add Aplikasi/menu confins'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen form Add Aplikasi/select menu gede'), '109', true)

WebUI.delay(2)

WebUI.click(findTestObject('Komponen form Add Aplikasi/menu new app car'))

WebUI.delay(3)

WebUI.click(findTestObject('Komponen form Add Aplikasi/button add'))

WebUI.delay(3)

WebUI.click(findTestObject('Input Product Offering/Kaca pembesar product offering'))

WebUI.delay(3)

WebUI.setText(findTestObject('Input Product Offering/Input Product Offering Code'), 'MGIPNCP00')

WebUI.click(findTestObject('Input Product Offering/Search Product Offering'))

WebUI.click(findTestObject('Input Product Offering/Select Input Product MGIPNCP00'))

WebUI.delay(3)

WebUI.setText(findTestObject('Input Product Offering/Page_New Confins - Main/Input asset new'), '1')

WebUI.click(findTestObject('Input Product Offering/Button Next Input Aplikasi'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Customer/kaca pembesar customer'))

WebUI.setText(findTestObject('Tab Customer/Input Customer Name'), 'HO HENDY')

WebUI.click(findTestObject('Tab Customer/Button Search nama customer'))

WebUI.click(findTestObject('Tab Customer/Select Customer'))

WebUI.click(findTestObject('Tab Customer/Button Save Continue'))

WebUI.delay(5)

WebUI.click(findTestObject('Tab Guarantor/Save Continue Guarantor'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Referantor/Save Continue Referantor'))

WebUI.delay(3)

'Diganti secara sequence tiap running ulang'
WebUI.setText(findTestObject('Tab Application Data/Input no prospect'), '536APP2021010080K')

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Tab Application Data/input tenor'))

WebUI.sendKeys(findTestObject('Tab Application Data/input tenor'), '36')

WebUI.delay(2)

WebUI.click(findTestObject('Tab Application Data/Tab Application Data/Tab Application Data/payment frequence new'))

WebUI.selectOptionByIndex(findTestObject('Tab Application Data/Tab Application Data/Tab Application Data/payment frequence new'), 
    '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Tab Application Data/Select Interest Type'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Tab Application Data/Select Installment Scheme'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Tab Application Data/Select Marketing Officer'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Tab Application Data/Select Application Source'), 'V', true)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Tab Application Data/Select Way Of Payment'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Tab Application Data/Select Notification By'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Tab Application Data/Copy Address From'), '1', true)

WebUI.click(findTestObject('Tab Application Data/Button Copy Address'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Tab Application Data/Select Cust Address Distance'), 'RANGE2', true)

WebUI.click(findTestObject('Tab Application Data/Button Save Continue'))

WebUI.delay(8)

WebUI.click(findTestObject('Tab Asset Data/Tab Asset Data/Tab Asset Data/Button Add Asset Data'))

WebUI.delay(2)

WebUI.click(findTestObject('Tab Asset Data/Kaca Pembesar Supp Branch Name'))

'Input Supp Branch yang akan digunakan'
WebUI.setText(findTestObject('Tab Asset Data/Input Supplier Branch Name'), '3N MOBILINDO - SERPONG')

WebUI.click(findTestObject('Tab Asset Data/Button Search'))

'Pilih supp branch yang disearch'
WebUI.click(findTestObject('Tab Asset Data/Tab Asset Data/Select 3N MOBILINDO'))

WebUI.delay(3)

'Pilih sales sesuai kebutuhan'
WebUI.selectOptionByIndex(findTestObject('Tab Asset Data/Select Sales Person Name'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Tab Asset Data/Kaca Pembesar Asset Name'))

WebUI.delay(2)

WebUI.setText(findTestObject('Tab Asset Data/Input Asset Name'), 'HONDA ALL NEW BRIO E CVT')

WebUI.click(findTestObject('Tab Asset Data/Tab Asset Data new/Search Asset Name new'))

WebUI.delay(2)

WebUI.click(findTestObject('Tab Asset Data/Select HONDA ALL NEW BRIO E CVT'))

WebUI.delay(5)

WebUI.setText(findTestObject('Tab Asset Data/Input Manufacturing Year'), '2020')

WebUI.delay(5)

WebUI.click(findTestObject('Tab Asset Data/Input Asset Price ( Include VAT )'))

WebUI.doubleClick(findTestObject('Tab Asset Data/Input Asset Price ( Include VAT )'))

WebUI.sendKeys(findTestObject('Tab Asset Data/Input Asset Price ( Include VAT )'), '300000000')

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Tab Asset Data/Input Down Payment'))

WebUI.sendKeys(findTestObject('Tab Asset Data/Input Down Payment'), '70000000')

WebUI.selectOptionByValue(findTestObject('Tab Asset Data/Select Asset Usage'), 'N', true)

WebUI.setText(findTestObject('Tab Asset Data/Input Color'), 'RED')

WebUI.selectOptionByValue(findTestObject('Tab Asset Data/Select Wilayah Asset'), 'REGION 2', true)

WebUI.click(findTestObject('Tab Asset Data/Button Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Tab Asset Data/Asset Registration'))

WebUI.delay(2)

WebUI.click(findTestObject('Tab Asset Data/Self Usage'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Tab Asset Data/Select Asset Location'), 'LEGAL', true)

WebUI.delay(2)

WebUI.click(findTestObject('Tab Asset Data/Copy Address Asset Location'))

WebUI.delay(2)

WebUI.click(findTestObject('Tab Asset Data/Button Save Asset Data'))

WebUI.delay(5)

WebUI.click(findTestObject('Tab Asset Data/Button Save Continue'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Insurance Data/Edit Insurance Data'))

WebUI.selectOptionByIndex(findTestObject('Tab Insurance Data/Select Insco Branch Name'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Tab Insurance Data/Select Rate Type'), 'NG', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Tab Insurance Data/Select Main Coverage Type Name'), 'ARK', false)

WebUI.delay(5)

WebUI.click(findTestObject('Tab Insurance Data/Next Asset Registration'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Insurance Data/Calculate Insurane Data'))

WebUI.delay(10)

WebUI.click(findTestObject('Tab Insurance Data/Save Insurance Data'))

WebUI.delay(10)

WebUI.click(findTestObject('Tab Insurance Data/Button Next Insurance Data'))

WebUI.delay(2)

WebUI.click(findTestObject('Tab Insurance Data/Save Continue Insurance Data'))

WebUI.delay(5)

WebUI.click(findTestObject('Tab Life Insurance Data/Ceklis Cover Life Insurance'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Tab Life Insurance Data/Select Life Insco Branch Name'), '922', true)

WebUI.delay(3)

WebUI.click(findTestObject('Tab Life Insurance Data/Ceklis Customer Insured'))

WebUI.selectOptionByValue(findTestObject('Tab Life Insurance Data/Select Premium Payment Method'), 'FO', true)

WebUI.delay(3)

WebUI.click(findTestObject('Tab Life Insurance Data/Button Save Continue'))

WebUI.delay(4)

WebUI.click(findTestObject('Tab Financial Data/Button Calculate Fees'))

WebUI.delay(4)

WebUI.click(findTestObject('Tab Financial Data/Button optional Fiducia Option'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Tab Financial Data/Input Effective Rate'))

WebUI.sendKeys(findTestObject('Tab Financial Data/Input Effective Rate'), '50')

WebUI.click(findTestObject('Tab Financial Data/Button Calculate Installment'))

WebUI.delay(10)

WebUI.click(findTestObject('Tab Financial Data/Button Recalculate Effective Rate'))

WebUI.delay(10)

WebUI.click(findTestObject('Tab Financial Data/Button Calculate Subsidy'))

WebUI.delay(5)

WebUI.click(findTestObject('Tab Financial Data/Button Save Continue'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Tab Commision/Input Commision Amount Supp Branch'))

WebUI.sendKeys(findTestObject('Tab Commision/Input Commision Amount Supp Branch'), '200000')

WebUI.doubleClick(findTestObject('Tab Commision/Input Commision Amount Supp branch Employee'))

WebUI.sendKeys(findTestObject('Tab Commision/Input Commision Amount Supp branch Employee'), '100000')

WebUI.delay(5)

WebUI.click(findTestObject('Tab Commision/Button Calculate new'))

WebUI.delay(2)

WebUI.click(findTestObject('Tab Commision/Save Continue Commision Data'))

WebUI.delay(5)

WebUI.setText(findTestObject('Tab Other Data/Input text area Purpose'), 'Test Purpose')

WebUI.setText(findTestObject('Tab Other Data/Input text area Asset Financed'), 'Test Asset Financed')

WebUI.setText(findTestObject('Tab Other Data/Input text area Source Of Income'), 'Test Source Of Income')

WebUI.setText(findTestObject('Tab Other Data/Input text area Ticket Number'), 'Test Ticket Number')

WebUI.setText(findTestObject('Tab Other Data/Input text area Reference'), 'Test Reference')

WebUI.click(findTestObject('Tab Other Data/Button Save and Continue'))

WebUI.delay(5)

WebUI.click(findTestObject('Tab Term and Condition/1'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/2'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/3'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/4'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/5'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/6'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/7'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/8'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/9'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/10'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/11'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/12'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/13'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/14'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/15'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/16'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/17'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/18'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/19'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/20'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/21'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/22'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/23'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/24'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/25'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/26'))

