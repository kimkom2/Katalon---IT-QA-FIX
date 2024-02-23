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

WebUI.delay(2)

WebUI.setText(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/1 Application Number'), '532APP20210400050')

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/2 Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/3 edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/4 Referantor Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan insurance asset Spliting/Page_New Confins - Main/8 Insurance Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Step 1 New Application/50 edit insurance data'))

WebUI.click(findTestObject('Step 1 New Application/51 Off sistem'))

WebUI.click(findTestObject('Step 1 New Application/52 Save Insurance'))

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/53 Next insurance data'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/54 SaveCont Insurance data'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/55 SaveCont Life insurance data'))

