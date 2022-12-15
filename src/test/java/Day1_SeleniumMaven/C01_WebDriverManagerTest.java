package Day1_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManagerTest {
    // Set Path.
// Create chrome driver.
// Maximize the window.
// Open google home page https://www.google.com/
// Verify that you are Google in the title.


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        //driver objemizi oluşturduk
        WebDriver driver=new ChromeDriver();

        //windowsu maxsimize ettik
        driver.manage().window().maximize();

        //google anasayfamızı açtık
        driver.get("https://www.google.com/");

        //title mizi aldık
        String tittle=driver.getTitle();

        //tittle imizi doğruladık
        if (tittle.equals("Google")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAİLED");
        }
        //drivermizi kapattık
        driver.quit();
    }
}
