package communicator.entity.address.street;

/**
 * Created by Morozov Oleksandr on 12.12.2016.
 * 414D
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"totalCount"
})
public class Info {

	@JsonProperty("totalCount")
	private Integer totalCount;

	/**
	 *
	 * @return
	 * The totalCount
	 */
	@JsonProperty("totalCount")
	public Integer getTotalCount() {
		return totalCount;
	}

	/**
	 *
	 * @param totalCount
	 * The totalCount
	 */
	@JsonProperty("totalCount")
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Info withTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
		return this;
	}

}