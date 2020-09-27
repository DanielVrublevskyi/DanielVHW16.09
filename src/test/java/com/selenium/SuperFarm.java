package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SuperFarm {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();

    }

    @Test
    public void testNavMenu(){

        wd.navigate().to("https://shop.super-pharm.co.il/");
//        wd.findElement(By.cssSelector("body.page-homepage.pageType-ContentPage.template-pages-layout-landingLayout2Page.pageLabel-homepage.language-he.INDlangdirRTL.INDpositionRight.INDDesktop.INDChrome:nth-child(2) div.site-wrap:nth-child(4) nav.navbar.navbar-top div.container-fluid div.row-fluid div.col-xs-6:nth-child(2) ul.nav.navbar-nav.nav-jusified li.yCmsComponent:nth-child(6) > a:nth-child(1)")).click();

        WebElement nav = wd.findElement(By.xpath("//nav[@id='navbar-header-top']"));
        nav.findElement(By.xpath(".//*[@title='תנאי שימוש']")).click();

//        wd.findElement(By.xpath("//nav[@id='navbar-header-top']//*[@title='תנאי שימוש']")).click();

    }
}
