@wip
Feature: I want to be able to login

  #Scenario Outline: Login and Logout

    #Given am on the "<Landing>" Page
    #And I enter my "Username" as "<User_Name>"
    #And I enter my "Password" as "<Pass_Word>"
    #When I i click on "Login" button
   # Then am on the "<Home>" Page
    #And I click "Logout" button
   # Then am on the "Landing" Page

    #Examples:
    #  |User_Name |Pass_Word |
     # |  Hello1  |  1234567  |
     # |  Hello2  |  12345678 |


  Scenario Login and Logout
    Given am on the "Landing" Page
    And I enter my "Username" as "Hello1"
    And I enter my "Password" as "1234567"
    When I click on "Login" button
    Then am on the "Home" Page