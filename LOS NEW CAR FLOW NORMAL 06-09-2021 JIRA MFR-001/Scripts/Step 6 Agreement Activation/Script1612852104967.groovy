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
WebUI.setText(findTestObject('Form Login/field username'), '33041011')

WebUI.setEncryptedText(findTestObject('Form Login/field password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('Form Login/button login'))

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Activation/Select Role BOS'))

WebUI.click(findTestObject('Komponen form Add Aplikasi/menu confins'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen form Add Aplikasi/select menu gede'), '109', true)

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Activation/menu Agreement Activation'))

WebUI.delay(2)

'Input no Aplikasi yang akan masuk ke step credit review'
WebUI.setText(findTestObject('Agreement Activation/Input Applikasi Number'), '536APP2021010049K')

WebUI.click(findTestObject('Agreement Activation/Button Search'))

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Activation/Pencil Agreement Activation'))

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Activation/Button Add aplikasi'))

WebUI.click(findTestObject('Agreement Activation/Ceklist Action'))

WebUI.click(findTestObject('Agreement Activation/Button Add To Temp'))

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Activation/Button Calculate'))

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Activation/Button Submit'))

