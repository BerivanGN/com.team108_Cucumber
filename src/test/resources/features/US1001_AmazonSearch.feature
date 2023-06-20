Feature: US1001 Kullanici Amazon sayfasında arama yapar

  @GridTest
  Scenario: TC01 Kullanici Amazonda Nutella aratir

    Given kullanici amazon anasayfaya gider
    Then  arama kutusuna nutella yazar ve enter tusuna basar
    And   arama sonuclarinin Nutella icerdigini test eder
    And   sayfayi kapatir

  Scenario: TC02 kullanici Amazonda Java aratir
      Given   kullanici amazon anasayfaya gider
      When    arama kutusuna Java yazar ve enter tusuna basar
      Then    arama sonuclarinin Java icerdigini test eder
      And     sayfayi kapatir

  Scenario: TC03 kullanıcı Amazonda Apple aratir
    Given   kullanici amazon anasayfaya gider
    When    arama kutusuna Apple yazar ve enter tusuna basar
    Then    arama sonuclarinin Apple icerdigini test eder
    And     sayfayi kapatir