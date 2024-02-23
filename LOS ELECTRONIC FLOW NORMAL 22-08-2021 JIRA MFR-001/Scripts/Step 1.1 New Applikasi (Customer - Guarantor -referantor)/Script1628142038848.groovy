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

WebUI.click(findTestObject('Step 1 New Application/7 Add Applikasi'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/8 Cari Product offering'))

WebUI.delay(2)

WebUI.setText(findTestObject('Step 1 New Application/60 Product offering code'), 'MGIPMPR000')

WebUI.click(findTestObject('Step 1 New Application/9 SEARCH Prodcut offering'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/10 Select Product offering'))

WebUI.delay(2)

WebUI.setText(findTestObject('Step 1 New Application/11 Input num asset'), '1')

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/12 Next Applikasi'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/13 Cari Customer'))

WebUI.setText(findTestObject('Step 1 New Application/14 Input customer'), 'HO HENDY')

WebUI.click(findTestObject('Step 1 New Application/15 SEARCH Customer'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/16 Select Customer'))

WebUI.click(findTestObject('Step 1 New Application/17 SaveCont Customer'))

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/18 SaveCont Guarantor'))

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/19 SaveCont Referantor'))

