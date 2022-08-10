package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pojo.Response;


import java.awt.Dimension;
import java.io.File.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


public class myStepDef {
    @FindBy(id="Sample")
    WebElement txtSample;
    Response response;

    @Given("^User calls get user API$")
    public void UsercallsgetuserAPI(){
       response=    given().
                    when().
                    get("https://reqres.in/api/users/2").
                    then().assertThat().statusCode(200).
                     extract().as(Response.class);
    }
    @Then("Verify that status code is {int} and FirstName is {string}")
    public void verify_that_status_code_is_and_FirstName_is(Integer int1, String sExpected) {
      String sFirstName=  response.getData().getFirst_name();
      System.out.println("First Name is ;-"+sFirstName);
        Assert.assertEquals(sExpected,sFirstName);
    }
    @And("^Verify Last name as \"([^\"]*)\"$")
    public void verify_last_name_as_something(String sLastName) throws Throwable {
        Assert.assertEquals(sLastName,response.getData().getLast_name());
    }

    @Given("User launches URL")
    public void userLaunchesURL() throws AWTException, WebDriverException, IOException {
        System.out.println("Hello World!");
        System.setProperty("webdriver.chrome.driver","C:\\VishwanathChenni\\AWS\\SampleTestProject\\claculatortest\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

//        Actions action =new Actions(driver);
//        WebElement element=driver.findElement(By.id("sample"));
//        action.doubleClick(element).build().perform();;
//          Right click

//        Actions action =new Actions(driver);
//        WebElement myElement=driver.findElement(By.xpath("//input[@id='test']"));
//        action.contextClick(myElement).build().perform();
        Properties properties=new Properties();
        FileInputStream fis=new FileInputStream("C://temp.properties");
        properties.load(fis);
        properties.getProperty("userName");

//        String element=driver.findElement(By.xpath("//input[@id='sample']")).getAttribute("value");

        Select select =new Select(driver.findElement(By.id("MyId")));
        select.selectByVisibleText("India");


//       List<WebElement>list=driver.findElements(By.tagName("a"));
//       list.size();
//        driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);

//        Robot robot=new Robot();
//        robot.keyPress(KeyEvent.VK_CONTROL);

//        Mouse Over
            Actions action =new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//input[@id='myinputbox']"));
        action.moveToElement(element).build().perform();

//        Executing Java script in slenima

        JavascriptExecutor js =((JavascriptExecutor)driver);
        js.executeScript("{java script code}");

        //Appcept an alert
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        Select mySelect=new Select(driver.findElement(By.id("myid")));
        mySelect.getOptions().size();



        // To scroll a window
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");

        //  Scroll to visibility of the element
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",element);

        //  Taking screenshot in selenium
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("D:/TempFolder/sample.jpeg"));

        PageFactory.initElements(driver,this);
        txtSample.sendKeys();


        // Maximise the window size.
        driver.manage().window().maximize();

//        Set the size of Window
        Dimension d =new Dimension(420,600);
//        driver.manage().window().setSize(d);

//        Enter text without using sendKeyss method
        JavascriptExecutor je= (JavascriptExecutor)driver;
        je.executeScript("document.getElementById('Login').value=SetTextWithoutSendKeys");

//        How to enter credentials in authentication pop up
        WebDriverWait wait=new WebDriverWait(driver,10);
//        Alert alert=wait.until(ExpectedConditions.alertIsPresent());
//        alert.authenticateUsing(new UsernamePasswordCredentials("username,passwor"));

//        How to click on element thst is not visible
        WebElement myelement=driver.findElement(By.xpath("Hello"));
        ((JavascriptExecutor)driver).executeScript("arugument[0].click()",myelement);


//        How to get broekn links in a page
        List<WebElement> links=driver.findElements(By.tagName("a"));
        for (int i=0;i<links.size();i++){

            WebElement element1= links.get(i);
            //By using href we can get the required link
            String sURL=element1.getAttribute("href");

//            Print the URL
            URL link=new URL(sURL);

//            Create connnection using URL
            HttpURLConnection httpURLConnection=(HttpURLConnection)link.openConnection();

//            set the timeout for 2 seconds
            httpURLConnection.setConnectTimeout(2000);

//            Connect using connect method
            httpURLConnection.connect();;


//            user  get response code to get the response code
            if(httpURLConnection.getResponseCode() > 400){
                System.out.println(sURL+"-"+ "is Broken");
            }else{
                System.out.println(sURL+"-"+ "is Valid");
            }

        }
//
//        List<WebElement> linksa=driver.findElements(By.tagName("a"));
//        for(int j=0;j<linksa.size();j++){
//
//            WebElement webElement1=linksa.get(j);
//            String sURLString=webElement1.getAttribute("href");
//            URL link1=new URL(sURLString);
//            HttpURLConnection httpURLConnection=(HttpURLConnection)link1.openConnection();
//            httpURLConnection.setConnectTimeout(2000);
//            httpURLConnection.connect();
//            httpURLConnection.getResponseCode();
//        }



//         Deleting all cookies
            driver.manage().deleteAllCookies();
//
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("Hello")));
//        driver.findElement(By.xpath("//input[contains(text(),'Hello')]"))
//        WebDriverWait wait =new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("MyObject")));
//
//        Actions action =new Actions(driver);
//        WebElement element=driver.findElement(By.id("sample"));
//        action.doubleClick(element).build().perform();

        //        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver_mac");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
//        String baseUrl = "http://demo.guru99.com/test/newtours/";
//        driver.get(baseUrl);
//        try{
//            driver.findElement(By.xpath("//h1[contains(text(),'Demo Calculator')]")).isDisplayed();
//        }catch (Exception e){
//            System.out.println("HomePage is not displayed");
//        }
//
//        driver.close();
//        driver.quit();
        ( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

           Set<String> sHandles=driver.getWindowHandles();
           for(String handle: sHandles){
               driver.switchTo().window(handle);
           }

    }
}
