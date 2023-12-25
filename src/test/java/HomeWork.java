
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void cssLocators() {


        //by tag name
        WebElement h1Tag = wd.findElement(By.tagName("h1"));
        WebElement h1Css = wd.findElement(By.cssSelector("h1"));
        WebElement h1 = wd.findElement(By.xpath("//h1"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement divCss = wd.findElement(By.cssSelector("div"));
        WebElement divX = wd.findElement(By.xpath("//div"));

        WebElement a = wd.findElement(By.tagName("a"));
        WebElement aCss = wd.findElement(By.cssSelector("a"));
        WebElement aX = wd.findElement(By.xpath("//a"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement buttonCss = wd.findElement(By.cssSelector("button"));
        WebElement buttonX = wd.findElement(By.xpath("//button"));


        //by id
        WebElement divId = wd.findElement(By.id("root"));
        WebElement divCss1 = wd.findElement(By.cssSelector("#root"));
        WebElement divX1 = wd.findElement(By.xpath("//*[@id='root']"));


        //by class
        WebElement divCl = wd.findElement(By.className("container"));
        WebElement divCss2 = wd.findElement(By.cssSelector(".container"));
        WebElement div1 = wd.findElement(By.xpath("//div[@class ='container']"));

        WebElement divCl1 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement divCss3 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement div2 = wd.findElement(By.xpath("//*[@class ='navbar-component_nav__1X_4m']"));

        WebElement divCl2 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement divCss4 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement div3 = wd.findElement(By.xpath("//*[@class ='login_login__3EHKB']"));

        //by attribute

        WebElement element = wd.findElement(By.cssSelector("[id='root']"));
        WebElement element1 = wd.findElement(By.xpath("//*[@id='root']"));

        WebElement element2 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement element3 = wd.findElement(By.xpath("//*[@href='/home']"));


        //one of elements find by attribute ====> start & end & contains
        WebElement inp = wd.findElement(By.cssSelector("[placeholder ='Email']"));
        WebElement inpX = wd.findElement(By.xpath("//input[@placeholder='Email']"));

        //star
        WebElement inp1 = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement inpX1 = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Em')]"));


        WebElement inp2 = wd.findElement(By.cssSelector("[placeholder $='il']"));
        WebElement inpX2 = wd.findElement(By.xpath("//*[contains(@placeholder, 'il')]"));

        //contains
        WebElement inp3 = wd.findElement(By.cssSelector("[placeholder *='ma']"));
        WebElement inpX3 = wd.findElement(By.xpath("//*[contains(@placeholder, 'ma')]"));
        WebElement a1=wd.findElement(By.xpath("//a[3]"));




    }


    @Test
    public void classwork(){
        //parent
        WebElement el =wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el1 =wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 =wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one option

        //ancestor or self (plus one more)
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement>list =wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement>list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        WebElement el7 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::h1"));
        List<WebElement>list2 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::a"));





    }

    @AfterClass
    public void stop() {
        wd.close();
    }

}
