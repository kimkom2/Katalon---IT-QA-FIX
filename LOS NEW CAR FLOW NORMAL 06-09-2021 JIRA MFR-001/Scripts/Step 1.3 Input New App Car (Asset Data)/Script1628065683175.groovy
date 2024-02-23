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
WebUI.setText(findTestObject('Form Login/field username'), '52081212')

WebUI.setEncryptedText(findTestObject('Form Login/field password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('Form Login/button login'))

WebUI.delay(3)

WebUI.click(findTestObject('Form Login/Select role user 52081212'))

WebUI.click(findTestObject('Komponen form Add Aplikasi/menu confins'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen form Add Aplikasi/select menu gede'), '109', true)

WebUI.delay(2)

WebUI.click(findTestObject('Komponen form Add Aplikasi/menu new app car'))

WebUI.delay(3)

WebUI.setText(findTestObject('Perbaikan Application Data spliting/Page_New Confins - Main/1 Application Number'), '555APP20210400046')

WebUI.click(findTestObject('Perbaikan Application Data spliting/Page_New Confins - Main/2 Search'))

WebUI.delay(3)

WebUI.click(findTestObject('Perbaikan Application Data spliting/Page_New Confins - Main/3 Edit'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan Application Data spliting/Page_New Confins - Main/4 Referantor Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan Asset Data spliting/Page_New Confins - Main/6 Asset Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Tab Asset Data/Tab Asset Data/Tab Asset Data/Button Add Asset Data'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Asset Data spliting/Page_New Confins - Main/7 Edit2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Tab Asset Data/Kaca Pembesar Supp Branch Name'))

'Input Supp Branch yang akan digunakan'
WebUI.setText(findTestObject('Tab Asset Data/Input Supplier Branch Name'), '3N MOBILINDO - SERPONG')

WebUI.click(findTestObject('Tab Asset Data/Button Search'))

'Pilih supp branch yang disearch'
WebUI.click(findTestObject('Tab Asset Data/Tab Asset Data/Select 3N MOBILINDO'))

WebUI.delay(3)

'Pilih sales sesuai kebutuhan'
WebUI.selectOptionByIndex(findTestObject('Tab Asset Data/Select Sales Person Name'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Tab Asset Data/Kaca Pembesar Asset Name'))

WebUI.delay(2)

WebUI.setText(findTestObject('Tab Asset Data/Input Asset Name'), 'HONDA ALL NEW BRIO E CVT')

WebUI.click(findTestObject('Tab Asset Data/Tab Asset Data new/Search Asset Name new'))

WebUI.delay(2)

WebUI.click(findTestObject('Tab Asset Data/Select HONDA ALL NEW BRIO E CVT'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Tab Asset Data/Input Manufacturing Year'), '2020')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Tab Asset Data/Input Asset Price ( Include VAT )'), 9)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Tab Asset Data/Input Asset Price ( Include VAT )'), '300000000')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Tab Asset Data/Select Asset Usage'), 'N', true)

WebUI.delay(2)

WebUI.setText(findTestObject('Tab Asset Data/Input Color'), 'RED')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Tab Asset Data/Select Wilayah Asset'), 'REGION 2', true)

WebUI.delay(4)

'Input Supp Branch yang akan digunakan'
WebUI.scrollToElement(findTestObject('Tab Asset Data/Input Supplier Branch Name'), 9)

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Asset Data spliting/Page_New Confins - Main/9 Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Asset Data spliting/Page_New Confins - Main/10Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Tab Asset Data/Asset Registration'))

WebUI.delay(2)

WebUI.click(findTestObject('Tab Asset Data/Self Usage'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Tab Asset Data/Select Asset Location'), 'LEGAL', true)

WebUI.delay(2)

WebUI.click(findTestObject('Tab Asset Data/Copy Address Asset Location'))

WebUI.delay(2)

WebUI.click(findTestObject('Tab Asset Data/Button Save Asset Data'))

WebUI.delay(5)

WebUI.click(findTestObject('Tab Asset Data/Button Save Continue'))

