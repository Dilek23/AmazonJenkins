package amazonInterwiev.pages;

import deneme.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAmazon {
    /*
     cerez = driver.findElement(By.name("accept"));
     hesapListelerButton = driver.findElement(By.id("nav-link-accountList"));
     girisYapButton = driver.findElement(By.xpath("//a[@class='nav-action-button']"
      ePosta = driver.findElement(By.id("ap_email"));
      sifre = driver.findElement(By.id("ap_password"));
       loginControl = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
       kategoriler = driver.findElement(By.id("searchDropdownBox"));
       searchBox = driver.findElement(By.id("twotabsearchtextbox"));
       WebElement ikinciSayfa = driver.findElement(By.linkText("2"));
       JavascriptExecutor jse= (JavascriptExecutor) driver;
       jse.executeScript("arguments[0].scrollIntoView();" ,ikinciSayfa);
       ikinciUrun = driver.findElement(By.xpath("(//h2/a)[2]"));
      listeyeEkle = driver.findElement(By.name("submit.add-to-registry.wishlist"));
       hesapListelerButton1 = driver.findElement(By.id("nav-link-accountList"));
       alisverisList = driver.findElement(By.id("profile-list-name"));
       kaldir = driver.findElement(By.name("submit.deleteItem"));
        silindi = driver.findElement(By.xpath("//div[.='Silindi']"));
        logOut = driver.findElement(By.linkText("Çıkış Yap"));
     */
private WebDriver driver;

    public HomePageAmazon(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="ap_email")
    private WebElement emailGiris;
    public void emailGiris(){

    }
    @FindBy(id="continue")
    private WebElement devamEtButton;
    @FindBy(id="ap_password")
    private WebElement passWord;
    @FindBy(id="signInSubmit")
    private WebElement signInButton;
    public void login(){
        emailGiris.sendKeys("trydilek23@gmail.com");
        devamEtButton.click();
        passWord.sendKeys("trdilek49");
        signInButton.click();
    AnasayfaHomePage ahp=new AnasayfaHomePage(Driver.getDriver());
     ahp.verifyHesaploginControl();
     ahp.txtMSI();
     deneme.amazonInterwiev.pages.AmazonProductOnePage apoP=new AmazonProductOnePage(Driver.getDriver());
     apoP.verifyMSI();
      apoP.jseTwoGo();
     IkinciSayfaAmazon ikinciTikla=new IkinciSayfaAmazon(Driver.getDriver());
     ikinciTikla.sayfa2();
     ikinciTikla.twoPruduct();
     deneme.amazonInterwiev.pages.AmazonPageTwoPage twoPage=new AmazonPageTwoPage(Driver.getDriver());
       twoPage.urunListeyeEkle();
       twoPage.favoriLİstemeGit();
       AmazonTaskFavorListPage flP=new AmazonTaskFavorListPage(Driver.getDriver());
       flP.verifyAlisVeris();
       flP.urunKaldir();
       flP.verifySilindi();
       flP.logOutAccount();
    }

}
