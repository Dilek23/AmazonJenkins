package amazonInterwiev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IkinciSayfaAmazon {
     private WebDriver driver;

    public IkinciSayfaAmazon(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void sayfa2(){
    Assert.assertTrue(driver.getCurrentUrl().contains("page=2"));

}
  @FindBy(xpath = "(//h2/a)[2]")
  private WebElement textIkinciproduct;
    public void twoPruduct(){
        textIkinciproduct.click();
    }


}
