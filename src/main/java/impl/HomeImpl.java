package impl;

import pages.HomePage;
import utils.ConfigReader;
import utils.WebDriverUtils;
import java.util.Set;

public class HomeImpl {
    HomePage page = new HomePage();

    public HomePage getPage(){
        if(page == null)
            page = new HomePage();
            return page;

    }
    public void navigateToHomepage(){
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));

    }

    public void openLinkInNewWindowAndSwitch(String linkText){
        switch (linkText.toLowerCase()){
            case "saucedemo":
                getPage().sauceDemoLink.click();
            break;
            default:
                System.out.println("Invalid link text");
        }

//        String currentWindow = WebDriverUtils.getDriver().getWindowHandle();
//        Set<String> allWindow = WebDriverUtils.getDriver().getWindowHandles();
        for(String eachWindow : WebDriverUtils.getDriver().getWindowHandles()){
            if(!eachWindow.equals(WebDriverUtils.getDriver().getWindowHandle())){
                WebDriverUtils.getDriver().switchTo().window(eachWindow);
            }
        }
    }
}
