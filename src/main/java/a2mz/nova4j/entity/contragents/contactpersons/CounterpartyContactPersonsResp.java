package a2mz.nova4j.entity.contragents.contactpersons;

/**
 * Created by Morozov Oleksandr on 15.12.2016.
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
public class CounterpartyContactPersonsResp {

	@JsonProperty("success")
	private Boolean success;
	@JsonProperty("data")
	private List<ContactPerson> data = null;
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

	@JsonProperty("success")
	public Boolean getSuccess() {
		return success;
	}

	@JsonProperty("success")
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public CounterpartyContactPersonsResp withSuccess(Boolean success) {
		this.success = success;
		return this;
	}

	@JsonProperty("data")
	public List<ContactPerson> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<ContactPerson> data) {
		this.data = data;
	}

	public CounterpartyContactPersonsResp withData(List<ContactPerson> data) {
		this.data = data;
		return this;
	}

	@JsonProperty("errors")
	public List<Object> getErrors() {
		return errors;
	}

	@JsonProperty("errors")
	public void setErrors(List<Object> errors) {
		this.errors = errors;
	}

	public CounterpartyContactPersonsResp withErrors(List<Object> errors) {
		this.errors = errors;
		return this;
	}

	@JsonProperty("warnings")
	public List<Object> getWarnings() {
		return warnings;
	}

	@JsonProperty("warnings")
	public void setWarnings(List<Object> warnings) {
		this.warnings = warnings;
	}

	public CounterpartyContactPersonsResp withWarnings(List<Object> warnings) {
		this.warnings = warnings;
		return this;
	}

	@JsonProperty("info")
	public Info getInfo() {
		return info;
	}

	@JsonProperty("info")
	public void setInfo(Info info) {
		this.info = info;
	}

	public CounterpartyContactPersonsResp withInfo(Info info) {
		this.info = info;
		return this;
	}

	@JsonProperty("messageCodes")
	public List<Object> getMessageCodes() {
		return messageCodes;
	}

	@JsonProperty("messageCodes")
	public void setMessageCodes(List<Object> messageCodes) {
		this.messageCodes = messageCodes;
	}

	public CounterpartyContactPersonsResp withMessageCodes(List<Object> messageCodes) {
		this.messageCodes = messageCodes;
		return this;
	}

	@JsonProperty("errorCodes")
	public List<Object> getErrorCodes() {
		return errorCodes;
	}

	@JsonProperty("errorCodes")
	public void setErrorCodes(List<Object> errorCodes) {
		this.errorCodes = errorCodes;
	}

	public CounterpartyContactPersonsResp withErrorCodes(List<Object> errorCodes) {
		this.errorCodes = errorCodes;
		return this;
	}

	@JsonProperty("warningCodes")
	public List<Object> getWarningCodes() {
		return warningCodes;
	}

	@JsonProperty("warningCodes")
	public void setWarningCodes(List<Object> warningCodes) {
		this.warningCodes = warningCodes;
	}

	public CounterpartyContactPersonsResp withWarningCodes(List<Object> warningCodes) {
		this.warningCodes = warningCodes;
		return this;
	}

	@JsonProperty("infoCodes")
	public List<Object> getInfoCodes() {
		return infoCodes;
	}

	@JsonProperty("infoCodes")
	public void setInfoCodes(List<Object> infoCodes) {
		this.infoCodes = infoCodes;
	}

	public CounterpartyContactPersonsResp withInfoCodes(List<Object> infoCodes) {
		this.infoCodes = infoCodes;
		return this;
	}

}