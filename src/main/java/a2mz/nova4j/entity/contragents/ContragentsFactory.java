package a2mz.nova4j.entity.contragents;

import a2mz.nova4j.entity.ServiceModel;
import a2mz.nova4j.entity.contragents.counterparty.CounterpartyProperty;
import a2mz.nova4j.entity.contragents.counterparty.CounterpartyReq;
import a2mz.nova4j.entity.contragents.counterparty.CounterpartyResp;
import a2mz.nova4j.entity.header.CalledMethod;
import a2mz.nova4j.entity.header.ModelName;
import a2mz.nova4j.exception.RequestStatusException;
import a2mz.nova4j.sender.HttpClient;
import a2mz.nova4j.sender.HttpConfig;

import java.io.IOException;

/**
 * Created by Morozov Oleksandr on 30.11.2016.
 * 414D
 */
public class ContragentsFactory {
	private final String apiKey;


	public ContragentsFactory(String apiKey) {
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
	 */
	public CounterpartyResp getCounterpartyOptions(String counterpartyProperty, CounterpartyProperty type, int page) throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.GET_COUNTERPARTIES;
		ModelName model = ModelName.COUNTERPARTY;
		return HttpClient.createHttpClient(CounterpartyResp.class)
				.sendPost(getUrl(method, model), constructCounterpartyOptionsRequest(counterpartyProperty, type, page, model, method));
	}

	private String getUrl(CalledMethod method, ModelName model) {
		return String.format(HttpConfig.HOST + "/v2.0/json/%s/%s/", model.getVal(), method.getVal());
	}

	private ServiceModel constructCounterpartyOptionsRequest(String counterpartyProperty, CounterpartyProperty type, int page, ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method)
				.setMethodProperties(
						CounterpartyReq.create()
								.withCounterpartyProperty(counterpartyProperty)
								.withCounterpartyProperty(type.getVal())
								.withPage(String.valueOf(page))
				);
	}


}
