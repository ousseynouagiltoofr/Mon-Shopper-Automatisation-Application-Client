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

Mobile.tap(findTestObject('Object Repository/02- Se connecter avec ses identifiants/Se connecter.android.widget.Button'), 
    0)

Mobile.setText(findTestObject('Object Repository/02- Se connecter avec ses identifiants/username.android.widget.EditText'), 
    'pacorabanne@yopmail.com', 0)

Mobile.setText(findTestObject('Object Repository/02- Se connecter avec ses identifiants/Password.android.widget.EditText'), 
    'Passer123', 0)

Mobile.tap(findTestObject('Object Repository/02- Se connecter avec ses identifiants/android.widget.CheckBox - Se souvenir de moi'), 
    0)

Mobile.tap(findTestObject('Object Repository/02- Se connecter avec ses identifiants/android.widget.Button - Connexion'), 
    0)

Mobile.verifyElementVisible(findTestObject('02- Se connecter avec ses identifiants/android.view.View - Livraison de colis onglet'), 
    0)

Mobile.closeApplication()

