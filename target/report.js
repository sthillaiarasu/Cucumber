$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/WizzAironeway.feature");
formatter.feature({
  "name": "Wizz air oneway trip search",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "goto wizz air home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Wizzaironeway.goto_wizz_air_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "One way search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Select the source and destnation",
  "keyword": "When "
});
formatter.match({
  "location": "Wizzaironeway.select_the_source_and_destnation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the date",
  "keyword": "And "
});
formatter.match({
  "location": "Wizzaironeway.select_the_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the no of passenger",
  "keyword": "And "
});
formatter.match({
  "location": "Wizzaironeway.select_the_no_of_passenger()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the search",
  "keyword": "Then "
});
formatter.match({
  "location": "Wizzaironeway.click_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the list of plane details",
  "keyword": "And "
});
formatter.match({
  "location": "Wizzaironeway.verify_the_list_of_plane_details()"
});
formatter.result({
  "status": "passed"
});
});