
@tag
Feature: This feature is login Many id's in Adactin loginpage

  @tag2
  Scenario Outline: This scenario for login three credentials
    Given To load the Adactin Login page
    When providing three credentials "<name>", "<passWord>"
    Then To close the Adactin Login page

    Examples: 
      | name  | passWord |
      | Muhamed |65444 |
      | Javeed | 5465662| 
      | Abu | 786458| 
