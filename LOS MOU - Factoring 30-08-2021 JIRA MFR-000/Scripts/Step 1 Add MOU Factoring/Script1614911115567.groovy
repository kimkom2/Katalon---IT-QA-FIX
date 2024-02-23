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

WebUI.setEncryptedText(findTestObject('1 Add Mou Factoring/2 Pass'), 'p4y+y39Ir5OGQkBUoox0IA==')

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

WebUI.click(findTestObject('1 Add Mou Factoring/8 MOU Factoring a'))

WebUI.click(findTestObject('1 Add Mou Factoring/9 Add'))

WebUI.delay(2)

WebUI.click(findTestObject('1 Add Mou Factoring/10 Cari'))

WebUI.setText(findTestObject('1 Add Mou Factoring/11 input_Customer Name'), 'Ho Hendy')

WebUI.click(findTestObject('1 Add Mou Factoring/12 SEARCH'))

WebUI.delay(2)

WebUI.click(findTestObject('1 Add Mou Factoring/13 Select'))

WebUI.setText(findTestObject('1 Add Mou Factoring/14 End Date'), '01/03/2022')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('1 Add Mou Factoring/15 Currency'), '28', true)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('1 Add Mou Factoring/16 input_Plafond Amount'))

WebUI.sendKeys(findTestObject('1 Add Mou Factoring/16 input_Plafond Amount'), '200000000')

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('1 Add Mou Factoring/17 Way of Payment'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('1 Add Mou Factoring/18 Installment type'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('1 Add Mou Factoring/19 Method'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('1 Add Mou Factoring/20 Top'))

WebUI.sendKeys(findTestObject('1 Add Mou Factoring/20 Top'), '12')

WebUI.delay(2)

WebUI.click(findTestObject('1 Add Mou Factoring/21 Submit'))

