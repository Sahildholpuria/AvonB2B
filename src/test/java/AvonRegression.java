import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AvonRegression {

    WebDriver driver;

    String siteURL = "https://avoncosmeticsltd2023--b2bqa.sandbox.my.site.com/avonb2bstore/en-GB/login";
    String emailAddress = "ksahil+2@salesforce.com";
    String Password = "Root@123";
    int SleepTime = 10000;


    @BeforeMethod
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get(siteURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }

//    @Test
//    public void verifyTitle()
//    {
//        String actualTitle = driver.getTitle();
//        String expectedTitle = "Login";
//
//        Assert.assertEquals(actualTitle,expectedTitle);
//    }


    @Test
    public void AURORA_336_SelfRegistration() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"input-26\"]")).sendKeys(emailAddress);
        driver.findElement(By.xpath("//*[@id=\"input-28\"]")).sendKeys(Password);
        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/community_login-login-form/div/div[1]/div/button")).click();
        Thread.sleep(10000);



    }

    @Test
    public void AURORA_308_ForgotPassword() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/community_login-login-form/div/div[2]/div/a[1]")).click();
        Thread.sleep(10000);
    }

    @Test
    public void AURORA_312_RepNavigation() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"input-26\"]")).sendKeys(emailAddress);
        driver.findElement(By.xpath("//*[@id=\"input-28\"]")).sendKeys(Password);

        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/community_login-login-form/div/div[1]/div/button")).click();

        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[1]/webruntime-component-container[1]/commerce_builder-layout-header/commerce-layout-header/header/div/div/div[2]/div/commerce_builder-drilldown-navigation/commerce-drilldown-navigation/commerce-drilldown-navigation-bar/nav/ul/li[2]/button")).click();


        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[1]/webruntime-component-container[1]/commerce_builder-layout-header/commerce-layout-header/header/div/div/div[2]/div/commerce_builder-drilldown-navigation/commerce-drilldown-navigation/commerce-drilldown-navigation-bar/nav/ul/li[2]/commerce-drilldown-navigation-list/div/nav/ul/li[1]/a")).click();
        Thread.sleep(20000);
    }

    @Test
    public void AURORA_332_NativeAccountProfileData() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"input-26\"]")).sendKeys(emailAddress);
        driver.findElement(By.xpath("//*[@id=\"input-28\"]")).sendKeys(Password);
        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/community_login-login-form/div/div[1]/div/button")).click();

        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[1]/webruntime-component-container[1]/commerce_builder-layout-header/commerce-layout-header/header/div/div/div[4]/div[1]/div/commerce_builder-user-profile-menu/commerce_my_account-user-profile-menu/div/div[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[1]/webruntime-component-container[1]/commerce_builder-layout-header/commerce-layout-header/header/div/div/div[4]/div[1]/div/commerce_builder-user-profile-menu/commerce_my_account-user-profile-menu/div/div[2]/ul/li[1]/a/span")).click();
        Thread.sleep(SleepTime);
    }

