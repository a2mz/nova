package a2mz.nova4j.entity.address.street;

/**
 * Created by Morozov Oleksandr on 12.12.2016.
 * 414D
 */

import java.util.List;
		import com.fasterxml.jackson.annotation.JsonInclude;
		import com.fasterxml.jackson.annotation.JsonProperty;
		import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import a2mz.nova4j.entity.common.Info;

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
public class StreetResp {

	@JsonProperty("success")
	private Boolean success;
	@JsonProperty("data")
	private List<Street> data = null;
	@JsonProperty("errors")
	private List<Object> errors = null;
	@JsonProperty("warnings")
	private List<Object> warnings = null;
	@JsonProperty("info")
	private Info info;
	@JsonProperty("messageCodes")
	private List<Object> messageCodes = null;
	@JsonProperty("errorCodes")
	private List<Object> errorCodes = null;
	@JsonProperty("warningCodes")
	private List<Object> warningCodes = null;
	@JsonProperty("infoCodes")
	private List<Object> infoCodes = null;

	/**
	 *
	 * @return
	 * The success
	 */
	@JsonProperty("success")
	public Boolean getSuccess() {
		return success;
	}

	/**
	 *
	 * @param success
	 * The success
	 */
	@JsonProperty("success")
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public StreetResp withSuccess(Boolean success) {
		this.success = success;
		return this;
	}

	/**
	 *
	 * @return
	 * The data
	 */
	@JsonProperty("data")
	public List<Street> getData() {
		return data;
	}

	/**
	 *
	 * @param data
	 * The data
	 */
	@JsonProperty("data")
	public void setData(List<Street> data) {
		this.data = data;
	}

	public StreetResp withData(List<Street> data) {
		this.data = data;
		return this;
	}

	/**
	 *
	 * @return
	 * The errors
	 */
	@JsonProperty("errors")
	public List<Object> getErrors() {
		return errors;
	}

	/**
	 *
	 * @param errors
	 * The errors
	 */
	@JsonProperty("errors")
	public void setErrors(List<Object> errors) {
		this.errors = errors;
	}

	public StreetResp withErrors(List<Object> errors) {
		this.errors = errors;
		return this;
	}

	/**
	 *
	 * @return
	 * The warnings
	 */
	@JsonProperty("warnings")
	public List<Object> getWarnings() {
		return warnings;
	}

	/**
	 *
	 * @param warnings
	 * The warnings
	 */
	@JsonProperty("warnings")
	public void setWarnings(List<Object> warnings) {
		this.warnings = warnings;
	}

	public StreetResp withWarnings(List<Object> warnings) {
		this.warnings = warnings;
		return this;
	}

	/**
	 *
	 * @return
	 * The info
	 */
	@JsonProperty("info")
	public Info getInfo() {
		return info;
	}

	/**
	 *
	 * @param info
	 * The info
	 */
	@JsonProperty("info")
	public void setInfo(Info info) {
		this.info = info;
	}

	public StreetResp withInfo(Info info) {
		this.info = info;
		return this;
	}

	/**
	 *
	 * @return
	 * The messageCodes
	 */
	@JsonProperty("messageCodes")
	public List<Object> getMessageCodes() {
		return messageCodes;
	}

	/**
	 *
	 * @param messageCodes
	 * The messageCodes
	 */
	@JsonProperty("messageCodes")
	public void setMessageCodes(List<Object> messageCodes) {
		this.messageCodes = messageCodes;
	}

	public StreetResp withMessageCodes(List<Object> messageCodes) {
		this.messageCodes = messageCodes;
		return this;
	}

	/**
	 *
	 * @return
	 * The errorCodes
	 */
	@JsonProperty("errorCodes")
	public List<Object> getErrorCodes() {
		return errorCodes;
	}

	/**
	 *
	 * @param errorCodes
	 * The errorCodes
	 */
	@JsonProperty("errorCodes")
	public void setErrorCodes(List<Object> errorCodes) {
		this.errorCodes = errorCodes;
	}

	public StreetResp withErrorCodes(List<Object> errorCodes) {
		this.errorCodes = errorCodes;
		return this;
	}

	/**
	 *
	 * @return
	 * The warningCodes
	 */
	@JsonProperty("warningCodes")
	public List<Object> getWarningCodes() {
		return warningCodes;
	}

	/**
	 *
	 * @param warningCodes
	 * The warningCodes
	 */
	@JsonProperty("warningCodes")
	public void setWarningCodes(List<Object> warningCodes) {
		this.warningCodes = warningCodes;
	}

	public StreetResp withWarningCodes(List<Object> warningCodes) {
		this.warningCodes = warningCodes;
		return this;
	}

	/**
	 *
	 * @return
	 * The infoCodes
	 */
	@JsonProperty("infoCodes")
	public List<Object> getInfoCodes() {
		return infoCodes;
	}

	/**
	 *
	 * @param infoCodes
	 * The infoCodes
	 */
	@JsonProperty("infoCodes")
	public void setInfoCodes(List<Object> infoCodes) {
		this.infoCodes = infoCodes;
	}

	public StreetResp withInfoCodes(List<Object> infoCodes) {
		this.infoCodes = infoCodes;
		return this;
	}

}