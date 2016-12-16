package a2mz.nova4j.entity.contragents.counterpartyaddresses;

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
		"CounterpartyProperty"
})
public class CounterpartyAddressesReq implements MethodProperties {

	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("CounterpartyProperty")
	private String counterpartyProperty;

	private CounterpartyAddressesReq() {
	}

	public static CounterpartyAddressesReq create() {
		return new CounterpartyAddressesReq();
	}

	@JsonProperty("Ref")
	public String getRef() {
		return ref;
	}

	@JsonProperty("Ref")
	public void setRef(String ref) {
		this.ref = ref;
	}

	public CounterpartyAddressesReq withRef(String ref) {
		this.ref = ref;
		return this;
	}

	@JsonProperty("CounterpartyProperty")
	public String getCounterpartyProperty() {
		return counterpartyProperty;
	}

	@JsonProperty("CounterpartyProperty")
	public void setCounterpartyProperty(String counterpartyProperty) {
		this.counterpartyProperty = counterpartyProperty;
	}

	public CounterpartyAddressesReq withCounterpartyProperty(String counterpartyProperty) {
		this.counterpartyProperty = counterpartyProperty;
		return this;
	}

}
