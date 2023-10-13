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

WebUI.navigateToUrl('https://staging.cityfinance.in/')

WebUI.click(findTestObject('Object Repository/Page_City finance/img'))

WebUI.click(findTestObject('Object Repository/Page_City finance/button_Login for 15th FC Grant'))

WebUI.click(findTestObject('Object Repository/Page_City finance/input_XV-FC recommended Urban Local Body Fi_7e1991'))

WebUI.click(findTestObject('Object Repository/Page_City finance/div_ULB'))

WebUI.setText(findTestObject('Object Repository/Page_City finance/input_Sign In_mat-input-0'), '800429')

WebUI.setText(findTestObject('Object Repository/Page_City finance/input_Census CodeULB Code_mat-input-1'), 'ulb@123')

WebUI.click(findTestObject('Object Repository/Page_City finance/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_City finance/button_2023-24'))

WebUI.click(findTestObject('Object Repository/Page_City finance/span_Open Defecation Free (ODF)'))

//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0, 500);");
WebUI.click(findTestObject('Page_City finance/div_Single Select'))

WebUI.click(findTestObject('Page_City finance/span_ODF'))

WebUI.click(findTestObject('Object Repository/Page_City finance/button_Upload PDF'))

