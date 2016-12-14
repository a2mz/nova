package a2mz.nova4j.entity.contragents.counterparty;

/**
 * Created by Morozov Oleksandr on 14.12.2016.
 * 414D
 */
public enum  CounterpartyProperty {
	SENDER("Sender"),
	RECIPIENT("Recipient");

	private String val;

	CounterpartyProperty(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}
}
