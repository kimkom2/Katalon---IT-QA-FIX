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

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/a_New App Motorcycle'))

WebUI.delay(2)

WebUI.setText(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Application Number'), '601APP20210400116')

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Search'))

WebUI.delay(3)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/EDIT'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Test Referantor Data'))

WebUI.delay(3)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/a_Insurance Data_fixing'))

WebUI.delay(3)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Icon pencil insurance data'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select option Insco branch'), '4', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(8)

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select Main Coverage Type Name'), 'TLO', 
    true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select Rate Type'), 'NG', true)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Button Next Insurance Data'), 9)

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Button Next Insurance Data'))

WebUI.delay(12)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Calculate Insurance Data'))

WebUI.delay(20)

WebUI.scrollToElement(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Save calc Insurance Data'), 9)

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Save calc Insurance Data'))

WebUI.delay(20)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Next to Life'))

WebUI.delay(5)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Save Continue Life'))

