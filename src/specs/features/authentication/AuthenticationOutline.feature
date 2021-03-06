@cnxoutline
Feature: AuthenticationOutline-OrangeHRM
  En tant que utilisateur je veux connecter à l'application OrangeHRM avec un scenario outline

  @cnxoutline
  Scenario Outline: AuthenticationOutline-OrangeHRM
    Given Je me connecte à l'application OrangeHRM
    When Je saisie login "<login>"
    And Je saisie password "<password>"
   And Je clique sur le button login
   

    Examples: 
      | login   | password   |
      | Admin   | admin123   |
      | Nesrine | nesrine123 |
      | Asma    | asma123    |
