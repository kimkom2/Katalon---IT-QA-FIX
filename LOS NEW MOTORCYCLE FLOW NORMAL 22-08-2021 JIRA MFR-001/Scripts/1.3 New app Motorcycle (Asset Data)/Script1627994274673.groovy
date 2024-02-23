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

WebUI.setText(findTestObject('Komponen_Login/inputusername'), '18820817')

WebUI.setEncryptedText(findTestObject('Komponen_Login/password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('Komponen_Login/buttonlogin'))

WebUI.click(findTestObject('Komponen_Login/selectRoleCreditAdmin'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/klikmenugede'))

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/sub menu'), '109', true)

WebUI.click(findTestObject('Komponen_Menu_LOS/a_New App Motorcycle'))

WebUI.setText(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Application Number'), '601APP20210400120')

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/EDIT'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Test Referantor Data'))

WebUI.delay(4)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/a_Asset Data_fixing'))

WebUI.delay(4)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Edit 2 Fixing'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Add Asset Data'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Search Supplier branch name asset data'))

WebUI.delay(2)

WebUI.setText(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/input_Supplier Branch Name'), 'HARI JAYA, CV - GRESIK')

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/search supplier branch asset data'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Select supp branch asset data'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Sales person name asset data'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/search asset name main asset'))

WebUI.delay(2)

WebUI.setText(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input Asset Name asset data'), 'HONDA - ALL NEW BEAT POP CW (Plus New)')

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/search asset name main asset (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Select Asset Name'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input Manuc year Asset data'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input Manuc year Asset data'), '2020')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/input_Asset Price ( Include VAT )'), 
    9)

WebUI.doubleClick(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/input_Asset Price ( Include VAT )'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/input_Asset Price ( Include VAT )'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/input_Asset Price ( Include VAT )'), 
    '25000000')

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input DP Asset Data'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input DP Asset Data'), '7000000')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Select Asset Usage'), 'N', true)

WebUI.setText(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input Color'), 'BLACK')

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Select Wilayah'), 'REGION 3', true)

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/save asset data next step'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/a_Save_fixing'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Asset And registration'))

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Clik Self'))

WebUI.selectOptionByValue(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/Copy address'), 'LEGAL', true)

WebUI.delay(2)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/a_Copy'))

WebUI.delay(3)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/a_Save asset'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Perbaikan Pisah LOS/Page_New Confins - Main/input_-_lb_Form_SaveCont'), FailureHandling.CONTINUE_ON_FAILURE)

