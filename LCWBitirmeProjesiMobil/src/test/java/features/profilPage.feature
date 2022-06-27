@ProfilPage
Feature: Profil Page

  @SuccessRegistration
  Scenario Outline: Success Registration
    Given user is opened LcWaikiki App
    When click Skip button
    Then should see "<welcomeText>" home page
    When click "Profil"
    When click "<button>" button
    Then should see register page
    When enter e-mail "<e-mail>"
    And enter password "<password>"
    And enter phone number "<phone>"
    And click agreement checkbox
    And click button2 "<button2>"
    Then Then should see phone code box
    Examples:
      | welcomeText | button | e-mail               | password | phone       | button2 |
      | Hoş geldin, | ÜYE OL  | xxxxxxxxx@gmail.com | 123456a. | 1111111111  | ÜYE OL  |

  @SuccessLogin
  Scenario Outline:  Success Login
    Given user is opened LcWaikiki App
    When click Skip button
    Then should see "<welcomeText>" home page
    When click "Profil"
    And enter e-mail "<e-mail>"
    And enter password "<password>"
    And click on login button
    Then should see home page "<text>"
    Examples:
      | welcomeText  | e-mail                | password  | text                                                        |
      | Hoş geldin,  | gizemtrkgl@icloud.com | gizem2406 | Yeni trendler ve özel fırsatlar şimdi seninle, keşfe başla! |




