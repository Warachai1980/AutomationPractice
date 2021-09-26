package impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.UserMgtPage;
import utils.SeleniumUtils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UserMgtImpl {
    private UserMgtPage page;

    public UserMgtPage getPage() {
        if(page == null){
            page = new UserMgtPage();
        }
        return page;
    }

    Map<String, String> userFieldInputsMap = new LinkedHashMap<>();
    public void fillInputField(String inputFieldName, String value){
        switch (inputFieldName.toLowerCase()){
            case "firstname": getPage().firstNameInput.sendKeys(value);
                break;
            case "lastname": getPage().lastNameInput.sendKeys(value);
                break;
            case "phone number": getPage().phoneInput.sendKeys(value);
                break;
            case "email": getPage().emailInput.sendKeys(value);
                break;
            case "role":
                SeleniumUtils.selectByVisibleText(getPage().selectRole, value);
                break;
            default:
                System.out.println("Field name was not found...");
        }
        userFieldInputsMap.put(inputFieldName, value);
    }

    public String verifyEachUserFields() {

        String result = "success";
        List<WebElement> allCells = getPage().userTableRows;
        boolean missing = true;
            for (WebElement eachCells : allCells) {
                for(String eachMap : userFieldInputsMap.keySet()){
                    if( eachCells.getText().equals(userFieldInputsMap.get(eachMap))){
//                         if want to see the output
//                        System.out.println(each.getText());
//                        System.out.println(userFieldInputsMap.get(map));
                        missing = false;
                    }
                }
                if (missing){
                    result = "fail";
                }
            }
        return result;
    }
}