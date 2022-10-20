import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid03 {

    public static void main(String[] args) throws MalformedURLException {
        // BSelenium 4 ile birlikte DesiredCapabilities den options.merge sonuna kadarki kisima artik gerek kalmadi.
        // bunlarin yerine WedDriver satirini commentte gosterildigi gibi farkli yaziyoruz.
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setPlatform(Platform.WINDOWS);
        cap.setBrowserName("chrome");
        cap.setVersion("106.0.5249.119");
        ChromeOptions options = new ChromeOptions();
        options.merge(cap);

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.13:4444"), options);
        // WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.13:4444"), new FirefoxOptions());  // Selenium 4 versiyonu
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());

    }
}
