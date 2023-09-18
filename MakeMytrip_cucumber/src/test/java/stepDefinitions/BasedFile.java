package stepDefinitions;

import static pageObjects.FlightPage.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasedFile {
	
	@Given("user navigate the flight page")
    public void user_navigate_the_flight_page() {
        throw new io.cucumber.java.PendingException();
    }
    @When("user select flight module")
    public void user_select_flight_module() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        click_flight_module();
        throw new io.cucumber.java.PendingException();
    }
    @And("user select round trip")
    public void user_select_round_trip() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        click_round_trip();
        throw new io.cucumber.java.PendingException();
    }
    @And("user select from location")
    public void user_select_from_location() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        click_on_from();
        throw new io.cucumber.java.PendingException();
    }

    @And("user enter From Location")
    public void user_enter_from_location_as() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        click_on_from_text();
        throw new io.cucumber.java.PendingException();
    }
    @And("user select entered from text")
    public void user_select_entered_from_text() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        click_on_from_typed_text();
        throw new io.cucumber.java.PendingException();
    }
    @And("user select to location")
    public void user_select_to_location() throws InterruptedException {
        click_on_to();
    }
    @And("user enter To Location")
    public void user_enter_to_location_as() throws InterruptedException {
        click_on_to_text();
    }
    @And("user select entered to text")
    public void user_select_entered_to_text() throws InterruptedException {
        click_on_to_typed_text();

    }
    @Then("clcik on search button")
    public void clcik_on_search_button() throws InterruptedException {
        click_on_search();

    }



}
