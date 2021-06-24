@buzz 
Feature: Buzz OrangeHRM
 En tant que utilisateur je souhaite exprimer what is in my mind
 Background:
  Given Je me connecte à l'application OrangeHRM
    When Je saisie Username "Admin" 
    And Je saisie Password "admin123" 
    And Je clique sur le button login
    Then Je me redirige vers le compte admin "Welcome" 
    
  @buzz
  Scenario: Buzz OrangeHRM
   When Je clique sur le module buzz
   And Je saisie un message "I'm Happy" 
   And Je clique sur le button post
   Then Je vérifie le message "I'm Happy" 

 
