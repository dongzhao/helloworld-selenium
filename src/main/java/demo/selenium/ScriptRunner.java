package demo.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptRunner {

    WebDriver ffDriver = null;
    public ScriptRunner() {
        // Set FireFox driver path
        System.setProperty("webdriver.gecko.driver", 
        "C:\\Users\\User\\source\\VSCode\\Java\\helloworld-selenium\\driver\\geckodriver32.exe");      
        this.ffDriver = new FirefoxDriver();
    }   

    public void gotoChatRoom(String urlString) {
        ffDriver.get(urlString);
    }   

    public void closeBrowser() {
        ffDriver.close();
        //ffDriver.quit();
    }

    public void wait(int seconds) throws InterruptedException {
        ffDriver.wait((long)seconds * 1000);
    }

}
