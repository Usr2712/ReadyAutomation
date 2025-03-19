Feature: Login

  @test1
  Scenario Outline: Login
    Given user logged into website and search for with '<Vegetable>'

    Examples:
      | Vegetable     |
      | vegetablename |
