import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/marii/Downloads/21.index.html");
    }

    @Test
    public void tableTest(){
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(), "Canada");
    }



    @Test
    public void cssLocators() {
        //by tag name
        WebElement element = wd.findElement(By.tagName("button"));
        WebElement el = wd.findElement(By.cssSelector("button"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        WebElement el1 = wd.findElement(By.cssSelector("a"));

        WebElement element1 = wd.findElement(By.tagName("div"));
        WebElement el2 = wd.findElement(By.cssSelector("div"));

        List<WebElement> list1 = wd.findElements(By.tagName("div"));
        List<WebElement> list2 = wd.findElements(By.cssSelector("div"));

        WebElement element3 = wd.findElement(By.tagName("ul"));
        WebElement element8 = wd.findElement(By.cssSelector("ul"));

        WebElement element4 = wd.findElement(By.tagName("li"));
        WebElement element9 = wd.findElement(By.cssSelector("li"));

        List<WebElement> list3 = wd.findElements(By.tagName("li"));
        List<WebElement> list4 = wd.findElements(By.cssSelector("li"));

        WebElement element5 = wd.findElement(By.tagName("form"));
        WebElement element10 = wd.findElement(By.cssSelector("form"));

        WebElement element6 = wd.findElement(By.tagName("input"));
        WebElement element11 = wd.findElement(By.cssSelector("input"));

        WebElement element7 = wd.findElement(By.tagName("p"));
        WebElement element12 = wd.findElement(By.cssSelector("p"));


        //by class
        WebElement el13 = wd.findElement(By.className("container"));
        WebElement el14 = wd.findElement(By.cssSelector(".container"));

        List<WebElement> list5 = wd.findElements(By.className("nav-item"));
        List<WebElement> list6 = wd.findElements(By.cssSelector(".nav-item"));

        //by id

        WebElement el15 = wd.findElement(By.id("nav"));
        WebElement el16 = wd.findElement(By.cssSelector("#nav"));

        //by attribute

        WebElement el17 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement el18 = wd.findElement(By.cssSelector("[placeholder='Type your name']"));

        //by name
        WebElement el19 = wd.findElement(By.name("name"));
        WebElement el20 = wd.findElement(By.cssSelector("[name='surename']"));

        //by linkText & partialLinkText
        WebElement a = wd.findElement(By.linkText("Item 1"));
        WebElement a1 = wd.findElement(By.partialLinkText("m 1"));


        WebElement inp = wd.findElement(By.cssSelector("[placeholder='Type your name']"));

        //start
        WebElement inp1 = wd.findElement(By.cssSelector("[placeholder ^='Type']"));

        //end
        WebElement inp2 = wd.findElement(By.cssSelector("[placeholder $= 'name']"));

        //contains
        WebElement inp3 =wd.findElement(By.cssSelector("[placeholder *='your']"));




    }


    @AfterClass
    public void stop() {
        wd.close();
    }

}
