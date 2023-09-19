@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create  account using valid email
    Given user is on the Create New Customer Account page
    When user enters "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And user clicks on Create an Account
    Then my Account page is displayed

    Examples:
      | FirstName | LastName  | Email                    | Password     | ConfirmPassword |
      | Nike      | Olabintan | toyasolabint45@yahoo.com | Abc12345 |      Abc12345    |


    @DuplicateCreateAccount
    Scenario Outline: Create account using duplicate email
      Given user is on the Create New Customer Account page
      When user enters "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
      And user clicks on Create an Account
      Then my Account page is not displayed

      Examples:
        | FirstName | LastName  | Email                    | Password     | ConfirmPassword |
        | Nike      | Olabintan | toyasolabint45@yahoo.com | Abc12345 |      Abc12345    |


      @SignIn
      Scenario Outline: Sign in using valid email
        Given user is on the Customer Login page
        When user enters "<Email>" "<Password>"
        And user clicks on Sign in button
        Then Logged in page is displayed

        Examples:
           | Email                    | Password     |
          | toyasolabint45@yahoo.com | Abc12345 |