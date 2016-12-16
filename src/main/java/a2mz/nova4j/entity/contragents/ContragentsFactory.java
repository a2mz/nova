package a2mz.nova4j.entity.contragents;

import a2mz.nova4j.entity.ServiceModel;
import a2mz.nova4j.entity.common.CalledMethod;
import a2mz.nova4j.entity.common.ModelName;
import a2mz.nova4j.entity.contragents.contactpersons.CounterpartyContactPersonsReq;
import a2mz.nova4j.entity.contragents.contactpersons.CounterpartyContactPersonsResp;
import a2mz.nova4j.entity.contragents.counterparty.CounterpartyProperty;
import a2mz.nova4j.entity.contragents.counterparty.CounterpartyReq;
import a2mz.nova4j.entity.contragents.counterparty.CounterpartyResp;
import a2mz.nova4j.entity.contragents.counterpartyaddresses.CounterpartyAddressesReq;
import a2mz.nova4j.entity.contragents.counterpartyaddresses.CounterpartyAddressesResp;
import a2mz.nova4j.entity.contragents.options.CounterpartyOptionsResp;
import a2mz.nova4j.exception.RequestStatusException;
import a2mz.nova4j.sender.HttpClient;
import a2mz.nova4j.sender.HttpConfig;
import org.apache.http.client.config.RequestConfig;

import java.io.IOException;
import java.util.Optional;

/**
 * Created by Morozov Oleksandr on 30.11.2016.
 * 414D
 */
public class ContragentsFactory {

	private final String apiKey;
	private final Optional<RequestConfig> requestConfig;


	public ContragentsFactory(String apiKey, Optional<RequestConfig> requestConfig) {
		this.requestConfig = requestConfig;
		this.apiKey = apiKey;
	}

