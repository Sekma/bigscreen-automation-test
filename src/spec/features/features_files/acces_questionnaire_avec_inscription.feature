 @acces-questionnaire-avec-inscription
Feature: Je participe au questionnaire
  ETQ utilisateur je souhaite cliquer sur le bouton participer au sondage dans le site bigscreen
  et remplir le formulaire
  afin d acceder au questionnaire

  Background: 
    Given je me connecte sur le site bigscreen
    When je clique sur le bouton participer au sondage

    Scenario: je clique sur le bouton participer au sondage puis je clique sur annuler
        And je clique sur le bouton annuler
        Then je me redirige vers la page home "Bienvenue sur le Sondage de Bigscreen !"

    Scenario: je clique sur le bouton participer au sondage puis je remplie le formulaire
        And je saisi le nom "visiteur"
        And je saisi l email "visiteur@test.com"
        And je clique sur le bouton confirmer
        And j accepte le message alert
        Then je me redirige vers le questionnaire "visiteur@test.com"
