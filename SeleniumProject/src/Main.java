import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Main {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        System.setProperty("chromeDriver","D:\\selenium\\IEDriverServer.exe");

        webDriver.get("https://the-internet.herokuapp.com/iframe");
        WebElement something = webDriver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));


        Actions actions = new Actions(webDriver);
        actions.moveToElement(something,10,5).clickAndHold().moveByOffset(20,0).release().perform();



    }
}