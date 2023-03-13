Feature: US1010 WebUniversity Testi

  @wip
  Scenario: TC14 Webuniversity sayfasinda istenen gorevleri yapar

    Given kullanici "webUrl" anasayfaya gider
    Then  Login portal gorununceye kadar asagiya iner
    And   Login portal butonuna tiklar
    And   acilan ikinci window a gecer
    And   Username kutusuna deger yazdirir
    And   Password kutusuna deger yazdirir
    Then  webUniversity login butonuna basar
    And   3 saniye bekler
    And   Popup'ta cikan yazinin "validation failed" oldugunu test eder
    And   3 saniye bekler
    And   Ok diyerek Popup'i kapatir
    Then  ilk sayfaya geri doner
    And   ilk sayfaya donuldugunu test eder
    And   tum sayfalari kapatir
