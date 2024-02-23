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

'User Credit Admin - Employee Loan'
WebUI.setText(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/1. Input User Name'), '32610918')

WebUI.setEncryptedText(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/2. Input Password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/3. Button Log In'))

WebUI.delay(3)

WebUI.click(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/4. Select Role CA Employee Loan'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/5. Main Menu'))

WebUI.selectOptionByValue(findTestObject('New APP KTA/Page_New Confins - Main/6. Sub Menu'), '109', true)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/7. New App KTA'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/8. Add New App KTA'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/9. Search Product Offering Name'))

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/10. Input Product Offering Code'), 'MGIPVOSK')

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/11. Button Search POT KTA'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/12. Select Product Offering'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/13. Button Next New App'))

WebUI.delay(3)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/14. Seacrh Customer Name'))

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/15. Input Customer Name'), 'INTANI TEST')

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/16. Button Search Customer Name'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/17. Select Customer Name'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/18. Button SaveContinue Customer'))

WebUI.delay(3)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/19. Button SaveCountinue Referantor Data'))

