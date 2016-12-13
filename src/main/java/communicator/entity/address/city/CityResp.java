package communicator.entity.address.city;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"success",
		"data",
		"errors",
		"warnings",
		"info"
})
public class CityResp {

	@JsonProperty("success")
	private Boolean success;
	@JsonProperty("data")
	private List<City> data = null;
	@JsonProperty("errors")
	private List<Object> errors = null;
	@JsonProperty("warnings")
	private List<Object> warnings = null;
	@JsonProperty("info")
	private List<Object> info = null;


	/**
	 *
	 * @return
	 * The success
	 */
	@JsonProperty("success")
	public Boolean getSuccess() {
		return success;
	}

	/**
	 *
	 * @param success
	 * The success
	 */
	@JsonProperty("success")
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public CityResp withSuccess(Boolean success) {
		this.success = success;
		return this;
	}

	/**
	 *
	 * @return
	 * The data
	 */
	@JsonProperty("data")
	public List<City> getData() {
		return data;
	}

	/**
	 *
	 * @param data
	 * The data
	 */
	@JsonProperty("data")
	public void setData(List<City> data) {
		this.data = data;
	}

	public CityResp withData(List<City> data) {
		this.data = data;
		return this;
	}

	/**
	 *
	 * @return
	 * The errors
	 */
	@JsonProperty("errors")
	public List<Object> getErrors() {
		return errors;
	}

	/**
	 *
	 * @param errors
	 * The errors
	 */
	@JsonProperty("errors")
	public void setErrors(List<Object> errors) {
		this.errors = errors;
	}

	public CityResp withErrors(List<Object> errors) {
		this.errors = errors;
		return this;
	}

	/**
	 *
	 * @return
	 * The warnings
	 */
	@JsonProperty("warnings")
	public List<Object> getWarnings() {
		return warnings;
	}

	/**
	 *
	 * @param warnings
	 * The warnings
	 */
	@JsonProperty("warnings")
	public void setWarnings(List<Object> warnings) {
		this.warnings = warnings;
	}

	public CityResp withWarnings(List<Object> warnings) {
		this.warnings = warnings;
		return this;
	}

	/**
	 *
	 * @return
	 * The info
	 */
	@JsonProperty("info")
	public List<Object> getInfo() {
		return info;
	}

	/**
	 *
	 * @param info
	 * The info
	 */
	@JsonProperty("info")
	public void setInfo(List<Object> info) {
		this.info = info;
	}

	public CityResp withInfo(List<Object> info) {
		this.info = info;
		return this;
	}


}
