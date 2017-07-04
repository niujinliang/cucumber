package com.young.cucumber;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepdefs {
private Search search = null;
private String result = null;
@Given("^用户打开https://m.baidu.com/$") 
public void open(){
search = new Search();
search.open();
}
@When("^输入关键字：(.*)$")
public void input(String keyword){
result = search.find(keyword);
}
@Then("^搜索结果：(.*)就会显示出来$")
public void result(String expectedResult){
Assert.assertEquals((Object)expectedResult,(Object)result);
}
}
