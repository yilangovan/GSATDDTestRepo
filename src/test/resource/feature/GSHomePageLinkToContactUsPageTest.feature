@contactusPage
Feature: Testing GraduateSchool Home Page Link to Contact Us Page
  As a valid user of GraduateSchool website
  user should be able to open the Contact Us page

  Scenario: User opens up GraduateSchool website and click on the link
    Given Open GraduateSchool website Home page
    And User clicks on Contact Us  link
    Then Verify Site opens up Contact us page
   Given Open GraduateSchool website Home page
    And User clicks on Contact Us footer link
   Then Verify Site opens up Contact us page
   Given Open GraduateSchool website Home page
   And User clicks on Trainer  secondary navigation link
   Then Verify Site opens up Contact us page


  
       