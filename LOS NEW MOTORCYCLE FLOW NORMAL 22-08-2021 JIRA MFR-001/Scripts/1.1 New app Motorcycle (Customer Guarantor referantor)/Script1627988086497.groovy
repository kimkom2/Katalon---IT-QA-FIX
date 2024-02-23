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

WebUI.click(findTestObject('Komponen_Menu_LOS/a_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/klikkacapembesar'))

WebUI.delay(2)

WebUI.setText(findTestObject('Komponen_Menu_LOS/Input Product Offering'), 'MGIPNB0000')

WebUI.click(findTestObject('Komponen_Menu_LOS/search product offering'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/select product offering'))

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Next Application'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/search customer'))

WebUI.setText(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/input Customer Name'), 'HO HENDY')

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/search customer name'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select Customer name'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/save and continue'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/save continue guarantor'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/save and continue referantor'))

