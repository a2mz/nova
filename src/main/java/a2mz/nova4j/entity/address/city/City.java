package a2mz.nova4j.entity.address.city;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"Description",
		"DescriptionRu",
		"Ref",
		"Delivery1",
		"Delivery2",
		"Delivery3",
		"Delivery4",
		"Delivery5",
		"Delivery6",
		"Delivery7",
		"Area",
		"PreventEntryNewStreetsUser",
		"Conglomerates",
		"CityID"
})
public class City {

	@JsonProperty("Description")
	private String description;
	@JsonProperty("DescriptionRu")
	private String descriptionRu;
	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("Delivery1")
	private String delivery1;
	@JsonProperty("Delivery2")
	private String delivery2;
	@JsonProperty("Delivery3")
	private String delivery3;
	@JsonProperty("Delivery4")
	private String delivery4;
	@JsonProperty("Delivery5")
	private String delivery5;
	@JsonProperty("Delivery6")
	private String delivery6;
	@JsonProperty("Delivery7")
	private String delivery7;
	@JsonProperty("Area")
	private String area;
	@JsonProperty("PreventEntryNewStreetsUser")
	private Object preventEntryNewStreetsUser;
	@JsonProperty("Conglomerates")
	private List<String> conglomerates = null;
	@JsonProperty("CityID")
	private String cityID;

	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("Description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("DescriptionRu")
	public String getDescriptionRu() {
		return descriptionRu;
	}

	@JsonProperty("DescriptionRu")
	public void setDescriptionRu(String descriptionRu) {
		this.descriptionRu = descriptionRu;
	}

	@JsonProperty("Ref")
	public String getRef() {
		return ref;
	}

	@JsonProperty("Ref")
	public void setRef(String ref) {
		this.ref = ref;
	}

	@JsonProperty("Delivery1")
	public String getDelivery1() {
		return delivery1;
	}

	@JsonProperty("Delivery1")
	public void setDelivery1(String delivery1) {
		this.delivery1 = delivery1;
	}

	@JsonProperty("Delivery2")
	public String getDelivery2() {
		return delivery2;
	}

	@JsonProperty("Delivery2")
	public void setDelivery2(String delivery2) {
		this.delivery2 = delivery2;
	}

	@JsonProperty("Delivery3")
	public String getDelivery3() {
		return delivery3;
	}

	@JsonProperty("Delivery3")
	public void setDelivery3(String delivery3) {
		this.delivery3 = delivery3;
	}

	@JsonProperty("Delivery4")
	public String getDelivery4() {
		return delivery4;
	}

	@JsonProperty("Delivery4")
	public void setDelivery4(String delivery4) {
		this.delivery4 = delivery4;
	}

	@JsonProperty("Delivery5")
	public String getDelivery5() {
		return delivery5;
	}

	@JsonProperty("Delivery5")
	public void setDelivery5(String delivery5) {
		this.delivery5 = delivery5;
	}

	@JsonProperty("Delivery6")
	public String getDelivery6() {
		return delivery6;
	}

	@JsonProperty("Delivery6")
	public void setDelivery6(String delivery6) {
		this.delivery6 = delivery6;
	}

	@JsonProperty("Delivery7")
	public String getDelivery7() {
		return delivery7;
	}

	@JsonProperty("Delivery7")
	public void setDelivery7(String delivery7) {
		this.delivery7 = delivery7;
	}

	@JsonProperty("Area")
	public String getArea() {
		return area;
	}

	@JsonProperty("Area")
	public void setArea(String area) {
		this.area = area;
	}

	@JsonProperty("PreventEntryNewStreetsUser")
	public Object getPreventEntryNewStreetsUser() {
		return preventEntryNewStreetsUser;
	}

	@JsonProperty("PreventEntryNewStreetsUser")
	public void setPreventEntryNewStreetsUser(Object preventEntryNewStreetsUser) {
		this.preventEntryNewStreetsUser = preventEntryNewStreetsUser;
	}

	@JsonProperty("Conglomerates")
	public List<String> getConglomerates() {
		return conglomerates;
	}

	@JsonProperty("Conglomerates")
	public void setConglomerates(List<String> conglomerates) {
		this.conglomerates = conglomerates;
	}

	@JsonProperty("CityID")
	public String getCityID() {
		return cityID;
	}

	@JsonProperty("CityID")
	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

}