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

WebUI.click(findTestObject('Menu Gede Test/Page_New Confins - Main/img_Welcome, Zuhria Zuraidah, SURABAYA 2, Credit Admin_imgMenu'))

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/sub menu'), '109', true)

WebUI.click(findTestObject('Komponen_Menu_LOS/a_New App Motorcycle'))

WebUI.setText(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Application Number'), '601APP20231000021')

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/EDIT'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Test Referantor Data'))

WebUI.delay(4)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/a_Application Data fixing'))

WebUI.delay(4)

WebUI.setText(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/input_Prospect No'), '601APP20231000021', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/input_Tenor'), '24')

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Fixed Rate'))

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/select payment frequency'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select Installment Scheme'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select Marketing Officer'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Application Source'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Way of Payment'), '6', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Customer Notification'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Copy Address From'), '3', true)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/button Copy Addres'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Cus Address Distance'), 'RANGE2', true)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Save and continue Tab Application'))

