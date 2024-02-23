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

WebUI.setText(findTestObject('Komponen_Login/inputusername'), '18820817')

WebUI.setEncryptedText(findTestObject('Komponen_Login/password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('Komponen_Login/buttonlogin'))

WebUI.click(findTestObject('Komponen_Login/selectRoleCreditAdmin'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/klikmenugede'))

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/sub menu'), '109', true)

WebUI.click(findTestObject('Komponen_Menu_LOS/a_New App Motorcycle'))

WebUI.delay(2)

WebUI.setText(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Application Number'), '601APP20210400116')

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/EDIT'))

WebUI.delay(4)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Test Referantor Data'))

WebUI.delay(2)

WebUI.click(findTestObject('Financial data fixing/Page_New Confins - Main/a_Financial Data'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Financial data fixing/Page_New Confins - Main/Rate'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Financial data fixing/Page_New Confins - Main/Rate'), '25')

WebUI.delay(2)

WebUI.click(findTestObject('Financial data fixing/Page_New Confins - Main/CalculateFinancialData'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('Financial data fixing/Page_New Confins - Main/CalculateFees'), 9)

WebUI.delay(2)

WebUI.click(findTestObject('Financial data fixing/Page_New Confins - Main/CalculateFees'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('Financial data fixing/Page_New Confins - Main/SaveCont Financial'), 9)

WebUI.delay(10)

WebUI.click(findTestObject('Financial data fixing/Page_New Confins - Main/SaveCont Financial'), FailureHandling.STOP_ON_FAILURE)

