import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.AssertJUnit.assertEquals;

public class appiumDay01 {

    @Test
    public void app() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","11.0");
        desiredCapabilities.setCapability("deviceName","2981bb30");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app","C:\\Users\\asuma\\IdeaProjects\\Appium\\src\\Apps\\HesapMak.apk");
        AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);
        driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_div")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
        String expected = "3";


       // String actual = driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
        //System.out.println(actual);

        //assertEquals(expected, actual);


    }
}
