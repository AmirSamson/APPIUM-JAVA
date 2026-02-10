package com.amir.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appium:automationName","UIAutomator2");
        capabilities.setCapability("appium:platformVersion","16");       
        capabilities.setCapability("appium:appPackage","com.android.settings");
        capabilities.setCapability("appium:appActivity","com.android.settings.Settings");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),capabilities);   
        // System.out.println( "Hello World!" );
    }
}
