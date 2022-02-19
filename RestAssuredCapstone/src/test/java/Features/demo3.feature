@UserInfoAPI @APISuite @DELETE
Feature: User_Info_APIDelete


Scenario: User Information verification with valid details
   Given I have valid URL for delete request
   Then I should receive status code as 204
   And Delete the user for id generated 
   And verify the status message