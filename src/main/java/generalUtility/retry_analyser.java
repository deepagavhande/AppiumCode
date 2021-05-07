package generalUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry_analyser implements IRetryAnalyzer{

	int counter=0;
	int retrtLimit=3;
	
	public boolean retry(ITestResult arg0) {
		if(counter<retrtLimit){
			counter++;
			return true;
		}
		
		return false;
	}
	

}
