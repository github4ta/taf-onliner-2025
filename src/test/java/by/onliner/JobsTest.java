package by.onliner;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobsTest {
    @Test
    public void testJobs() {
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        String url="https://www.onliner.by/";
        driver.navigate().to(url);

    }
}
