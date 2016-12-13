package communicator.entity.address.settlement;

/**
 * Created by Morozov Oleksandr on 06.12.2016.
 * 414D
 */


import java.util.HashMap;
		import java.util.Map;
		import com.fasterxml.jackson.annotation.JsonAnyGetter;
		import com.fasterxml.jackson.annotation.JsonAnySetter;
		import com.fasterxml.jackson.annotation.JsonIgnore;
		import com.fasterxml.jackson.annotation.JsonInclude;
		import com.fasterxml.jackson.annotation.JsonProperty;
		import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"Ref",
		"SettlementType",
		"Latitude",
		"Longitude",
		"Description",
		"DescriptionRu",
		"SettlementTypeDescription",
		"SettlementTypeDescriptionRu",
		"Region",
		"RegionsDescription",
		"RegionsDescriptionRu",
		"Area",
		"AreaDescription",
		"AreaDescriptionRu",
		"Index1",
		"Index2",
		"Delivery1",
		"Delivery2",
		"Delivery3",
		"Delivery4",
		"Delivery5",
		"Delivery6",
		"Delivery7",
		"Warehouse"
})
public class Settlement {

	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("SettlementType")
	private String settlementType;
	@JsonProperty("Latitude")
	private String latitude;
	@JsonProperty("Longitude")
	private String longitude;
	@JsonProperty("Description")
	private String description;
	@JsonProperty("DescriptionRu")
	private String descriptionRu;
	@JsonProperty("SettlementTypeDescription")
	private String settlementTypeDescription;
	@JsonProperty("SettlementTypeDescriptionRu")
	private String settlementTypeDescriptionRu;
	@JsonProperty("Region")
	private String region;
	@JsonProperty("RegionsDescription")
	private String regionsDescription;
	@JsonProperty("RegionsDescriptionRu")
	private String regionsDescriptionRu;
	@JsonProperty("Area")
	private String area;
	@JsonProperty("AreaDescription")
	private String areaDescription;
	@JsonProperty("AreaDescriptionRu")
	private String areaDescriptionRu;
	@JsonProperty("Index1")
	private String index1;
	@JsonProperty("Index2")
	private String index2;
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
	@JsonProperty("Warehouse")
	private String warehouse;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

	/**
	 *
	 * @return
	 * The settlementType
	 */
	@JsonProperty("SettlementType")
	public String getSettlementType() {
		return settlementType;
	}

	/**
	 *
	 * @param settlementType
	 * The SettlementType
	 */
	@JsonProperty("SettlementType")
	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
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

	/**
	 *
	 * @return
	 * The settlementTypeDescription
	 */
	@JsonProperty("SettlementTypeDescription")
	public String getSettlementTypeDescription() {
		return settlementTypeDescription;
	}

	/**
	 *
	 * @param settlementTypeDescription
	 * The SettlementTypeDescription
	 */
	@JsonProperty("SettlementTypeDescription")
	public void setSettlementTypeDescription(String settlementTypeDescription) {
		this.settlementTypeDescription = settlementTypeDescription;
	}

	/**
	 *
	 * @return
	 * The settlementTypeDescriptionRu
	 */
	@JsonProperty("SettlementTypeDescriptionRu")
	public String getSettlementTypeDescriptionRu() {
		return settlementTypeDescriptionRu;
	}

	/**
	 *
	 * @param settlementTypeDescriptionRu
	 * The SettlementTypeDescriptionRu
	 */
	@JsonProperty("SettlementTypeDescriptionRu")
	public void setSettlementTypeDescriptionRu(String settlementTypeDescriptionRu) {
		this.settlementTypeDescriptionRu = settlementTypeDescriptionRu;
	}

	/**
	 *
	 * @return
	 * The region
	 */
	@JsonProperty("Region")
	public String getRegion() {
		return region;
	}

	/**
	 *
	 * @param region
	 * The Region
	 */
	@JsonProperty("Region")
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 *
	 * @return
	 * The regionsDescription
	 */
	@JsonProperty("RegionsDescription")
	public String getRegionsDescription() {
		return regionsDescription;
	}

	/**
	 *
	 * @param regionsDescription
	 * The RegionsDescription
	 */
	@JsonProperty("RegionsDescription")
	public void setRegionsDescription(String regionsDescription) {
		this.regionsDescription = regionsDescription;
	}

	/**
	 *
	 * @return
	 * The regionsDescriptionRu
	 */
	@JsonProperty("RegionsDescriptionRu")
	public String getRegionsDescriptionRu() {
		return regionsDescriptionRu;
	}

	/**
	 *
	 * @param regionsDescriptionRu
	 * The RegionsDescriptionRu
	 */
	@JsonProperty("RegionsDescriptionRu")
	public void setRegionsDescriptionRu(String regionsDescriptionRu) {
		this.regionsDescriptionRu = regionsDescriptionRu;
	}

