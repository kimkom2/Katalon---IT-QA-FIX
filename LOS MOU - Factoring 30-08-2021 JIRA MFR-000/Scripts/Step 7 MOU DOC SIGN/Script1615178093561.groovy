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

WebUI.setText(findTestObject('1 Add Mou Factoring/1 NRK'), '97030515')

WebUI.setEncryptedText(findTestObject('1 Add Mou Factoring/2 Pass'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('1 Add Mou Factoring/3 Login'))

WebUI.delay(2)

WebUI.click(findTestObject('1 Add Mou Factoring/4 Role a'))

WebUI.delay(2)

WebUI.click(findTestObject('1 Add Mou Factoring/5 Menu Gede'))

WebUI.selectOptionByValue(findTestObject('1 Add Mou Factoring/6 Menu 109'), '109', true)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('1 Add Mou Factoring/7 MOU Factoring a'), 10)

WebUI.doubleClick(findTestObject('1 Add Mou Factoring/7 MOU Factoring a'))

WebUI.delay(2)

WebUI.click(findTestObject('MOU DOC SIGN/1 MOU Document Signer'))

WebUI.delay(2)

WebUI.setText(findTestObject('MOU DOC SIGN/2 input_MOU No'), '599MOU20210300002')

WebUI.click(findTestObject('MOU DOC SIGN/3 btnSearch'))

WebUI.delay(2)

WebUI.click(findTestObject('MOU DOC SIGN/4 action'))

WebUI.delay(2)

WebUI.click(findTestObject('MOU DOC SIGN/5 Cari company'))

WebUI.setText(findTestObject('MOU DOC SIGN/6 Emp Name'), 'Ho Hendy')

WebUI.click(findTestObject('MOU DOC SIGN/7 SEARCH'))

WebUI.delay(2)

WebUI.click(findTestObject('MOU DOC SIGN/8 Select'))

WebUI.delay(2)

WebUI.click(findTestObject('MOU DOC SIGN/9 Submit'))

