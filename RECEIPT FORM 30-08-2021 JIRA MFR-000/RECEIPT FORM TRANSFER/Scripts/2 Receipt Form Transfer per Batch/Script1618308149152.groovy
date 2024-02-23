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

WebUI.openBrowser('http://172.16.26.81/CONFINS_TRAIN/MainX.aspx')

WebUI.setText(findTestObject('Form Login/1 Input username'), '88950215')

WebUI.setEncryptedText(findTestObject('Form Login/2 Input Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Form Login/3 Button Login'))

WebUI.delay(2)

WebUI.click(findTestObject('Form Receipt Form Transfer/4 Menu Gede'))

WebUI.selectOptionByValue(findTestObject('Form Receipt Form Transfer/15 Submenu gede'), '80', true)

WebUI.delay(2)

WebUI.click(findTestObject('Form Receipt Form Transfer/5 Menu Receipt Form Transfer'))

'Input Batch No yang akan di transfer'
WebUI.setText(findTestObject('Form Receipt Form Transfer/7 Input Batch No'), '999-0300108')

WebUI.click(findTestObject('Form Receipt Form Transfer/8 Button Search'))

WebUI.delay(3)

WebUI.click(findTestObject('Form Receipt Form Transfer/9 Ceklist data TTR'))

WebUI.click(findTestObject('Form Receipt Form Transfer/10 Button Add To Temp'))

WebUI.click(findTestObject('Form Receipt Form Transfer/11 Button Transfer'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Form Receipt Form Transfer/12 Pilih Assigned To'), '84', true)

WebUI.selectOptionByValue(findTestObject('Form Receipt Form Transfer/13 Pilih Reason Description'), 'RECEIPT_FORM_TRNSFR', 
    true)

WebUI.click(findTestObject('Form Receipt Form Transfer/14 Button Submit'))

