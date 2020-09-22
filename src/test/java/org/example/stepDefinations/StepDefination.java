package org.example.stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
public class StepDefination {
    @Given("^User is on landing page$")
    public void user_is_on_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("navigated to login url");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        System.out.println("Login successful");
    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Home page populated");
    }

    @And("^cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
        System.out.println("cards displayed =" + strArg1);
    }

    @When("^User login into application with following details$")
    public void user_login_into_application_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj = data.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));


    }


    @When("^User login in to application with username (.+) and password (.+)$")
    public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable {
        System.out.println(username +" "+password);
        System.out.println(username +" "+password);


    }
    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("browser validated");

    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("browser triggered");
    }

    @Then("^check if Browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("browser started");
    }

}