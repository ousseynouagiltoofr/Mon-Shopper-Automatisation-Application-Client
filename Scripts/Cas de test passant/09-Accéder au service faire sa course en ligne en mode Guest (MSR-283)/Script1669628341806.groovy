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

'Le shopper ouvre l\'application'
Mobile.startApplication('C:\\Users\\Ousseynou Diop\\Desktop\\APK Client\\app-debug.apk', true)

'Le client clique sur le bouton Continuer en mode Guest'
Mobile.tap(findTestObject('Object Repository/09-Accéder au service Faire sa course en ligne/android.widget.Button-Continuer en mode Guest'), 
    0)

'Le client clique sur l\'onglet Faire ses courses en ligne'
Mobile.tap(findTestObject('Object Repository/09-Accéder au service Faire sa course en ligne/android.view.View-Onglet Faire ses courses'), 
    0)

'Vérifier que le champ de saisit d\'&dresse du client s\'affiche'
Mobile.verifyElementVisible(findTestObject('Object Repository/09-Accéder au service Faire sa course en ligne/android.widget.EditText - Votre adresse'), 
    0)

'Fermer l\'application'
Mobile.closeApplication()

