package a2mz.nova4j.entity.contragents.contactpersons;

/**
 * Created by Morozov Oleksandr on 15.12.2016.
 * 414D
 */

import a2mz.nova4j.entity.common.MethodProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"Ref",
		"Page"
})
public class CounterpartyContactPersonsReq implements MethodProperties {

	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("Page")
	private String page;

	private CounterpartyContactPersonsReq() {
	}

	public static CounterpartyContactPersonsReq create() {
		return new CounterpartyContactPersonsReq();
	}

	@JsonProperty("Ref")
	public String getRef() {
		return ref;
	}

	@JsonProperty("Ref")
	public void setRef(String ref) {
		this.ref = ref;
	}

	public CounterpartyContactPersonsReq withRef(String ref) {
		this.ref = ref;
		return this;
	}

	@JsonProperty("Page")
	public String getPage() {
		return page;
	}

	@JsonProperty("Page")
	public void setPage(String page) {
		this.page = page;
	}

	public CounterpartyContactPersonsReq withPage(String page) {
		this.page = page;
		return this;
	}

}
