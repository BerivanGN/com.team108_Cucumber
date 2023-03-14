package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.Driver;

import javax.swing.*;
import java.time.Duration;

public class DemoqaStepdefinitions {
    DemoqaPage demoqaPage = new DemoqaPage();

    @Then("Alerts sekmesine tiklar")
    public void alerts_sekmesine_tiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);
        demoqaPage.alertSekmesi.click();
    }
    @Then("ustten ikinci click me butonuna basar")
    public void ustten_ikinci_click_me_butonuna_basar() {
        demoqaPage.timerAlertButonu.click();
    }
    @Then("Allert in gorunur olmasini bekler")
    public void allert_in_gorunur_olmasini_bekler() {
        //Explicitly wait ile yapalım
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(40));
        wait.until(ExpectedConditions.alertIsPresent());
    }
    @Then("Allert uzerindeki yazinin {string} oldugunu test eder")
    public void allert_uzerindeki_yazinin_oldugunu_test_eder(String alertYazisi) {
        String actualAlertYazisi=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(alertYazisi,actualAlertYazisi);
    }
    @Then("Ok diyerek alerti kapatir")
    public void ok_diyerek_alerti_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
}
