 @acces-questionnaire
Feature: Je verifie l acces au questionnaire
  ETQ utilisateur je souhaite cliquer sur le bouton questionnaire dans le site bigscreen
  afin de verifier l acces au questionnaire

  Background: 
    Given je me connecte sur le site bigscreen
    When je clique sur le bouton questionnaire

    Scenario: je clique sur le bouton questionnaire
        Then un message alert est affiche "Email non fourni."

    Scenario: j accepte le message alert
        And j accepte le message alert
        Then le message alert est acceppter et je me redirige vers la page home "Bienvenue sur le Sondage de Bigscreen !"