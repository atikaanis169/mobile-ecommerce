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

Mobile.tap(findTestObject('Chekout/android.widget.TextView - Samsung Galaxy S10 - Black'), 0)

Mobile.verifyElementExist(findTestObject('Chekout/android.widget.TextView - Samsung Galaxy S10 - Black (1)'), 0)

Mobile.verifyElementExist(findTestObject('Chekout/android.widget.TextView - 899 USD'), 0)

Mobile.tap(findTestObject('Chekout/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Chekout/android.widget.EditText'), '1', 0)

Mobile.tap(findTestObject('Chekout/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Chekout/android.widget.TextView'), 0)

Mobile.verifyElementExist(findTestObject('Chekout/android.widget.TextView - Total  989 USD'), 0)

Mobile.verifyElementExist(findTestObject('Chekout/android.widget.TextView - Tax  10'), 0)

Mobile.tap(findTestObject('Chekout/android.widget.Button - CHECKOUT'), 0)

Mobile.verifyElementExist(findTestObject('Chekout/android.widget.EditText - 1 Samsung Galaxy S10 - Black 899 USD,Order  899 USDTax  10   90 USDTotal  989 USD'), 
    0)

Mobile.tap(findTestObject('Chekout/android.widget.Button - PROCESS CHECKOUT'), 0)

Mobile.verifyElementExist(findTestObject('Chekout/android.widget.TextView - Process Checkout'), 0)

Mobile.verifyElementExist(findTestObject('Chekout/android.widget.TextView - Are you sure want to checkout'), 0)

Mobile.tap(findTestObject('Chekout/android.widget.Button - YES'), 0)

Mobile.waitForElementPresent(findTestObject('Chekout/android.widget.TextView - Congratulation'), 3)

Mobile.verifyElementExist(findTestObject('Chekout/android.widget.TextView - Congratulation'), 0)

Mobile.verifyElementExist(findTestObject('Chekout/android.widget.TextView - Thank you for ordering, your order will be review soon, invoice detail will be sent to your email when the order is ready'), 
    0)

Mobile.tap(findTestObject('Chekout/android.widget.Button - OK'), 0)

Mobile.closeApplication()

