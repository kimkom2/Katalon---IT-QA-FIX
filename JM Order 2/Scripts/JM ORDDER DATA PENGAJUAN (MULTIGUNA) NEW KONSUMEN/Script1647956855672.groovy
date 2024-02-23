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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import io.appium.java_client.android.nativekey.KeyEventFlag as KeyEventFlag

Mobile.startApplication('C:\\Users\\ho.hendy\\Downloads\\APK JM Order 2, di pakai untuk Katalon\\JMOrder 1.1.0.0.1 dev.apk', 
    true)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText'), 'HermanMKT', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Login/android.widget.EditText (1)'), 'p4y+y39Ir5OGQkBUoox0IA==', 
    0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - Login'), 0)

WebUI.delay(0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - Pilih'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.CheckedTextView - Single'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.Button - Selanjutnya'), 0)

Mobile.setText(findTestObject('Step 1 - Data pemohon/android.widget.EditText - NIK'), '3173042711880003', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - NIK'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'Cari button search\r\n'
Mobile.tapAtPosition(1075, 2140, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.Button - BROWSE'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - Capture photo from camera'), 
    0)

Mobile.tapAndHold(findTestObject('Object Repository/Step 1 - Data pemohon/android.view.View'), 0, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.RelativeLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.ImageView (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - Nama'), 'Ho Hendy', 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - Tempat Lahir'), 'Jakarta', 
    0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - Tanggal Lahir'), '27/11/1988', 
    0)

Mobile.scrollToText('RW', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - Alamat'), 'Jalan laksa 1', 
    0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - RT'), '123', 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - RW'), '321', 0)

Mobile.tap(findTestObject('Step 1 - Data pemohon/android.widget.TextView - Pilih (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText'), 'Jakarta barat', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - JAKARTA BARAT'), 0)

Mobile.tap(findTestObject('Step 1 - Data pemohon/android.widget.TextView - Pilih (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText (1)'), 'Tambora', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - TAMBORA'), 0)

Mobile.tap(findTestObject('Step 1 - Data pemohon/android.widget.TextView - Pilih (2)'), 0)

Mobile.setText(findTestObject('Step 1 - Data pemohon/android.widget.EditText (2)'), 'Jembatan lima', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - JEMBATAN LIMA'), 0)

Mobile.scrollToText('Jumlah Tanggungan', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - No Handphone'), '0818886224', 
    0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - Nama Ibu Kandung'), 'mama', 
    0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText - Jumlah Tanggungan'), '2', 
    0)

Mobile.tap(findTestObject('Step 1 - Data pemohon/android.widget.TextView - Pilih (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.EditText (2)'), 'sendiri', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - MILIK SENDIRI'), 0)

Mobile.tap(findTestObject('Step 1 - Data pemohon/android.widget.TextView - Pilih (2)'), 0)

Mobile.setText(findTestObject('Step 1 - Data pemohon/android.widget.EditText (2)'), '2010', 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.TextView - 2010'), 0)

Mobile.tap(findTestObject('Object Repository/Step 1 - Data pemohon/android.widget.Button - Selanjutnya (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Step 2 - Data Pengajuan/android.widget.TextView - Pilih'), 0)

Mobile.tap(findTestObject('Object Repository/Step 2 - Data Pengajuan/android.widget.CheckedTextView - Dahsyat - Multiguna Mobil'), 
    0)

Mobile.tap(findTestObject('Object Repository/Step 2 - Data Pengajuan/android.widget.TextView - Pilih (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 2 - Data Pengajuan/android.widget.CheckedTextView - CALL CENTER'), 0)

Mobile.tap(findTestObject('Object Repository/Step 2 - Data Pengajuan/android.widget.TextView - Pilih (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 2 - Data Pengajuan/android.widget.EditText (1)'), 'HONDA ALL NEW BRIO E MT', 
    0)

Mobile.tap(findTestObject('Step 2 - Data Pengajuan/android.widget.TextView - HONDA ALL NEW BRIO E MT'), 0)

Mobile.tap(findTestObject('Object Repository/Step 2 - Data Pengajuan/android.widget.TextView - Pilih (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 2 - Data Pengajuan/android.widget.CheckedTextView - 2022'), 0)

Mobile.setText(findTestObject('Object Repository/Step 2 - Data Pengajuan/android.widget.EditText - 0'), '150000000', 0)

Mobile.setText(findTestObject('Object Repository/Step 2 - Data Pengajuan/android.widget.EditText - NTF Kapitalisasi'), '50000000', 
    0)

Mobile.scrollToText('Selanjutnya', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Pembenaran/android.widget.EditText - 0'), '12', 0)

Mobile.tap(findTestObject('Object Repository/Step 2 - Data Pengajuan/android.widget.Button - Selanjutnya'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Step 3 - Data pekerjaan/android.widget.TextView - Pilih'), 0)

Mobile.tap(findTestObject('Object Repository/Step 3 - Data pekerjaan/android.widget.CheckedTextView - Proffesional'), 0)

Mobile.tap(findTestObject('Object Repository/Step 3 - Data pekerjaan/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Step 3 - Data pekerjaan/android.widget.CheckedTextView - January'), 0)

Mobile.tap(findTestObject('Object Repository/Step 3 - Data pekerjaan/android.widget.Spinner (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 3 - Data pekerjaan/android.widget.CheckedTextView - 2022'), 0)

Mobile.tap(findTestObject('Object Repository/Step 3 - Data pekerjaan/android.widget.Button - Selanjutnya'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Step 4 - Disclaimer/android.widget.EditText - Rencana Tanggal Survey'), '22/03/2022', 0)

Mobile.setText(findTestObject('Object Repository/Step 4 - Disclaimer/android.widget.EditText - Rencana Jam Survey'), '0:0', 
    0)

Mobile.tap(findTestObject('Object Repository/Step 4 - Disclaimer/android.widget.Button - Selanjutnya'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Step 4 - Disclaimer/android.widget.Button - Sumbit Form'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Step 4 - Disclaimer/android.widget.Button - Submit'), 0)

