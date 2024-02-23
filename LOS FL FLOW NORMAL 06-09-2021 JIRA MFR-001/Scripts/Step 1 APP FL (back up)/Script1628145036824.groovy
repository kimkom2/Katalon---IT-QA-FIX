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

WebUI.click(findTestObject('Application data/11 SEARCH Product offering'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/12 Select Product offering'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Application data/13 input_Num asset'), '1')

WebUI.click(findTestObject('Application data/14 Next App_no'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/15 CARI Customer Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Application data/16 input_Customer Name'), 'Ho Hendy')

WebUI.click(findTestObject('Application data/17 SEARCH Customer Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/18 Select Customer name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/19 SaveCont customer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/20 SaveCont guarantor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/21 SaveCont Referantor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Application data/22 input_Prospect No'), '558HO20210200020')

WebUI.delay(2)

WebUI.setText(findTestObject('Application data/23 Tenor'), '24')

WebUI.delay(2)

WebUI.click(findTestObject('Application data/24 payment frequency'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Application data/24 payment frequency'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/25 interest type'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Application data/25 interest type'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Application data/26 installment scheme'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Application data/27 Marketing officer'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Application data/28 Application source'), 'X', true)

WebUI.selectOptionByIndex(findTestObject('Application data/29 Way of payment'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Application data/30 customer notification by'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Application data/31 Address'), '1', true)

WebUI.click(findTestObject('Application data/32 Copy Address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Application data/33 cust address distance'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/34 SaveCont Application data'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/35 Add Asset data'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/36 Cari supplier'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Application data/37 input_Supplier Branch'), 'MAJU UTAMA AUTO, PT')

WebUI.click(findTestObject('Application data/38 SEARCH Supplier'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/39 Select Supplier'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Application data/40 sales person name'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/41 Cari asset name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Application data/42 input_Asset Name'), 'Caterpillar Excavator 304E CR')

WebUI.click(findTestObject('Application data/43 SEARCH Asset name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/44 Select Asset Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/45 Year'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Application data/45 Year'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Application data/45 Year'), '2020')

WebUI.delay(2)

WebUI.click(findTestObject('Application data/46 VAT'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Application data/46 VAT'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Application data/46 VAT'), '100000000')

WebUI.delay(2)

WebUI.click(findTestObject('Application data/47 DP'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Application data/47 DP'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Application data/47 DP'), '30000000')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Application data/48 Asset usage'), 'C', true)

WebUI.setText(findTestObject('Application data/49 color'), 'HITAM')

WebUI.selectOptionByValue(findTestObject('Application data/50 Wilayah'), 'OTHER', true)

WebUI.click(findTestObject('Application data/51 Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/52 asset reg'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/53 self usage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Application data/54 Address'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/55 Copy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/56 Save Asset reg'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/57 SaveCont Asset data'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/58 Edit asuransi'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Application data/59 Insco'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Application data/60 Rate Type'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Application data/61 TLO ARK'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/74 Next Insurance TLO ARK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/63 Calculate Asuransi'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Application data/76 Cancel_lbSave'), 3)

WebUI.click(findTestObject('Application data/76 Cancel_lbSave'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Application data/75 Next insurance data'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Application data/64SaveCont Asuransi'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/65 Life insurance'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Application data/66 Inso life'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/67 Customer cek'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Application data/68 Payment method'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/69 SaveCont Life insurance'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

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

