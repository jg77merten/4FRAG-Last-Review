package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("On Test Start " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("On Test Success " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("On Test Failed " + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

}
