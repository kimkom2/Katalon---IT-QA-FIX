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

WebUI.setText(findTestObject('Step 2 Credit Review/1 NRK'), '00330301')

WebUI.setEncryptedText(findTestObject('Step 2 Credit Review/2 Passowrd'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Step 2 Credit Review/3 Login'))

WebUI.click(findTestObject('Step 5 Agrement Activation/1 Select Role'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 2 Credit Review/4 Menu'))

WebUI.selectOptionByValue(findTestObject('Step 2 Credit Review/5 sub menu'), '109', true)

WebUI.click(findTestObject('Step 9 Go live/1 Go Live'))

WebUI.setText(findTestObject('Step 9 Go live/2 input_Application Number'), '532APP20200800188')

WebUI.click(findTestObject('Step 9 Go live/3 Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 9 Go live/4 entry'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 9 Go live/5 Submit'))

