package a2mz.nova4j.entity.contragents.counterparty;

/**
 * Created by Morozov Oleksandr on 14.12.2016.
 * 414D
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"Description",
		"Ref",
		"City",
		"Counterparty",
		"FirstName",
		"LastName",
		"MiddleName",
		"OwnershipFormRef",
		"OwnershipFormDescription",
		"EDRPOU",
		"CounterpartyType",
		"CityDescription"
})
public class Counterparty {

	@JsonProperty("Description")
	private String description;
	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("City")
	private String city;
	@JsonProperty("Counterparty")
	private Object counterparty;
	@JsonProperty("FirstName")
	private String firstName;
	@JsonProperty("LastName")
	private String lastName;
	@JsonProperty("MiddleName")
	private String middleName;
	@JsonProperty("OwnershipFormRef")
	private String ownershipFormRef;
	@JsonProperty("OwnershipFormDescription")
	private String ownershipFormDescription;
	@JsonProperty("EDRPOU")
	private String eDRPOU;
	@JsonProperty("CounterpartyType")
	private String counterpartyType;
	@JsonProperty("CityDescription")
	private String cityDescription;

	/**
	 *
	 * @return
	 * The description
	 */
	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}

	/**
	 *
	 * @param description
	 * The Description
	 */
	@JsonProperty("Description")
	public void setDescription(String description) {
		this.description = description;
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

	/**
	 *
	 * @return
	 * The city
	 */
	@JsonProperty("City")
	public String getCity() {
		return city;
	}

	/**
	 *
	 * @param city
	 * The City
	 */
	@JsonProperty("City")
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 *
	 * @return
	 * The counterparty
	 */
	@JsonProperty("Counterparty")
	public Object getCounterparty() {
		return counterparty;
	}

	/**
	 *
	 * @param counterparty
	 * The Counterparty
	 */
	@JsonProperty("Counterparty")
	public void setCounterparty(Object counterparty) {
		this.counterparty = counterparty;
	}

	/**
	 *
	 * @return
	 * The firstName
	 */
	@JsonProperty("FirstName")
	public String getFirstName() {
		return firstName;
	}

	/**
	 *
	 * @param firstName
	 * The FirstName
	 */
	@JsonProperty("FirstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 *
	 * @return
	 * The lastName
	 */
	@JsonProperty("LastName")
	public String getLastName() {
		return lastName;
	}

	/**
	 *
	 * @param lastName
	 * The LastName
	 */
	@JsonProperty("LastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 *
	 * @return
	 * The middleName
	 */
	@JsonProperty("MiddleName")
	public String getMiddleName() {
		return middleName;
	}

	/**
	 *
	 * @param middleName
	 * The MiddleName
	 */
	@JsonProperty("MiddleName")
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 *
	 * @return
	 * The ownershipFormRef
	 */
	@JsonProperty("OwnershipFormRef")
	public String getOwnershipFormRef() {
		return ownershipFormRef;
	}

	/**
	 *
	 * @param ownershipFormRef
	 * The OwnershipFormRef
	 */
	@JsonProperty("OwnershipFormRef")
	public void setOwnershipFormRef(String ownershipFormRef) {
		this.ownershipFormRef = ownershipFormRef;
	}

	/**
	 *
	 * @return
	 * The ownershipFormDescription
	 */
	@JsonProperty("OwnershipFormDescription")
	public String getOwnershipFormDescription() {
		return ownershipFormDescription;
	}

	/**
	 *
	 * @param ownershipFormDescription
	 * The OwnershipFormDescription
	 */
	@JsonProperty("OwnershipFormDescription")
	public void setOwnershipFormDescription(String ownershipFormDescription) {
		this.ownershipFormDescription = ownershipFormDescription;
	}

	/**
	 *
	 * @return
	 * The eDRPOU
	 */
	@JsonProperty("EDRPOU")
	public String getEDRPOU() {
		return eDRPOU;
	}

	/**
	 *
	 * @param eDRPOU
	 * The EDRPOU
	 */
	@JsonProperty("EDRPOU")
	public void setEDRPOU(String eDRPOU) {
		this.eDRPOU = eDRPOU;
	}

	/**
	 *
	 * @return
	 * The counterpartyType
	 */
	@JsonProperty("CounterpartyType")
	public String getCounterpartyType() {
		return counterpartyType;
	}

	/**
	 *
	 * @param counterpartyType
	 * The CounterpartyType
	 */
	@JsonProperty("CounterpartyType")
	public void setCounterpartyType(String counterpartyType) {
		this.counterpartyType = counterpartyType;
	}

	/**
	 *
	 * @return
	 * The cityDescription
	 */
	@JsonProperty("CityDescription")
	public String getCityDescription() {
		return cityDescription;
	}

	/**
	 *
	 * @param cityDescription
	 * The CityDescription
	 */
	@JsonProperty("CityDescription")
	public void setCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
	}

	@Override
	public String toString() {
		return "Counterparty{" +
				"description='" + description + '\'' +
				", ref='" + ref + '\'' +
				", city='" + city + '\'' +
				", counterparty=" + counterparty +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", middleName='" + middleName + '\'' +
				", ownershipFormRef='" + ownershipFormRef + '\'' +
				", ownershipFormDescription='" + ownershipFormDescription + '\'' +
				", eDRPOU='" + eDRPOU + '\'' +
				", counterpartyType='" + counterpartyType + '\'' +
				", cityDescription='" + cityDescription + '\'' +
				'}';
	}
}