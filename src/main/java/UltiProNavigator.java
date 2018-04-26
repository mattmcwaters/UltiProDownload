import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class UltiProNavigator {
    ChromeDriver driver = new ChromeDriver();

    public UltiProNavigator(){};


    public void login(String user, String pass) throws MalformedURLException {
        driver.get("http://ultipro.centro.net/");
        WebElement userBox = driver.findElement(By.id("userNameInput"));
        userBox.sendKeys(user);

        WebElement passBox = driver.findElement(By.id("passwordInput"));
        passBox.sendKeys(pass);

        WebElement loginBtn = driver.findElement(By.id("submitButton"));
        loginBtn.click();


    }
    //TODO: paystubs function which happens after login
    public void payStubs(){
    }



}
