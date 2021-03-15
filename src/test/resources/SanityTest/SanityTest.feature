
Feature: Checking Sanity

  @SmokeTest
  Scenario: This should not run
    Given sanity test is chosen
    When this is not needed
    Then this should not run

  @SanityTest
  Scenario: should run
    Given sanity test is picked
    When during execution
    Then this section should run
    And generate report
