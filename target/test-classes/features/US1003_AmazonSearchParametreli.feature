@ilk
Feature: US1003 Kullanici  Amazonda parametre olarak yazdığı kelimeyi aratir

  Scenario: TC07 kullanici parametre ile arama yaptirabilmeli

    Given kullanici amazon anasayfaya gider
    Then  amazonda "Samsung" icin arama yapar
    And   sonuclarin "Samsung" icerdigini test eder
    And   3 saniye bekler
    And   sayfayi kapatir