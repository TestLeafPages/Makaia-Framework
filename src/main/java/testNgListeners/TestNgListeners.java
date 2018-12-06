package testNgListeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class TestNgListeners implements IRetryAnalyzer, IAnnotationTransformer{
	int maxTry = 2;
	@Override
	public boolean retry(ITestResult result) {
		System.out.println(result.getStatus());
		String testName = result.getName();
		if(testName.equals("test1")) {
			System.out.println(testName);
			return true;
		}
		return false;
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
		String name = testMethod.getName();
		System.out.println(name);
		
	}

	
}
