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

WebUI.setText(findTestObject('Perbaikan Application data/Page_New Confins - Main/1 Application Number'), '558APP20211000002')

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data/Page_New Confins - Main/2 Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data/Page_New Confins - Main/3 Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data/Page_New Confins - Main/4 Referantor Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan Asset data/Page_New Confins - Main/6 Asset Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Application data/35 Add Asset data'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Asset data/Page_New Confins - Main/9 Edit2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/36 Cari supplier'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Application data/37 input_Supplier Branch'), 'MAJU UTAMA AUTO, PT')

WebUI.click(findTestObject('Application data/38 SEARCH Supplier'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/39 Select Supplier'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Application data/40 sales person name'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/41 Cari asset name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Application data/42 input_Asset Name'), 'CATERPILLAR BULLDOZER D3C BUILT UP')

WebUI.click(findTestObject('Application data/43 SEARCH Asset name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/44 Select Asset Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/45 Year'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Application data/45 Year'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Application data/45 Year'), '2020')

WebUI.delay(2)

WebUI.click(findTestObject('Application data/46 VAT'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Application data/46 VAT'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Application data/46 VAT'), '100000000')

WebUI.delay(2)

WebUI.click(findTestObject('Application data/47 DP'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Application data/47 DP'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Application data/47 DP'), '30000000')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Application data/48 Asset usage'), 'C', true)

WebUI.delay(2)

WebUI.setText(findTestObject('Application data/49 color'), 'HITAM')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Application data/50 Wilayah'), 'OTHER', true)

WebUI.click(findTestObject('Application data/51 Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Asset data/Page_New Confins - Main/10 Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Application data/52 asset reg'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Application data/53 self usage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Application data/54 Address'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/55 Copy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Application data/56 Save Asset reg'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Application data/57 SaveCont Asset data'), FailureHandling.CONTINUE_ON_FAILURE)

