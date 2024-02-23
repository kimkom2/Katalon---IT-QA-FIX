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
WebUI.setText(findTestObject('Form Login/field username'), '18820817')

WebUI.setEncryptedText(findTestObject('Form Login/field password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('Form Login/button login'))

WebUI.delay(3)

WebUI.click(findTestObject('JIRA 1603 BATCH 257/Page_NEW CONFINS LOGIN PAGE/Select Role user 18820817'))

WebUI.click(findTestObject('Komponen form Add Aplikasi/menu confins'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen form Add Aplikasi/select menu gede'), '109', true)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Delivery Order/Menu Invoice'), 0)

WebUI.click(findTestObject('Delivery Order/Menu Invoice'))

WebUI.delay(3)

'Input no Aplikasi yang akan masuk ke step credit review'
WebUI.setText(findTestObject('Menu Invoice/Input No Aplikasi'), '601APP20210400150')

WebUI.delay(2)

WebUI.click(findTestObject('Menu Invoice/Button Search'))

WebUI.click(findTestObject('Menu Invoice/Pencil Invoice'))

WebUI.delay(2)

WebUI.setText(findTestObject('Menu Invoice/Input Aplikasi Invoice'), '601APP20210400150')

WebUI.delay(2)

'Cek scenario normal di No 33 & scenario negative di No 15'
WebUI.selectOptionByValue(findTestObject('Menu Invoice/Currency Select By Value 28'), '28', true)

WebUI.delay(2)

WebUI.click(findTestObject('Menu Invoice/Button Search 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu Invoice/Checklist'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Menu Invoice/Button Add To Temp'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Menu Invoice/Button Next'))

WebUI.delay(2)

'Cek scenario normal di No 34 & scenario negative di No 16'
WebUI.setText(findTestObject('Menu Invoice/Input Invoice Number'), 'INVKWA0022')

WebUI.delay(2)

WebUI.setText(findTestObject('Menu Invoice/Invoice Date 02022021'), '02/02/2021')

WebUI.delay(2)

WebUI.click(findTestObject('Menu Invoice/Button Save'))

