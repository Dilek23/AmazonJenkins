package amazonInterwiev.pages;

import deneme.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageAmazon {

 private WebDriver driver;



    public LoginPageAmazon(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(name ="accept" )
    private WebElement cerezKabul;

    public void cerezKabul(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cerezKabul)).click();
    }
    @FindBy(id = "nav-link-accountList")
    private WebElement hesapButton;
    @FindBy(partialLinkText = "Giriş yap")
    private WebElement girisButton;

    public void girisYap(){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(hesapButton).perform();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(girisButton)).click();

    }






}
