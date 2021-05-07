package seleniumBasicPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class clipboard_practice {
	
	public static void main(String[] args) throws AWTException {
		
		//for copy test
		
		Clipboard cp= Toolkit.getDefaultToolkit().getSystemClipboard();
		
		StringSelection ss=new StringSelection("shriDeep");
		
		cp.setContents(ss, null);
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		
		rb.keyPress(KeyEvent.VK_F);
		
		rb.keyRelease(KeyEvent.VK_F);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.keyPress(KeyEvent.VK_DELETE);
		
        rb.keyPress(KeyEvent.VK_CONTROL);
		
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
