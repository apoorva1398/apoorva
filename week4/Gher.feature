Feature: User vlidations on new TestMe applications
Scenario: User verification for the registrtion in TestMe
    Given TestMe app is launched
    And User accessing registration link 
    When User accessing valid data for all required fiedls
    Then user verifying registration status
    
       Scenario: User verification for the login in TestMe
    Given TestMe app is launched and acccessible
    Then User clicks on login link available in home page
   # And User accessing valid data for all required fiedls
   And provides valid credentials
    Then user verifying Login status
    
    