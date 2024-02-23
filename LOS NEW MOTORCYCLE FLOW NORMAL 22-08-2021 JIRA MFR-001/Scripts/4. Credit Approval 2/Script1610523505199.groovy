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

WebUI.setText(findTestObject('Komponen_Login/inputusername'), '25810711')

WebUI.setEncryptedText(findTestObject('Komponen_Login/password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Komponen_Login/buttonlogin'))

WebUI.click(findTestObject('Credit Approval/a_Select Role credit approval'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/klikmenugede'))

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/sub menu'), '109', true)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/menu Credit Approval'))

'sesuai aplikasi yang sudah masuk tahap CRV'
WebUI.setText(findTestObject('Page_New Confins - Main/Input no app credit approval'), '601KWA20200800059')

WebUI.click(findTestObject('Credit Approval/Page_New Confins - Main/Button Search credit approval'))

WebUI.delay(3)

WebUI.click(findTestObject('Credit Approval/Page_New Confins - Main/Button Process Credit Approval'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Credit Approval/Page_New Confins - Main/select action approval'), 'Approve', true)

WebUI.delay(3)

WebUI.setText(findTestObject('Credit Approval/Page_New Confins - Main/Notes Approval Action'), 'TEST TRAINING Approval 2')

WebUI.click(findTestObject('Credit Approval/Page_New Confins - Main/Button Submit Credit Approval'))

