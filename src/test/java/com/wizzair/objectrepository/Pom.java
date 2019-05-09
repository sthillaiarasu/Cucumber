package com.wizzair.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wizzair.resources.Base;

public class Pom extends Base {

	public Pom()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"search-departure-station\"]")
	public  WebElement origin;

	@FindBy(id = "search-arrival-station")
	private WebElement destination;

	@FindBy(id = "search-departure-date")
	private WebElement date;

	@FindBy(xpath = "//button[@class='pika-next']")
	private WebElement Month;

	@FindBy(xpath = "//td[@data-day=\"12\"]")
	private WebElement day;

	@FindBy(id = "search-passenger")
	private WebElement passenger;

	@FindBy(xpath = "//button[@class='stepper__button stepper__button--add'][1]")
	private WebElement adult;

	@FindBy(xpath = "(//span[contains(text(),'child')]//following::button)[1]")
	private WebElement child;

	@FindBy(xpath = "(//span[contains(text(),'infant')]//following::button)[1]")
	private WebElement infant;

	@FindBy(xpath = "//button[@class='rf-button rf-button--medium rf-button--primary flight-search__panel__cta-btn']")
	private WebElement search;

	public WebElement getOrigin() {
		return origin;
	}

	public WebElement getDestination() {
		return destination;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getPassenger() {
		return passenger;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getInfant() {
		return infant;
	}

	

	public WebElement getSearch() {
		return search;
	}

}
