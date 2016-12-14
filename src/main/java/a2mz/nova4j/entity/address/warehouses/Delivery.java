package a2mz.nova4j.entity.address.warehouses;

/**
 * Created by Morozov Oleksandr on 07.12.2016.
 * 414D
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"Monday",
		"Tuesday",
		"Wednesday",
		"Thursday",
		"Friday",
		"Saturday",
		"Sunday"
})
public class Delivery {

	@JsonProperty("Monday")
	private String monday;
	@JsonProperty("Tuesday")
	private String tuesday;
	@JsonProperty("Wednesday")
	private String wednesday;
	@JsonProperty("Thursday")
	private String thursday;
	@JsonProperty("Friday")
	private String friday;
	@JsonProperty("Saturday")
	private String saturday;
	@JsonProperty("Sunday")
	private String sunday;

	/**
	 * @return The monday
	 */
	@JsonProperty("Monday")
	public String getMonday() {
		return monday;
	}

	/**
	 * @param monday The Monday
	 */
	@JsonProperty("Monday")
	public void setMonday(String monday) {
		this.monday = monday;
	}

	public Delivery withMonday(String monday) {
		this.monday = monday;
		return this;
	}

	/**
	 * @return The tuesday
	 */
	@JsonProperty("Tuesday")
	public String getTuesday() {
		return tuesday;
	}

	/**
	 * @param tuesday The Tuesday
	 */
	@JsonProperty("Tuesday")
	public void setTuesday(String tuesday) {
		this.tuesday = tuesday;
	}

	public Delivery withTuesday(String tuesday) {
		this.tuesday = tuesday;
		return this;
	}

	/**
	 * @return The wednesday
	 */
	@JsonProperty("Wednesday")
	public String getWednesday() {
		return wednesday;
	}

	/**
	 * @param wednesday The Wednesday
	 */
	@JsonProperty("Wednesday")
	public void setWednesday(String wednesday) {
		this.wednesday = wednesday;
	}

	public Delivery withWednesday(String wednesday) {
		this.wednesday = wednesday;
		return this;
	}

	/**
	 * @return The thursday
	 */
	@JsonProperty("Thursday")
	public String getThursday() {
		return thursday;
	}

	/**
	 * @param thursday The Thursday
	 */
	@JsonProperty("Thursday")
	public void setThursday(String thursday) {
		this.thursday = thursday;
	}

	public Delivery withThursday(String thursday) {
		this.thursday = thursday;
		return this;
	}

	/**
	 * @return The friday
	 */
	@JsonProperty("Friday")
	public String getFriday() {
		return friday;
	}

	/**
	 * @param friday The Friday
	 */
	@JsonProperty("Friday")
	public void setFriday(String friday) {
		this.friday = friday;
	}

	public Delivery withFriday(String friday) {
		this.friday = friday;
		return this;
	}

	/**
	 * @return The saturday
	 */
	@JsonProperty("Saturday")
	public String getSaturday() {
		return saturday;
	}

	/**
	 * @param saturday The Saturday
	 */
	@JsonProperty("Saturday")
	public void setSaturday(String saturday) {
		this.saturday = saturday;
	}

	public Delivery withSaturday(String saturday) {
		this.saturday = saturday;
		return this;
	}

	/**
	 * @return The sunday
	 */
	@JsonProperty("Sunday")
	public String getSunday() {
		return sunday;
	}

	/**
	 * @param sunday The Sunday
	 */
	@JsonProperty("Sunday")
	public void setSunday(String sunday) {
		this.sunday = sunday;
	}

	public Delivery withSunday(String sunday) {
		this.sunday = sunday;
		return this;
	}

}