package amazonInterwiev.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AnasayfaHomePage {

    private WebDriver driver;

    public AnasayfaHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(id="nav-link-accountList-nav-line-1")
    private WebElement txtHesapGirisKonrol;
    public void verifyHesaploginControl(){
        Assert.assertTrue(txtHesapGirisKonrol.getText().toLowerCase().contains("tuğba"));
    }
    @FindBy(id="searchDropdownBox")
    private WebElement katgri;
    public void drpDownSecim(){
        Select select=new Select(katgri);
        select.selectByVisibleText("Bilgisayarlar");
    }
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;
    public void txtMSI(){
        searchBox.sendKeys("MSI"+ Keys.ENTER);

    }

}
