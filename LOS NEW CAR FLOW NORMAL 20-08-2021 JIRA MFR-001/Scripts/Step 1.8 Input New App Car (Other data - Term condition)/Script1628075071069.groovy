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

WebUI.click(findTestObject('Komponen form Add Aplikasi/menu new app car'))

WebUI.delay(3)

WebUI.setText(findTestObject('Perbaikan Application Data spliting/Page_New Confins - Main/1 Application Number'), '601APP20210400150')

WebUI.click(findTestObject('Perbaikan Application Data spliting/Page_New Confins - Main/2 Search'))

WebUI.delay(3)

WebUI.click(findTestObject('Perbaikan Application Data spliting/Page_New Confins - Main/3 Edit'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan Application Data spliting/Page_New Confins - Main/4 Referantor Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan Other data Spliting/Page_New Confins - Main/19Other Data'))

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

WebUI.delay(5)

WebUI.click(findTestObject('Tab Term and Condition/25'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/26'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Term and Condition/Button Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Tab Term and Condition/Page_New Confins - Main/Button submit new'))

