package communicator.entity.address;

import communicator.entity.ServiceModel;
import communicator.entity.address.area.AreaResp;
import communicator.entity.address.city.CityReq;
import communicator.entity.address.city.CityResp;
import communicator.entity.address.delete.DeleteReq;
import communicator.entity.address.delete.DeleteResp;
import communicator.entity.address.save.SaveReq;
import communicator.entity.address.save.SaveResp;
import communicator.entity.address.settlement.SettlementsReq;
import communicator.entity.address.settlement.SettlementsResp;
import communicator.entity.address.street.StreetReq;
import communicator.entity.address.street.StreetResp;
import communicator.entity.address.update.UpdateReq;
import communicator.entity.address.update.UpdateResp;
import communicator.entity.address.warehouses.WarehousesReq;
import communicator.entity.address.warehouses.WarehousesResp;
import communicator.entity.exception.RequestStatusException;
import communicator.entity.header.CalledMethod;
import communicator.entity.header.ModelName;
import communicator.entity.sender.HttpClient;
import communicator.entity.sender.HttpConfig;

import java.io.IOException;

/**
 * Created by Morozov Oleksandr on 30.11.2016.
 * 414D
 */
public class AddressFactory {
	private final String apiKey;


	public AddressFactory(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * <h1>Справочник географических областей Украины</h1>
	 * Метод «getAreas», работает в модели «ADDRESS», этот метод необходим для скачивания справочника географических областей Украины, компании «Новая Почта».
	 * Рекомендуется проводить обновление справочников раз в месяц.
	 * <p>
	 * <p>
	 * <h4>Тело ответа на запрос</h4>
	 * <p>
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td style="text-align: center;"><b>Параметр</b></td>
	 * <td style="text-align: center;"><b>Тип данных</b></td>
	 * <td style="text-align: center;"><b>Описание</b></td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Ref</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор Области</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Description</td>
	 * <td style="text-align: center;">string[50]</td>
	 * <td style="text-align: center;">Описание на украинском языке</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">AreasCenter</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор города, который является областным центром</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 *
	 * @return AreaResp
	 * @throws IOException
	 * @throws RequestStatusException
	 */
	public AreaResp getAreas() throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.GET_AREAS;
		ModelName model = ModelName.ADDRESS;

		return HttpClient.createHttpClient(AreaResp.class)
				.sendPost(getUrl(method, model), constructAreaRequest(model, method));
	}

	private String getUrl(CalledMethod method, ModelName model) {
		return String.format(HttpConfig.HOST + "/v2.0/json/%s/%s/", model.getVal(), method.getVal());
	}

