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

WebUI.setText(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Application Number'), '601APP20210400135')

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/EDIT'))

WebUI.delay(4)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Test Referantor Data'))

WebUI.delay(2)

WebUI.click(findTestObject('Commision Data/tab commision data'))

WebUI.delay(6)

WebUI.click(findTestObject('Commision Data/Input refund supplier branch'))

WebUI.doubleClick(findTestObject('Commision Data/Input refund supplier branch'))

'Jalankan proses input commision hingga TC secara manual atau delete supplier pada commision agar bisa lanjut ke step berikutnya)\r\n& cek scenario negative nomor 10'
WebUI.sendKeys(findTestObject('Commision Data/Input refund supplier branch'), '200000')

WebUI.delay(4)

WebUI.click(findTestObject('Commision Data/Input refund supplier branch emp'))

WebUI.doubleClick(findTestObject('Commision Data/Input refund supplier branch emp'))

'Jalankan proses input commision hingga TC secara manual atau delete supplier pada commision agar bisa lanjut ke step berikutnya)\r\n& cek scenario negative nomor 11'
WebUI.sendKeys(findTestObject('Commision Data/Input refund supplier branch emp'), '100000')

WebUI.delay(4)

WebUI.click(findTestObject('Commision Data/button calculate'))

WebUI.delay(9)

WebUI.click(findTestObject('Commision Data/Button save and continue'), FailureHandling.STOP_ON_FAILURE)

