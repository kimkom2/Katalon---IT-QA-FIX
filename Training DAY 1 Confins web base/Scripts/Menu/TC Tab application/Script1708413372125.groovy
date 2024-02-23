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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Baca semua kolom yang ada di data excel start in here
TestData Datahohendy = findTestData('Data Files/Application/Tab Application data')

// Baca semua kolom yang ada di data excel END in here
WebUI.switchToDefaultContent()

number = WebUI.getText(findTestObject('Menu/Credit admin/Page_New Confins - Main/Application Number'))

println(number)

WebUI.setText(findTestObject('Menu/Credit admin/Page_New Confins - Main/input Prospect no'), number)

// contoh untuk buat parameter nya di excel tenor.
WebUI.setText(findTestObject('Menu/Credit admin/Page_New Confins - Main/input Tenor'), Datahohendy.getValue('Tenor', 1))

// start contoh untuk buat parameter nya di excel Payment Frequency.
if (Datahohendy.getValue('Pay', 1) == 'MONTHLY') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Payment Frequency'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        2)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Pay Ferquency obj/Pay MONTHLY'))
}

if (Datahohendy.getValue('Pay', 1) == 'BIMONTHLY') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Payment Frequency'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        2)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Pay Ferquency obj/Pay BIMONTHLY'))
}

if (Datahohendy.getValue('Pay', 1) == 'QUARTERLY') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Payment Frequency'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        2)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Pay Ferquency obj/Pay QUARTERLY'))
}

if (Datahohendy.getValue('Pay', 1) == 'TRIMESTER') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Payment Frequency'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        2)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Pay Ferquency obj/Pay TRIMESTER'))
}

if (Datahohendy.getValue('Pay', 1) == 'SEMI ANNUALY') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Payment Frequency'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        2)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Pay Ferquency obj/Pay SEMI ANNUALY'))
}

if (Datahohendy.getValue('Pay', 1) == 'ANNUALY') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Payment Frequency'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        2)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Pay Ferquency obj/Pay ANNUALY'))
}

// End contoh untuk buat parameter nya di excel Payment Frequency.
WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Menu/Credit admin/Page_New Confins - Main/List Interest Type'))

WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
    0)

if (Datahohendy.getValue('Interest Type', 1) == 'Float Rate') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Float Rate'))

    WebUI.switchToDefaultContent()

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Select folating'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        0)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/BI monthly' //	
            //	WebUI.click(findTestObject('null'))
            ))
} else {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Fixed Rate'))
}

WebUI.switchToDefaultContent()

// start parameter ins scheme
if (Datahohendy.getValue('Installment Scheme', 1) == 'Regular') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Insallment scheme'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        2)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Inst scheme obj/Regular scheme'))
}

if (Datahohendy.getValue('Installment Scheme', 1) == 'Irregular') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Insallment scheme'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        2)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Inst scheme obj/Irregular scheme'))
}

if (Datahohendy.getValue('Installment Scheme', 1) == 'Up Down') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Insallment scheme'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        2)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Inst scheme obj/Up Down scheme'))
}

if (Datahohendy.getValue('Installment Scheme', 1) == 'Even Principle') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Insallment scheme'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        2)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Inst scheme obj/Even Principle scheme'))
}

if (Datahohendy.getValue('Installment Scheme', 1) == 'Balloon') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Insallment scheme'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        2)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Inst scheme obj/Balloon scheme'))
}

if (Datahohendy.getValue('Installment Scheme', 1) == 'Daily Interest') {
    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Insallment scheme'))

    WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 
        2)

    WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Inst scheme obj/Daily Interest scheme'))
}

// end parameter ins scheme

// marketing officer start
WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Marketing Officer'))

WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/iframe_Term  Condition_appForm'), 2)

WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/List Mkt Officer/ACHMAD SAIHU'))

WebUI.switchToDefaultContent()
//// marketing officer end

WebUI.scrollToElement(findTestObject('Menu/Credit admin/Page_New Confins - Main/List Application source'), 2)

WebUI.click(findTestObject('Menu/Credit admin/Page_New Confins - Main/List Application source'))

WebUI.selectOptionByValue(findTestObject('Menu/Credit admin/Page_New Confins - Main/List Application source'), 'X', true)

WebUI.selectOptionByValue(findTestObject('Menu/Credit admin/Page_New Confins - Main/List way of payment'), 'AUTODEBET', 
    true)

WebUI.selectOptionByValue(findTestObject('Menu/Credit admin/Page_New Confins - Main/List cutomer Notification'), 'CALL', 
    true)

WebUI.click(findTestObject('Menu/Credit admin/Page_New Confins - Main/List Copy address Form'))

WebUI.selectOptionByValue(findTestObject('Menu/Credit admin/Page_New Confins - Main/List Copy address Form'), '1', true)

WebUI.click(findTestObject('Menu/Credit admin/Page_New Confins - Main/Button Copy Address'))

WebUI.click(findTestObject('Menu/Credit admin/Page_New Confins - Main/List Cust Address Distance'))

WebUI.selectOptionByValue(findTestObject('Menu/Credit admin/Page_New Confins - Main/List Cust Address Distance'), 'RANGE2', 
    false)

