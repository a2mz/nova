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
		"SiteKey",
		"Description",
		"DescriptionRu",
		"Phone",
		"TypeOfWarehouse",
		"Ref",
		"Number",
		"CityRef",
		"CityDescription",
		"CityDescriptionRu",
		"Longitude",
		"Latitude",
		"PostFinance",
		"BicycleParking",
		"POSTerminal",
		"TotalMaxWeightAllowed",
		"PlaceMaxWeightAllowed",
		"Reception",
		"Delivery",
		"Schedule"
})
public class Warehouse {

	@JsonProperty("SiteKey")
	private String siteKey;
	@JsonProperty("Description")
	private String description;
	@JsonProperty("DescriptionRu")
	private String descriptionRu;
	@JsonProperty("Phone")
	private String phone;
	@JsonProperty("TypeOfWarehouse")
	private String typeOfWarehouse;
	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("Number")
	private String number;
	@JsonProperty("CityRef")
	private String cityRef;
	@JsonProperty("CityDescription")
	private String cityDescription;
	@JsonProperty("CityDescriptionRu")
	private String cityDescriptionRu;
	@JsonProperty("Longitude")
	private String longitude;
	@JsonProperty("Latitude")
	private String latitude;
	@JsonProperty("PostFinance")
	private String postFinance;
	@JsonProperty("BicycleParking")
	private String bicycleParking;
	@JsonProperty("POSTerminal")
	private String pOSTerminal;
	@JsonProperty("TotalMaxWeightAllowed")
	private String totalMaxWeightAllowed;
	@JsonProperty("PlaceMaxWeightAllowed")
	private Integer placeMaxWeightAllowed;
	@JsonProperty("Reception")
	private Reception reception;
	@JsonProperty("Delivery")
	private Delivery delivery;
	@JsonProperty("Schedule")
	private Schedule schedule;

	/**
	 *
	 * @return
	 * The siteKey
	 */
	@JsonProperty("SiteKey")
	public String getSiteKey() {
		return siteKey;
	}

	/**
	 *
	 * @param siteKey
	 * The SiteKey
	 */
	@JsonProperty("SiteKey")
	public void setSiteKey(String siteKey) {
		this.siteKey = siteKey;
	}

	public Warehouse withSiteKey(String siteKey) {
		this.siteKey = siteKey;
		return this;
	}

