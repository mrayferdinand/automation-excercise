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

WebUI.navigateToUrl('automationexercise.com')

WebUI.click(findTestObject('Object Repository/Home Page/Link Login or Signup'))

WebUI.setText(findTestObject('Signup and Login Page/Register Section/Input Name'), 'Budi')

WebUI.setText(findTestObject('Signup and Login Page/Register Section/Input Email'), 'budidoremi@gmail.com')

WebUI.click(findTestObject('Signup and Login Page/Register Section/Register Button'))

WebUI.setEncryptedText(findTestObject('Object Repository/Detailed Data Register Page/Input New Passsword'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.setText(findTestObject('Object Repository/Detailed Data Register Page/Input First Name'), 'Budi')

WebUI.setText(findTestObject('Object Repository/Detailed Data Register Page/Input Last Name'), 'Hartono')

WebUI.setText(findTestObject('Object Repository/Detailed Data Register Page/Input Address'), 'Jl. Jalan')

WebUI.selectOptionByValue(findTestObject('Object Repository/Detailed Data Register Page/Choose Country'), 'India', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Detailed Data Register Page/Choose Country'), 'United States', 
    true)

WebUI.setText(findTestObject('Object Repository/Detailed Data Register Page/Input State'), 'Texas')

WebUI.setText(findTestObject('Object Repository/Detailed Data Register Page/Input City'), 'Austin')

WebUI.setText(findTestObject('Object Repository/Detailed Data Register Page/Input Zipcode'), '12345')

WebUI.setText(findTestObject('Object Repository/Detailed Data Register Page/Input Phone'), '08120987654321')

WebUI.click(findTestObject('Object Repository/Detailed Data Register Page/Register Button'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Success Registered Page/Continue Redirect to Home'))

WebUI.closeBrowser()

