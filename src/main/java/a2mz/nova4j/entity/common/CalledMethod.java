package a2mz.nova4j.entity.common;

/**
 * Created by Morozov Oleksandr on 29.11.2016.
 * 414D
 */
public enum CalledMethod {
	DELETE("delete"),
	SAVE("save"),
	UPDATE("update"),
	GET_AREAS("getAreas"),
	GET_CITIES("getCities"),
	GET_SETTLEMENTS("getSettlements"),
	GET_WAREHOUSES("getWarehouses"),
	GET_STREET("getStreet"),
	GET_COUNTERPARTIES("getCounterparties"),
	GET_COUNTERPARTY_CONTACT_PERSONS("getCounterpartyContactPersons"),
	GET_COUNTERPARTY_ADDRESSES("getCounterpartyContactPersons"),
	GET_COUNTERPARTY_OPTIONS("getCounterpartyOptions");

	private String val;

	CalledMethod(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}
}
