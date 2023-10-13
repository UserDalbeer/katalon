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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fpomisuat.dhwaniris.in/site/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Sign in_LoginFormusername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Sign in_Userspassword'), 'ip6RfAiuxbLo2q9dcsd55A==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Governance  Compliances'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Compliances and Frequency'))

WebUI.click(findTestObject('Object Repository/Page_Compliance and Frequency/a_Create Compliance Frequency'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('fpo/Page_Create Compliance And Frequency/level'), level, false)

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('fpo/Page_Create Compliance And Frequency/multiple_i'), checkO, false)

WebUI.selectOptionByValue(findTestObject('fpo/Page_Create Compliance And Frequency/multiple_i'), checkT, false)

WebUI.selectOptionByValue(findTestObject('fpo/Page_Create Compliance And Frequency/multiple_i'), checkthree, false)

WebUI.selectOptionByValue(findTestObject('fpo/Page_Create Compliance And Frequency/multiple_i'), checkfour, false)

WebUI.selectOptionByValue(findTestObject('fpo/Page_Create Compliance And Frequency/multiple_i'), checkfive, false)

WebUI.selectOptionByValue(findTestObject('Page_Create Compliance And Frequency/select_Select compliance DIR-12    Any chan_4b558a'), 
    '14', false)

WebUI.selectOptionByValue(findTestObject('Page_Create Compliance And Frequency/second'), '11', false)

WebUI.click(findTestObject('Object Repository/Page_Create Compliance And Frequency/input_Start date_ComplianceFrequencystart_date'))

WebUI.click(findTestObject('Object Repository/Page_Create Compliance And Frequency/td_10'))

WebUI.click(findTestObject('Object Repository/Page_Create Compliance And Frequency/input_Dead line_ComplianceFrequencydead_line_date'))

WebUI.click(findTestObject('Object Repository/Page_Create Compliance And Frequency/td_13'))

WebUI.setText(findTestObject('Object Repository/Page_Create Compliance And Frequency/input_Narration_ComplianceFrequencynarration'), 
    'demo testing')

WebUI.click(findTestObject('Object Repository/Page_Create Compliance And Frequency/input_Dead line_ComplianceFrequencydead_line_date'))

WebUI.setText(findTestObject('Object Repository/Page_Create Compliance And Frequency/input_Alert_ComplianceFrequencyalert'), 
    '103')

WebUI.click(findTestObject('KKK/Page_Create Compliance And Frequency/Create'))

