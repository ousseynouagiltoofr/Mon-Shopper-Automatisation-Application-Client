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
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button-Continuer en mode Guest'), 
    0)

'Le client clique sur l\'onglet Livraison de colis'
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View-Onglet  Livraison de colis'), 
    0)

'Le client clique sur champ Adresse de Collecte'
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.EditText - Adresse de collecte'), 
    0)

'Le client clique sur le bouton Ma Position'
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View- Ma position'), 0)

'Le client clique sur le champ Adresse de Livraison'
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.EditText - Adresse de livraison'), 
    0)

'Le client saisit l\'Adresse de livraison du colis'
Mobile.setText(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.EditText - Adresse de livraison (1)'), 
    'Pikine Rue 10', 0)

'Le client clique sur l\'autocomplétion de l\'adresse saisie'
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View- Pikine Rue 10, Dakar, Senegal'), 
    0)

'Le client clique sur le bouton Continuer'
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button Continuer'), 0)

'Le client clique sur une catégorie'
Mobile.tap(findTestObject('11-Ajouter un colis au panier/android.view.View'), 0)

'Le client clique sur le bouton déplier de la Hauteur'
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button'), 0)

'Le client choisit la hauteur'
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View (1)'), 0)

'Le client clique sur le bouton déplier de la Longueur'
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button (1)'), 0)

'Le client choisit la Longueur '
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View (2)'), 0)

'Le client clique sur le bouton déplier de la largeur'
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button (2)'), 0)

'Le client choisit la Largeur'
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View (3)'), 0)

'Le client coche Beauté'
Mobile.checkElement(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.CheckBox-Beaut'), 0)

'Le client coche Santé'
Mobile.checkElement(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.CheckBox-Sant'), 0)

'Le client scroll jusqu\'au text : Saisir la description exacte du colis'
Mobile.scrollToText('Saisir la description exacte de votre colis', FailureHandling.CONTINUE_ON_FAILURE)

'Le client clique le champ Saisir la description exacte de votre colis'
Mobile.tap(findTestObject('11-Ajouter un colis au panier/android.widget.EditText - Saisir la description exacte de votre colis (1)'), 
    0)

'Le client renseigne la description du colis'
Mobile.setText(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.EditText - Saisir la description exacte de votre colis (1)'), 
    'Baume', 0)

//Mobile.scrollToText('Ajouter au panier')
'Le client clique sur le bouton Retour du téléphone'
Mobile.pressBack()

'Le client clique sur le Bouton Ajouter au panier'
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button-Ajouter au panier'), 0)

'Cliquer sur le bouton Retour'
Mobile.tap(findTestObject('Object Repository/12-Retour a la page d ajout d un colis/ButtonBack'), 0)

'Vérifier que l\'élément Léger de la catégorie est présent sur la page'
Mobile.verifyElementVisible(findTestObject('11-Ajouter un colis au panier/android.view.View'), 0)

'Fermer l\'application'
Mobile.closeApplication()

