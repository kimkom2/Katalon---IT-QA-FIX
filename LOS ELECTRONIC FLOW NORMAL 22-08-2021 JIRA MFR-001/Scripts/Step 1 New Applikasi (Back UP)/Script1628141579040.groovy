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

WebUI.setText(findTestObject('Step 1 New Application/1 NRK'), '30520811')

WebUI.setEncryptedText(findTestObject('Step 1 New Application/2 Password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('Step 1 New Application/3 Login'))

WebUI.click(findTestObject('Step 1 New Application/4 Menu Gede'))

WebUI.selectOptionByValue(findTestObject('Step 1 New Application/5 Sub Menu 109 los'), '109', true)

WebUI.click(findTestObject('Step 1 New Application/6 New App Electronic'))

WebUI.click(findTestObject('Step 1 New Application/7 Add Applikasi'))

WebUI.click(findTestObject('Step 1 New Application/8 Cari Product offering'))

WebUI.setText(findTestObject('Step 1 New Application/60 Product offering code'), 'MGIPMPR000')

WebUI.click(findTestObject('Step 1 New Application/9 SEARCH Prodcut offering'))

WebUI.click(findTestObject('Step 1 New Application/10 Select Product offering'))

WebUI.setText(findTestObject('Step 1 New Application/11 Input num asset'), '1')

WebUI.click(findTestObject('Step 1 New Application/12 Next Applikasi'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/13 Cari Customer'))

WebUI.setText(findTestObject('Step 1 New Application/14 Input customer'), 'HO HENDY')

WebUI.click(findTestObject('Step 1 New Application/15 SEARCH Customer'))

WebUI.click(findTestObject('Step 1 New Application/16 Select Customer'))

WebUI.click(findTestObject('Step 1 New Application/17 SaveCont Customer'))

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/18 SaveCont Guarantor'))

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/19 SaveCont Referantor'))

WebUI.delay(5)

WebUI.setText(findTestObject('Step 1 New Application/20 ProspectNo'), '532APP20200800190')

WebUI.delay(2)

WebUI.setText(findTestObject('Step 1 New Application/21 Tenor'), '24')

WebUI.click(findTestObject('Step 1 New Application/22 Payment frequency'))

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/22 Payment frequency'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/23 marketing officer'))

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/23 marketing officer'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/24 Application Source'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/25 Way of payment'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/26 Customer Notifiation By'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Step 1 New Application/27 Copy address form'), '1', true)

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/28 Address distance'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/28 Copy address button'))

WebUI.click(findTestObject('Step 1 New Application/29 SaveCont Application data'))

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/30 Add Asset data'))

WebUI.click(findTestObject('Step 1 New Application/31 Cari supplier branch name'))

WebUI.setText(findTestObject('Step 1 New Application/32 Input supplier branch name'), 'AGIL MOTOR')

WebUI.click(findTestObject('Step 1 New Application/33 SEARCH Supplier branch name'))

WebUI.click(findTestObject('Step 1 New Application/34 Select Supplier branch name'))

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/35 sales person name'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Step 1 New Application/36 Cari Asset name'))

WebUI.setText(findTestObject('Step 1 New Application/37 input_Asset Name'), 'ACER ELECTRONIC I3 4740 LAPTOP C-I3 4740')

WebUI.click(findTestObject('Step 1 New Application/38 SEARCH Asset name'))

WebUI.click(findTestObject('Step 1 New Application/39 Select Asset name'))

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/40 Year'))

WebUI.doubleClick(findTestObject('Step 1 New Application/40 Year'))

WebUI.sendKeys(findTestObject('Step 1 New Application/40 Year'), '2020')

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/41 Asset Price'))

WebUI.doubleClick(findTestObject('Step 1 New Application/41 Asset Price'))

WebUI.sendKeys(findTestObject('Step 1 New Application/41 Asset Price'), '15000000')

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/42 DP'))

WebUI.doubleClick(findTestObject('Step 1 New Application/42 DP'))

WebUI.sendKeys(findTestObject('Step 1 New Application/42 DP'), '5000000')

WebUI.delay(5)

WebUI.setText(findTestObject('Step 1 New Application/43 Warna'), 'HITAM')

WebUI.setText(findTestObject('Step 1 New Application/44 No series'), 'Test 123')

WebUI.setText(findTestObject('Step 1 New Application/45 Type'), 'Test 123')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Step 1 New Application/46 Wilayah'), 'REGION 2', true)

WebUI.selectOptionByValue(findTestObject('Step 1 New Application/47 Asset usage'), 'N', true)

WebUI.click(findTestObject('Step 1 New Application/48 Save asset data'))

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/49 SaveCont Asset data'))

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/50 edit insurance data'))

WebUI.click(findTestObject('Step 1 New Application/51 Off sistem'))

WebUI.click(findTestObject('Step 1 New Application/52 Save Insurance'))

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/53 Next insurance data'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/54 SaveCont Insurance data'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/55 SaveCont Life insurance data'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/56 CalculateFees'))

WebUI.delay(2)

WebUI.setText(findTestObject('Step 1 New Application/57 Rate'), '50')

WebUI.click(findTestObject('Step 1 New Application/58 CalculateFinancialData'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/59 SaveCont Financial data'))

