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

Mobile.startApplication('C:\\Users\\Ousseynou Diop\\Desktop\\APK Client\\app-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/01-Inscription/Se connecter.android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/01-Inscription/android.widget.TextView - Enregistrement'), 0)

Mobile.setText(findTestObject('Object Repository/01-Inscription/firstName.android.widget.EditText'), 'Elhadji Ouseynou', 
    0)

Mobile.setText(findTestObject('Object Repository/01-Inscription/lastName.android.widget.EditText'), 'DIOP', 0)

Mobile.setText(findTestObject('Object Repository/01-Inscription/email.android.widget.EditText'), 'aimerdiop11@yopmail.com', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/01-Inscription/password.android.widget.EditText'), 'Cexku/mp9Z18eElUeR1LGg==', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/01-Inscription/password-confirm.android.widget.EditText'), 'Cexku/mp9Z18eElUeR1LGg==', 
    0)

Mobile.tap(findTestObject('Object Repository/01-Inscription/android.widget.Button - Enregistrement'), 0)

Mobile.tap(findTestObject('01-Inscription/android.widget.Button - Accepter'), 0)

Mobile.verifyElementExist(findTestObject('01-Inscription/android.widget.TextView - Vous devez vrifier votre courriel pour activer votre compte'), 
    0)

Mobile.closeApplication()

