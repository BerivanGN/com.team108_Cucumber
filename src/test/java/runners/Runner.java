package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@demo",
        dryRun = false
)
public class Runner {

}

/*
    Runner class'ı testlerimizi tekli veya toplu olarak çalıştırmamızı sağlar.
    Runner class'ı BOŞ bir class'tır.
    burada asıl işi yapan 2 tane notasyon(@Runith,@CucumberOption)
    ve içlerine yazdığımız argümentlerdir.

    @CucumberOptions içerisine yazacağımız değerler
    bu Runner class'ının çalıştıracağı
       - feature dosyalarının ve
       - feature dosyalarına ait Java method'larının nerede olduğunu
       - ve bu fature dosyaları içerisinde oluşturulan
         Scenario veya Feature'lerin hangilerinin çalıştırılacağını belirler.

    dryRun : default değeri olan false olduğunda
             feature dosyasında run tuşuna bastığımız gibi çalıştırır
             stepdefinition'ı oluşturulan adımları çalıştırır
             stepdefinition'ı olmayan ilk adımda eksik adımları bize raporlar

             Ancak bu tür çalıştırmada gereksiz çalıştırılan adımlar olur
             bunun yerine

             "true" değerini verirseniz
             testi çalıştırmayı denemez
             sadece adımları kontrol eder ve eksik adım varsa kodları oluşturur
             eksik adım yoksa hiçbir adımı çalıştırmadan TEST PASSED der.
             Buradaki test passed "EKSİK ADIM YOK" anlamına gelmektedir.
     plugin : raporlama için eklenen notasyondur.

 */
