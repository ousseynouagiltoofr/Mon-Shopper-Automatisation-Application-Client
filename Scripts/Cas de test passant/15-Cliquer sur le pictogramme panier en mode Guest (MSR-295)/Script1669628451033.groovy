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

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button-Continuer en mode Guest'), 
    0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View-Onglet  Livraison de colis'), 
    0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.EditText - Adresse de collecte'), 
    0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View- Ma position'), 0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.EditText - Adresse de livraison'), 
    0)

Mobile.setText(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.EditText - Adresse de livraison (1)'), 
    'Pikine Rue 10', 0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View- Pikine Rue 10, Dakar, Senegal'), 
    0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button Continuer'), 0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View (2)'), 0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View (3)'), 0)

Mobile.checkElement(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.CheckBox-Beaut'), 0)

Mobile.checkElement(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.CheckBox-Sant'), 0)

Mobile.scrollToText('Saisir la description exacte de votre colis', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('11-Ajouter un colis au panier/android.widget.EditText - Saisir la description exacte de votre colis (1)'), 
    0)

Mobile.setText(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.EditText - Saisir la description exacte de votre colis (1)'), 
    'Baume', 0)

//Mobile.scrollToText('Ajouter au panier')
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button-Ajouter au panier'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button-Valider mon panier'), 
    0)

Mobile.tap(findTestObject('Object Repository/12-Retour a la page d ajout d un colis/ButtonBack'), 0)

Mobile.tap(findTestObject('15-CliquerSurLePictoPanierEnModeGuest/PictogrammePanier'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/15-CliquerSurLePictoPanierEnModeGuest/TextMonPanier'), 0)

Mobile.closeApplication()

