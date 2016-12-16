package a2mz.nova4j.entity.address.settlement;

/**
 * Created by Morozov Oleksandr on 06.12.2016.
 * 414D
 */import java.util.HashMap;
import java.util.List;
import java.util.Map;

import a2mz.nova4j.entity.common.Info;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"success",
		"Settlement",
		"errors",
		"warnings",
		"info",
		"messageCodes",
		"errorCodes",
		"warningCodes",
		"infoCodes"
})
public class SettlementsResp {

	@JsonProperty("success")
	private Boolean success;
	@JsonProperty("data")
	private List<Settlement> Settlement = null;
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
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

	/**
	 *
	 * @return
	 * The Settlement
	 */
	@JsonProperty("data")
	public List<Settlement> getSettlement() {
		return Settlement;
	}

	/**
	 *
	 * @param settlement
	 * The Settlement
	 */
	@JsonProperty("data")
	public void setSettlement(List<Settlement> settlement) {
		this.Settlement = settlement;
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

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}