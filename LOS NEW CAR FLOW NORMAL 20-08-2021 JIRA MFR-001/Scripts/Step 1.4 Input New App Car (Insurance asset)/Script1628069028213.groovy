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

WebUI.click(findTestObject('Tab Referantor/Save Continue Referantor'))

WebUI.delay(5)

WebUI.delay(5)

WebUI.click(findTestObject('Perbaikan insurace data Spliting/Page_New Confins - Main/12Insurance Data'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Insurance Data/Edit Insurance Data'), FailureHandling.CONTINUE_ON_FAILURE)

'Cek scenario normal di No 14 & scenario negative di No 5'
WebUI.selectOptionByIndex(findTestObject('Tab Insurance Data/Select Insco Branch Name'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Tab Insurance Data/Select Rate Type'), 'NG', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Tab Insurance Data/Select Main Coverage Type Name'), 'TLO', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Tab Insurance Data/Next Asset Registration'))

WebUI.delay(30)

WebUI.click(findTestObject('Tab Insurance Data/Calculate Insurane Data'))

WebUI.delay(30)

WebUI.scrollToElement(findTestObject('Tab Insurance Data/Save Insurance Data'), 9)

WebUI.delay(5)

WebUI.click(findTestObject('Tab Insurance Data/Save Insurance Data'))

WebUI.delay(10)

WebUI.click(findTestObject('Perbaikan/Page_New Confins - Main/Button Next Insurance New'))

WebUI.delay(2)

WebUI.click(findTestObject('Tab Insurance Data/Save Continue Insurance Data'))

