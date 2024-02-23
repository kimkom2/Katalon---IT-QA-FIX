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

WebUI.setEncryptedText(findTestObject('Komponen_Login/password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Komponen_Login/buttonlogin'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Login/selectRoleCreditAdmin'))

WebUI.delay(3)

WebUI.click(findTestObject('Komponen_Menu_LOS/klikmenugede'))

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/sub menu'), '109', true)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Menu Invoice/Menu Invoice'), 0)

WebUI.click(findTestObject('Menu Invoice/Menu Invoice'))

WebUI.delay(2)

'sesuai aplikasi yang sudah masuk tahap CRV'
WebUI.setText(findTestObject('Menu Invoice/Input app Invoice'), '601KWA20200800059')

WebUI.click(findTestObject('Menu Invoice/Search Invoice'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu Invoice/Pencil Invoice'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu Invoice/Input app Invoice'), '601KWA20200800059')

WebUI.selectOptionByIndex(findTestObject('Menu Invoice/Currency Code Invoice'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Menu Invoice/Search Currency Invoice'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu Invoice/checklist Invoice'))

'diganti secara sequence'
WebUI.click(findTestObject('Menu Invoice/Add To Temp Invoice'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Menu Invoice/Next invoice'))

WebUI.delay(2)

'ganti sesuai sequence'
WebUI.setText(findTestObject('Menu Invoice/Input Nomor Invoice'), 'INVTRAINING001')

'ubah sesuai business date'
WebUI.setText(findTestObject('Menu Invoice/Input Date Invoice'), '14/01/2020')

WebUI.click(findTestObject('Menu Delivery Order/Save Delivery Order'))

WebUI.delay(2)

WebUI.delay(2)

