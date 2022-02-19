@UserInfoAPI @APISuite @POST
Feature: User_Info_APIPut


Scenario: User Information verification with valid details
   Given I have valid URL for post request
   Then I should receive status code as 200
   And Update name to "Raj" and job to "QA"
   And Verify the Responce Scheme