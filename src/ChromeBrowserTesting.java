import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTesting {

    public static void main(String[] args) {
        ChromeBrowserTesting d = new ChromeBrowserTesting();
        d.chrometest();
    }

    public void chrometest(){
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        //driver.close();



    }



}
