package a2mz.nova4j.entity.address.update;

/**
 * Created by Morozov Oleksandr on 13.12.2016.
 * 414D
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import a2mz.nova4j.entity.header.MethodProperties;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"CounterpartyRef",
		"Ref",
		"StreetRef",
		"BuildingNumber",
		"Flat",
		"Note"
})
public class UpdateReq implements MethodProperties {

	@JsonProperty("CounterpartyRef")
	private String counterpartyRef;
	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("StreetRef")
	private String streetRef;
	@JsonProperty("BuildingNumber")
	private String buildingNumber;
	@JsonProperty("Flat")
	private String flat;
	@JsonProperty("Note")
	private String note;

	private UpdateReq() {
	}

	public static UpdateReq create() {
		return new UpdateReq();
	}

	/**
	 *
	 * @return
	 * The counterpartyRef
	 */
	@JsonProperty("CounterpartyRef")
	public String getCounterpartyRef() {
		return counterpartyRef;
	}

	/**
	 *
	 * @param counterpartyRef
	 * The CounterpartyRef
	 */
	@JsonProperty("CounterpartyRef")
	public void setCounterpartyRef(String counterpartyRef) {
		this.counterpartyRef = counterpartyRef;
	}

	public UpdateReq withCounterpartyRef(String counterpartyRef) {
		this.counterpartyRef = counterpartyRef;
		return this;
	}

	/**
	 *
	 * @return
	 * The ref
	 */
	@JsonProperty("Ref")
	public String getRef() {
		return ref;
	}

	/**
	 *
	 * @param ref
	 * The Ref
	 */
	@JsonProperty("Ref")
	public void setRef(String ref) {
		this.ref = ref;
	}

	public UpdateReq withRef(String ref) {
		this.ref = ref;
		return this;
	}

	/**
	 *
	 * @return
	 * The streetRef
	 */
	@JsonProperty("StreetRef")
	public String getStreetRef() {
		return streetRef;
	}

	/**
	 *
	 * @param streetRef
	 * The StreetRef
	 */
	@JsonProperty("StreetRef")
	public void setStreetRef(String streetRef) {
		this.streetRef = streetRef;
	}

	public UpdateReq withStreetRef(String streetRef) {
		this.streetRef = streetRef;
		return this;
	}

	/**
	 *
	 * @return
	 * The buildingNumber
	 */
	@JsonProperty("BuildingNumber")
	public String getBuildingNumber() {
		return buildingNumber;
	}

	/**
	 *
	 * @param buildingNumber
	 * The BuildingNumber
	 */
	@JsonProperty("BuildingNumber")
	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public UpdateReq withBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
		return this;
	}

	/**
	 *
	 * @return
	 * The flat
	 */
	@JsonProperty("Flat")
	public String getFlat() {
		return flat;
	}

	/**
	 *
	 * @param flat
	 * The Flat
	 */
	@JsonProperty("Flat")
	public void setFlat(String flat) {
		this.flat = flat;
	}

	public UpdateReq withFlat(String flat) {
		this.flat = flat;
		return this;
	}

	/**
	 *
	 * @return
	 * The note
	 */
	@JsonProperty("Note")
	public String getNote() {
		return note;
	}

	/**
	 *
	 * @param note
	 * The Note
	 */
	@JsonProperty("Note")
	public void setNote(String note) {
		this.note = note;
	}

	public UpdateReq withNote(String note) {
		this.note = note;
		return this;
	}

}
