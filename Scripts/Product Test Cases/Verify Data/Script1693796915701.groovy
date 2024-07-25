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

WebUI.navigateToUrl('https://www.automationexercise.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Home Page/Link Login or Signup'))

WebUI.setText(findTestObject('Signup and Login Page/Register Section/Input Name'), 'budi')

WebUI.setText(findTestObject('Signup and Login Page/Register Section/Input Email'), 'budi123@gmail.com')

WebUI.click(findTestObject('Signup and Login Page/Register Section/Register Button'))

WebUI.setText(findTestObject('Detailed Data Register Page/Input New Passsword'), 'Abcd1234')

WebUI.setText(findTestObject('Detailed Data Register Page/Input First Name'), 'budi')

WebUI.setText(findTestObject('Detailed Data Register Page/Input Last Name'), 'anduk')

WebUI.setText(findTestObject('Detailed Data Register Page/Input Address'), 'Jl. Aja Dulu')

WebUI.setText(findTestObject('Detailed Data Register Page/Input State'), 'Delhi')

WebUI.setText(findTestObject('Detailed Data Register Page/Input City'), 'Mumbai')

WebUI.setText(findTestObject('Detailed Data Register Page/Input Zipcode'), '12345')

WebUI.setText(findTestObject('Detailed Data Register Page/Input Phone'), '080987654321')

WebUI.click(findTestObject('Detailed Data Register Page/Register Button'))

WebUI.click(findTestObject('Success Registered Page/Continue Redirect to Home'))

WebUI.delay(5)

WebUI.click(findTestObject('Home Page/Link to Product'))

WebUI.scrollToElement(findTestObject('Product Page/Text - All Products'), 5)

WebUI.click(findTestObject('Product Page/1 - Products/Add to cart - Blue Top'))

WebUI.click(findTestObject('Product Page/General - Popup - View Cart'))

WebUI.click(findTestObject('Checkout Page/Checkout 1'))

WebUI.verifyElementVisible(findTestObject('Checkout Page/Delivery Address'))

WebUI.verifyElementVisible(findTestObject('Checkout Page/Invoice Address'))

WebUI.delay(5)

WebUI.click(findTestObject('Home Page/Link Delete Account'))

WebUI.click(findTestObject('Success Delete Account Page/Continue Redirect to Landing Page'))

WebUI.closeBrowser()

