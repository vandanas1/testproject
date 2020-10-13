package retryAnalyzer1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class MyTransformer implements IAnnotationTransformer {
	
	@Test
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(ExecuteFailedTestCase.class);
		//IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
	}	
	
	@Override
	public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor,
			Method testMethod) {
		// TODO Auto-generated method stub
		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
	}
	

}
