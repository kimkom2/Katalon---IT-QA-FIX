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

WebUI.openBrowser('http://172.16.26.81/CONFINS_TRAIN/MainX.aspx')

WebUI.setText(findTestObject('Receipt form assignment/Page_NEW CONFINS LOGIN PAGE/1Nrk'), '43730712')

WebUI.setEncryptedText(findTestObject('Receipt form assignment/Page_NEW CONFINS LOGIN PAGE/2 Pass'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Receipt form assignment/Page_NEW CONFINS LOGIN PAGE/3 Login'))

WebUI.click(findTestObject('Receipt form assignment/Page_NEW CONFINS LOGIN PAGE/4 Role'))

WebUI.delay(2)

WebUI.click(findTestObject('Receipt form assignment/Page_New Confins - Main/5 Menu'))

WebUI.selectOptionByValue(findTestObject('Receipt form assignment/Page_New Confins - Main/6 Account maintance'), '80', true)

WebUI.scrollToElement(findTestObject('Receipt form assignment/Page_New Confins - Main/7 Receipt Form'), 10)

WebUI.doubleClick(findTestObject('Receipt form assignment/Page_New Confins - Main/7 Receipt Form'))

WebUI.delay(2)

WebUI.click(findTestObject('Receipt form assignment/Page_New Confins - Main/8 Receipt Form Assignment'))

WebUI.delay(2)

WebUI.setText(findTestObject('Receipt form assignment/Page_New Confins - Main/9 Receipt form no'), '%')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Receipt form assignment/Page_New Confins - Main/10 status'), 'Assign', true)

WebUI.click(findTestObject('Receipt form assignment/Page_New Confins - Main/11 btnSearch'))

WebUI.delay(2)

WebUI.click(findTestObject('Receipt form assignment/Page_New Confins - Main/12 Klik cek list'))

WebUI.delay(2)

WebUI.click(findTestObject('Receipt form assignment/Page_New Confins - Main/13 Assign'))

WebUI.delay(2)

WebUI.click(findTestObject('Receipt form assignment/Page_New Confins - Main/14 cari assigned to'))

WebUI.setText(findTestObject('Receipt form assignment/Page_New Confins - Main/15 Employee No'), '43730712')

WebUI.delay(2)

WebUI.click(findTestObject('Receipt form assignment/Page_New Confins - Main/16 SEARCH'))

WebUI.delay(2)

WebUI.click(findTestObject('Receipt form assignment/Page_New Confins - Main/17 Select'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Receipt form assignment/Page_New Confins - Main/18 Reason'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Receipt form assignment/Page_New Confins - Main/19 Submit'))

