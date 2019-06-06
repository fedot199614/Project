import com.sun.beans.editors.ColorEditor;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class CustomTestNGListener implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {
            System.out.println(Manager.infoMap.get(iTestResult.getTestClass().getRealClass().getSimpleName()).getClassName());
            //Manager.createLogFile(iTestResult.getTestClass().getRealClass().getSimpleName()+".txt",iTestResult.getMethod().getMethodName()+"| Success |"+iTestResult.getEndMillis());
        Manager.appendContents(iTestResult.getTestClass().getRealClass().getSimpleName()+".txt",iTestResult.getMethod().getMethodName()+"| Success |"+Manager.getTimeInMillis(iTestResult.getEndMillis()));



    }


    public void onTestFailure(ITestResult iTestResult) {
            System.out.println(Manager.infoMap.get(iTestResult.getTestClass().getRealClass().getSimpleName()).getClassName());
            //Manager.createLogFile(iTestResult.getTestClass().getRealClass().getSimpleName()+".txt",iTestResult.getMethod().getMethodName()+"| Falled |"+iTestResult.getEndMillis());
        Manager.appendContents(iTestResult.getTestClass().getRealClass().getSimpleName()+".txt",iTestResult.getMethod().getMethodName()+"| Falle |"+Manager.getTimeInMillis(iTestResult.getEndMillis()));
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {


           Map<String, List<ITestNGMethod>> list =  Arrays.stream(iTestContext.getAllTestMethods())
                .collect(Collectors.groupingBy(e->e.getTestClass().getRealClass().getSimpleName()));

           Map<String,TestInfo> infoList = new LinkedHashMap<>();

           list.forEach((e,k) -> {
               List<Methods> buff = new LinkedList<>();

               for(ITestNGMethod name : k){
                   buff.add(new Methods(name.getMethodName()));

               }
               infoList.put(e,new TestInfo(k.size(),buff,e));

           });

            Manager.infoMap = infoList;

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
