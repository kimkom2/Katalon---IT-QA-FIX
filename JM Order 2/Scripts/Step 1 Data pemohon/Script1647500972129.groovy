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

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - Pilih'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.CheckedTextView - Single'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.Button - Selanjutnya'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - NIK'), '3173042711880003', 
    0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - Pilih (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.CheckedTextView - eKTP'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.Button - BROWSE'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - Capture photo from camera'), 
    0)

Mobile.tapAndHold(findTestObject('Object Repository/Step 1 - Data pemohon/android.view.View'), 0, 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.RelativeLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.ImageView (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - Nama'), 'Ho Hendy', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - Pilih (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.CheckedTextView - Laki-laki'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - Tempat Lahir'), 'Jakarta', 
    0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - Tanggal Lahir'), '27/11/1988', 
    0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - Alamat'), 'Jalan laksa 1', 
    0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - RT'), '123', 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - RW'), '321', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - Pilih (3)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText'), 'Jakarta barat', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - JAKARTA BARAT'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - Pilih (4)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText (1)'), 'Tambora', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - TAMBORA'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - Pilih (5)'), 0)

Mobile.setText(findTestObject(''), 'Jembatan lima', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - JEMBATAN LIMA'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - No Handphone'), '08188823', 
    0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - Nama Ibu Kandung'), 'mama', 
    0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - Jumlah Tanggungan'), '2', 
    0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - Pilih (6)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText (2)'), 'sendiri', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - MILIK SENDIRI'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - Pilih (7)'), 0)

Mobile.setText(findTestObject(''), '2010', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - 2010'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.Button - Selanjutnya (1)'), 0)

Mobile.closeApplication()

