import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hepsiBurada {

    @Test
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("deviceName", "2981bb30");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", "C:\\Users\\asuma\\IdeaProjects\\Appium\\src\\Apps\\Hepsiburada.apk");
        AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),caps);

        //driver.findElementById("com.pozitron.hepsiburada:id/tv_toolbar_editable_title").click();
        //driver.findElementById("com.pozitron.hepsiburada:id/etSearchBox").sendKeys("iphone");

       //driver.findElementByClassName("android.widget.EditText").sendKeys("iphone 14");
      // driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Arama\"]").click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox")).click();

        driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox")).sendKeys("iphone 14" );

        driver.findElement(By.id("com.pozitron.hepsiburada:id/search_suggestion_title")).click();

        String actualResult= driver.findElementById("com.pozitron.hepsiburada:id/tv_toolbar_editable_title").getText();
        String expectedResult="iphone 14 (10.000+)";
        Assert.assertTrue(actualResult.contains(expectedResult));


    }
}
