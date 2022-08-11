import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        FireFoxBrowserTest d = new FireFoxBrowserTest();
        d.firefoxtest();
    }


    public void firefoxtest(){

        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        //driver.close();
    }

}