	private ServiceModel constructAreaRequest(ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method);
	}

	/**
	 * <h1>Справочник населенных пунктов Украины</h1>
	 * Метод «getSettlements» работает в модели «ADDRESS_GENERAL», этот метод выгружает справочников городов Украины (на Украинском и Русском), в которые осуществляется доставка груза компанией «Новая Почта». Стоит учитывать, что метод «getSettlements» для каждого населенного пункта возвращает область, и район.
	 * Необходимо сохранять копию справочников на стороне клиента и поддерживать ее в актуальном состоянии.
	 * Рекомендуется проводить обновление справочников раз в месяц.
	 * <p>
	 * <p>
	 * <h4>Тело ответа на запрос</h4>
	 * <p>
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td style="text-align: center;"><b>Параметр</b></td>
	 * <td style="text-align: center;"><b>Тип данных</b></td>
	 * <td style="text-align: center;"><b>Описание</b></td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Ref</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор адреса</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Ref</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор адреса</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">SettlementType</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Тип населенного пункта (Село, ПГТ и т.д.) </td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Description</td>
	 * <td style="text-align: center;">string[50]</td>
	 * <td style="text-align: center;">Адрес на Украинском языке</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">DescriptionRu</td>
	 * <td style="text-align: center;">string[50]</td>
	 * <td style="text-align: center;">Адрес на русском языке</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Area</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Обозначение области</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">SettlementTypeDescription</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Тип населённого пункта</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">SettlementTypeDescriptionRu</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Тип населённого пункта&lt;</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Region</td>
	 * <td style="text-align: center;">string[50]</td>
	 * <td style="text-align: center;">Код населенного пункта</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">RegionsDescription</td>
	 * <td style="text-align: center;">string[50]</td>
	 * <td style="text-align: center;">Область</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">RegionsDescriptionRu</td>
	 * <td style="text-align: center;">string[50]</td>
	 * <td style="text-align: center;">Область</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Index</td>
	 * <td style="text-align: center;">int[10]</td>
	 * <td style="text-align: center;">Индекс</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Delivery1-Delivery7</td>
	 * <td style="text-align: center;">string[50]</td>
	 * <td style="text-align: center;">Наличие доставки отправления в днях недели
	 * </td>
	 * </tr>
	 * </tbody>
	 * </table>
	 *
	 * @param areaRef        Идентификатор области
	 * @param ref            Идентификатор адреса
	 * @param mainCitiesOnly Фильтр по названию
	 * @param hideMainCities Фильтр по названию
	 * @param regionRef      Фильтр по идентификатору района
	 * @return
	 * @throws IOException
	 * @throws RequestStatusException
	 */
	public SettlementsResp getSettlements(String areaRef, String ref, Boolean mainCitiesOnly, Boolean hideMainCities, String regionRef) throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.GET_SETTLEMENTS;
		ModelName model = ModelName.ADDRESS_GENERAL;
		return HttpClient.createHttpClient(SettlementsResp.class)
				.sendPost(getUrl(method, model), constructSettlementsRequest(areaRef, ref, mainCitiesOnly, hideMainCities, regionRef, model, method));
	}

	private ServiceModel constructSettlementsRequest(String areaRef, String ref, Boolean mainCitiesOnly, Boolean hideMainCities, String regionRef, ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method)
				.setMethodProperties(
						SettlementsReq.create()
								.withAreaRef(areaRef)
								.withRef(ref)
								.withMainCitiesOnly(mainCitiesOnly)
								.withHideMainCities(hideMainCities)
								.withRegionRef(regionRef)
						//.withPage() non using
				);
	}

	/**
	 * <h1>Справочник городов компании</h1>
	 * Получение справочника городов компании «Новая Почта» на украинском и русском языках.
	 * <p>
	 * Метод «getCities» работает в модели «ADDRESS», этот метод загружает справочник населенных пунктов Украины. Стоит учитывать, справочник выгружается только с населенными пунктами где есть отделения "Нова Пошта" и можно оформить доставку на отделение, а также на доставку по адресу.
	 * Если в этот запрос добавить параметр «FindByString» (поиск по строкам) и в его свойствах прописать название населенного пункта (Бровары), который нужно найти, то получим запрос с помощью которого в справочнике находится населенный пункт.
	 * <p>
	 * <code> "FindByString": "Бровари" </code>
	 * <p>
	 * Необходимо сохранять копию справочников на стороне клиента и поддерживать ее в актуальном состоянии.
	 * Рекомендуется проводить обновление справочников раз в сутки.
	 * <p>
	 * <p>
	 * <h2>Тело ответа на запрос</h2>
	 * <p>
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td style="text-align: center;"><b>Параметр</b></td>
	 * <td style="text-align: center;"><b>Тип данных</b></td>
	 * <td style="text-align: center;"><b>Описание</b></td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Ref</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор адреса</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Description</td>
	 * <td style="text-align: center;">string[50]</td>
	 * <td style="text-align: center;">Адрес на Украинском языке</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">DescriptionRu</td>
	 * <td style="text-align: center;">string[50]</td>
	 * <td style="text-align: center;">Адрес на русском языке</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Delivery1- Delivery7</td>
	 * <td style="text-align: center;">int[1]</td>
	 * <td style="text-align: center;">Наличие доставки отправления в днях недели</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Area</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Область</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Conglomerates</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Конгломерат</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">CityID</td>
	 * <td style="text-align: center;">int[]</td>
	 * <td style="text-align: center;">Код населенного пункта</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 *
	 * @param ref          Идентификатор адреса
	 * @param findByString Поиск по названию города
	 * @return CityResp
	 * @throws IOException
	 * @throws RequestStatusException
	 */
	public CityResp getCities(String ref, String findByString) throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.GET_CITIES;
		ModelName model = ModelName.ADDRESS;
		return HttpClient.createHttpClient(CityResp.class)
				.sendPost(getUrl(method, model), constructCitiesRequest(ref, findByString, model, method));
	}

	private ServiceModel constructCitiesRequest(String ref, String findByString, ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method)
				.setMethodProperties(
						CityReq.create()
								.withRef(ref)
								.withFindByString(findByString)
				);
	}


	/**
	 * <h1>Справочник отделений и типов отделений</h1>
	 * Метод «getWarehouses», работает в модели «ADDRESS», этот метод загружает справочник отделений «Новая Почта» в рамках населенных пунктов Украины.
	 * Если заменить «getWarehouses» на «getWarehouseTypes», можно получить справочник типов отделений «Новая Почта».
	 * Копию справочника необходимо сохранять и поддерживать в актуальном состоянии путем обновления раз в сутки.
	 * <p>
	 * <p>
	 * <h2>Тело ответа на запрос</h2>
	 * <p>
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td style="text-align: center;"><b>Параметр</b></td>
	 * <td style="text-align: center;"><b>Тип данных</b></td>
	 * <td style="text-align: center;"><b>Описание</b></td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Ref</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор адреса</td>
	 * </tr>
	 * <tr>
	 * <td>SiteKey</td>
	 * <td>decimal[9999999999]</td>
	 * <td>Код отделения</td>
	 * </tr>
	 * <tr>
	 * <td>Description</td>
	 * <td>string[99]</td>
	 * <td>Название отделения на Украинском</td>
	 * </tr>
	 * <tr>
	 * <td>DescriptionRu</td>
	 * <td>string[99]</td>
	 * <td>Название отделения на русском</td>
	 * </tr>
	 * <tr>
	 * <td>TypeOfWarehouse</td>
	 * <td>string[36]</td>
	 * <td>Тип отделения</td>
	 * </tr>
	 * <tr>
	 * <td>Ref</td>
	 * <td>string[36]</td>
	 * <td>Идентификатор отделения</td>
	 * </tr>
	 * <tr>
	 * <td>Number</td>
	 * <td>int[99999]</td>
	 * <td>Номер отделения</td>
	 * </tr>
	 * <tr>
	 * <td>CityRef</td>
	 * <td>string[36]</td>
	 * <td>Идентификатор населенного пункта</td>
	 * </tr>
	 * <tr>
	 * <td>CityDescription</td>
	 * <td>string[50]</td>
	 * <td>Название населенного пункта на Украинском</td>
	 * </tr>
	 * <tr>
	 * <td>CityDescriptionRu</td>
	 * <td>string[50]</td>
	 * <td>Название населенного пункта на русском</td>
	 * </tr>
	 * <tr>
	 * <td>TotalMaxWeightAllowed</td>
	 * <td>int[9999999999]</td>
	 * <td>Максимальный вес отправления</td>
	 * </tr>
	 * <tr>
	 * <td>PlaceMaxWeightAllowed</td>
	 * <td>int[9999999999]</td>
	 * <td>Максимальный вес одного места отправления</td>
	 * </tr>
	 * <tr>
	 * <td>Reception</td>
	 * <td>array[7]</td>
	 * <td>График приема отправлений</td>
	 * </tr>
	 * <tr>
	 * <td>Delivery</td>
	 * <td>array[7]</td>
	 * <td>График отправки день в день</td>
	 * </tr>
	 * <tr>
	 * <td>Schedule</td>
	 * <td>array[7]</td>
	 * <td>График работы</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 *
	 * @param cityName Дополнительный фильтр по имени города
	 * @param cityRef  Дополнительный фильтр по идентификатору города
	 * @return WarehousesResp
	 * @throws IOException
	 * @throws RequestStatusException
	 */
	public WarehousesResp getWarehouses(String cityName, String cityRef) throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.GET_WAREHOUSES;
		ModelName model = ModelName.ADDRESS_GENERAL;
		return HttpClient.createHttpClient(WarehousesResp.class)
				.sendPost(getUrl(method, model), constructWarehousesRequest(cityName, cityRef, model, method));
	}

	private ServiceModel constructWarehousesRequest(String cityName, String cityRef, ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method)
				.setMethodProperties(
						WarehousesReq.create()
								.withCityName(cityName)
								.withCityRef(cityRef)
				);
	}

	/**
	 * <h1>Справочник улиц компании</h1>
	 * Метод «getStreet» работает в модели «ADDRESS», этот метод загружает справочник улиц в рамках населенных пунктов Украины куда осуществляет доставку компания «Новая Почта». Справочник используется при создании отправлений с типом доставки от/до адреса клиента.
	 * Если в этот запрос добавить параметр «FindByString» (поиск по строкам) и в его свойствах прописать название улицы (Броварський), который нужно найти, то получим запрос с помощью которого в справочнике находится проспект или улица.
	 * <p>
	 * "methodProperties": {
	 * "FindByString": "Броварський"
	 * }
	 * <p>
	 * Копию справочника необходимо сохранять и поддерживать в актуальном состоянии путем обновления раз в сутки.
	 * <p>
	 * <p>
	 * <h2>Тело ответа на запрос</h2>
	 * <p>
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td style="text-align: center;"><b>Параметр</b></td>
	 * <td style="text-align: center;"><b>Тип данных</b></td>
	 * <td style="text-align: center;"><b>Описание</b></td>
	 * </tr>
	 * <p>
	 * <tr>
	 * <td style="text-align: center;">Ref</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор адреса</td>
	 * </tr>
	 * <p>
	 * <tr>
	 * <td style="text-align: center;">Ref</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор улицы</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Description</td>
	 * <td style="text-align: center;">string[100]</td>
	 * <td style="text-align: center;">Название улицы на украинском языке</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">StreetsTypeRef</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Название типа улицы на украинском языке</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">StreetsType</td>
	 * <td style="text-align: center;">string[]</td>
	 * <td style="text-align: center;">Тип улицы</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 *
	 * @param findByString Поиск по строкам
	 * @param cityRef      Идентификатор города
	 * @return StreetResp
	 * @throws IOException
	 * @throws RequestStatusException
	 */
	public StreetResp getStreet(String findByString, String cityRef) throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.GET_STREET;
		ModelName model = ModelName.ADDRESS;
		return HttpClient.createHttpClient(StreetResp.class)
				.sendPost(getUrl(method, model), constructStreetRequest(findByString, cityRef, model, method));
	}

	private ServiceModel constructStreetRequest(String findByString, String cityRef, ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method)
				.setMethodProperties(
						StreetReq.create()
								.withFindByString(findByString)
								.withCityRef(cityRef)
				);
	}

	/**
	 * <h1>Создать адрес контрагента (отправитель/получатель)</h1>
	 * Метод «SAVE» , работает в модели «ADDRESS» , этот метод сохраняет адреса контрагента отправителя/получателя.
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
	 * <td style="text-align: center;">CounterpartyRef</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор контрагента</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">StreetRef</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор улицы</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">BuildingNumber</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Номер дома</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Flat</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Квартира</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Note</td>
	 * <td style="text-align: center;">string[40]</td>
	 * <td style="text-align: center;">Комментарий </td>
	 * </tr>
	 * </tbody>
	 * </table>
	 *
	 * @param counterpartyRef Идентификатор контрагента
	 * @param streetRef       Идентификатор улицы
	 * @param buildingNumber  Номер дома
	 * @param flat            Квартира
	 * @param note            Комментарий
	 * @return SaveResp
	 * @throws IOException
	 * @throws RequestStatusException
	 */


	public SaveResp save(String counterpartyRef, String streetRef, String buildingNumber, String flat, String note) throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.SAVE;
		ModelName model = ModelName.ADDRESS;
		return HttpClient.createHttpClient(SaveResp.class)
				.sendPost(getUrl(method, model), constructSaveAddressRequest(counterpartyRef, streetRef, buildingNumber, flat, note, model, method));
	}

	private ServiceModel constructSaveAddressRequest(String counterpartyRef, String streetRef, String buildingNumber, String flat, String note, ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method)
				.setMethodProperties(
						SaveReq.create()
								.withCounterpartyRef(counterpartyRef)
								.withStreetRef(streetRef)
								.withBuildingNumber(buildingNumber)
								.withFlat(flat)
								.withNote(note)
				);
	}

	/**
	 * <h1>Редактировать адрес контрагента (отправитель/получатель)</h1>
	 * Метод «update», работает в модели «ADDRESS», этот метод необходим для обновления адреса контрагента отправителя/получателя.
	 * Редактировать данные контрагента можно только с момента его создания и до момента создания интернет документа с ним.
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
	 * <td style="text-align: center;">Идентификатор адреса</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">CounterpartyRef</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор контрагента</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">StreetRef</td>
	 * <td style="text-align: center;">string[36]</td>
	 * <td style="text-align: center;">Идентификатор улицы</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">BuildingNumber</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Номер дома</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Flat</td>
	 * <td style="text-align: center;">string</td>
	 * <td style="text-align: center;">Квартира</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align: center;">Note</td>
	 * <td style="text-align: center;">string[40]</td>
	 * <td style="text-align: center;">Комментарий </td>
	 * </tr>
	 * </tbody>
	 * </table>
	 *
	 * @param ref             Идентификатор адреса (predicate)
	 * @param counterpartyRef Идентификатор контрагента
	 * @param streetRef       Идентификатор улицы
	 * @param buildingNumber  Номер дома
	 * @param flat            Квартира
	 * @param note            Комментарий
	 * @return UpdateResp
	 * @throws IOException
	 * @throws RequestStatusException
	 */


	public UpdateResp update(String ref, String counterpartyRef, String streetRef, String buildingNumber, String flat, String note) throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.UPDATE;
		ModelName model = ModelName.ADDRESS;
		return HttpClient.createHttpClient(UpdateResp.class)
				.sendPost(getUrl(method, model), constructUpdateAddressRequest(ref, counterpartyRef, streetRef, buildingNumber, flat, note, model, method));
	}

	private ServiceModel constructUpdateAddressRequest(String ref, String counterpartyRef, String streetRef, String buildingNumber, String flat, String note, ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method)
				.setMethodProperties(
						UpdateReq.create()
								.withRef(ref)
								.withCounterpartyRef(counterpartyRef)
								.withStreetRef(streetRef)
								.withBuildingNumber(buildingNumber)
								.withFlat(flat)
								.withNote(note)
				);
	}

	/**
	 * <h1>Удалить адрес контрагента (отправитель/получатель)</h1>
	 * Метод «delete», работает в модели «ADDRESS», этот метод необходим для удаления адреса контрагента отправителя/получателя.
	 * Редактировать данные контрагента можно только с момента его создания до момента создания ИД с ним.
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
	 * <td style="text-align: center;">Идентификатор адреса</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 *
	 * @param ref             Идентификатор адреса (predicate)
	 * @return DeleteResp
	 * @throws IOException
	 * @throws RequestStatusException
	 */
	public DeleteResp delete(String ref) throws IOException, RequestStatusException {
		CalledMethod method = CalledMethod.DELETE;
		ModelName model = ModelName.ADDRESS;
		return HttpClient.createHttpClient(DeleteResp.class)
				.sendPost(getUrl(method, model), constructDeleteAddressRequest(ref, model, method));
	}

	private ServiceModel constructDeleteAddressRequest(String ref, ModelName model, CalledMethod method) {
		return ServiceModel.create(apiKey, model, method)
				.setMethodProperties(
						DeleteReq.create()
								.withRef(ref)

				);
	}


}
