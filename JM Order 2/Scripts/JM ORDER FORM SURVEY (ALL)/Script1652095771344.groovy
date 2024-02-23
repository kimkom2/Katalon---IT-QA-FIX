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

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.RelativeLayout'), 0)

WebUI.delay(0)

Mobile.tap(findTestObject('Object Repository/Pembenaran camera survery/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Pembenaran camera survery/android.widget.TextView - Capture photo from camera'), 
    0)

Mobile.tapAndHold(findTestObject('Object Repository/Pembenaran camera survery/android.view.View'), 0, 0)

Mobile.tap(findTestObject('Object Repository/Pembenaran camera survery/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Pembenaran camera survery/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Pembenaran camera survery/android.widget.ImageView (2)'), 0)

WebUI.delay(0)

Mobile.setText(findTestObject('Object Repository/Step 7 Survery Data/android.widget.EditText - Domisili RT'), '333', 0)

Mobile.setText(findTestObject('Object Repository/Step 7 Survery Data/android.widget.EditText - Domisili  RW'), '444', 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.TextView - Pilih'), 0)

Mobile.setText(findTestObject('Object Repository/Step 7 Survery Data/android.widget.EditText (2)'), 'Jakarta Barat', 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.TextView - JAKARTA BARAT'), 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.TextView - Pilih (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 7 Survery Data/android.widget.EditText (3)'), 'Tambora', 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.TextView - TAMBORA'), 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.TextView - Pilih (2)'), 0)

Mobile.setText(findTestObject('Step 7 Survery Data/android.widget.EditText (3)'), 'Jembatan lima', 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.TextView - JEMBATAN LIMA'), 0)

Mobile.scrollToText('Kondisi Tempat Tinggal')

Mobile.setText(findTestObject('Object Repository/Step 7 Survery Data/android.widget.EditText - Detil Tujuan Pembiayaan'), 
    'Coba', 0)

Mobile.tap(findTestObject('Step 7 Survery Data/android.widget.TextView - Pilih (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Step 7 Survery Data/android.widget.EditText (4)'), 'Permanen', 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.TextView - Permanen'), 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.CheckBox - Jalan Raya'), 0)

Mobile.scrollToText('Simpan')

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.TextView - Pilih (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.TextView - Terawat'), 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.CheckBox - Garasi Cukup Motor'), 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.TextView - Pilih (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.TextView - Tidak'), 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.TextView - Pilih (6)'), 0)

Mobile.tap(findTestObject('Step 7 Survery Data/android.widget.TextView - Tidak'), 0)

Mobile.tap(findTestObject('Object Repository/Step 7 Survery Data/android.widget.Button - SIMPAN'), 0)

'Jeda Pemohon ke lingkungan\r\n'
WebUI.delay(3)

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

Mobile.switchToPortrait()

'Jeda Pemohon ke lingkungan\r\n'
WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.TextView - Proffesional'), 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.CheckedTextView - Proffesional'), 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.TextView - Pilih'), 0)

Mobile.setText(findTestObject('Object Repository/Survery data pekerjaan/android.widget.EditText'), 'Dokter', 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.TextView - Dokter'), 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.TextView - Pilih (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.TextView - 1111 - Tanaman Pangan - Padi'), 
    0)

Mobile.setText(findTestObject('Object Repository/Survery data pekerjaan/android.widget.EditText - Nama Perusahaan'), 'Ho MPM', 
    0)

Mobile.setText(findTestObject('Object Repository/Survery data pekerjaan/android.widget.EditText - Kode Area  No. Kantor'), 
    '0216690571', 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.TextView - Pilih (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.CheckedTextView - Permanen'), 0)

Mobile.setText(findTestObject('Object Repository/Survery data pekerjaan/android.widget.EditText - Alamat Kantor'), 'Rasuna said', 
    0)

Mobile.tap(findTestObject('Survery data pekerjaan/android.widget.TextView - Pilih (6)'), 0)

Mobile.tap(findTestObject('Survery data pekerjaan/android.widget.TextView - BUKAN PEMILIK - Bendahara'), 0)

Mobile.scrollToText('Simpan')

Mobile.setText(findTestObject('Object Repository/Survery data pekerjaan/android.widget.EditText - RT'), '333', 0)

Mobile.setText(findTestObject('Object Repository/Survery data pekerjaan/android.widget.EditText - RW'), '444', 0)

Mobile.tap(findTestObject('Survery data pekerjaan/android.widget.TextView - Pilih (3)'), 0)

Mobile.setText(findTestObject('Survery data pekerjaan/android.widget.EditText (1)'), 'Jakarta barat', 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.TextView - JAKARTA BARAT'), 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.TextView - Pilih (4)'), 0)

Mobile.setText(findTestObject('Object Repository/Survery data pekerjaan/android.widget.EditText (2)'), 'Tambora', 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.TextView - TAMBORA'), 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.TextView - Pilih (5)'), 0)

Mobile.setText(findTestObject('Survery data pekerjaan/android.widget.EditText (2)'), 'Jembatan lima', 0)

Mobile.tap(findTestObject('Object Repository/Survery data pekerjaan/android.widget.TextView - JEMBATAN LIMA'), 0)

Mobile.setText(findTestObject('Object Repository/Survery data pekerjaan/android.widget.EditText - 0'), '5000000', 0)

Mobile.setText(findTestObject('Object Repository/Survery data pekerjaan/android.widget.EditText - 0 (1)'), '1000000', 0)

Mobile.switchToLandscape()

Mobile.scrollToText('Simpan')

Mobile.tap(findTestObject('Survery data pekerjaan/android.widget.Button - SIMPAN'), 0)

Mobile.switchToPortrait()

