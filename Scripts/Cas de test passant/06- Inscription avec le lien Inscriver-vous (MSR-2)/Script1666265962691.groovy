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

'Le client ouvre l\'application'
Mobile.startApplication('C:\\Users\\Ousseynou Diop\\Desktop\\APK Client\\app-debug.apk', true)

'Le client clique sur le lien Inscrivez-vous'
Mobile.tap(findTestObject('Object Repository/06- Inscription avec le lien Inscrivez-vous/android.widget.Button Inscrivez-vous'), 
    0)

'Vérifier que le formulaire d\'inscription s\'affiche'
Mobile.verifyElementVisible(findTestObject('06- Inscription avec le lien Inscrivez-vous/android.widget.TextView - Senregistrer'), 
    0)

'Le client ferme l\'application'
Mobile.closeApplication()

