package a2mz.nova4j.entity.address.delete;

/**
 * Created by Morozov Oleksandr on 13.12.2016.
 * 414D
 */

import com.fasterxml.jackson.annotation.JsonInclude;
		import com.fasterxml.jackson.annotation.JsonProperty;
		import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import a2mz.nova4j.entity.common.MethodProperties;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"Ref"
})
public class DeleteReq implements MethodProperties {

	@JsonProperty("Ref")
	private String ref;

	private DeleteReq() {
	}

	public static DeleteReq create() {
		return new DeleteReq();
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

	public DeleteReq withRef(String ref) {
		this.ref = ref;
		return this;
	}

}