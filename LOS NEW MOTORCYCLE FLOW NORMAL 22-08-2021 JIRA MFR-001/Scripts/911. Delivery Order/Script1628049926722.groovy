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

WebUI.click(findTestObject('Menu Delivery Order/menu Delivery Order'))

WebUI.delay(2)

'sesuai aplikasi yang sudah masuk tahap CRV'
WebUI.setText(findTestObject('Menu Delivery Order/input app Delivery order'), '601KWA20200800059')

WebUI.click(findTestObject('Menu Delivery Order/Search Delivery Order'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu Delivery Order/pencil Delivery order'))

WebUI.click(findTestObject('Menu Delivery Order/Entry DO'))

WebUI.delay(3)

'diganti secara sequence'
WebUI.setText(findTestObject('Menu Delivery Order/input_NO. RANGKA Delivery Order'), 'RNKTRAINING0001')

'diganti secara sequence'
WebUI.setText(findTestObject('Menu Delivery Order/input_NO. MESIN Delivery Order'), 'MSNTRAINING001')

WebUI.setText(findTestObject('Menu Delivery Order/Registration Date'), '14/01/2021')

WebUI.delay(2)

WebUI.click(findTestObject('Menu Delivery Order/Save Delivery Order'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu Delivery Order/Menu Delivery Order (1)/Next Delivery Order'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu Delivery Order/Menu Delivery Order (1)/Submit Delivery Order'))

