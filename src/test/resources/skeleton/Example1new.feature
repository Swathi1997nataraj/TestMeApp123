Feature: login

Scenario Outline: successful login
Given user is on the home page
When user enter "<username>" and "<password>"
Then user does successful login
 Examples:
  |username | password|
  |mercury | mercury|
  |tutorial | tutorial|