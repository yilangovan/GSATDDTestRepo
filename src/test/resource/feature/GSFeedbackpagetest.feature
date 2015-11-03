@feedbackForm
Feature: Testing GraduateSchool website feedback form
  As a valid user of GraduateSchool website
  user should be able navigate to the menus and other details
  

  Scenario: User opens up GraduateSchool website and navigating the menus
    Given Open Feedback form page
    Then Verify we are on feedback page
    When User Enters information
    Then User clicks submit
    Then Verify that form was submitted successfully
    

  
       