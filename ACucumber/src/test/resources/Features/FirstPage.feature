Feature: Verify Login functionality

  Scenario Outline: Verify login functionality with valid Credential
    Given user launch browser
    And User hit Amazon Page
    When User Enter User Id "<userId>" and click on continue button
    And Uer Enter Password "<password>" and click on login button
    Then user should be on home page of User
    And Uer should logout successfully
    Examples:
    | userId | password |
    | 9423864021 | Gargi*1 |  
    
    
    
    
