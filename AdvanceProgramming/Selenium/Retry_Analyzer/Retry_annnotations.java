package Retry_Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.sun.net.httpserver.Authenticator.Retry;

public class Retry_annnotations implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotatons, Class arg1, Constructor arg2,
			Method arg3) {
		// TODO Auto-generated method stub
		
		annotatons.setRetryAnalyzer(Anlyzer.class);
		
	}

	

}
