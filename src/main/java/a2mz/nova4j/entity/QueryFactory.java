package a2mz.nova4j.entity;

import a2mz.nova4j.entity.address.AddressFactory;

/**
 * Created by Morozov Oleksandr on 29.11.2016.
 * 414D
 */
public class QueryFactory {

	private final String apiKey;

	private QueryFactory(String apiKey) {
		this.apiKey = apiKey;
	}

	public static QueryFactory withKey(String apiKey) {
		return new QueryFactory(apiKey);
	}

	public  AddressFactory address() {
		return new AddressFactory(apiKey);
	}


}
