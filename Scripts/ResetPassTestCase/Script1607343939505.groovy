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

WebUI.click(findTestObject('Object Repository/ResetPass/Page_DemoShop/a_Login'))

WebUI.setText(findTestObject('Object Repository/ResetPass/Page_DemoShop/input_Email_Input.Email'), 'deo.kichi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ResetPass/Page_DemoShop/input_Password_Input.Password'), 'nbPRAawFRnE=')

WebUI.click(findTestObject('Object Repository/ResetPass/Page_DemoShop/button_Log in'))

WebUI.doubleClick(findTestObject('Object Repository/ResetPass/Page_DemoShop/a_Hello deo.kichigmail.com'))

WebUI.doubleClick(findTestObject('Object Repository/ResetPass/Page_DemoShop/a_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/ResetPass/Page_DemoShop/input_Current password_Input.OldPassword'), 
    'ZGlJcp9PvRA=')

WebUI.setEncryptedText(findTestObject('Object Repository/ResetPass/Page_DemoShop/input_New password_Input.NewPassword'), 
    'lXbL6rWvZZo=')

WebUI.setEncryptedText(findTestObject('Object Repository/ResetPass/Page_DemoShop/input_Current password_Input.OldPassword'), 
    'nbPRAawFRnE=')

WebUI.setEncryptedText(findTestObject('Object Repository/ResetPass/Page_DemoShop/input_New password_Input.NewPassword'), 
    'uDKhiHB7w1c=')

WebUI.setEncryptedText(findTestObject('Object Repository/ResetPass/Page_DemoShop/input_Confirm new password_Input.ConfirmPassword'), 
    'uDKhiHB7w1c=')

WebUI.click(findTestObject('Object Repository/ResetPass/Page_DemoShop/button_Update password'))

WebUI.click(findTestObject('Object Repository/ResetPass/Page_DemoShop/div_        Your password has been changed'))

WebUI.doubleClick(findTestObject('Object Repository/ResetPass/Page_DemoShop/button_Logout'))

WebUI.click(findTestObject('Object Repository/ResetPass/Page_DemoShop/a_Login'))

WebUI.doubleClick(findTestObject('Object Repository/ResetPass/Page_DemoShop/a_Login'))

WebUI.click(findTestObject('Object Repository/ResetPass/Page_DemoShop/a_Login'))

WebUI.setText(findTestObject('Object Repository/ResetPass/Page_DemoShop/input_Email_Input.Email'), 'deo.kichi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ResetPass/Page_DemoShop/input_Password_Input.Password'), 'nbPRAawFRnE=')

WebUI.click(findTestObject('Object Repository/ResetPass/Page_DemoShop/button_Log in'))

WebUI.click(findTestObject('Object Repository/ResetPass/Page_DemoShop/li_Invalid login attempt'))

WebUI.setEncryptedText(findTestObject('Object Repository/ResetPass/Page_DemoShop/input_Password_Input.Password'), 'uDKhiHB7w1c=')

WebUI.click(findTestObject('Object Repository/ResetPass/Page_DemoShop/button_Log in'))

WebUI.click(findTestObject('Object Repository/ResetPass/Page_DemoShop/button_Logout'))

WebUI.closeBrowser()

