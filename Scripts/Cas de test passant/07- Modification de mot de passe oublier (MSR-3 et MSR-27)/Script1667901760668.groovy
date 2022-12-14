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
Mobile.tap(findTestObject('Object Repository/07-Modification de mot de passe oublié/android.widget.Button-Se connecter'), 
    0)

'Le client clique sur le bouton Mot de passe oublier'
Mobile.tap(findTestObject('Object Repository/07-Modification de mot de passe oublié/android.widget.TextView - Mot de passe oubli'), 
    0)

'Le client clique sur le champ Adresse Email'
Mobile.tap(findTestObject('07-Modification de mot de passe oublié/android.widget.EditText-username'), 0)

'Le client saisit son Adresse Email'
Mobile.setText(findTestObject('Object Repository/07-Modification de mot de passe oublié/android.widget.EditText-username'), 
    'pacorabanne@yopmail.com', 0)

'Le client clique sur le bouton Soumettre'
Mobile.tap(findTestObject('Object Repository/07-Modification de mot de passe oublié/android.widget.Button - Soumettre'), 
    0)

'Vérifier que le message: Vous devriez rapidement recevoir un couriel avec de plus amples instructions'
Mobile.verifyElementVisible(findTestObject('Object Repository/07-Modification de mot de passe oublié/android.widget.TextView - Vous devriez recevoir rapidement un courriel avec de plus amples instructions'), 
    0)

'Le client ferme l\'application'
Mobile.closeApplication()

