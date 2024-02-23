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
import com.kms.katalon.entity.global.GlobalVariableEntity as GlobalVariableEntity
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// mana yang mau di select untuk APInya
def getAKH = WS.sendRequest(findTestObject('Object Repository/Postman/getAKH'))

// komponen baku selalu seperti ini
def slurper = new groovy.json.JsonSlurper()
def Responbody = slurper.parseText(getAKH.getResponseBodyContent()) // get akh bisa di rubah kyk table
String AKH = getAKH.getResponseText() // akan selalu string terus, AKH alias get akh bisa di rubah kyk table


for (x = 0 ; x <=1000; x ++) // untuk perulangan
{
	def Flag_alisas = Responbody.data[x].flag_submit 
	
	println(Flag_alisas)
	
	if(Flag_alisas == 'N') // validasi mencari kalau flag harus N baru di jalanin hit
	{		
		// di tampung ke alias dulu sebelum di combine ke global variable
		def Agreement_no_alias = Responbody.data[x].no_agreement
		def NO_AKH_ALIAS = Responbody.data[x].no_akh
		def id_penagih_ALIAS = Responbody.data[x].penagih_id
		
		// cuma buat cek benar ke set tidak pada alias.
		println(Agreement_no_alias)
		println(NO_AKH_ALIAS)
		println(id_penagih_ALIAS)
		
		// global variable yang ada di profiles // buat di panggil di body
		GlobalVariable.Noagrmnt = Agreement_no_alias
		GlobalVariable.NoAKH = NO_AKH_ALIAS
		GlobalVariable.IDpenagih = id_penagih_ALIAS
	break
	}
}

// panggil API yang bersankutan
WS.sendRequestAndVerify(findTestObject('Object Repository/Postman/submitHasilPenagihan'))