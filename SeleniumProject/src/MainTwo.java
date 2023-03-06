import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MainTwo {

    public static void main(String[] args){

        WebDriver chromeDriver = new ChromeDriver();
        System.setProperty("chromeDriver", "D:\\selenium\\IEDriverServer.exe");


        chromeDriver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = chromeDriver.getTitle();

        assertEquals("Web form", title);

        WebElement textInput = chromeDriver.findElement(By.cssSelector("input[class=\"form-control\"]"));
        WebElement submitButton = chromeDriver.findElement(By.cssSelector("button[class=\"btn btn-outline-primary mt-3\"]"));

        textInput.sendKeys("Selenium");
        submitButton.click();

        WebElement message = chromeDriver.findElement(By.id("message"));

        String messageTitle = message.getText();
        assertEquals("Received!" , messageTitle);

        chromeDriver.quit();


    }

    private static void assertEquals(String web_form, String title) {

        if(title.contentEquals(web_form))
            System.out.println("Test Passed!");
        else
            System.out.println("Test Failed");


    }


}