//    @Test
//    public void AURORA_439_NativeSearch()
//    {
//        driver.findElement(By.xpath("//*[@id=\"input-26\"]")).sendKeys(emailAddress);
//        driver.findElement(By.xpath("//*[@id=\"input-28\"]")).sendKeys(Password);
//        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/community_login-login-form/div/div[1]/div/button")).click();
//
//        driver.findElement(By.id("uh26n7z")).sendKeys("sdsa");
//
//    }

    @Test
    public void AURORA_888_PDP() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"input-26\"]")).sendKeys(emailAddress);
        driver.findElement(By.xpath("//*[@id=\"input-28\"]")).sendKeys(Password);
        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/community_login-login-form/div/div[1]/div/button")).click();

        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[1]/webruntime-component-container[1]/commerce_builder-layout-header/commerce-layout-header/header/div/div/div[2]/div/commerce_builder-drilldown-navigation/commerce-drilldown-navigation/commerce-drilldown-navigation-bar/nav/ul/li[2]/button")).click();


        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[1]/webruntime-component-container[1]/commerce_builder-layout-header/commerce-layout-header/header/div/div/div[2]/div/commerce_builder-drilldown-navigation/commerce-drilldown-navigation/commerce-drilldown-navigation-bar/nav/ul/li[2]/commerce-drilldown-navigation-list/div/nav/ul/li[1]/a")).click();

        driver.navigate().to("https://avoncosmeticsltd2023--b2bqa.sandbox.my.site.com/avonb2bstore/product/colors-of-love-heartwarming-bronzer-matte-mineral-powder/01tPu000003DcUCIA0");
        Thread.sleep(20000);
    }

    @Test
    public void AURORA_1976_AddtoWishlist() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"input-26\"]")).sendKeys(emailAddress);
        driver.findElement(By.xpath("//*[@id=\"input-28\"]")).sendKeys(Password);
        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/community_login-login-form/div/div[1]/div/button")).click();

        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[1]/webruntime-component-container[1]/commerce_builder-layout-header/commerce-layout-header/header/div/div/div[2]/div/commerce_builder-drilldown-navigation/commerce-drilldown-navigation/commerce-drilldown-navigation-bar/nav/ul/li[2]/button")).click();


        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[1]/webruntime-component-container[1]/commerce_builder-layout-header/commerce-layout-header/header/div/div/div[2]/div/commerce_builder-drilldown-navigation/commerce-drilldown-navigation/commerce-drilldown-navigation-bar/nav/ul/li[2]/commerce-drilldown-navigation-list/div/nav/ul/li[1]/a")).click();

        driver.navigate().to("https://avoncosmeticsltd2023--b2bqa.sandbox.my.site.com/avonb2bstore/product/cashmere-eyeshadow-palette/01tPu000003DcTzIAK");
        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[2]/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce_data_provider-product-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/webruntime-component-container[2]/community_layout-section/div[3]/community_layout-column[2]/div/c-b2b-builder-product-purchase-options/div/div/button")).click();
        driver.navigate().to("https://avoncosmeticsltd2023--b2bqa.sandbox.my.site.com/avonb2bstore/mylists");
        Thread.sleep(20000);


    }

    @Test
    public void AURORA_797_ViewSavedAddress() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"input-26\"]")).sendKeys(emailAddress);
        driver.findElement(By.xpath("//*[@id=\"input-28\"]")).sendKeys(Password);
        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/community_login-login-form/div/div[1]/div/button")).click();

        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[1]/webruntime-component-container[1]/commerce_builder-layout-header/commerce-layout-header/header/div/div/div[4]/div[1]/div/commerce_builder-user-profile-menu/commerce_my_account-user-profile-menu/div/div[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[1]/webruntime-component-container[1]/commerce_builder-layout-header/commerce-layout-header/header/div/div/div[4]/div[1]/div/commerce_builder-user-profile-menu/commerce_my_account-user-profile-menu/div/div[2]/ul/li[1]/a/span")).click();

        driver.navigate().to("https://avoncosmeticsltd2023--b2bqa.sandbox.my.site.com/avonb2bstore/addresses");
        driver.findElement(By.xpath("//*[@id=\"Billing__item\"]")).click();

        Thread.sleep(SleepTime);

    }

    @Test
    public void AURORA_886_Ingredients_DeliveryReturntabs() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"input-26\"]")).sendKeys(emailAddress);
        driver.findElement(By.xpath("//*[@id=\"input-28\"]")).sendKeys(Password);
        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/community_login-login-form/div/div[1]/div/button")).click();

        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[1]/webruntime-component-container[1]/commerce_builder-layout-header/commerce-layout-header/header/div/div/div[2]/div/commerce_builder-drilldown-navigation/commerce-drilldown-navigation/commerce-drilldown-navigation-bar/nav/ul/li[2]/button")).click();


        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/commerce-layout-site/div[1]/webruntime-component-container[1]/commerce_builder-layout-header/commerce-layout-header/header/div/div/div[2]/div/commerce_builder-drilldown-navigation/commerce-drilldown-navigation/commerce-drilldown-navigation-bar/nav/ul/li[2]/commerce-drilldown-navigation-list/div/nav/ul/li[1]/a")).click();

        driver.navigate().to("https://avoncosmeticsltd2023--b2bqa.sandbox.my.site.com/avonb2bstore/product/colors-of-love-heartwarming-bronzer-matte-mineral-powder/01tPu000003DcUCIA0");
        driver.findElement(By.xpath("//*[@id=\"0b36e-nav\"]")).click();
        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"0b36e-nav\"]")).click();

        Thread.sleep(20000);

    }


//    @Test
//    public void invalidCradentialLogin()
//    {
//
//        driver.findElement(By.xpath("//*[@id=\"input-26\"]")).sendKeys("emailAddress@sasa.com");
//        driver.findElement(By.xpath("//*[@id=\"input-28\"]")).sendKeys("Password");
//        driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/community_login-login-form/div/div[1]/div/button")).click();
//
//        boolean errorFlag = driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/community_login-login-form/div/community_login-login-error/div")).isDisplayed();
//        Assert.assertTrue(errorFlag);
//
//
//    }

//    @Test
//    public void verifyLogo()
//    {
//        boolean flag = driver.findElement(By.xpath("//*[@id=\"main\"]/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/b2c_lite_commerce-external-layout/webruntime-router-container/dxp_data_provider-user-record-data-provider/dxp_data_provider-data-proxy/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/dxp_content_layout-site-logo/a/div")).isDisplayed();
//        Assert.assertTrue(flag);
//    }



    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}

