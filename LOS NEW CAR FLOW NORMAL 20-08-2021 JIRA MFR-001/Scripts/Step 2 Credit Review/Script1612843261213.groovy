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

WebUI.openBrowser('http://172.16.26.81/CONFINS_TRAIN/HTML5LOGIN.ASPX')

WebUI.delay(3)

'Input user yang memiliki role sebagai admin credit'
WebUI.setText(findTestObject('Form Login/field username'), '32610918')

WebUI.setEncryptedText(findTestObject('Form Login/field password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('Form Login/button login'))

WebUI.delay(3)

WebUI.click(findTestObject('Credit Review/Select Role Credit Analyst'))

WebUI.click(findTestObject('Komponen form Add Aplikasi/menu confins'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen form Add Aplikasi/select menu gede'), '109', true)

WebUI.delay(2)

WebUI.click(findTestObject('Credit Review/Menu Credit Review'))

WebUI.delay(2)

'Input no Aplikasi yang akan masuk ke step credit review'
WebUI.setText(findTestObject('Credit Review/Input Application Number'), '601APP20210400150')

WebUI.click(findTestObject('Credit Review/Button Search Application Number'))

WebUI.delay(2)

WebUI.click(findTestObject('Credit Review/Pencil Review'))

WebUI.delay(3)

WebUI.click(findTestObject('Credit Review/Tab APPROVAL RECOMMENDATION'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Credit Review/Select Value Reason Desc 40736'), '40736', true)

WebUI.delay(3)

WebUI.setText(findTestObject('Credit Review/Input Notes'), 'Test Notes')

WebUI.selectOptionByValue(findTestObject('Credit Review/Select value Approved By 1313578'), '1313578', true)

WebUI.delay(2)

WebUI.setText(findTestObject('Credit Review/Input Strength'), 'STRENGTH TEST')

WebUI.delay(2)

WebUI.setText(findTestObject('Credit Review/Input Weakness'), 'WEAKNEST TEST')

WebUI.delay(2)

WebUI.setText(findTestObject('Credit Review/Input Opportunity'), 'OPPORTUNITY TEST')

WebUI.delay(2)

WebUI.setText(findTestObject('Credit Review/Input Thread'), 'THREAD TEST')

WebUI.delay(2)

WebUI.click(findTestObject('Credit Review/Submit Credit Review'))

