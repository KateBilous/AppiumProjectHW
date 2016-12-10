package scenarios;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Kate on 10.12.2016.
 */
public class myTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        String app_package_name = "com.linkedin.android:id/";
        By userEmail = By.id(app_package_name + "growth_login_join_fragment_email_address");
        By userPassword = By.id(app_package_name + "growth_login_join_fragment_password");
        By firstSignIn = By.id(app_package_name + "growth_prereg_fragment_sign_in_button");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", "C:\\Program Files (x86)\\Appium\\node_modules\\appium\\build\\unlock_apk\\unlock_apk-debug.apk");

        AndroidDriver androidDriver = new AndroidDriver( new URL("http://127.0.0.1:4723/wd/hub"), caps );



        androidDriver.pressKeyCode(AndroidKeyCode.HOME);


        androidDriver.findElementByAndroidUIAutomator("new UiSelector().description(\"Apps\")").click();
        androidDriver.findElementByAndroidUIAutomator("new UiSelector().text(\"LinkedIn\")").click();
        //androidDriver.findElementByAndroidUIAutomator("new UiSelector().description(\"Apps\")").click();
        androidDriver.findElementByAndroidUIAutomator("new UiSelector().text(\"Sign in\")").click();

       // androidDriver.findElement(firstSignIn).click();


        androidDriver.findElement(userEmail).sendKeys("test@mail.com");
        androidDriver.findElement(userPassword).sendKeys("password123");
        androidDriver.findElementByAndroidUIAutomator("new UiSelector().text(\"Sign in\")").click();
        androidDriver.quit();

    }







}
