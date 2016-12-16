package a2mz.nova4j.entity.common;

/**
 * Created by Morozov Oleksandr on 29.11.2016.
 * 414D
 */
public enum  ModelName {
	COUNTERPARTY("Counterparty"),
	CONTACT_PERSON("ContactPerson"),
	ADDRESS("Address"),
	ADDRESS_GENERAL("AddressGeneral");


	private String val;

	ModelName(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}

}
