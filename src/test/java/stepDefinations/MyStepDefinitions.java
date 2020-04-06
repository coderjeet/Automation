package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

	@Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
       System.out.println("Browser is displayed");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is validated");
    }

    @Then("^Check is browser is started$")
    public void check_is_browser_is_started() throws Throwable {
    	System.out.println("Browser is started");
    }
	
    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("User is on landing page");
    }

    @When("^User log into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_log_in_to_application_with_username_and_password(String arg1, String str2) throws Throwable {
        System.out.println("User has logged in to application"+" "+arg1+" "+str2);
    }

    @Then("^Home Page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Home page is printed");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
       System.out.println("All cards are displayed"); 
    }
    
    @When("^User signup with following details$")
    public void user_signup_with_following_details(DataTable arg1) throws Throwable {
       List<List<String>> obj = arg1.raw();
       System.out.println(obj.get(2).get(0));
    }
    
    @When("^User log in to application with (.+) and (.+)$")
    public void user_log_in_to_application_with_and(String username, String passworrd) throws Throwable {
    	System.out.println(username);
    	System.out.println(passworrd);
    }

}