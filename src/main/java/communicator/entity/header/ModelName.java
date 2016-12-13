package communicator.entity.header;

/**
 * Created by Morozov Oleksandr on 29.11.2016.
 * 414D
 */
public enum  ModelName {
	Counterparty("Counterparty"),
	ContactPerson("ContactPerson"),
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
