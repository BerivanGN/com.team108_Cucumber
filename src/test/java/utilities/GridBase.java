package utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridBase {

    DesiredCapabilities cap = new DesiredCapabilities();

    public static String hubUrl = "http://192.168.43.226:4444";
    public static String browser = "chrome";

    public WebDriver setDriver(WebDriver driver){

        if (browser=="chrome"){

            cap.setPlatform(Platform.ANY);
            cap.setBrowserName("chrome");
            //cap.setVersion("111.0.5563.112");

            ChromeOptions options = new ChromeOptions();
            options.merge(cap);
        }
        if(browser=="edge"){

            cap.setPlatform(Platform.WINDOWS);
            cap.setBrowserName("edge");
            //cap.setVersion("111.0.1661.54");

            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.merge(cap);

        }

        try {
            driver = new RemoteWebDriver(new URL(hubUrl),cap);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        return driver;
    }

}
