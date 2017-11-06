import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {

    private static WebDriver driver;


    @BeforeClass
    public static void start()
    {
    driver =  new ChromeDriver();
    driver.get("file:///home/kazmiruk/Desktop/calc.html");
    }

    @Before
    public void cleanup()
    {
    driver.findElement(By.xpath("//input[@value='C']")).click();

    }

    @Test
    public void add_test ()
    {
            driver.get(baseUrl + "file:///home/kazmiruk/Desktop/calc.html");
            driver.findElement(By.xpath("//input[@value='5']")).click();
            driver.findElement(By.xpath("//input[@value='+']")).click();
            driver.findElement(By.xpath("//input[@value='3']")).click();
            driver.findElement(By.xpath("//input[@value='=']")).click();
            driver.assertEquals(expected:"8", driver.findElement(By.id("resultsbox")).getAttribute("value"));
    }

    @Test
    public void subtract_test ()
    {
        driver.get(baseUrl + "file:///home/kazmiruk/Desktop/calc.html");
        driver.findElement(By.xpath("//input[@value='5']")).click();
        driver.findElement(By.xpath("//input[@value='-']")).click();
        driver.findElement(By.xpath("//input[@value='3']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        driver.assertEquals(expected:"2", driver.findElement(By.id("resultsbox")).getAttribute("value"));
    }

    @Test
    public void multiply_test ()
    {
        driver.get(baseUrl + "file:///home/kazmiruk/Desktop/calc.html");
        driver.findElement(By.xpath("//input[@value='5']")).click();
        driver.findElement(By.xpath("//input[@value='*']")).click();
        driver.findElement(By.xpath("//input[@value='3']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        driver.assertEquals(expected:"18", driver.findElement(By.id("resultsbox")).getAttribute("value"));
    }

    @Test
    public void divide_test ()
    {
        driver.get(baseUrl + "file:///home/kazmiruk/Desktop/calc.html");
        driver.findElement(By.xpath("//input[@value='4']")).click();
        driver.findElement(By.xpath("//input[@value='/']")).click();
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        driver.assertEquals(expected:"2", driver.findElement(By.id("resultsbox")).getAttribute("value"));
    }

    @AfterClass
    public static void stop()
    {
    driver.quit();
    }




}