	/**
	 *
	 * @return
	 * The description
	 */
	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}

	/**
	 *
	 * @param description
	 * The Description
	 */
	@JsonProperty("Description")
	public void setDescription(String description) {
		this.description = description;
	}

	public Warehouse withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 *
	 * @return
	 * The descriptionRu
	 */
	@JsonProperty("DescriptionRu")
	public String getDescriptionRu() {
		return descriptionRu;
	}

	/**
	 *
	 * @param descriptionRu
	 * The DescriptionRu
	 */
	@JsonProperty("DescriptionRu")
	public void setDescriptionRu(String descriptionRu) {
		this.descriptionRu = descriptionRu;
	}

	public Warehouse withDescriptionRu(String descriptionRu) {
		this.descriptionRu = descriptionRu;
		return this;
	}

	/**
	 *
	 * @return
	 * The phone
	 */
	@JsonProperty("Phone")
	public String getPhone() {
		return phone;
	}

	/**
	 *
	 * @param phone
	 * The Phone
	 */
	@JsonProperty("Phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Warehouse withPhone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 *
	 * @return
	 * The typeOfWarehouse
	 */
	@JsonProperty("TypeOfWarehouse")
	public String getTypeOfWarehouse() {
		return typeOfWarehouse;
	}

	/**
	 *
	 * @param typeOfWarehouse
	 * The TypeOfWarehouse
	 */
	@JsonProperty("TypeOfWarehouse")
	public void setTypeOfWarehouse(String typeOfWarehouse) {
		this.typeOfWarehouse = typeOfWarehouse;
	}

	public Warehouse withTypeOfWarehouse(String typeOfWarehouse) {
		this.typeOfWarehouse = typeOfWarehouse;
		return this;
	}

	/**
	 *
	 * @return
	 * The ref
	 */
	@JsonProperty("Ref")
	public String getRef() {
		return ref;
	}

	/**
	 *
	 * @param ref
	 * The Ref
	 */
	@JsonProperty("Ref")
	public void setRef(String ref) {
		this.ref = ref;
	}

	public Warehouse withRef(String ref) {
		this.ref = ref;
		return this;
	}

	/**
	 *
	 * @return
	 * The number
	 */
	@JsonProperty("Number")
	public String getNumber() {
		return number;
	}

	/**
	 *
	 * @param number
	 * The Number
	 */
	@JsonProperty("Number")
	public void setNumber(String number) {
		this.number = number;
	}

	public Warehouse withNumber(String number) {
		this.number = number;
		return this;
	}

	/**
	 *
	 * @return
	 * The cityRef
	 */
	@JsonProperty("CityRef")
	public String getCityRef() {
		return cityRef;
	}

	/**
	 *
	 * @param cityRef
	 * The CityRef
	 */
	@JsonProperty("CityRef")
	public void setCityRef(String cityRef) {
		this.cityRef = cityRef;
	}

	public Warehouse withCityRef(String cityRef) {
		this.cityRef = cityRef;
		return this;
	}

	/**
	 *
	 * @return
	 * The cityDescription
	 */
	@JsonProperty("CityDescription")
	public String getCityDescription() {
		return cityDescription;
	}

	/**
	 *
	 * @param cityDescription
	 * The CityDescription
	 */
	@JsonProperty("CityDescription")
	public void setCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
	}

	public Warehouse withCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
		return this;
	}

	/**
	 *
	 * @return
	 * The cityDescriptionRu
	 */
	@JsonProperty("CityDescriptionRu")
	public String getCityDescriptionRu() {
		return cityDescriptionRu;
	}

	/**
	 *
	 * @param cityDescriptionRu
	 * The CityDescriptionRu
	 */
	@JsonProperty("CityDescriptionRu")
	public void setCityDescriptionRu(String cityDescriptionRu) {
		this.cityDescriptionRu = cityDescriptionRu;
	}

	public Warehouse withCityDescriptionRu(String cityDescriptionRu) {
		this.cityDescriptionRu = cityDescriptionRu;
		return this;
	}

	/**
	 *
	 * @return
	 * The longitude
	 */
	@JsonProperty("Longitude")
	public String getLongitude() {
		return longitude;
	}

	/**
	 *
	 * @param longitude
	 * The Longitude
	 */
	@JsonProperty("Longitude")
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Warehouse withLongitude(String longitude) {
		this.longitude = longitude;
		return this;
	}

	/**
	 *
	 * @return
	 * The latitude
	 */
	@JsonProperty("Latitude")
	public String getLatitude() {
		return latitude;
	}

	/**
	 *
	 * @param latitude
	 * The Latitude
	 */
	@JsonProperty("Latitude")
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Warehouse withLatitude(String latitude) {
		this.latitude = latitude;
		return this;
	}

	/**
	 *
	 * @return
	 * The postFinance
	 */
	@JsonProperty("PostFinance")
	public String getPostFinance() {
		return postFinance;
	}

	/**
	 *
	 * @param postFinance
	 * The PostFinance
	 */
	@JsonProperty("PostFinance")
	public void setPostFinance(String postFinance) {
		this.postFinance = postFinance;
	}

	public Warehouse withPostFinance(String postFinance) {
		this.postFinance = postFinance;
		return this;
	}

	/**
	 *
	 * @return
	 * The bicycleParking
	 */
	@JsonProperty("BicycleParking")
	public String getBicycleParking() {
		return bicycleParking;
	}

	/**
	 *
	 * @param bicycleParking
	 * The BicycleParking
	 */
	@JsonProperty("BicycleParking")
	public void setBicycleParking(String bicycleParking) {
		this.bicycleParking = bicycleParking;
	}

	public Warehouse withBicycleParking(String bicycleParking) {
		this.bicycleParking = bicycleParking;
		return this;
	}

	/**
	 *
	 * @return
	 * The pOSTerminal
	 */
	@JsonProperty("POSTerminal")
	public String getPOSTerminal() {
		return pOSTerminal;
	}

	/**
	 *
	 * @param pOSTerminal
	 * The POSTerminal
	 */
	@JsonProperty("POSTerminal")
	public void setPOSTerminal(String pOSTerminal) {
		this.pOSTerminal = pOSTerminal;
	}

	public Warehouse withPOSTerminal(String pOSTerminal) {
		this.pOSTerminal = pOSTerminal;
		return this;
	}

	/**
	 *
	 * @return
	 * The totalMaxWeightAllowed
	 */
	@JsonProperty("TotalMaxWeightAllowed")
	public String getTotalMaxWeightAllowed() {
		return totalMaxWeightAllowed;
	}

	/**
	 *
	 * @param totalMaxWeightAllowed
	 * The TotalMaxWeightAllowed
	 */
	@JsonProperty("TotalMaxWeightAllowed")
	public void setTotalMaxWeightAllowed(String totalMaxWeightAllowed) {
		this.totalMaxWeightAllowed = totalMaxWeightAllowed;
	}

	public Warehouse withTotalMaxWeightAllowed(String totalMaxWeightAllowed) {
		this.totalMaxWeightAllowed = totalMaxWeightAllowed;
		return this;
	}

	/**
	 *
	 * @return
	 * The placeMaxWeightAllowed
	 */
	@JsonProperty("PlaceMaxWeightAllowed")
	public Integer getPlaceMaxWeightAllowed() {
		return placeMaxWeightAllowed;
	}

	/**
	 *
	 * @param placeMaxWeightAllowed
	 * The PlaceMaxWeightAllowed
	 */
	@JsonProperty("PlaceMaxWeightAllowed")
	public void setPlaceMaxWeightAllowed(Integer placeMaxWeightAllowed) {
		this.placeMaxWeightAllowed = placeMaxWeightAllowed;
	}

	public Warehouse withPlaceMaxWeightAllowed(Integer placeMaxWeightAllowed) {
		this.placeMaxWeightAllowed = placeMaxWeightAllowed;
		return this;
	}

	/**
	 *
	 * @return
	 * The reception
	 */
	@JsonProperty("Reception")
	public Reception getReception() {
		return reception;
	}

	/**
	 *
	 * @param reception
	 * The Reception
	 */
	@JsonProperty("Reception")
	public void setReception(Reception reception) {
		this.reception = reception;
	}

	public Warehouse withReception(Reception reception) {
		this.reception = reception;
		return this;
	}

	/**
	 *
	 * @return
	 * The delivery
	 */
	@JsonProperty("Delivery")
	public Delivery getDelivery() {
		return delivery;
	}

	/**
	 *
	 * @param delivery
	 * The Delivery
	 */
	@JsonProperty("Delivery")
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public Warehouse withDelivery(Delivery delivery) {
		this.delivery = delivery;
		return this;
	}

	/**
	 *
	 * @return
	 * The schedule
	 */
	@JsonProperty("Schedule")
	public Schedule getSchedule() {
		return schedule;
	}

	/**
	 *
	 * @param schedule
	 * The Schedule
	 */
	@JsonProperty("Schedule")
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Warehouse withSchedule(Schedule schedule) {
		this.schedule = schedule;
		return this;
	}

}