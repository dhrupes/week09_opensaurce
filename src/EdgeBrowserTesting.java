import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTesting {
    public static void main(String[] args) {


    EdgeBrowserTesting d = new EdgeBrowserTesting();
    d.edgetest();

}


    public void edgetest(){
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }




}
