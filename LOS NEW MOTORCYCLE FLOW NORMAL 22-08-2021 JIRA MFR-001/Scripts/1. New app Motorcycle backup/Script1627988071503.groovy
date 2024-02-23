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

WebUI.click(findTestObject('Komponen_Menu_LOS/a_Add'))

WebUI.click(findTestObject('Komponen_Menu_LOS/klikkacapembesar'))

WebUI.setText(findTestObject('Komponen_Menu_LOS/Input Product Offering'), 'MGIPNB0000')

WebUI.click(findTestObject('Komponen_Menu_LOS/search product offering'))

WebUI.click(findTestObject('Komponen_Menu_LOS/select product offering'))

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Next Application'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/search customer'))

WebUI.setText(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/input Customer Name'), 'HO HENDY')

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/search customer name'))

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select Customer name'))

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/save and continue'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/save continue guarantor'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/save and continue referantor'))

WebUI.delay(2)

WebUI.setText(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/input_Prospect No'), '601KA202008000005')

WebUI.setText(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/input_Tenor'), '24')

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Fixed Rate'))

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/select payment frequency'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select Installment Scheme'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select Marketing Officer'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Application Source'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Way of Payment'), '6', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Customer Notification'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Copy Address From'), '3', true)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/button Copy Addres'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Cus Address Distance'), 'RANGE2', true)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Save and continue Tab Application'))

WebUI.delay(4)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Add Asset Data'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Search Supplier branch name asset data'))

WebUI.setText(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/input_Supplier Branch Name'), 'HARI JAYA, CV - GRESIK')

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/search supplier branch asset data'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Select supp branch asset data'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Sales person name asset data'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/search asset name main asset'))

WebUI.setText(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input Asset Name asset data'), 'HONDA - ALL NEW BEAT POP CW (Plus New)')

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/search asset name main asset (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Select Asset Name'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input Manuc year Asset data'), FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input Manuc year Asset data'))

WebUI.sendKeys(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input Manuc year Asset data'), '2020')

WebUI.delay(3)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/input_Asset Price ( Include VAT )'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/input_Asset Price ( Include VAT )'))

WebUI.sendKeys(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/input_Asset Price ( Include VAT )'), 
    '25000000')

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input DP Asset Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input DP Asset Data'))

WebUI.sendKeys(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input DP Asset Data'), '7000000')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Select Asset Usage'), 'N', true)

WebUI.setText(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Input Color'), 'BLACK')

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Select Wilayah'), 'REGION 3', true)

WebUI.click(findTestObject('Komponen_Menu_LOS/Tab Asset Data/Page_New Confins - Main/save asset data next step'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_New Confins - Main/Asset Registration/Input Asset Registrasi'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Asset Registration/Click Checklist self usage'))

WebUI.selectOptionByValue(findTestObject('Page_New Confins - Main/Asset Registration/Select option copy adress asset'), 
    'LEGAL', true)

WebUI.delay(2)

WebUI.click(findTestObject('Page_New Confins - Main/Page_New Confins - Main/Copy Adress new'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_New Confins - Main/Asset Registration/Save Asset registration'))

WebUI.delay(6)

WebUI.click(findTestObject('Page_New Confins - Main/Asset Registration/Save and Continue Asset Data'))

WebUI.delay(4)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Icon pencil insurance data'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select option Insco branch'), '3', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(8)

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select Main Coverage Type Name'), 'TLO', 
    true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select Rate Type'), 'NG', true)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Button Next Insurance Data'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Calculate Insurance Data'))

WebUI.delay(3)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Save calc Insurance Data'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Next to Life'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Save Continue Life'))

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Click Cover Life Insurance'))

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select Life Insco Branch'), '797', true)

WebUI.delay(2)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Customer Insured'))

WebUI.selectOptionByValue(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Select Premium Payment'), 'FP', true)

WebUI.click(findTestObject('Komponen_Menu_LOS/Page_New Confins - Main/Save Continue Life'))

