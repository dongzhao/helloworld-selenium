package demo.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScriptRun {

    public static void main(String[] args) {
        System.out.println("Hello, Welcome to my world!");

        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\User\\source\\VSCode\\Java\\helloworld-selenium\\driver\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com");

        
        System.setProperty("webdriver.gecko.driver", 
        "C:\\Users\\User\\source\\VSCode\\Java\\helloworld-selenium\\driver\\geckodriver32.exe");    
        WebDriver ffDriver = new FirefoxDriver();
        ffDriver.get("https://www.google.com");   
    }
}
