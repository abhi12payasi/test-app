package com.fico.listeners;

import org.testng.*;
import org.testng.annotations.BeforeClass;
import org.testng.xml.XmlSuite;

import java.util.List;

public class ListenerForTests implements ISuiteListener, ITestListener , IReporter {

    @Override
    public void onStart(ISuite iSuite) {
        Reporter.log("start suite" , true);
    }

    @Override
    public void onFinish(ISuite iSuite) {
        Reporter.log("finish suite" , true);
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("test start");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("test passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("test failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("test start ");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("test finish");
    }

    @Override
    public void generateReport(List<XmlSuite> list, List<ISuite> list1, String s) {
        System.out.println(list);
    }
}
