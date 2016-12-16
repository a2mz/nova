package a2mz.nova4j.entity.address.update;

/**
 * Created by Morozov Oleksandr on 13.12.2016.
 * 414D
 */
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"success",
		"data",
		"errors",
		"warnings",
		"info"
})
public class UpdateResp {

	@JsonProperty("success")
	private Boolean success;
	@JsonProperty("data")
	private List<Address> data = null;
	@JsonProperty("errors")
	private List<Object> errors = null;
	@JsonProperty("warnings")
	private List<Object> warnings = null;
	@JsonProperty("info")
	private List<Object> info = null;

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

	public UpdateResp withSuccess(Boolean success) {
		this.success = success;
		return this;
	}

	/**
	 *
	 * @return
	 * The data
	 */
	@JsonProperty("data")
	public List<Address> getData() {
		return data;
	}

	/**
	 *
	 * @param data
	 * The data
	 */
	@JsonProperty("data")
	public void setData(List<Address> data) {
		this.data = data;
	}

	public UpdateResp withData(List<Address> data) {
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

	public UpdateResp withErrors(List<Object> errors) {
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

	public UpdateResp withWarnings(List<Object> warnings) {
		this.warnings = warnings;
		return this;
	}

	/**
	 *
	 * @return
	 * The info
	 */
	@JsonProperty("info")
	public List<Object> getInfo() {
		return info;
	}

	/**
	 *
	 * @param info
	 * The info
	 */
	@JsonProperty("info")
	public void setInfo(List<Object> info) {
		this.info = info;
	}

	public UpdateResp withInfo(List<Object> info) {
		this.info = info;
		return this;
	}

}