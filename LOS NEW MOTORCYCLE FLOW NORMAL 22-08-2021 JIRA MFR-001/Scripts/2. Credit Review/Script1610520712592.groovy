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

WebUI.click(findTestObject('Komponen_Menu_LOS/Credit Review/Menu Credit Review'))

WebUI.delay(2)

'sesuai aplikasi yang sudah masuk tahap CRV'
WebUI.setText(findTestObject('Page_New Confins - Main/Input app Credit Review'), '601APP20210400141')

WebUI.click(findTestObject('Komponen_Menu_LOS/Credit Review/Page_New Confins - Main/search credit review'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_New Confins - Main/klik pencil PO'))

WebUI.delay(3)

WebUI.click(findTestObject('Tab Approval Recommend/Tab APPROVAL RECOMMENDATION'))

WebUI.delay(0)

WebUI.selectOptionByIndex(findTestObject('Tab Approval Recommend/Reason Description'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(0)

WebUI.setText(findTestObject('Tab Approval Recommend/Notes Approval'), 'TEST TRAINING')

WebUI.selectOptionByValue(findTestObject('Tab Approval Recommend/Approval By'), '507098', true)

WebUI.setText(findTestObject('Tab Approval Recommend/Text Strength'), 'TEST STRENGTH')

WebUI.setText(findTestObject('Tab Approval Recommend/Text Weakness'), 'TEST WEAKNESS')

WebUI.setText(findTestObject('Tab Approval Recommend/Text Opportunity'), 'TEST OPPORTUNITY')

WebUI.setText(findTestObject('Tab Approval Recommend/Text Thread'), 'Test THREAD')

WebUI.click(findTestObject('Tab Approval Recommend/Submit Credit Review'))

WebUI.delay(3)

