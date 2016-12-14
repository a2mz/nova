package a2mz.nova4j.entity.address.area;

/**
 * Created by Morozov Oleksandr on 02.12.2016.
 * 414D
 */


import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
		"success",
		"areas",
		"errors",
		"warnings",
		"info"
})
public class AreaResp {

	@JsonProperty("success")
	private Boolean success;
	@JsonProperty("data")
	private List<Area> areas = new ArrayList<>();
	@JsonProperty("errors")
	private List<Object> errors = new ArrayList<Object>();
	@JsonProperty("warnings")
	private List<Object> warnings = new ArrayList<Object>();
	@JsonProperty("info")
	private List<Object> info = new ArrayList<Object>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * @return The success
	 */
	@JsonProperty("success")
	public Boolean getSuccess() {
		return success;
	}

	/**
	 * @param success The success
	 */
	@JsonProperty("success")
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	/**
	 * @return The areas
	 */
	@JsonProperty("data")
	public List<Area> getAreas() {
		return areas;
	}

	/**
	 * @param areas The areas
	 */
	@JsonProperty("data")
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	/**
	 * @return The errors
	 */
	@JsonProperty("errors")
	public List<Object> getErrors() {
		return errors;
	}

	/**
	 * @param errors The errors
	 */
	@JsonProperty("errors")
	public void setErrors(List<Object> errors) {
		this.errors = errors;
	}

	/**
	 * @return The warnings
	 */
	@JsonProperty("warnings")
	public List<Object> getWarnings() {
		return warnings;
	}

	/**
	 * @param warnings The warnings
	 */
	@JsonProperty("warnings")
	public void setWarnings(List<Object> warnings) {
		this.warnings = warnings;
	}

	/**
	 * @return The info
	 */
	@JsonProperty("info")
	public List<Object> getInfo() {
		return info;
	}

	/**
	 * @param info The info
	 */
	@JsonProperty("info")
	public void setInfo(List<Object> info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
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