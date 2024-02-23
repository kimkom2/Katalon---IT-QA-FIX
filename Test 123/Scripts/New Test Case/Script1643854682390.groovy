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

Mobile.startApplication('C:\\Users\\ho.hendy\\Downloads\\MobWo 1.1.0.9.1 dev.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - User ID '), 0)

WebUI.delay(3)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - HermanMKT'), 'HermanMKT', 0)

WebUI.delay(3)

Mobile.setEncryptedText(findTestObject('Object Repository/android.widget.EditText'), 'p4y+y39Ir5OGQkBUoox0IA==', 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Login'), 0)

