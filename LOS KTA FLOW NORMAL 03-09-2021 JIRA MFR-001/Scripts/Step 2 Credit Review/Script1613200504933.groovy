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

WebUI.click(findTestObject('Credit Review/Page_New Confins - Main/7. Credit Review'))

WebUI.delay(2)

'Cek skenario Flow Normal no 29 & Negative flow no 2'
WebUI.setText(findTestObject('Credit Review/Page_New Confins - Main/8. Input Application No'), '501APP2021020000IR1')

WebUI.click(findTestObject('Credit Review/Page_New Confins - Main/9. Button Search - Credit Review'))

WebUI.delay(2)

WebUI.click(findTestObject('Credit Review/Page_New Confins - Main/10. Button Review'))

WebUI.delay(2)

WebUI.click(findTestObject('Credit Review/Page_New Confins - Main/11. Approval Recommendation'))

WebUI.delay(2)

'Cek skenario Flow Normal no 30'
WebUI.selectOptionByIndex(findTestObject('Credit Review/Page_New Confins - Main/12. Reason Description - Credit Review'), 
    '1', FailureHandling.CONTINUE_ON_FAILURE)

'Cek Skenario Flow Normal no 31'
WebUI.selectOptionByIndex(findTestObject('Credit Review/Page_New Confins - Main/13. To be Approved By - Credit Review'), 
    '1', FailureHandling.CONTINUE_ON_FAILURE)

'Cek Skenario Flow Normal no 32'
WebUI.setText(findTestObject('Credit Review/Page_New Confins - Main/14. Notes - Credit Review'), 'test')

'Cek Skenario Flow Normal no 33'
WebUI.setText(findTestObject('Credit Review/Page_New Confins - Main/15. Strength - Credit Review'), 'OK')

'Cek Skenario Flow Normal no 34'
WebUI.setText(findTestObject('Credit Review/Page_New Confins - Main/16. Weakness - Credit Review'), 'OK')

'Cek Skenario Flow Normal no 35'
WebUI.setText(findTestObject('Credit Review/Page_New Confins - Main/17. Opportunity - Credit Review'), 'OK')

'Cek Skenario Flow Normal no 36'
WebUI.setText(findTestObject('Credit Review/Page_New Confins - Main/18. Thread - Credit Review'), 'OK')

WebUI.click(findTestObject('Credit Review/Page_New Confins - Main/19. Submit - Credit Review'))

