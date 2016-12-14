package a2mz.nova4j.entity.address.city;

/**
 * Created by Morozov Oleksandr on 06.12.2016.
 * 414D
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import a2mz.nova4j.entity.header.MethodProperties;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"FindByString",
		"Ref"
})
public class CityReq implements MethodProperties{

	@JsonProperty("FindByString")
	private String findByString;
	@JsonProperty("Ref")
	private String ref;

	private CityReq() {
	}


	public static CityReq create() {
		return new CityReq();
	}

	/**
	 *
	 * @return
	 * The findByString
	 */
	@JsonProperty("FindByString")
	public String getFindByString() {
		return findByString;
	}

	/**
	 *
	 * @param findByString
	 * The FindByString
	 */
	@JsonProperty("FindByString")
	public void setFindByString(String findByString) {
		this.findByString = findByString;
	}

	public CityReq withFindByString(String findByString) {
		this.findByString = findByString;
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

	public CityReq withRef(String ref) {
		this.ref = ref;
		return this;
	}

}
