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

WebUI.setText(findTestObject('1 Add Mou Factoring/1 NRK'), '38260412')

WebUI.setEncryptedText(findTestObject('1 Add Mou Factoring/2 Pass'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('1 Add Mou Factoring/3 Login'))

WebUI.delay(2)

WebUI.click(findTestObject('3 MOU APPROVAL/1 Role 2'))

WebUI.delay(2)

WebUI.click(findTestObject('1 Add Mou Factoring/5 Menu Gede'))

WebUI.selectOptionByValue(findTestObject('1 Add Mou Factoring/6 Menu 109'), '109', true)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('3 MOU APPROVAL/3 MOU Factoring 2'), 10)

WebUI.doubleClick(findTestObject('3 MOU APPROVAL/3 MOU Factoring 2'))

WebUI.delay(2)

WebUI.click(findTestObject('3 MOU APPROVAL/2 MOU Approval (1)'))

WebUI.delay(2)

WebUI.setText(findTestObject('3 MOU APPROVAL/3 Transaction Number'), '599MOU20210300002')

WebUI.delay(2)

WebUI.click(findTestObject('3 MOU APPROVAL/btnSearch'))

WebUI.delay(2)

WebUI.click(findTestObject('3 MOU APPROVAL/4 Process'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('3 MOU APPROVAL/5 Task'), 'Approve', true)

WebUI.delay(2)

WebUI.setText(findTestObject('3 MOU APPROVAL/6 Notes'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('3 MOU APPROVAL/7 Submit'))

