import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class AvonLogin {

    WebDriver driver;

    String siteURL = "https://avoncosmeticsltd2023--b2bqa.sandbox.my.site.com/avonb2bstore/en-GB/login";
    String emailAddress = "ksahil+2@salesforce.com";
    String Password = "Root@123";


    @BeforeMethod
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get(siteURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }

    @Test(priority = 1)
    public void verifyTitle()
    {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Login";

        Assert.assertEquals(actualTitle,expectedTitle);
    }


    @Test(priority = 2)
    public void validCradentialLogin()
    {
        driver.findElement(By.xpath("//*[@id=\"input-26\"]")).sendKeys(emailAddress);
        driver.findElement(By.xpath("//*[@id=\"input-28\"]")).sendKeys(Password);
        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/community_login-login-form/div/div[1]/div/button")).click();

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}

