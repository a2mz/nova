package communicator.entity.header;

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
	GET_STREET("getStreet");

	private String val;

	CalledMethod(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}
}
