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

WebUI.openBrowser('http://172.16.26.81/CONFINS_TRAIN/Main.aspx')

WebUI.setText(findTestObject('Step 1 New Application/1 NRK'), '30520811')

WebUI.setEncryptedText(findTestObject('Step 1 New Application/2 Password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('Step 1 New Application/3 Login'))

WebUI.click(findTestObject('Step 1 New Application/4 Menu Gede'))

WebUI.selectOptionByValue(findTestObject('Step 1 New Application/5 Sub Menu 109 los'), '109', true)

WebUI.click(findTestObject('Step 1 New Application/6 New App Electronic'))

WebUI.setText(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/1 Application Number'), '532APP20210400050')

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/2 Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/3 edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/4 Referantor Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/5 Application Data'))

WebUI.delay(8)

WebUI.setText(findTestObject('Step 1 New Application/20 ProspectNo'), '532APP20210400050', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Step 1 New Application/21 Tenor'), '24')

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/22 Payment frequency'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/22 Payment frequency'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/23 marketing officer'))

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/23 marketing officer'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/24 Application Source'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/25 Way of payment'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/26 Customer Notifiation By'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Step 1 New Application/27 Copy address form'), '1', true)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/28 Address distance'), '4', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/28 Copy address button'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/29 SaveCont Application data'))