	/**
	 * <h1>Загрузить список Контрагентов отправителей/получателей</h1>
	 * Метод «getCounterparties», работает в модели «Counterparty», этот метод загружает список контрагентов отправителей или получателей.
	 * Если в методе более чем 100 контрагентов отправителей или получателей, необходимо использовать параметр «Page»
	 * <p>
	 * Если в этот запрос добавить параметр «FindByString» (поиск по строкам) и в его свойствах прописать название контрагента (Талисман), который нужно найти, то получим запрос с помощью которого в справочнике находится нужный контрагент
	 * <p>
	 * Необходимо сохранять копию справочников на стороне клиента и поддерживать ее в актуальном состоянии. Рекомендуется проводить обновление справочников раз в сутки.
	 * <p>
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td style="text-align: center;"><b>Параметр</b></td>
	 * <td style="text-align: center;"><b>Тип данных</b></td>
	 * <td style="text-align: center;"><b>Описание</b></td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">apiKey*</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Ваш ключ API 2.0</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">modelName*</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Имя модели</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">calledMethod*</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Имя вызываемого метода</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">methodProperties</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Свойства метода</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">CounterpartyProperty</td>
	 * <td style="text-align: center;">string[36]	</td>
	 * <td style="text-align: center;">Вид контрагента</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Sender/Recipient	</td>
	 * <td style="text-align: center;">string[36]	</td>
	 * <td style="text-align: center;">Отправитель или получатель</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Page</td>
	 * <td style="text-align: center;">int[36]	</td>
	 * <td style="text-align: center;">Страница с информацией для отображения (не более 100 записей на одной странице)</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 *
	 * @param type CounterpartyProperty
	 * @param page Number of page need if >100 row selected
	 */
	public CounterpartyResp getCounterparties(CounterpartyProperty type, int page) throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.GET_COUNTERPARTIES;
		ModelName model = ModelName.COUNTERPARTY;
		return HttpClient.createHttpClient(CounterpartyResp.class, requestConfig)
				.sendPost(getUrl(method, model), constructCounterpartiesRequest(type, page, model, method));
	}

	private String getUrl(CalledMethod method, ModelName model) {
		return String.format(HttpConfig.HOST + "/v2.0/json/%s/%s/", model.getVal(), method.getVal());
	}

	private ServiceModel constructCounterpartiesRequest(CounterpartyProperty type, int page, ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method)
				.setMethodProperties(
						CounterpartyReq.create()
								.withCounterpartyProperty(type.getVal())
								.withPage(String.valueOf(page))
				);
	}

	/**
	 * <h1>Загрузить список контактных лиц Контрагента</h1>
	 * Метод «getCounterpartyContactPerson», работает в модели «Counterparty», этот метод загружает список контактных лиц контрагентов. Если в методе более чем 100 контактных лиц контрагентов, необходимо использовать параметр «Page» 	 * <p>
	 * Необходимо сохранять копию справочников на стороне клиента и поддерживать ее в актуальном состоянии. Рекомендуется проводить обновление справочников раз в сутки.
	 * <p>
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td style="text-align: center;"><b>Параметр</b></td>
	 * <td style="text-align: center;"><b>Тип данных</b></td>
	 * <td style="text-align: center;"><b>Описание</b></td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">apiKey*</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Ваш ключ API 2.0</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">modelName*</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Имя модели</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">calledMethod*</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Имя вызываемого метода</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">methodProperties</td>
	 * <td style="text-align: center;">&nbsp;</td>
	 * <td style="text-align: center;">Свойства метода</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Ref</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор контрагента</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Page</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Страница с информацией для отображения (не более 100 записей на одной странице)</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 *
	 * @param ref  Идентификатор контрагента
	 * @param page Number of page need if >100 row selected
	 */
	public CounterpartyContactPersonsResp getCounterpartyContactPersons(String ref, int page) throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.GET_COUNTERPARTY_CONTACT_PERSONS;
		ModelName model = ModelName.COUNTERPARTY;
		return HttpClient.createHttpClient(CounterpartyContactPersonsResp.class, requestConfig)
				.sendPost(getUrl(method, model), constructCounterpartyContactPersonsRequest(ref, page, model, method));
	}

	private ServiceModel constructCounterpartyContactPersonsRequest(String ref, int page, ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method)
				.setMethodProperties(
						CounterpartyContactPersonsReq.create()
								.withRef(ref)
								.withPage(String.valueOf(page))
				);
	}

	/**
	 * <h1>Загрузить список адресов Контрагентов</h1>
	 * Метод «getCounterpartyAddresses», работает в модели «Counterparty», этот метод загружает список контрагентов отправителей/получателей.
	 * Необходимо сохранять копию справочников на стороне клиента и поддерживать ее в актуальном состоянии.
	 * Рекомендуется проводить обновление справочников раз в месяц.
	 * <p>
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td style="text-align: center;"><b>Параметр</b></td>
	 * <td style="text-align: center;"><b>Тип данных</b></td>
	 * <td style="text-align: center;"><b>Описание</b></td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">apiKey*</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Ваш ключ API 2.0</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">modelName*</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Имя модели</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">calledMethod*</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Имя вызываемого метода</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">methodProperties</td>
	 * <td style="text-align: center;">&nbsp;</td>
	 * <td style="text-align: center;">Свойства метода</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Ref*</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор контрагента</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">CounterpartyProperty*</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Cвойства контрагента</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 *
	 * @param ref                  Идентификатор контрагента
	 * @param counterpartyProperty Sender/Recipient
	 */
	public CounterpartyAddressesResp getCounterpartyAddresses(String ref, CounterpartyProperty counterpartyProperty) throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.GET_COUNTERPARTY_ADDRESSES;
		ModelName model = ModelName.COUNTERPARTY;
		return HttpClient.createHttpClient(CounterpartyAddressesResp.class, requestConfig)
				.sendPost(getUrl(method, model), constructCounterpartyAddressesRequest(ref, counterpartyProperty, model, method));
	}

	private ServiceModel constructCounterpartyAddressesRequest(String ref, CounterpartyProperty counterpartyProperty, ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method)
				.setMethodProperties(
						CounterpartyAddressesReq.create()
								.withRef(ref)
								.withCounterpartyProperty(counterpartyProperty.getVal())
				);
	}

	/**
	 * <h1>Загрузить параметры Контрагента</h1>
	 * Метод «getCounterpartyOptions», работает в модели «Counterparty», этот метод используется для получения параметров контрагента отправителя/получателя.
	 * <p>
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td style="text-align: center;"><b>Параметр</b></td>
	 * <td style="text-align: center;"><b>Тип данных</b></td>
	 * <td style="text-align: center;"><b>Описание</b></td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">apiKey*</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Ваш ключ API 2.0</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">modelName*</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Имя модели</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">calledMethod*</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Имя вызываемого метода</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">methodProperties</td>
	 * <td style="text-align: center;">&nbsp;</td>
	 * <td style="text-align: center;">Свойства метода</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Ref*</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор контрагента</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 *
	 * @param ref                  Идентификатор контрагента
	 *
	 */
	public CounterpartyOptionsResp getCounterpartyOptions(String ref) throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.GET_COUNTERPARTY_OPTIONS;
		ModelName model = ModelName.COUNTERPARTY;
		return HttpClient.createHttpClient(CounterpartyOptionsResp.class, requestConfig)
				.sendPost(getUrl(method, model), constructCounterpartyOptoinsRequest(ref,model, method));
	}

	private ServiceModel constructCounterpartyOptoinsRequest(String ref, ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method)
				.setMethodProperties(
						CounterpartyAddressesReq.create()
								.withRef(ref)
				);
	}


}
