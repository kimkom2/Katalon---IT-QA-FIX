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

WebUI.setText(findTestObject('Approval/1 NRK'), '44170612')

WebUI.setEncryptedText(findTestObject('Approval/15 Pass'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Approval/3 Login'))

WebUI.click(findTestObject('Agreement activaion/4 Role'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Approval/5 menu'))

WebUI.selectOptionByIndex(findTestObject('Approval/6 LOS 109'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Go Live/1 Go Live'))

WebUI.setText(findTestObject('Go Live/2 Application Number'), '558HO20210200020')

WebUI.click(findTestObject('Go Live/3 Search'))

WebUI.click(findTestObject('Go Live/4 Entry'))

WebUI.delay(2)

WebUI.click(findTestObject('Go Live/5 Submit'))

