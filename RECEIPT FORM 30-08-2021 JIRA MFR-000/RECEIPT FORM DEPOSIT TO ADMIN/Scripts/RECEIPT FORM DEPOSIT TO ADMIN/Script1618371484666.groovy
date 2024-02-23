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

WebUI.delay(3)

WebUI.setText(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/1. Input User Name'), '43730712')

WebUI.setEncryptedText(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/2. Input Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/3. Button Login'))

WebUI.delay(3)

WebUI.click(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/4. Select Role BOS'))

WebUI.delay(3)

WebUI.click(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/5. Main Menu'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/6. Sub Menu'), '80', true)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/7. Menu Receipt Form'), 2)

WebUI.click(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/7. Menu Receipt Form'))

WebUI.delay(3)

WebUI.click(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/8. Receipt Form Deposit To Admin'))

WebUI.delay(3)

'Diisi sesuai dengan tanggal verifikasi Receipt Form >='
WebUI.setText(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/9. Verification Date 1'), '04/03/2021')

WebUI.delay(2)

'Diisi sesuai dengan tanggal verifikasi Receipt Form <='
WebUI.setText(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/10. Verification Date 2'), '04/03/2021')

WebUI.delay(2)

WebUI.click(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/11. Button Search'))

WebUI.delay(3)

WebUI.click(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/12. Button Edit'))

WebUI.delay(3)

WebUI.click(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/13. Checklist Batch Receipt Form'))

WebUI.delay(3)

WebUI.click(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/14. Button Add'))

WebUI.delay(3)

WebUI.click(findTestObject('RECEIPT FORM DEPOSIT TO ADMIN/15. Button Submit'))

WebUI.delay(3)

