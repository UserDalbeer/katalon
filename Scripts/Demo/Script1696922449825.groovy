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

WebUI.navigateToUrl('https://staging.cityfinance.in/ulb-form/gfc')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_City finance/button_Login for Rankings 2022'))

WebUI.setText(findTestObject('Object Repository/Page_City finance/input_Sign In_mat-input-0'), '800419')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_City finance/input_Census CodeULB Code_mat-input-1'), '9NLz+4tGZcQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_City finance/input_Census CodeULB Code_mat-input-1'), 'r9Ul8CpmE+s=')

WebUI.click(findTestObject('Object Repository/Page_City finance/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_City finance/span_Contact information'))

WebUI.click(findTestObject('Object Repository/Page_City finance/div_Financial Information'))

WebUI.click(findTestObject('Object Repository/Page_City finance/span_Upload Financial Documents'))

WebUI.scrollToPosition(80, 0)

WebUI.delay(10)

WebUI.uploadFile(findTestObject('FR/Page_City finance/div'), filenew)

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Page_City finance/div_Select File'), filetw)

WebUI.delay(5)

WebUI.uploadFile(findTestObject('FR/Page_City finance/Filethree'), fileth)

WebUI.delay(5)

WebUI.uploadFile(findTestObject('FR/Page_City finance/Filefour'), filefo)

