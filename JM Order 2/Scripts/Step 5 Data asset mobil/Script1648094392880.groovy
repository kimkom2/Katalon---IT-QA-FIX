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

Mobile.tap(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.TextView - Pilih'), 0)

Mobile.tap(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.CheckedTextView - Pembiayaan Mobil Baru'), 
    0)

Mobile.tap(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.TextView - Pilih (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.CheckedTextView - DEALER WALK IN'), 
    0)

Mobile.tap(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.TextView - Pilih (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.EditText'), 'HONDA HRV 1.5 S CVT', 
    0)

Mobile.tap(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.TextView - HONDA HRV 1.5 S CVT'), 
    0)

Mobile.tap(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.TextView - Pilih (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.CheckedTextView - 2022'), 0)

Mobile.setText(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.EditText - 0'), '250000000', 0)

Mobile.setText(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.EditText - 0 (1)'), '100000000', 
    0)

Mobile.setText(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.EditText - 0 (2)'), '12', 0)

Mobile.tap(findTestObject('Object Repository/Step 5 - Data Asset mobil/android.widget.Button - Selanjutnya'), 0)

Mobile.closeApplication()

Mobile.verifyElementText(findTestObject('Step 5 - Data Asset mobil/android.widget.Button - Selanjutnya'), 'Selanjutnya')

