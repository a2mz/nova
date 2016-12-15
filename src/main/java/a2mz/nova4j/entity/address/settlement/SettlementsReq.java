package a2mz.nova4j.entity.address.settlement;

/**
 * Created by Morozov Oleksandr on 06.12.2016.
 * 414D
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import a2mz.nova4j.entity.common.MethodProperties;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"AreaRef",
		"Ref",
		"MainCitiesOnly",
		"HideMainCities",
		"RegionRef",
		"Page"
})
public class SettlementsReq implements MethodProperties {

	@JsonProperty("AreaRef")
	private String areaRef;
	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("MainCitiesOnly")
	private Boolean mainCitiesOnly;
	@JsonProperty("HideMainCities")
	private Boolean hideMainCities;
	@JsonProperty("RegionRef")
	private String regionRef;
	@JsonProperty("Page")
	private String page;

	private SettlementsReq() {
	}

	public static SettlementsReq create() {
		return new SettlementsReq();
	}

	/**
	 * @return The areaRef
	 */
	@JsonProperty("AreaRef")
	public String getAreaRef() {
		return areaRef;
	}

	/**
	 * @param areaRef The AreaRef
	 */
	@JsonProperty("AreaRef")
	public void setAreaRef(String areaRef) {
		this.areaRef = areaRef;
	}

	public SettlementsReq withAreaRef(String areaRef) {
		this.areaRef = areaRef;
		return this;
	}

	/**
	 * @return The ref
	 */
	@JsonProperty("Ref")
	public String getRef() {
		return ref;
	}

	/**
	 * @param ref The Ref
	 */
	@JsonProperty("Ref")
	public void setRef(String ref) {
		this.ref = ref;
	}

	public SettlementsReq withRef(String ref) {
		this.ref = ref;
		return this;
	}

	/**
	 * @return The mainCitiesOnly
	 */
	@JsonProperty("MainCitiesOnly")
	public Boolean getMainCitiesOnly() {
		return mainCitiesOnly;
	}

	/**
	 * @param mainCitiesOnly The MainCitiesOnly
	 */
	@JsonProperty("MainCitiesOnly")
	public void setMainCitiesOnly(Boolean mainCitiesOnly) {
		this.mainCitiesOnly = mainCitiesOnly;
	}

	public SettlementsReq withMainCitiesOnly(Boolean mainCitiesOnly) {
		this.mainCitiesOnly = mainCitiesOnly;
		return this;
	}

	/**
	 * @return The hideMainCities
	 */
	@JsonProperty("HideMainCities")
	public Boolean getHideMainCities() {
		return hideMainCities;
	}

	/**
	 * @param hideMainCities The HideMainCities
	 */
	@JsonProperty("HideMainCities")
	public void setHideMainCities(Boolean hideMainCities) {
		this.hideMainCities = hideMainCities;
	}

	public SettlementsReq withHideMainCities(Boolean hideMainCities) {
		this.hideMainCities = hideMainCities;
		return this;
	}

	/**
	 * @return The regionRef
	 */
	@JsonProperty("RegionRef")
	public String getRegionRef() {
		return regionRef;
	}

	/**
	 * @param regionRef The RegionRef
	 */
	@JsonProperty("RegionRef")
	public void setRegionRef(String regionRef) {
		this.regionRef = regionRef;
	}

	public SettlementsReq withRegionRef(String regionRef) {
		this.regionRef = regionRef;
		return this;
	}

	/**
	 * @return The page
	 */
	@JsonProperty("Page")
	public String getPage() {
		return page;
	}

	/**
	 * @param page The Page
	 */
	@JsonProperty("Page")
	public void setPage(String page) {
		this.page = page;
	}

	public SettlementsReq withPage(String page) {
		this.page = page;
		return this;
	}

}
