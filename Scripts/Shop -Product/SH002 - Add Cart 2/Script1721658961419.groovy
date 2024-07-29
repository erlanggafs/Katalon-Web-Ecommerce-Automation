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

WebUI.navigateToUrl('https://erlangga.enjoyproject.online/?v=637120feeaca')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Shop - Product/SH002 - Add Cart 2/Page_/a_Shop'))

WebUI.verifyElementText(findTestObject('Object Repository/Shop - Product/SH002 - Add Cart 2/Page_Shop/h1_Shop'), 'Shop')

WebUI.click(findTestObject('Object Repository/Shop - Product/SH002 - Add Cart 2/Page_Shop/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Shop - Product/SH002 - Add Cart 2/Page_Shop/a_Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Shop - Product/SH002 - Add Cart 2/Page_Cart/a_Sepatu Athletica   Supra White'), 
    'Sepatu Athletica – Supra White')

WebUI.closeBrowser()

