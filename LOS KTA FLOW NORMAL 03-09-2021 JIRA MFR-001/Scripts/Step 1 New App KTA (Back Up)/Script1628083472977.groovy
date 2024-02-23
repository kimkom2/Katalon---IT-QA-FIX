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

WebUI.openBrowser('http://172.16.26.81/CONFINS_TRAIN/Main.aspx')

'User Credit Admin - Employee Loan'
WebUI.setText(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/1. Input User Name'), '32610918')

WebUI.setEncryptedText(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/2. Input Password'), 'p4y+y39Ir5OGQkBUoox0IA==')

WebUI.click(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/3. Button Log In'))

WebUI.delay(3)

WebUI.click(findTestObject('New APP KTA/Page_NEW CONFINS LOGIN PAGE/4. Select Role CA Employee Loan'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/5. Main Menu'))

WebUI.selectOptionByValue(findTestObject('New APP KTA/Page_New Confins - Main/6. Sub Menu'), '109', true)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/7. New App KTA'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/8. Add New App KTA'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/9. Search Product Offering Name'))

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/10. Input Product Offering Code'), 'MGIPVOSK')

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/11. Button Search POT KTA'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/12. Select Product Offering'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/13. Button Next New App'))

WebUI.delay(3)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/14. Seacrh Customer Name'))

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/15. Input Customer Name'), 'INTANI TEST')

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/16. Button Search Customer Name'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/17. Select Customer Name'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/18. Button SaveContinue Customer'))

WebUI.delay(3)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/19. Button SaveCountinue Referantor Data'))

WebUI.delay(3)

'Ubah secara sequence setiap running ulang'
WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/20. Input Prospect No'), '501APP2021020000IRK')

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/21. Input Tenor'), '12')

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/22. td_Number Of Installment'))

WebUI.selectOptionByValue(findTestObject('New APP KTA/Page_New Confins - Main/23. Payment Frequency KTA'), '1', true)

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/24. td_Fixed Rate'))

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/25. Marketing Officer'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/26. Application Source'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/27. Way Of Payment'), '8', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/28. Customer Notification By'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/29. Copy Address From'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/30. Button Copy Address'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('New APP KTA/Page_New Confins - Main/31. Customer Address Distance'), 'RANGE2', true)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/32. Button SaveContinue Application Data'))

WebUI.delay(4)

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/33. Loan Object'), '5', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/34. Bank Name Loan Data'))

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/35. Input Bank Name'), 'BANK BCA')

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/36. Button Search Bank Name'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/37. Select Bank Name'))

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/38. Input Bank Branch'), 'JAKARTA')

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/39. Input Account Name'), 'INTANI TEST')

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/40. Input Account No'), '12762818278728')

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/41. Input Financing Amount'))

WebUI.doubleClick(findTestObject('New APP KTA/Page_New Confins - Main/41. Input Financing Amount'))

WebUI.sendKeys(findTestObject('New APP KTA/Page_New Confins - Main/41. Input Financing Amount'), '1000000')

WebUI.delay(2)

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/42. Input Notes'), 'TEST')

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/43. Button SaveCountinue Loan Data'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/44. Cover Life Insurance'))

WebUI.selectOptionByIndex(findTestObject('New APP KTA/Page_New Confins - Main/45. Life Insco Branch Name'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/46. Customer Insured'))

WebUI.selectOptionByValue(findTestObject('New APP KTA/Page_New Confins - Main/47. Premium Payment Method'), 'FO', true)

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/48. Button SaveContinue Life Insurance'))

WebUI.delay(3)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/49. Button Calculate Financial Data'))

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/52. Button Calculate Installment'))

WebUI.delay(4)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/53. Button SaveContinue Financial Data'))

WebUI.delay(3)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/54. Button Calculate Commission Data'))

WebUI.delay(2)

WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/55. Button SaveCountinue Commission Data'))

WebUI.delay(2)

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/56. Other Info - Purpose'), '-')

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/57. Other Info - Asset Financed'), '-')

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/58. Other Info - SourceOfIncome'), '-')

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/59. Other Info - Ticket Number'), '-')

WebUI.setText(findTestObject('New APP KTA/Page_New Confins - Main/60. Other Info - Reference No Internal Agent'), '-')

'selanjutnya Tahap Term Condition dilakukan secara manual, melalui Confins_Test'
WebUI.click(findTestObject('New APP KTA/Page_New Confins - Main/61. Button SaveCountinue Other Data'))

