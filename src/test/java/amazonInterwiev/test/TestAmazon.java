package amazonInterwiev.test;

import deneme.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazon {

    @Test
    public void testAmazon() {
        Driver.getDriver().get("https://www.amazon.com.tr/");
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("amazon"));
        LoginPageAmazon lpa=new LoginPageAmazon(Driver.getDriver());
        lpa.cerezKabul();
        lpa.girisYap();
        HomePageAmazon hpa=new HomePageAmazon(Driver.getDriver());
        hpa.login();

    }

}
