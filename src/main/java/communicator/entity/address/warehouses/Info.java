package communicator.entity.address.warehouses;

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
		"totalCount"
})
public class Info {

	@JsonProperty("totalCount")
	private String totalCount;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return
	 * The totalCount
	 */
	@JsonProperty("totalCount")
	public String getTotalCount() {
		return totalCount;
	}

	/**
	 *
	 * @param totalCount
	 * The totalCount
	 */
	@JsonProperty("totalCount")
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
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