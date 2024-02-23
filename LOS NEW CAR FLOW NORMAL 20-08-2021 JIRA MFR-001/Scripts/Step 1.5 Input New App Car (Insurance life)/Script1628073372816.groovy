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

WebUI.click(findTestObject('Perbaikan insurance life spliting/Page_New Confins - Main/14 Life Insurance Data'))

WebUI.delay(5)

WebUI.click(findTestObject('Tab Life Insurance Data/Ceklis Cover Life Insurance'))

WebUI.delay(5)

'Cek scenario normal di No 17 & scenario negative di No 6'
WebUI.selectOptionByValue(findTestObject('Tab Life Insurance Data/Select Life Insco Branch Name'), '251', true)

WebUI.delay(3)

WebUI.click(findTestObject('Tab Life Insurance Data/Ceklis Customer Insured'))

WebUI.selectOptionByValue(findTestObject('Tab Life Insurance Data/Select Premium Payment Method'), 'FO', true)

WebUI.delay(3)

WebUI.click(findTestObject('Tab Life Insurance Data/Button Save Continue'))

WebUI.delay(4)

