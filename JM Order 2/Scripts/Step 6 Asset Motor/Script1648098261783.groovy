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
import org.openqa.selenium.Keys as Keys

Mobile.tap(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.TextView - Pilih'), 0)

Mobile.tap(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.CheckedTextView - Pembiayaan Motor Baru'), 
    0)

Mobile.tap(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.TextView - Pilih (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.CheckedTextView - DEALER WALK IN'), 0)

Mobile.tap(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.TextView - Pilih (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.EditText'), 'HONDA - Beat CBS Fi', 0)

Mobile.tap(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.TextView - HONDA - Beat CBS FI'), 0)

Mobile.tap(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.TextView - Pilih (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.CheckedTextView - 2022'), 0)

Mobile.setText(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.EditText - 0'), '25000000', 0)

Mobile.setText(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.EditText - 0 (1)'), '10000000', 0)

Mobile.setText(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.EditText - 0 (2)'), '12', 0)

Mobile.tap(findTestObject('Object Repository/Step 6 Asset Motor/android.widget.Button - Selanjutnya'), 0)

