Feature: Candidate Hiring Process

  As an authenticated user
  I want to add a recruitment, complete the forms, and verify the candidate's status
  To manage the hiring process correctly

  @Verify_user
  Scenario: Create a recruitment and verify the hired candidate
    Given the user is on the homepage
    When enters their credentials and logs into the system
    And complete the first form with candidate information
      | First Name | Middle Name | Last Name   | Email             | Phone Number | Keyword       | Notes         |
      | Jose       | Luis        | Perez Hoyos | jose123@gmail.com | 3044822853   | QA automation | Qa automation |
    Then save the changes for the first form
    And complete the second form with interview details
      | Interview Title | Interviewer | Notes        | Date       | Time     |
      | QA Automation   | Orange      | Interview QA | 2024-06-11 | 05:00 PM |
    Then save the changes for the second form
    And navigates to the main page
    Then the candidate should have the status hired



