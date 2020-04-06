package com.fico;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String driverPath = "C:\\softwares\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver" , driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test");
        driver.findElement(By.id("btn_basic_example")).click();
        System.out.println(driver.getCurrentUrl());
        String fileName = "C:\\Users\\Abhishekpayasi\\Desktop\\test.png";
        try {
            takeScreenshot(driver , fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenshot(WebDriver webDriver , String fileName) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) webDriver;
        File file = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile=new File(fileName);
        FileUtils.copyFile(file, destFile);
    }
}
