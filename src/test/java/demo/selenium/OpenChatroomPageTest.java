package demo.selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenChatroomPageTest {

    @BeforeMethod
    public void setUp() {
		long id = Thread.currentThread().getId();
		System.out.println("Before test. Thread id is: " + id);

        //System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.setProperty("webdriver.gecko.driver", 
        "C:\\Users\\User\\source\\VSCode\\Java\\helloworld-selenium\\driver\\geckodriver32.exe");
    }

    @Test
    public void testOpenChatroomPage1() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("test One. Thread id is: " + id);

        ScriptRunner scriptRunner = new ScriptRunner();
        scriptRunner.gotoChatRoom("http://localhost:19001");
        //scriptRunner.wait(5);
        scriptRunner.closeBrowser();
    }

    @Test
    public void testOpenChatroomPage2() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("test Two. Thread id is: " + id);

        ScriptRunner scriptRunner = new ScriptRunner();
        scriptRunner.gotoChatRoom("http://localhost:19001");
        //scriptRunner.wait(5);
        scriptRunner.closeBrowser();
    }

    @Test
    public void testOpenChatroomPage3() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("test Three. Thread id is: " + id);

        ScriptRunner scriptRunner = new ScriptRunner();
        scriptRunner.gotoChatRoom("http://localhost:19001");
        //scriptRunner.wait(5);
        scriptRunner.closeBrowser();
    }

    @AfterMethod
    public void tearDown() {
        long id = Thread.currentThread().getId();
		System.out.println("After test. Thread id is: " + id);
    }
    
}
