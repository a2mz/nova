package a2mz.nova4j.entity;

import a2mz.nova4j.entity.address.AddressFactory;
import a2mz.nova4j.entity.contragents.ContragentsFactory;
import org.apache.http.client.config.RequestConfig;

import java.util.Optional;

/**
 * Created by Morozov Oleksandr on 29.11.2016.
 * 414D
 */
public class QueryFactory {

	private final String apiKey;
	private Optional<RequestConfig> config;


	private QueryFactory(String apiKey, RequestConfig config) {
		this.config = Optional.ofNullable(config);
		this.apiKey = apiKey;
	}

	public static QueryFactory withKey(String apiKey) {
		return new QueryFactory(apiKey, null);
	}

	/**
	 *
	 * HttpHost proxy = new HttpHost("proxy.imb.local", 3128);
	 * RequestConfig config = RequestConfig.custom().setProxy(proxy).build();
	 *
	 * @param apiKey
	 * @param config
	 * @return
	 */
	public static QueryFactory withKey(String apiKey, RequestConfig config) {
		return new QueryFactory(apiKey, config);
	}

	public AddressFactory address() {
		return new AddressFactory(apiKey, config);
	}
	public ContragentsFactory contragent() {
		return new ContragentsFactory(apiKey, config);
	}


}
