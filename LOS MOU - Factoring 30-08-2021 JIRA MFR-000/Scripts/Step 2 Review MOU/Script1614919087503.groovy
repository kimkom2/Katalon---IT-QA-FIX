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

WebUI.setText(findTestObject('1 Add Mou Factoring/1 NRK'), '95060315')

WebUI.setEncryptedText(findTestObject('1 Add Mou Factoring/2 Pass'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('1 Add Mou Factoring/3 Login'))

WebUI.delay(2)

WebUI.click(findTestObject('2 MOU REVIEW/1 Role'))

WebUI.delay(2)

WebUI.click(findTestObject('1 Add Mou Factoring/5 Menu Gede'))

WebUI.selectOptionByValue(findTestObject('1 Add Mou Factoring/6 Menu 109'), '109', true)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('2 MOU REVIEW/7 MOU Factoring'), 10)

WebUI.doubleClick(findTestObject('2 MOU REVIEW/7 MOU Factoring'))

WebUI.delay(2)

WebUI.click(findTestObject('2 MOU REVIEW/8 MOU Review'))

WebUI.delay(2)

WebUI.setText(findTestObject('2 MOU REVIEW/9 MOU No'), '599MOU20210300002')

WebUI.delay(2)

WebUI.click(findTestObject('2 MOU REVIEW/10 Search'))

WebUI.delay(2)

WebUI.click(findTestObject('2 MOU REVIEW/11 Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('2 MOU REVIEW/12 Approval Recomendation'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('2 MOU REVIEW/13 Reason'), '112', true)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('2 MOU REVIEW/14 Approve by'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('2 MOU REVIEW/15 Notes'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('2 MOU REVIEW/16 Submit'))

