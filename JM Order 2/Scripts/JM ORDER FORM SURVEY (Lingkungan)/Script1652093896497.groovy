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

Mobile.startApplication('C:\\Users\\ho.hendy\\Downloads\\APK JM Order 2, di pakai untuk Katalon\\JMOrder 1.1.0.0.1 dev.apk', 
    true)

Mobile.setText(findTestObject('Object Repository/Step 7 Survery Data/android.widget.EditText'), 'HermanMKT', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Step 7 Survery Data/android.widget.EditText (1)'), 'p4y+y39Ir5OGQkBUoox0IA==', 
    0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.LinearLayout'), 0)

Mobile.setText(findTestObject('Object Repository/Step 7 Survery Data/android.widget.EditText - Masukkan kata kunci (1)'), 
    'W839220500002', 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.LinearLayout (1)'), 0)

WebUI.delay(0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.RelativeLayout (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Survery Lingkungan/android.widget.EditText - Nama Pemberi Informasi'), 
    'Ho HO test', 0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.TextView - Pilih'), 0)

Mobile.setText(findTestObject('Object Repository/Survery Lingkungan/android.widget.EditText (2)'), 'Rekan usaha', 0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.TextView - Rekan Usaha'), 0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.TextView - Pilih (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Survery Lingkungan/android.widget.EditText (3)'), 'Benar', 0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.TextView - Benar'), 0)

Mobile.setText(findTestObject('Object Repository/Survery Lingkungan/android.widget.EditText - Lama Tinggal jika benar (tahun)'), 
    '12', 0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.TextView - Pilih (2)'), 0)

Mobile.setText(findTestObject('Survery Lingkungan/android.widget.EditText (4)'), '<30', 0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.TextView - 30 Hari'), 0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.TextView - Pilih (3)'), 0)

Mobile.setText(findTestObject('Object Repository/Survery Lingkungan/android.widget.EditText (4)'), 'Sering', 0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.TextView - Sering'), 0)

Mobile.switchToLandscape()

Mobile.scrollToText('Simpan')

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.TextView - Pilih (4)'), 0)

Mobile.setText(findTestObject('Survery Lingkungan/android.widget.EditText (5)'), 'Tidak', 0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.TextView - Tidak'), 0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.TextView - Pilih (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.TextView - Ada, dalam 5 tahun terakhir'), 
    0)

Mobile.setText(findTestObject('Object Repository/Survery Lingkungan/android.widget.EditText - Sumber Negative Information'), 
    'Test', 0)

Mobile.tap(findTestObject('Object Repository/Survery Lingkungan/android.widget.Button - SIMPAN (1)'), 0)