	/**
	 *
	 * @return
	 * The area
	 */
	@JsonProperty("Area")
	public String getArea() {
		return area;
	}

	/**
	 *
	 * @param area
	 * The Area
	 */
	@JsonProperty("Area")
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 *
	 * @return
	 * The areaDescription
	 */
	@JsonProperty("AreaDescription")
	public String getAreaDescription() {
		return areaDescription;
	}

	/**
	 *
	 * @param areaDescription
	 * The AreaDescription
	 */
	@JsonProperty("AreaDescription")
	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}

	/**
	 *
	 * @return
	 * The areaDescriptionRu
	 */
	@JsonProperty("AreaDescriptionRu")
	public String getAreaDescriptionRu() {
		return areaDescriptionRu;
	}

	/**
	 *
	 * @param areaDescriptionRu
	 * The AreaDescriptionRu
	 */
	@JsonProperty("AreaDescriptionRu")
	public void setAreaDescriptionRu(String areaDescriptionRu) {
		this.areaDescriptionRu = areaDescriptionRu;
	}

	/**
	 *
	 * @return
	 * The index1
	 */
	@JsonProperty("Index1")
	public String getIndex1() {
		return index1;
	}

	/**
	 *
	 * @param index1
	 * The Index1
	 */
	@JsonProperty("Index1")
	public void setIndex1(String index1) {
		this.index1 = index1;
	}

	/**
	 *
	 * @return
	 * The index2
	 */
	@JsonProperty("Index2")
	public String getIndex2() {
		return index2;
	}

	/**
	 *
	 * @param index2
	 * The Index2
	 */
	@JsonProperty("Index2")
	public void setIndex2(String index2) {
		this.index2 = index2;
	}

	/**
	 *
	 * @return
	 * The delivery1
	 */
	@JsonProperty("Delivery1")
	public String getDelivery1() {
		return delivery1;
	}

	/**
	 *
	 * @param delivery1
	 * The Delivery1
	 */
	@JsonProperty("Delivery1")
	public void setDelivery1(String delivery1) {
		this.delivery1 = delivery1;
	}

	/**
	 *
	 * @return
	 * The delivery2
	 */
	@JsonProperty("Delivery2")
	public String getDelivery2() {
		return delivery2;
	}

	/**
	 *
	 * @param delivery2
	 * The Delivery2
	 */
	@JsonProperty("Delivery2")
	public void setDelivery2(String delivery2) {
		this.delivery2 = delivery2;
	}

	/**
	 *
	 * @return
	 * The delivery3
	 */
	@JsonProperty("Delivery3")
	public String getDelivery3() {
		return delivery3;
	}

	/**
	 *
	 * @param delivery3
	 * The Delivery3
	 */
	@JsonProperty("Delivery3")
	public void setDelivery3(String delivery3) {
		this.delivery3 = delivery3;
	}

	/**
	 *
	 * @return
	 * The delivery4
	 */
	@JsonProperty("Delivery4")
	public String getDelivery4() {
		return delivery4;
	}

	/**
	 *
	 * @param delivery4
	 * The Delivery4
	 */
	@JsonProperty("Delivery4")
	public void setDelivery4(String delivery4) {
		this.delivery4 = delivery4;
	}

	/**
	 *
	 * @return
	 * The delivery5
	 */
	@JsonProperty("Delivery5")
	public String getDelivery5() {
		return delivery5;
	}

	/**
	 *
	 * @param delivery5
	 * The Delivery5
	 */
	@JsonProperty("Delivery5")
	public void setDelivery5(String delivery5) {
		this.delivery5 = delivery5;
	}

	/**
	 *
	 * @return
	 * The delivery6
	 */
	@JsonProperty("Delivery6")
	public String getDelivery6() {
		return delivery6;
	}

	/**
	 *
	 * @param delivery6
	 * The Delivery6
	 */
	@JsonProperty("Delivery6")
	public void setDelivery6(String delivery6) {
		this.delivery6 = delivery6;
	}

	/**
	 *
	 * @return
	 * The delivery7
	 */
	@JsonProperty("Delivery7")
	public String getDelivery7() {
		return delivery7;
	}

	/**
	 *
	 * @param delivery7
	 * The Delivery7
	 */
	@JsonProperty("Delivery7")
	public void setDelivery7(String delivery7) {
		this.delivery7 = delivery7;
	}

	/**
	 *
	 * @return
	 * The warehouse
	 */
	@JsonProperty("Warehouse")
	public String getWarehouse() {
		return warehouse;
	}

	/**
	 *
	 * @param warehouse
	 * The Warehouse
	 */
	@JsonProperty("Warehouse")
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
