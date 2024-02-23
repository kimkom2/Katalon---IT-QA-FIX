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

Mobile.startApplication('C:\\Users\\ho.hendy\\Downloads\\MobWo 1.1.0.9.2 dev.apk', true)

Mobile.setText(findTestObject('Object Repository/Step 1/android.widget.EditText'), 'HermanMKT', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Step 1/android.widget.EditText (1)'), 'p4y+y39Ir5OGQkBUoox0IA==', 
    0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.TextView - Please Select'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.CheckedTextView - Aplikasi Baru'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.Button - Selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.TextView - Pilih'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.CheckedTextView - Single'), 0)

Mobile.tap(findTestObject('Step 1/android.widget.Button - Selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.Button - BROWSE'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.TextView - Capture photo from camera'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/Step 1/android.view.View'), 0, 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.RelativeLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.TextView - Pilih (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.CheckedTextView - E-KTP'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1/android.widget.EditText - NIK'), '3073042711880007', 0)

Mobile.setText(findTestObject('Object Repository/Step 1/android.widget.EditText - Nama'), 'HO hendy', 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.TextView - Pilih (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1/android.widget.CheckedTextView - Laki-laki'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1/android.widget.EditText - Tempat Lahir'), 'Jakarta', 0)

Mobile.setText(findTestObject('Object Repository/Step 1/android.widget.EditText - Tanggal Lahir'), '27/11/1988', 0)

Mobile.scrollToText('RW')

Mobile.setText(findTestObject('Object Repository/Step 1/android.widget.EditText - 123'), '312', 0)

Mobile.setText(findTestObject('Object Repository/Step 1/android.widget.EditText - RT'), '333', 0)

Mobile.closeApplication()

