$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountManagement.feature");
formatter.feature({
  "line": 2,
  "name": "Account Management",
  "description": "",
  "id": "account-management",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AccountManagement"
    }
  ]
});
formatter.scenarioOutline({
  "line": 29,
  "name": "Sign in using valid email",
  "description": "",
  "id": "account-management;sign-in-using-valid-email",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@SignIn"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user is on the Customer Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "user enters \"\u003cEmail\u003e\" \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user clicks on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Logged in page is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 35,
  "name": "",
  "description": "",
  "id": "account-management;sign-in-using-valid-email;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ],
      "line": 36,
      "id": "account-management;sign-in-using-valid-email;;1"
    },
    {
      "cells": [
        "toyasolabint45@yahoo.com",
        "Abc12345"
      ],
      "line": 37,
      "id": "account-management;sign-in-using-valid-email;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 37,
  "name": "Sign in using valid email",
  "description": "",
  "id": "account-management;sign-in-using-valid-email;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AccountManagement"
    },
    {
      "line": 28,
      "name": "@SignIn"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user is on the Customer Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "user enters \"toyasolabint45@yahoo.com\" \"Abc12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user clicks on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Logged in page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountManagementSteps.userIsOnTheCustomerLoginPage()"
});
formatter.result({
  "duration": 6995945800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "toyasolabint45@yahoo.com",
      "offset": 13
    },
    {
      "val": "Abc12345",
      "offset": 40
    }
  ],
  "location": "AccountManagementSteps.userEnters(String,String)"
});
formatter.result({
  "duration": 570806000,
  "status": "passed"
});
formatter.match({
  "location": "AccountManagementSteps.userClicksOnSignInButton()"
});
formatter.result({
  "duration": 1568534600,
  "status": "passed"
});
formatter.match({
  "location": "AccountManagementSteps.loggedInPageIsDisplayed()"
});
formatter.result({
  "duration": 58017200,
  "status": "passed"
});
});