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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://banksystem-demoshop.herokuapp.com/')

WebUI.doubleClick(findTestObject('Object Repository/Buy/Page_DemoShop/a_Login'))

WebUI.setText(findTestObject('Object Repository/Buy/Page_DemoShop/input_Email_Input.Email'), 'deo.kichi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Buy/Page_DemoShop/input_Password_Input.Password'), 'nbPRAawFRnE=')

WebUI.click(findTestObject('Object Repository/Buy/Page_DemoShop/button_Log in'))

WebUI.click(findTestObject('Object Repository/Buy/Page_DemoShop/a_DemoShop'))

WebUI.doubleClick(findTestObject('Object Repository/Buy/Page_DemoShop/button_Pay by card'))

WebUI.click(findTestObject('Object Repository/Buy/Page_DemoShop/input_Card number_Number'))

WebUI.setText(findTestObject('Object Repository/Buy/Page_DemoShop/input_Card number_Number'), '2013576689276962')

WebUI.setText(findTestObject('Object Repository/Buy/Page_DemoShop/input_Cardholder name_Name'), 'deo deo')

WebUI.setText(findTestObject('Object Repository/Buy/Page_DemoShop/input_Expiration date_ExpiryDate'), '12/24')

WebUI.setText(findTestObject('Object Repository/Buy/Page_DemoShop/input_Security code_SecurityCode'), '285')

WebUI.click(findTestObject('Object Repository/Buy/Page_DemoShop/button_Pay'))

WebUI.click(findTestObject('Object Repository/Buy/Page_DemoShop/div_Completed'))

WebUI.click(findTestObject('Object Repository/Buy/Page_DemoShop/h4_Camera'))

WebUI.click(findTestObject('Object Repository/Buy/Page_DemoShop/html_DemoShop            katalonfont-family_03283f'))

WebUI.click(findTestObject('Object Repository/Buy/Page_DemoShop/button_Logout'))

WebUI.closeBrowser()

