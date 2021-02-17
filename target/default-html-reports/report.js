$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PayBills.feature");
formatter.feature({
  "name": "Automating Pay Bills",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PayBills"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ZeroOnlineBanking.step_definitions.LoginStepDefs.i_am_on_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login with username \"username\" and password \"password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ZeroOnlineBanking.step_definitions.LoginStepDefs.i_login_with_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the online banking button",
  "keyword": "And "
});
formatter.match({
  "location": "com.ZeroOnlineBanking.step_definitions.AccountSummaryStepDefs.i_click_the_online_banking_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As an authorized user I should NOT be able to pay",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PayBills"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "I click the Pay Bills button",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ZeroOnlineBanking.step_definitions.PayBillsStepDefs.i_click_the_Pay_Bills_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page should have the title \"Zero - Pay Bills\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ZeroOnlineBanking.step_definitions.AccountActivityStepDefs.page_should_have_the_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Payee and click any options",
  "keyword": "And "
});
formatter.match({
  "location": "com.ZeroOnlineBanking.step_definitions.PayBillsStepDefs.i_click_the_Payee_and_click_any_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Account and click any options",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ZeroOnlineBanking.step_definitions.PayBillsStepDefs.i_click_the_Account_and_click_any_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Pay button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ZeroOnlineBanking.step_definitions.PayBillsStepDefs.i_click_the_Pay_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be have this message \"Please fill in this field.\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.ZeroOnlineBanking.step_definitions.PayBillsStepDefs.i_should_be_have_this_message(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003cPlease fill in this field.\u003e but was:\u003cnull\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.ZeroOnlineBanking.step_definitions.PayBillsStepDefs.i_should_be_have_this_message(PayBillsStepDefs.java:80)\r\n\tat ✽.I should be have this message \"Please fill in this field.\"(file:///C:/Users/yunus/IdeaProjects/ZeroOnlineBanking/src/test/resources/features/PayBills.feature:25)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});