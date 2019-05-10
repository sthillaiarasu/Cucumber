package com.wizzair.stepdefination;
import com.wizzair.objectrepository.Pom;
import com.wizzair.resources.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Wizzaironeway extends Base{
	
	static  Pom p;

@Given("goto wizz air home page")
public void goto_wizz_air_home_page() {

	browserlaunnch();
	loadurl("https://wizzair.com/en-gb");
	//wait1();
	maximize();
	
}

@When("Select the source and destnation")
public void select_the_source_and_destnation() {
	p= new Pom();
	send(p.getOrigin(), "Vienna");
	send(p.getDestination(), "Tuzla");
}

@When("select the date")
public void select_the_date() {
	p= new Pom();
	click(p.getDate());
	click(p.getMonth());
	click(p.getDay());
	
}

@When("select the no of passenger")
public void select_the_no_of_passenger() {
	p= new Pom();
	click(p.getPassenger());
	click(p.getAdult());
	click(p.getChild());
	click(p.getInfant());
}

@Then("click the search")
public void click_the_search() {
	p= new Pom();
	click(p.getSearch());

}

@Then("verify the list of plane details")
public void verify_the_list_of_plane_details() {
   
}


}
