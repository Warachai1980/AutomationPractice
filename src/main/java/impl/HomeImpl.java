package impl;

import utils.ConfigReader;
import utils.WebDriverUtils;

public class HomeImpl {

    public void navigateToHomepage(){
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));

    }
}
