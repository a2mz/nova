package a2mz.nova4j.entity.address.area;


/**
 * Created by Morozov Oleksandr on 29.11.2016.
 * 414D
 */

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
		"Description",
		"Ref",
		"AreasCenter"
})
 class Area {

	@JsonProperty("Description")
	private String description;
	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("AreasCenter")
	private String areasCenter;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

	public Area withDescription(String description) {
		this.description = description;
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

	public Area withRef(String ref) {
		this.ref = ref;
		return this;
	}

	/**
	 *
	 * @return
	 * The areasCenter
	 */
	@JsonProperty("AreasCenter")
	public String getAreasCenter() {
		return areasCenter;
	}

	/**
	 *
	 * @param areasCenter
	 * The AreasCenter
	 */
	@JsonProperty("AreasCenter")
	public void setAreasCenter(String areasCenter) {
		this.areasCenter = areasCenter;
	}

	public Area withAreasCenter(String areasCenter) {
		this.areasCenter = areasCenter;
		return this;
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

	public Area withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}