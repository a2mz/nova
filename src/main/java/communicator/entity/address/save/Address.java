package communicator.entity.address.save;

/**
 * Created by Morozov Oleksandr on 13.12.2016.
 * 414D
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"Ref",
		"Description"
})
public class Address {

	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("Description")
	private String description;

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

	public Address withRef(String ref) {
		this.ref = ref;
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

	public Address withDescription(String description) {
		this.description = description;
		return this;
	}

	@Override
	public String toString() {
		return "ADDRESS{" +
				"ref='" + ref + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}