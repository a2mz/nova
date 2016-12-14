package a2mz.nova4j.entity.address.warehouses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import a2mz.nova4j.entity.header.MethodProperties;

/**
 * Created by Morozov Oleksandr on 07.12.2016.
 * 414D
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"CityName",
		"CityRef"
})
public class WarehousesReq implements MethodProperties {

	@JsonProperty("CityName")
	private String cityName;
	@JsonProperty("CityRef")
	private String cityRef;

	private WarehousesReq() {
	}

	public static WarehousesReq create() {
		return new WarehousesReq();
	}

	/**
	 * @return The cityName
	 */
	@JsonProperty("CityName")
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName The CityName
	 */
	@JsonProperty("CityName")
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public WarehousesReq withCityName(String cityName) {
		this.cityName = cityName;
		return this;
	}

	/**
	 * @return The cityRef
	 */
	@JsonProperty("CityRef")
	public String getCityRef() {
		return cityRef;
	}

	/**
	 * @param cityRef The CityRef
	 */
	@JsonProperty("CityRef")
	public void setCityRef(String cityRef) {
		this.cityRef = cityRef;
	}

	public WarehousesReq withCityRef(String cityRef) {
		this.cityRef = cityRef;
		return this;
	}

}