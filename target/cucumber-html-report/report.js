$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentication/Authentication.feature");
formatter.feature({
  "line": 2,
  "name": "Authentication - orangeHRM",
  "description": "En tant que utilisateur je souhaite m\u0027authentifier",
  "id": "authentication---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@connexion"
    }
  ]
});
formatter.before({
  "duration": 2258306401,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Authentication - orangeHRM",
  "description": "",
  "id": "authentication---orangehrm;authentication---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Je me connecte à l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisie Username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisie Password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le button login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Je me redirige vers le compte admin",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationStepDefinitions.jeMeConnecteÀLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 1764230100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    }
  ],
  "location": "AuthenticationStepDefinitions.jeSaisieUsername(String)"
});
formatter.result({
  "duration": 122985000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 20
    }
  ],
  "location": "AuthenticationStepDefinitions.jeSaisiePassword(String)"
});
formatter.result({
  "duration": 120523800,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationStepDefinitions.jeCliqueSurLeButtonLogin()"
});
formatter.result({
  "duration": 55411700,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationStepDefinitions.jeMeRedirigeVersLeCompteAdmin()"
});
formatter.result({
  "duration": 31600,
  "status": "passed"
});
formatter.after({
  "duration": 1673155600,
  "status": "passed"
});
});