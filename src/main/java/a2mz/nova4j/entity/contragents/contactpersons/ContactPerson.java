package a2mz.nova4j.entity.contragents.contactpersons;

/**
 * Created by Morozov Oleksandr on 15.12.2016.
 * 414D
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"Description",
		"Phones",
		"Email",
		"Ref",
		"LastName",
		"FirstName",
		"MiddleName"
})
public class ContactPerson {

	@JsonProperty("Description")
	private String description;
	@JsonProperty("Phones")
	private String phones;
	@JsonProperty("Email")
	private String email;
	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("LastName")
	private String lastName;
	@JsonProperty("FirstName")
	private String firstName;
	@JsonProperty("MiddleName")
	private String middleName;

	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("Description")
	public void setDescription(String description) {
		this.description = description;
	}

	public ContactPerson withDescription(String description) {
		this.description = description;
		return this;
	}

	@JsonProperty("Phones")
	public String getPhones() {
		return phones;
	}

	@JsonProperty("Phones")
	public void setPhones(String phones) {
		this.phones = phones;
	}

	public ContactPerson withPhones(String phones) {
		this.phones = phones;
		return this;
	}

	@JsonProperty("Email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("Email")
	public void setEmail(String email) {
		this.email = email;
	}

	public ContactPerson withEmail(String email) {
		this.email = email;
		return this;
	}

	@JsonProperty("Ref")
	public String getRef() {
		return ref;
	}

	@JsonProperty("Ref")
	public void setRef(String ref) {
		this.ref = ref;
	}

	public ContactPerson withRef(String ref) {
		this.ref = ref;
		return this;
	}

	@JsonProperty("LastName")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("LastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ContactPerson withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@JsonProperty("FirstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("FirstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public ContactPerson withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	@JsonProperty("MiddleName")
	public String getMiddleName() {
		return middleName;
	}

	@JsonProperty("MiddleName")
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public ContactPerson withMiddleName(String middleName) {
		this.middleName = middleName;
		return this;
	}

}