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

WebUI.navigateToUrl(GlobalVariable.url)

CustomKeywords.'common.login.refreshBrowser'()

WebUI.delay(3)

WebUI.click(findTestObject('0 iFrame/Home/a_Login'))

WebUI.switchToWindowTitle('LearnKS Log in')

CustomKeywords.'common.login.refreshBrowser'()

WebUI.delay(3)

WebUI.setText(findTestObject('0 iFrame/Log in/input_Login_userName'), GlobalVariable.uname)

WebUI.delay(3)

WebUI.click(findTestObject('0 iFrame/Log in/a_Forgot your password'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowUrl('file:///C:/Users/Teguh%20IPN/OneDrive%20-%20PT.%20Telekomunikasi%20Indonesia/Documents/Downloads/Download-Sample-Site/learnks1-forgot-password.html')

CustomKeywords.'common.login.refreshBrowser'()

WebUI.delay(3)

WebUI.setText(findTestObject('0 iFrame/Forgot Password/input_Forgotten Password_emailAddress'), GlobalVariable.email)

WebUI.delay(3)

WebUI.closeWindowTitle('Page Submitted')

WebUI.closeWindowIndex(1)

WebUI.closeBrowser()

