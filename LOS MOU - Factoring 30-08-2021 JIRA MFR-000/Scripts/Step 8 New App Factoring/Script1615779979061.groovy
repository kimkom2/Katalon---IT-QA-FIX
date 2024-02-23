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

WebUI.setText(findTestObject('1 Add Mou Factoring/1 NRK'), '15450517')

WebUI.setEncryptedText(findTestObject('1 Add Mou Factoring/2 Pass'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('1 Add Mou Factoring/3 Login'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/1 Role'))

WebUI.delay(2)

WebUI.click(findTestObject('1 Add Mou Factoring/5 Menu Gede'))

WebUI.selectOptionByValue(findTestObject('1 Add Mou Factoring/6 Menu 109'), '109', true)

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/2 New Application Factoring'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/3 Add'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/4 Product Offering Name'))

WebUI.setText(findTestObject('New APP Factoring/5 Product Offering Code'), 'PMKAPM')

WebUI.click(findTestObject('New APP Factoring/6 SEARCH'))

WebUI.click(findTestObject('New APP Factoring/7 Select'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/8 Next'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/9 Cari customer'))

WebUI.delay(2)

WebUI.setText(findTestObject('New APP Factoring/10 Customer Name'), 'Ho Hendy')

WebUI.click(findTestObject('New APP Factoring/11 SEARCH'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/12 Select'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/13 SaveCont customer'))

WebUI.delay(2)

WebUI.setText(findTestObject('New APP Factoring/14 Prospect No'), '599HO20210300005')

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New APP Factoring/15 MOU NO'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New APP Factoring/16 Application source'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New APP Factoring/17 Copy address form'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('New APP Factoring/18 Copy Address'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/19 SaveCont application data'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/20 Add'))

WebUI.delay(2)

WebUI.setText(findTestObject('New APP Factoring/21 Invoice No'), '599HO20210300005')

WebUI.setText(findTestObject('New APP Factoring/22 Invoice Date'), '03/03/2021')

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/21 Invoice No'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('New APP Factoring/23 Invoice Amount'))

WebUI.sendKeys(findTestObject('New APP Factoring/23 Invoice Amount'), '1000000')

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/21 Invoice No'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/25 cari Customer Factoring'))

WebUI.setText(findTestObject('New APP Factoring/26 input_Customer Name'), 'HO Hendy')

WebUI.click(findTestObject('New APP Factoring/27 SEARCH'))

WebUI.click(findTestObject('New APP Factoring/28 Select'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/29 Receive'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/30 Save'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/31 SaveCont invoice data'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/32 SaveCont collateral data'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/33 Next asuransi'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/34 SaveCont asurnasi'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/35 CalculateFees'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('New APP Factoring/36 interest rate'))

WebUI.sendKeys(findTestObject('New APP Factoring/36 interest rate'), '50')

WebUI.delay(2)

WebUI.setText(findTestObject('New APP Factoring/37 Estimation Effective Date'), '03/03/2021')

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/38 calc installment'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP Factoring/39 SaveCont financial'))

