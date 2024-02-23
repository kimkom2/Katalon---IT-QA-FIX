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

WebUI.setText(findTestObject('Credit review/1 NRK'), '51771112')

WebUI.setEncryptedText(findTestObject('Credit review/2 Pass'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('Credit review/3 Login'))

WebUI.click(findTestObject('Credit review/4 menu'))

WebUI.selectOptionByValue(findTestObject('Credit review/5 LOS 109'), '109', true)

WebUI.click(findTestObject('Credit review/6 Credit Review'))

WebUI.delay(2)

WebUI.setText(findTestObject('Credit review/7 Application number'), '558APP20211000002')

WebUI.click(findTestObject('Credit review/8 Search'))

WebUI.click(findTestObject('Credit review/9 edit application num'))

WebUI.delay(2)

WebUI.click(findTestObject('Credit review/10 APPROVAL RECOMMENDATION'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Credit review/11 RECOMMENDED'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Credit review/12 Approval'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Credit review/13 notest'), 'Oke')

WebUI.setText(findTestObject('Credit review/14 STRENGTH'), 'STR')

WebUI.setText(findTestObject('Credit review/15 WEAKNESS'), 'WEAk')

WebUI.setText(findTestObject('Credit review/16 OPPORTUNITY'), 'OP')

WebUI.setText(findTestObject('Credit review/17 THREAD'), 'THR')

WebUI.delay(2)

WebUI.click(findTestObject('Credit review/a_18 Submit'))

