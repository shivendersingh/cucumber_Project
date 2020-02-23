$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Creat_User.feature");
formatter.feature({
  "name": "Create User",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verification of create user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "goto signup page",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the details as \"\u003cname\u003e\" and \"\u003cphone\u003e\" and \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user is created",
  "keyword": "And "
});
formatter.step({
  "name": "user is created",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "phone",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "shivender",
        "12213223",
        "a@gmail.com",
        "sadass"
      ]
    },
    {
      "cells": [
        "shivender",
        "12213223",
        "a@gmail.com",
        "sadass"
      ]
    },
    {
      "cells": [
        "shivender",
        "12213223",
        "a@gmail.com",
        "sadass"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of create user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "goto signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "create_user.Open_the_chrome_and_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the details as \"shivender\" and \"12213223\" and \"a@gmail.com\" and \"sadass\"",
  "keyword": "When "
});
formatter.match({
  "location": "create_user.Enter_the_details_as(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is created",
  "keyword": "And "
});
formatter.match({
  "location": "create_user.user_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is created",
  "keyword": "Then "
});
formatter.match({
  "location": "create_user.user_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verification of create user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "goto signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "create_user.Open_the_chrome_and_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the details as \"shivender\" and \"12213223\" and \"a@gmail.com\" and \"sadass\"",
  "keyword": "When "
});
formatter.match({
  "location": "create_user.Enter_the_details_as(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is created",
  "keyword": "And "
});
formatter.match({
  "location": "create_user.user_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is created",
  "keyword": "Then "
});
formatter.match({
  "location": "create_user.user_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verification of create user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "goto signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "create_user.Open_the_chrome_and_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the details as \"shivender\" and \"12213223\" and \"a@gmail.com\" and \"sadass\"",
  "keyword": "When "
});
formatter.match({
  "location": "create_user.Enter_the_details_as(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is created",
  "keyword": "And "
});
formatter.match({
  "location": "create_user.user_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is created",
  "keyword": "Then "
});
formatter.match({
  "location": "create_user.user_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/TryThis.feature");
formatter.feature({
  "name": "Reset functionality on login page of Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verification of Reset button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open the Firefox and launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "TryThisDefs.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "TryThisDefs.enter_the_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.match({
  "location": "TryThisDefs.reset_the_credential()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/website_up_and_running.feature");
formatter.feature({
  "name": "websiteup and running testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verification of website up and running",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open the chrome and launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "website.Open_the_chrome_and_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the url of a website",
  "keyword": "When "
});
formatter.match({
  "location": "website.Enter_the_url_of_a_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "website should running",
  "keyword": "Then "
});
formatter.match({
  "location": "website.website_should_running()"
});
formatter.result({
  "status": "passed"
});
});