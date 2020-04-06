Feature: Account




@SmokeTest
Scenario: Home page default login
Given User is on landing page
When User log into application with "" and ""
Then Home Page is populated



@RegTest
Scenario Outline: Home page default login
Given User is on landing page
When User log in to application with <Username> and <passworrd>
Then Home Page is populated



Examples:
|Username | passworrd |
|user1    | password  |
|user2    | password  |
|user3    | password  |


@RegTest
Scenario Outline: Home page default login
Given User is on landing page
When User log in to application with <Username> and <passworrd>
Then Home Page is populated


Examples:
|Username | passworrd |
|user1    | password  |
|user2    | password  |
|user3    | password  |