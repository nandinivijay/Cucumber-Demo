package Demo;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDef {

	int x;
	int y;
	int sum;

@Given("^two numbers$")
public void two_numbers() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  x=25;
  y=50;
  
}

@When("^I do addition$")
public void i_do_addition() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 sum = x+y;
}

@Then("^I should get the sum$")
public void i_should_get_the_sum() throws Throwable {

   Assert.assertEquals(sum, 75);
}

@And("^Display the sum$")
public void display_the_sum() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
System.out.print(sum);
}


}
