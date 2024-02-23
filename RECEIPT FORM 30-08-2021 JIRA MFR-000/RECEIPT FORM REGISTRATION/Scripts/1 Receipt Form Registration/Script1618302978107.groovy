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

WebUI.delay(3)

WebUI.setText(findTestObject('Form Login/1 Input Username'), '88950215')

WebUI.setEncryptedText(findTestObject('Form Login/2 Input Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Form Login/3 Button Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Receipt Form Registration/4 Menu Gede'))

WebUI.selectOptionByValue(findTestObject('Receipt Form Registration/5 Sub Menu Gede'), '80', true)

WebUI.delay(3)

WebUI.click(findTestObject('Receipt Form Registration/6 Menu Registration'))

WebUI.delay(3)

'ubah sesuai sequence'
WebUI.setText(findTestObject('Receipt Form Registration/7 Input TTR Begin No'), 'B001')

WebUI.doubleClick(findTestObject('Receipt Form Registration/8 Input Jumlah TTR'))

'ubah sesuai jumlah yg dibutuhkan'
WebUI.sendKeys(findTestObject('Receipt Form Registration/8 Input Jumlah TTR'), '100')

WebUI.click(findTestObject('Receipt Form Registration/9 Kaca Pembesar Received from'))

WebUI.setText(findTestObject('Receipt Form Registration/10 Input Employee No'), '88950215')

WebUI.click(findTestObject('Receipt Form Registration/11 Button Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Receipt Form Registration/12 Button Select'))

WebUI.delay(2)

WebUI.click(findTestObject('Receipt Form Registration/13 Button Submit'))

