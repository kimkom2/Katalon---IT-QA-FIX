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

WebUI.setText(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/1 Application Number'), '532APP20210400050')

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/2 Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/3 edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Application data Spliting/Page_New Confins - Main/4 Referantor Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Perbaikan asset data spliting/Page_New Confins - Main/5 Asset Data'))

WebUI.delay(8)

WebUI.click(findTestObject('Step 1 New Application/30 Add Asset data'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan asset data spliting/Page_New Confins - Main/6 Edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/31 Cari supplier branch name'))

WebUI.delay(2)

WebUI.setText(findTestObject('Step 1 New Application/32 Input supplier branch name'), 'AGIL MOTOR')

WebUI.click(findTestObject('Step 1 New Application/33 SEARCH Supplier branch name'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/34 Select Supplier branch name'))

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Step 1 New Application/35 sales person name'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/36 Cari Asset name'))

WebUI.setText(findTestObject('Step 1 New Application/37 input_Asset Name'), 'LG FREEZER GNV 204 RL')

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/38 SEARCH Asset name'))

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/39 Select Asset name'))

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/40 Year'))

WebUI.doubleClick(findTestObject('Step 1 New Application/40 Year'))

WebUI.sendKeys(findTestObject('Step 1 New Application/40 Year'), '2020')

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/41 Asset Price'))

WebUI.doubleClick(findTestObject('Step 1 New Application/41 Asset Price'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Step 1 New Application/41 Asset Price'), '15000000')

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/42 DP'))

WebUI.doubleClick(findTestObject('Step 1 New Application/42 DP'))

WebUI.sendKeys(findTestObject('Step 1 New Application/42 DP'), '5000000')

WebUI.delay(5)

WebUI.setText(findTestObject('Step 1 New Application/43 Warna'), 'HITAM')

WebUI.delay(2)

WebUI.setText(findTestObject('Step 1 New Application/44 No series'), 'Test 123')

WebUI.delay(2)

WebUI.setText(findTestObject('Step 1 New Application/45 Type'), 'Test 123')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Step 1 New Application/46 Wilayah'), 'REGION 2', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Step 1 New Application/47 Asset usage'), 'N', true)

WebUI.delay(2)

WebUI.click(findTestObject('Step 1 New Application/48 Save asset data'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan asset data spliting/Page_New Confins - Main/8 Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Step 1 New Application/49 SaveCont Asset data'))

