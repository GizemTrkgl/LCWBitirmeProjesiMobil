@TutorialPage
Feature: Tutorial Page
  @CheckComponents
  Scenario Outline: Check Tutorial Page Components
    Given user is opened LcWaikiki App
    Then should see TvTutorial
    Then should see "<text>" text
    Then should see "<title>" title
    Then should see "<desc>" title description
    Then should see "<button>" button
    Examples:
      | text            | title           | desc                                | button |
      | Yeniliği Keşfet | PRATİK ALT MENÜ | Yenilenen alt menü ile kategorilere | Atla   |

  @DragDrop
  Scenario Outline: Check Drag Drop TvTutorial
    Given user is opened LcWaikiki App
    When drag and drop TvTutorial
    Then should see "<title>" title
    Examples:
      | title             |
      | KATEGORİ GÖRÜNÜMÜ |

  @Skip @AddProduct
  Scenario Outline: Click Skip Button and Add Product
    Given user is opened LcWaikiki App
    When click Skip button
    Then should see "<welcomeText>" home page
    When click "Profil"
    And enter e-mail "<e-mail>"
    And enter password "<password>"
    And click on login button
    When click categories "Kategoriler"
    Then should see "Kategoriler" title
    When click category name "Giyim"
    And click product type "Bluz"
    Then should see title "Bluz"
    When click "Filtre" button and click "Renk" button
    And select color "<color>"
    And click list button
    And select product
    And select size "<size>"
    And click add to cart button and go to cart button
    Then should see text "SİPARİŞ ÖZETİ"
    When check product name "Bağlamalı Yaka Nakışlı Uzun Kollu Kadın Bluz"
    And check product size "M"
    And check product counter "Sepetim (1 Ürün)"
    And click payment button
    Then should see delivery text "Teslimat Türü"
    Examples:
      | e-mail                | password  | welcomeText | color  | size |
      | gizemtrkgl@icloud.com | gizem2406 | Hoş geldin, | Siyah  | M    |
