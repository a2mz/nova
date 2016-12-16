package a2mz.nova4j.entity.contragents.counterparty;

/**
 * Created by Morozov Oleksandr on 14.12.2016.
 * 414D
 */

import a2mz.nova4j.entity.common.MethodProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"CounterpartyProperty",
		"Page"
})
public class CounterpartyReq implements MethodProperties {

	@JsonProperty("CounterpartyProperty")
	private String counterpartyProperty;
	@JsonProperty("Page")
	private String page;

	private CounterpartyReq() {
	}

	public static CounterpartyReq create() {
		return new CounterpartyReq();
	}

	/**
	 *
	 * @return
	 * The counterpartyProperty
	 */
	@JsonProperty("CounterpartyProperty")
	public String getCounterpartyProperty() {
		return counterpartyProperty;
	}

	/**
	 *
	 * @param counterpartyProperty
	 * The CounterpartyProperty
	 */
	@JsonProperty("CounterpartyProperty")
	public void setCounterpartyProperty(String counterpartyProperty) {
		this.counterpartyProperty = counterpartyProperty;
	}

	public CounterpartyReq withCounterpartyProperty(String counterpartyProperty) {
		this.counterpartyProperty = counterpartyProperty;
		return this;
	}

	/**
	 *
	 * @return
	 * The page
	 */
	@JsonProperty("Page")
	public String getPage() {
		return page;
	}

	/**
	 *
	 * @param page
	 * The Page
	 */
	@JsonProperty("Page")
	public void setPage(String page) {
		this.page = page;
	}

	public CounterpartyReq withPage(String page) {
		this.page = page;
		return this;
	}

}

