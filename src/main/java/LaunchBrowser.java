import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    WebDriver driver;
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver_win32/chromedriver.exe");
        driver= new ChromeDriver();


    }

    }


