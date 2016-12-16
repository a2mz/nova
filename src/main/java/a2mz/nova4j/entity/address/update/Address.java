package a2mz.nova4j.entity.address.update;

/**
 * Created by Morozov Oleksandr on 13.12.2016.
 * 414D
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"Ref"
})
public class Address {

	@JsonProperty("Ref")
	private String ref;

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

}
