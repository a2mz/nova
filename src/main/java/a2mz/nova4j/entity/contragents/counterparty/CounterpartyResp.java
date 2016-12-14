package a2mz.nova4j.entity.contragents.counterparty;

/**
 * Created by Morozov Oleksandr on 14.12.2016.
 * 414D
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"success",
		"data",
		"errors",
		"warnings",
		"info",
		"messageCodes",
		"errorCodes",
		"warningCodes",
		"infoCodes"
})

public class CounterpartyResp {

	@JsonProperty("success")
	private Boolean success;
	@JsonProperty("data")
	private List<Counterparty> data = null;
	@JsonProperty("errors")
	private List<String> errors = null;
	@JsonProperty("warnings")
	private List<String> warnings = null;
	@JsonProperty("info")
	private Info info = null;
	@JsonProperty("messageCodes")
	private List<String> messageCodes = null;
	@JsonProperty("errorCodes")
	private List<String> errorCodes = null;
	@JsonProperty("warningCodes")
	private List<String> warningCodes = null;
	@JsonProperty("infoCodes")
	private List<String> infoCodes = null;


	public CounterpartyResp() {
	}

	/**
	 * @return The success
	 */
	@JsonProperty("success")
	public Boolean getSuccess() {
		return success;
	}

	/**
	 * @param success The success
	 */
	@JsonProperty("success")
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	/**
	 * @return The data
	 */
	@JsonProperty("data")
	public List<Counterparty> getData() {
		return data;
	}

	/**
	 * @param data The data
	 */
	@JsonProperty("data")
	public void setData(List<Counterparty> data) {
		this.data = data;
	}

	/**
	 * @return The errors
	 */
	@JsonProperty("errors")
	public List<String> getErrors() {
		return errors;
	}

	/**
	 * @param errors The errors
	 */
	@JsonProperty("errors")
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	/**
	 * @return The warnings
	 */
	@JsonProperty("warnings")
	public List<String> getWarnings() {
		return warnings;
	}

	/**
	 * @param warnings The warnings
	 */
	@JsonProperty("warnings")
	public void setWarnings(List<String> warnings) {
		this.warnings = warnings;
	}

	/**
	 * @return The info
	 */
	@JsonProperty("info")
	public Info getInfo() {
		return info;
	}

	/**
	 * @param info The info
	 */
	@JsonProperty("info")
	public void setInfo(Info info) {
		this.info = info;
	}

	/**
	 * @return The messageCodes
	 */
	@JsonProperty("messageCodes")
	public List<String> getMessageCodes() {
		return messageCodes;
	}

	/**
	 * @param messageCodes The messageCodes
	 */
	@JsonProperty("messageCodes")
	public void setMessageCodes(List<String> messageCodes) {
		this.messageCodes = messageCodes;
	}

	/**
	 * @return The errorCodes
	 */
	@JsonProperty("errorCodes")
	public List<String> getErrorCodes() {
		return errorCodes;
	}

	/**
	 * @param errorCodes The errorCodes
	 */
	@JsonProperty("errorCodes")
	public void setErrorCodes(List<String> errorCodes) {
		this.errorCodes = errorCodes;
	}

	/**
	 * @return The warningCodes
	 */
	@JsonProperty("warningCodes")
	public List<String> getWarningCodes() {
		return warningCodes;
	}

	/**
	 * @param warningCodes The warningCodes
	 */
	@JsonProperty("warningCodes")
	public void setWarningCodes(List<String> warningCodes) {
		this.warningCodes = warningCodes;
	}

	/**
	 * @return The infoCodes
	 */
	@JsonProperty("infoCodes")
	public List<String> getInfoCodes() {
		return infoCodes;
	}

	/**
	 * @param infoCodes The infoCodes
	 */
	@JsonProperty("infoCodes")
	public void setInfoCodes(List<String> infoCodes) {
		this.infoCodes = infoCodes;
	}

}