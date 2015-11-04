@GSFooterPage
Feature: As a user, i should be able to view the following on the the GS Footer.
   Graduate School Seal
   GSA Contract Holder
   Social Media icons
   © 2015 Graduate School USA
   Mission
   Policies
   Accreditation and Approvals
   Southeastern University Students link
   Instructor opputunities link
   Sign-up for Email link
   Contact GS options - Email, Phone and Chat options

  Scenario: GS homepage Footer links/logo display AC:
    Given the user is on the GS Website
    Then the Footer should display the Graduate School Seal,
    And the Facebook icon
    And the Twitter icon
    And the Flickr icon
    And the GSA Contract Holder logo
    And the 2015 Graduate School USA copyright "© 2015 Graduate School USA"
    And the GS Mission link
    And the GS policies link
    And the GS Accreditation and Approvals link
    And the Southeastern University Students link
    And the Instructor opputunities link
    And the Sign-up for Email link
    And Contact Us options - Chat, Phone and email

  Scenario: user selects to view General Service Administration (GSA) Contracts page on the GS website
    Given the user is on the GS Homepage Footer
    When the user clicks on the GSA Contract Holder
    Then the system should display the General Service Administration (GSA) Contracts page

  Scenario: User selects a social media link on the GS homepage footer
    Given the user is on the GS Homepage
    And the user navigates to the footer section on the GS homepage
    When the user clicks on a social Media icon (Facebook, Youtube, Twitter, Flickr)
    Then the System should display the appropriate Social Media page (Facebook, Youtube, Twitter, Flickr) for GS

  Scenario: User selects to view the Graduate school Mission
    Given the user is on the GS Homepage
    And the user navigates to the Footer section on the GS homepage
    When the user clicks on the "Mission" link
    Then the system should display the Graduate School Mission Page

  Scenario: User selects to view Graduate school policies
    Given the user is on the GS Homepage
    And the user navigates to the Footer section on the GS homepage
    When the user clicks on the Policies link
    Then the system should display the Graduate School Polices Page

  Scenario: User selects to view the Graduate school Accreditation and approvals
    Given the user is on the GS Homepage
    And the user navigates to the Footer section on the GS homepage
    When the user clicks on the Accreditation and Approvals link
    Then the system should display the Graduate School Accreditation and Approvals Page

  Scenario: User selects to view the Southeastern Students information
    Given the user is on the GS Homepage
    And the user navigates to the Footer section on the GS homepage
    When the user clicks on the Southeastern Students link
    Then the system should display the Former Southeastern Students Information Page

  Scenario: User selects to view the Instructor Opportunities at GS
    Given the user is on the GS Homepage
    And the user navigates to the Footer section on the GS homepage
    When the user clicks on the  Instructor Opportunities link
    Then the system should display the Instructor Opportunities Information Page

  Scenario: User selects to Signup to receive GS emails
    Given the user is on the GS Homepage
    And the user navigates to the Footer section on the GS homepage
    When the user clicks on the Signup for Email updates link
    Then the system should display the Email Sign up form

  Scenario: User selects to view Accessibility
    Given the user is on the GS Homepage
    And the user navigates to the Footer section on the GS homepage
    When the user clicks on the Accessibility link
    Then the system should display the Accessibility Policy page

  Scenario: User selects to contact GS via email
    Given the user is on the GS Homepage
    And the user navigates to the Footer section on the GS homepage
    When the user selects to Contact GS by selecting Email Option
    Then the system should open the default user email app
    And the mail should be addressed to customersupport@graduateschool.edu

  Scenario: User selects to contact GS via Chat
    Given the user is on the GS Homepage
    And the user navigates to the Footer section on the GS homepage
    When the user selects to Contact GS by selecting Chat Option
    Then the system should open Boldchat app for chat

  Scenario: User selects to contact GS via phone
    Given the user is on the GS Homepage
    And the user navigates to the Footer section on the GS homepage
    When the user selects to Contact GS by selecting to call via phone number "888-744-GRAD"
    Then the system should provide the option to call GS


  

    

  
       