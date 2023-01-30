package amazonInterwiev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AmazonPageTwoPage {
    private WebDriver driver;

    public AmazonPageTwoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(id = "add-to-wishlist-button-submit")
    private WebElement addFavorite;
    @FindBy(id = "huc-item-link")
    private WebElement textOnePRoduct;
    @FindBy(tagName="button")
    private WebElement closeButton;

    public void urunListeyeEkle() {
        addFavorite.click();
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(textOnePRoduct));
      Assert.assertTrue(textOnePRoduct.isDisplayed());
        closeButton.click();


    }
    @FindBy(id="nav-link-accountList")//hesap ve listelere git
    private WebElement hesapButton;

    @FindBy(linkText = "Alışveriş Listesi")//alisveris listesine git
    private   WebElement favoriList;

    public void favoriLİstemeGit() {
        hesapButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(favoriList));
        favoriList.click();


    }



}
