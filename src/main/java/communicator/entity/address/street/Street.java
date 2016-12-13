package communicator.entity.address.street;

/**
 * Created by Morozov Oleksandr on 12.12.2016.
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
		"Description",
		"Ref",
		"StreetsTypeRef",
		"StreetsType"
})
public class Street {

	@JsonProperty("Description")
	private String description;
	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("StreetsTypeRef")
	private String streetsTypeRef;
	@JsonProperty("StreetsType")
	private String streetsType;

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

	public Street withDescription(String description) {
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

	public Street withRef(String ref) {
		this.ref = ref;
		return this;
	}

	/**
	 *
	 * @return
	 * The streetsTypeRef
	 */
	@JsonProperty("StreetsTypeRef")
	public String getStreetsTypeRef() {
		return streetsTypeRef;
	}

	/**
	 *
	 * @param streetsTypeRef
	 * The StreetsTypeRef
	 */
	@JsonProperty("StreetsTypeRef")
	public void setStreetsTypeRef(String streetsTypeRef) {
		this.streetsTypeRef = streetsTypeRef;
	}

	public Street withStreetsTypeRef(String streetsTypeRef) {
		this.streetsTypeRef = streetsTypeRef;
		return this;
	}

	/**
	 *
	 * @return
	 * The streetsType
	 */
	@JsonProperty("StreetsType")
	public String getStreetsType() {
		return streetsType;
	}

	/**
	 *
	 * @param streetsType
	 * The StreetsType
	 */
	@JsonProperty("StreetsType")
	public void setStreetsType(String streetsType) {
		this.streetsType = streetsType;
	}

	public Street withStreetsType(String streetsType) {
		this.streetsType = streetsType;
		return this;
	}


}