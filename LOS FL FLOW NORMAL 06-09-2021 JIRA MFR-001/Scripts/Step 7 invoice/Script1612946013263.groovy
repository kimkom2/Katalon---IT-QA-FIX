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

WebUI.openBrowser('http://172.16.26.81/CONFINS_Train/Main.aspx')

WebUI.setText(findTestObject('Application data/1 NRK'), '67420314')

WebUI.setEncryptedText(findTestObject('Application data/2 Pass'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Application data/3 Login'))

WebUI.click(findTestObject('Application data/4 role'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Application data/5 Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Application data/6 LOS 109'), '109', true)

WebUI.scrollToElement(findTestObject('Invoice/111 Invoice'), 2)

WebUI.click(findTestObject('Invoice/111 Invoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Invoice/2 Application Number'), '558HO20210200020')

WebUI.click(findTestObject('Invoice/3 Search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Invoice/4 action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Invoice/5 Application Number'), '558HO20210200020')

WebUI.selectOptionByIndex(findTestObject('Invoice/6 Currency'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Invoice/7 Search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Invoice/8 input'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Invoice/9 Add To Temp'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Invoice/10 Next'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Invoice/11 Invoice Number'), '558HO20210200020')

WebUI.setText(findTestObject('Invoice/12 Invoice Date'), '02/02/2021')

WebUI.delay(2)

WebUI.click(findTestObject('Invoice/13 save'), FailureHandling.CONTINUE_ON_FAILURE)

