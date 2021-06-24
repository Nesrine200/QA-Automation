@connexion
Feature: Authentication - orangeHRM
  En tant que utilisateur je souhaite m'authentifier

  @cnx
  Scenario: Authentication - orangeHRM
    Given Je me connecte à l'application OrangeHRM
    When Je saisie Username "Admin" 
    And Je saisie Password "admin123" 
    And Je clique sur le button login
    Then Je me redirige vers le compte admin "Welcome" 
    
      