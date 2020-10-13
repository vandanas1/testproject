package retryAnalyzer1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ExecuteFailedTestCase implements IRetryAnalyzer {
	int count=0;
	int retryLimit=3;

@Override
@Test
public boolean retry(ITestResult result) {
	 if(count<retryLimit){
		  count++;
		  return true;
	  }
	
	return false;
}


}
