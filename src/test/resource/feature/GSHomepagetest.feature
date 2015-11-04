@aboutUsPage
Feature: Testing GraduateSchool website UI navigations
  As a valid user of GraduateSchool website
  user should be able navigate to the menus and other details


  Scenario: User opens up GraduateSchool website and navigating the menus
    Given Open GraduateSchool website Page
    When User clicks on Who we are link
    Then Verify Site opens up About us page
    When User clicks on What we offer link
    And User clicks on Our History


  
       