Feature: I want to login to the Application

Scenario: I want to Login to the Application
  
  Given open browser and redirect to login page
  And I open login page 
  When i enter username and password
  And I enter my password
  Then I should be logged in