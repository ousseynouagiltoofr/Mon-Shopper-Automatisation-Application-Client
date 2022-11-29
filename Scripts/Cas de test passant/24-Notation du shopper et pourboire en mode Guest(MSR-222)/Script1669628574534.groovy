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
Mobile.tap(findTestObject('Object Repository/11-Ajouter un colis au panier/android.view.View'), 0)

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
Mobile.scrollToText('Saisir la description exacte de votre colis', FailureHandling.STOP_ON_FAILURE)

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

'Vérifier que le bouton Valider mon panier est présent'
Mobile.verifyElementVisible(findTestObject('Object Repository/11-Ajouter un colis au panier/android.widget.Button-Valider mon panier'), 
    0)

'Cliquer sur le bouton Valider mon panier'
Mobile.tap(findTestObject('Object Repository/14-ValiderMonPanierEnModeGuest/ButtonValiderMonPanier'), 0)

'Le client clique le champ Nom de l\'expéditeur'
Mobile.tap(findTestObject('Object Repository/16-Ajouter les informations de l expéditeure en mode Guest/android.widget.EditText - Nom'), 
    0)

'Le client saisit le Nom du de l\'expéditeur'
Mobile.setText(findTestObject('Object Repository/16-Ajouter les informations de l expéditeure en mode Guest/android.widget.EditText - Nom (1)'), 
    'DIOP', 0)

'Le client clique le champ Prénom de l\'expéditeur'
Mobile.tap(findTestObject('Object Repository/16-Ajouter les informations de l expéditeure en mode Guest/android.widget.EditText - Prnom'), 
    0)

'Le client saisit le Prénom de l\'expéditeur'
Mobile.setText(findTestObject('Object Repository/16-Ajouter les informations de l expéditeure en mode Guest/android.widget.EditText - Prnom (1)'), 
    'Elhadji Ousseynou', 0)

'Le client clique le champ Email de l\'expéditeur'
Mobile.tap(findTestObject('Object Repository/16-Ajouter les informations de l expéditeure en mode Guest/android.widget.EditText - Email'), 
    0)

'Le client saisit l\'Email de l\'expéditeur'
Mobile.setText(findTestObject('Object Repository/16-Ajouter les informations de l expéditeure en mode Guest/android.widget.EditText - Email (1)'), 
    'pacorabanne@yopmail.com', 0)

'Le client clique sur le drapeau pour sélectionner son pays'
Mobile.tap(findTestObject('Object Repository/16-Ajouter les informations de l expéditeure en mode Guest/android.widget.ImageView'), 
    0)

'Le client clique sur le drapeau de l\'Algérie'
Mobile.tap(findTestObject('16-Ajouter les informations de l expéditeure en mode Guest/Algeria'), 0)

'Le client clique sur le champ numéro de téléphone de l\'expéditeur'
Mobile.tap(findTestObject('Object Repository/16-Ajouter les informations de l expéditeure en mode Guest/android.widget.EditText - Numro'), 
    0)

'Le client saisit le numéro de l\'expéditeur'
Mobile.setText(findTestObject('Object Repository/16-Ajouter les informations de l expéditeure en mode Guest/android.widget.EditText - Numro (1)'), 
    '770000000', 0)

'Le clique clique sur le bouton Retour du téléphone'
Mobile.pressBack()

'Le client clique sur le bouton Suivant'
Mobile.tap(findTestObject('16-Ajouter les informations de l expéditeure en mode Guest/android.widget.Button'), 0)

'Le client clique sur le champ Nom du destinataire'
Mobile.tap(findTestObject('Object Repository/17-Ajouter les informations du destinataire en mode Guest/android.widget.EditText - Nom du destinataire'), 
    0)

'Le client saisit le Nom du destinataire'
Mobile.setText(findTestObject('Object Repository/17-Ajouter les informations du destinataire en mode Guest/android.widget.EditText - Nom du destinataire (1)'), 
    'Anta', 0)

'Le client clique sur le champ Numéro de téléphone du destinataire '
Mobile.tap(findTestObject('Object Repository/17-Ajouter les informations du destinataire en mode Guest/android.widget.EditText - Numro de tlphone'), 
    0)

'Le client clique sur le champ numéro de téléphone du destinataire'
Mobile.tap(findTestObject('Object Repository/17-Ajouter les informations du destinataire en mode Guest/android.widget.EditText - Numro de tlphone'), 
    0)

'Le client saisit le Numéro de téléphone du destinataire'
Mobile.setText(findTestObject('17-Ajouter les informations du destinataire en mode Guest/android.widget.EditText - Numro de tlphone (1)'), 
    '77 000 00 00', 0)

//Mobile.tap(findTestObject(null), 0)
'Le client scroll jusqu\'au champ de saisi Informations complémentaires'
Mobile.scrollToText('Informations complémentaires', FailureHandling.STOP_ON_FAILURE)

'Le client clique sur le champ: Ajouter des informations complémentaires pour le livreur'
Mobile.tap(findTestObject('17-Ajouter les informations du destinataire en mode Guest/EditText - Informations complmentaires pour aider le livreur  trouver plus facilement ladresse exacte ect'), 
    0)

'Le client saisit des informations complémentaires pour le livreur'
Mobile.setText(findTestObject('17-Ajouter les informations du destinataire en mode Guest/EditText - Informations complmentaires pour aider le livreur  trouver plus facilement ladresse exacte ect'), 
    'En face Hypermarché Exclusive', 0)

'Le client clique sur le bouton Retour du téléphone'
Mobile.pressBack()

'Le client clique sur le bouton Suivant'
Mobile.tap(findTestObject('Object Repository/17-Ajouter les informations du destinataire en mode Guest/android.widget.ButtonSuivant'), 
    0)

'Le client clique sur le nombre d\'étoiles pour noter le shopper'
Mobile.tap(findTestObject('Object Repository/24-Notation du shopper et pourboire en mode Guest/ChoisirLeNombreD toiles'), 
    0)

'Le client clique sur le champ Commentaires sur la livraison'
Mobile.tap(findTestObject('Object Repository/24-Notation du shopper et pourboire en mode Guest/android.widget.EditText - Commentaire sur la livraison'), 
    0)

'Le client saisit un commentaire sur la livraison'
Mobile.setText(findTestObject('Object Repository/24-Notation du shopper et pourboire en mode Guest/android.widget.EditText - Commentaire sur la livraison (1)'), 
    'Rapide', 0)

'Le client clique sur le champ pour donner un pourboire'
Mobile.tap(findTestObject('Object Repository/24-Notation du shopper et pourboire en mode Guest/android.widget.EditText - Entrez un montant de votre choix'), 
    0)

'Le client saisit le montant du pourboire'
Mobile.setText(findTestObject('Object Repository/24-Notation du shopper et pourboire en mode Guest/android.widget.EditText - Entrez un montant de votre choix (1)'), 
    '1000', 0)

'Le client clique sur le bouton Retour du téléphone'
Mobile.pressBack()

'Le client clique sur le bouton Envoyé'
Mobile.tap(findTestObject('Object Repository/24-Notation du shopper et pourboire en mode Guest/android.widget.ButtonEnvoyé'), 
    0)

'Vérifier que le message de remerciement s\'affiche'
Mobile.verifyElementVisible(findTestObject('Object Repository/24-Notation du shopper et pourboire en mode Guest/MessageDeRemerciement'), 
    0)

'Fermer l\'application'
Mobile.closeApplication()

