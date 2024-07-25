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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Home Page/Link to Product'))

WebUI.setText(findTestObject('Product Page/Search Text Field'), 'Blue Top')

WebUI.click(findTestObject('Product Page/Search Button'))

WebUI.scrollToElement(findTestObject('Product Page/Searched Product'), 5)

WebUI.click(findTestObject('Product Page/1 - Products/Add to cart - Blue Top'))

WebUI.click(findTestObject('Product Page/General - Popup - View Cart'))

WebUI.click(findTestObject('Checkout Page/Checkout 1'))

WebUI.click(findTestObject('Checkout Page/General - Popup - Register_Login'))

WebUI.setText(findTestObject('Signup and Login Page/Login Section/Input Email'), 'budidoremi@gmail.com')

WebUI.setText(findTestObject('Signup and Login Page/Login Section/Input Password'), 'Abcd1234')

WebUI.click(findTestObject('Signup and Login Page/Login Section/Login Button'))

WebUI.click(findTestObject('Home Page/Link to Cart Page'))

WebUI.verifyElementVisible(findTestObject('Checkout Page/Cart Info'))

WebUI.closeBrowser()

