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

'Le client clique sur le bouton Se Connecter'
Mobile.tap(findTestObject('Object Repository/01-Inscription/Se connecter.android.widget.Button'), 0)

'Le client clique sur le lien Enregistrement'
Mobile.tap(findTestObject('Object Repository/01-Inscription/android.widget.TextView - Enregistrement'), 0)

'Le client saisit son Prénom'
Mobile.setText(findTestObject('Object Repository/01-Inscription/firstName.android.widget.EditText'), 'Elhadji Ouseynou', 
    0)

'Le client saisit son Nom'
Mobile.setText(findTestObject('Object Repository/01-Inscription/lastName.android.widget.EditText'), 'DIOP', 0)

'Le client saisit son Adresse Email'
Mobile.setText(findTestObject('Object Repository/01-Inscription/email.android.widget.EditText'), 'aimerdiop18@yopmail.com', 
    0)

'Le client saisit son Mot de passe'
Mobile.setEncryptedText(findTestObject('Object Repository/01-Inscription/password.android.widget.EditText'), 'Cexku/mp9Z18eElUeR1LGg==', 
    0)

'Le client saisit son confirmation de Mot De Passe'
Mobile.setEncryptedText(findTestObject('Object Repository/01-Inscription/password-confirm.android.widget.EditText'), 'Cexku/mp9Z18eElUeR1LGg==', 
    0)

'Le client clique sur le bouton Enregistrement'
Mobile.tap(findTestObject('Object Repository/01-Inscription/android.widget.Button - Enregistrement'), 0)

'Le client clique sur le bouton Accepter '
Mobile.tap(findTestObject('01-Inscription/android.widget.Button - Accepter'), 0)

'Vérifier que le message: Vous devez vérifier votre couriel pour confirmer votre compte'
Mobile.verifyElementExist(findTestObject('01-Inscription/android.widget.TextView - Vous devez vrifier votre courriel pour activer votre compte'), 
    0)

'Fermer l\'application'
Mobile.closeApplication()

