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

'Le client clique sur le bouton Continuer en mode Guest'
Mobile.tap(findTestObject('Object Repository/10-Saisir ses adresses de collecte et de livraison/android.widget.Button'), 
    0)

'Le client clique sur l\'onglet Livraison de colis'
Mobile.tap(findTestObject('Object Repository/10-Saisir ses adresses de collecte et de livraison/android.view.View- Onglet Livraison de colis'), 
    0)

'Le client clique sur champ Adresse de Collecte'
Mobile.tap(findTestObject('Object Repository/10-Saisir ses adresses de collecte et de livraison/android.widget.EditText - Adresse de collecte'), 
    0)

'Le client clique sur le bouton Ma Position'
Mobile.tap(findTestObject('Object Repository/10-Saisir ses adresses de collecte et de livraison/android.view.View-Ma position'), 
    0)

'Le client clique sur le champ Adresse de Livraison'
Mobile.tap(findTestObject('Object Repository/10-Saisir ses adresses de collecte et de livraison/android.widget.EditText - Adresse de livraison'), 
    0)

'Le client saisit l\'Adresse de livraison du colis'
Mobile.setText(findTestObject('Object Repository/10-Saisir ses adresses de collecte et de livraison/android.widget.EditText - Adresse de livraison (1)'), 
    'Pikine', 0)

'Le client clique sur l\'autocomplétion de l\'adresse saisie'
Mobile.tap(findTestObject('10-Saisir ses adresses de collecte et de livraison/android.view.View'), 0)

'Le client clique sur le bouton Continuer'
Mobile.tap(findTestObject('Object Repository/10-Saisir ses adresses de collecte et de livraison/android.widget.Button- Continuer'), 
    0)

'Le client clique sur le bouton Continuer'
Mobile.verifyElementVisible(findTestObject('10-Saisir ses adresses de collecte et de livraison/android.widget.ImageView'), 
    0)

'Fermer l\'application'
Mobile.closeApplication()

