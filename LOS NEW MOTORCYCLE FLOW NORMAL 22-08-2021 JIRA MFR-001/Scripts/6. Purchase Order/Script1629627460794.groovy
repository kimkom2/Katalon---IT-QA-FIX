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

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Login/selectRoleCreditAdmin'))

WebUI.delay(3)

WebUI.click(findTestObject('Komponen_Menu_LOS/klikmenugede'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/sub menu'), '109', true)

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan menu/a_Purchase Order Agreement'))

WebUI.delay(2)

'sesuai aplikasi yang sudah masuk tahap CRV'
WebUI.setText(findTestObject('Menu PO/Input app number PO'), '601APP20210400135')

WebUI.click(findTestObject('Menu PO/search PO'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu PO/Pencil PO'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu PO/Entri PO'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu PO/Save PO'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu PO/Menu PO (1)/Submit PO'))

