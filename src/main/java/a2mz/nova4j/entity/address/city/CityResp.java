package a2mz.nova4j.entity.address.city;
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
public class CityResp {

	@JsonProperty("success")
	private Boolean success;
	@JsonProperty("data")
	private List<City> data = null;
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

	@JsonProperty("data")
	public List<City> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<City> data) {
		this.data = data;
	}

	@JsonProperty("errors")
	public List<Object> getErrors() {
		return errors;
	}

	@JsonProperty("errors")
	public void setErrors(List<Object> errors) {
		this.errors = errors;
	}

	@JsonProperty("warnings")
	public List<Object> getWarnings() {
		return warnings;
	}

	@JsonProperty("warnings")
	public void setWarnings(List<Object> warnings) {
		this.warnings = warnings;
	}

	@JsonProperty("info")
	public Info getInfo() {
		return info;
	}

	@JsonProperty("info")
	public void setInfo(Info info) {
		this.info = info;
	}

	@JsonProperty("messageCodes")
	public List<Object> getMessageCodes() {
		return messageCodes;
	}

	@JsonProperty("messageCodes")
	public void setMessageCodes(List<Object> messageCodes) {
		this.messageCodes = messageCodes;
	}

	@JsonProperty("errorCodes")
	public List<Object> getErrorCodes() {
		return errorCodes;
	}

	@JsonProperty("errorCodes")
	public void setErrorCodes(List<Object> errorCodes) {
		this.errorCodes = errorCodes;
	}

	@JsonProperty("warningCodes")
	public List<Object> getWarningCodes() {
		return warningCodes;
	}

	@JsonProperty("warningCodes")
	public void setWarningCodes(List<Object> warningCodes) {
		this.warningCodes = warningCodes;
	}

	@JsonProperty("infoCodes")
	public List<Object> getInfoCodes() {
		return infoCodes;
	}

	@JsonProperty("infoCodes")
	public void setInfoCodes(List<Object> infoCodes) {
		this.infoCodes = infoCodes;
	}

}