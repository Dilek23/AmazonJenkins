package amazonInterwiev.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonProductOnePage {
    private WebDriver driver;

    public AmazonProductOnePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
@FindBy(xpath = "//*[text()='MSI']")
   private WebElement dogrulaMSI;
    public void verifyMSI(){
        Assert.assertTrue(dogrulaMSI.getText().toUpperCase().contains("MSI"));
    }

    @FindBy(xpath="(//a[@class='s-pagination-item s-pagination-button'])[1]")
    private WebElement ikinciSayfa;

    public void jseTwoGo(){
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",ikinciSayfa);
         ikinciSayfa.click();

    }



}
