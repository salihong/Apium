package Uttilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass{

    @Test
    public AndroidDriver<AndroidElement> getAndroidDriver() throws MalformedURLException{
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"2981bb30");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\asuma\\IdeaProjects\\Appium\\src\\Apps\\Etsy.apk");
        AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),caps);
        return driver;

    }

}
