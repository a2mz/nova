package communicator.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import communicator.entity.address.AddressFactory;
import communicator.entity.header.CalledMethod;
import communicator.entity.header.ModelName;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created by Morozov Oleksandr on 01.12.2016.
 * 414D
 */
public class AddressFactoryTest {
	ObjectMapper mapper;
	AddressFactory factory;


	@Before
	public void setUp() throws Exception {
		factory = new AddressFactory("key");
		mapper = new ObjectMapper();
	}

	@Test
	public void constructAreaRequest() throws Exception {
		Class[] cArg = new Class[2];

		cArg[0] = ModelName.class;
		cArg[1] = CalledMethod.class;

		Method method = factory.getClass().getDeclaredMethod("constructAreaRequest", cArg);
		method.setAccessible(true);
		Object result = method.invoke(factory, ModelName.ADDRESS, CalledMethod.GET_AREAS);


		String expected = "{\"apiKey\":\"key\",\"modelName\":\"Address\",\"calledMethod\":\"getAreas\",\"methodProperties\":null}";

		Assert.assertEquals(expected, mapper.writeValueAsString(result));

	}

	@Test
	public void constructSettlementsRequest() throws Exception {

		Class[] cArg = new Class[7];
		cArg[0] = String.class;
		cArg[1] = String.class;
		cArg[2] = Boolean.class;
		cArg[3] = Boolean.class;
		cArg[4] = String.class;
		//
		cArg[5] = ModelName.class;
		cArg[6] = CalledMethod.class;

//		String areaRef,
//		String ref,
//		Boolean mainCitiesOnly,
//		Boolean hideMainCities,
//		String regionRef,
//		CalledMethod method,
//		ModelName model

		Method method = factory.getClass().getDeclaredMethod("constructSettlementsRequest", cArg);
		method.setAccessible(true);


		Object result = method.invoke(factory, null, null, null, null, null, ModelName.ADDRESS_GENERAL, CalledMethod.GET_SETTLEMENTS);

		String expected = "{\"apiKey\":\"key\",\"modelName\":\"AddressGeneral\",\"calledMethod\":\"getSettlements\",\"methodProperties\":{}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


		result = method.invoke(factory, "dcaadb64-4b33-11e4-ab6d-005056801329", null, null, null, null, ModelName.ADDRESS_GENERAL, CalledMethod.GET_SETTLEMENTS);
		expected = "{\"apiKey\":\"key\",\"modelName\":\"AddressGeneral\",\"calledMethod\":\"getSettlements\",\"methodProperties\":{\"AreaRef\":\"dcaadb64-4b33-11e4-ab6d-005056801329\"}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


		result = method.invoke(factory, "dcaadb64-4b33-11e4-ab6d-005056801329", "0e451e40-4b3a-11e4-ab6d-005056801329", null, null, null, ModelName.ADDRESS_GENERAL, CalledMethod.GET_SETTLEMENTS);
		expected = "{\"apiKey\":\"key\",\"modelName\":\"AddressGeneral\",\"calledMethod\":\"getSettlements\",\"methodProperties\":{\"AreaRef\":\"dcaadb64-4b33-11e4-ab6d-005056801329\",\"Ref\":\"0e451e40-4b3a-11e4-ab6d-005056801329\"}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


		result = method.invoke(factory, "dcaadb64-4b33-11e4-ab6d-005056801329", "0e451e40-4b3a-11e4-ab6d-005056801329", true, null, null, ModelName.ADDRESS_GENERAL, CalledMethod.GET_SETTLEMENTS);
		expected = "{\"apiKey\":\"key\",\"modelName\":\"AddressGeneral\",\"calledMethod\":\"getSettlements\",\"methodProperties\":{\"AreaRef\":\"dcaadb64-4b33-11e4-ab6d-005056801329\",\"Ref\":\"0e451e40-4b3a-11e4-ab6d-005056801329\",\"MainCitiesOnly\":true}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));

		result = method.invoke(factory, "dcaadb64-4b33-11e4-ab6d-005056801329", "0e451e40-4b3a-11e4-ab6d-005056801329", null, false, "e4b03a8f-4b33-11e4-ab6d-005056801329", ModelName.ADDRESS_GENERAL, CalledMethod.GET_SETTLEMENTS);
		expected = "{\"apiKey\":\"key\",\"modelName\":\"AddressGeneral\",\"calledMethod\":\"getSettlements\",\"methodProperties\":{\"AreaRef\":\"dcaadb64-4b33-11e4-ab6d-005056801329\",\"Ref\":\"0e451e40-4b3a-11e4-ab6d-005056801329\",\"HideMainCities\":false,\"RegionRef\":\"e4b03a8f-4b33-11e4-ab6d-005056801329\"}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


	}

	@Test
	public void constructCitiesRequest() throws Exception {

		Class[] cArg = new Class[4];

		//String ref,
		// String findByString
		cArg[0] = String.class;
		cArg[1] = String.class;

		cArg[2] = ModelName.class;
		cArg[3] = CalledMethod.class;


		Method method = factory.getClass().getDeclaredMethod("constructCitiesRequest", cArg);
		method.setAccessible(true);


		Object result = method.invoke(factory, null, null, ModelName.ADDRESS, CalledMethod.GET_CITIES);

		String expected = "{\"apiKey\":\"key\",\"modelName\":\"Address\",\"calledMethod\":\"getCities\",\"methodProperties\":{}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


		result = method.invoke(factory, "a9280688-94c0-11e3-b441-0050568002cf", null, ModelName.ADDRESS, CalledMethod.GET_CITIES);
		expected = "{\"apiKey\":\"key\",\"modelName\":\"Address\",\"calledMethod\":\"getCities\",\"methodProperties\":{\"Ref\":\"a9280688-94c0-11e3-b441-0050568002cf\"}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


		result = method.invoke(factory, null, "Андріївк", ModelName.ADDRESS, CalledMethod.GET_CITIES);
		expected = "{\"apiKey\":\"key\",\"modelName\":\"Address\",\"calledMethod\":\"getCities\",\"methodProperties\":{\"FindByString\":\"Андріївк\"}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


	}

	@Test
	public void constructWarehouseRequest() throws Exception {

		Class[] cArg = new Class[4];

		//String cityName,
		// String cityRef
		cArg[0] = String.class;
		cArg[1] = String.class;

		cArg[2] = ModelName.class;
		cArg[3] = CalledMethod.class;


		Method method = factory.getClass().getDeclaredMethod("constructWarehousesRequest", cArg);
		method.setAccessible(true);


		Object result = method.invoke(factory, null, null, ModelName.ADDRESS_GENERAL, CalledMethod.GET_WAREHOUSES);

		String expected = "{\"apiKey\":\"key\",\"modelName\":\"AddressGeneral\",\"calledMethod\":\"getWarehouses\",\"methodProperties\":{}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


		result = method.invoke(factory, "Київ", null, ModelName.ADDRESS_GENERAL, CalledMethod.GET_WAREHOUSES);
		expected = "{\"apiKey\":\"key\",\"modelName\":\"AddressGeneral\",\"calledMethod\":\"getWarehouses\",\"methodProperties\":{\"CityName\":\"Київ\"}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


		result = method.invoke(factory, "Бахмач", null, ModelName.ADDRESS_GENERAL, CalledMethod.GET_WAREHOUSES);
		expected = "{\"apiKey\":\"key\",\"modelName\":\"AddressGeneral\",\"calledMethod\":\"getWarehouses\",\"methodProperties\":{\"CityName\":\"Бахмач\"}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


		result = method.invoke(factory, null, "8d5a980d-391c-11dd-90d9-001a92567626", ModelName.ADDRESS_GENERAL, CalledMethod.GET_WAREHOUSES);
		expected = "{\"apiKey\":\"key\",\"modelName\":\"AddressGeneral\",\"calledMethod\":\"getWarehouses\",\"methodProperties\":{\"CityRef\":\"8d5a980d-391c-11dd-90d9-001a92567626\"}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


	}

	@Test
	public void constructStreetRequest() throws Exception {

		Class[] cArg = new Class[4];

		//String cityName,
		// String cityRef
		cArg[0] = String.class;
		cArg[1] = String.class;

		cArg[2] = ModelName.class;
		cArg[3] = CalledMethod.class;


		Method method = factory.getClass().getDeclaredMethod("constructStreetRequest", cArg);
		method.setAccessible(true);

		Object result = method.invoke(factory, "Броварський", "ebc0eda9-93ec-11e3-b441-0050568002cf", ModelName.ADDRESS, CalledMethod.GET_STREET);

		String expected = "{\"apiKey\":\"key\",\"modelName\":\"Address\",\"calledMethod\":\"getStreet\",\"methodProperties\":{\"CityRef\":\"ebc0eda9-93ec-11e3-b441-0050568002cf\",\"FindByString\":\"Броварський\"}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


	}

	@Test
	public void constructSaveAddressRequest() throws Exception {

		Class[] cArg = new Class[7];


		//String cityName,
		// String cityRef
		cArg[0] = String.class;
		cArg[1] = String.class;
		cArg[2] = String.class;
		cArg[3] = String.class;
		cArg[4] = String.class;

		cArg[5] = ModelName.class;
		cArg[6] = CalledMethod.class;


		Method method = factory.getClass().getDeclaredMethod("constructSaveAddressRequest", cArg);
		method.setAccessible(true);

		Object result = method.invoke(factory, "5ace4a2e-13ee-11e5-add9-005056887b8d", "d4450bdb-0a58-11de-b6f5-001d92f78697", "7", "2", "Комментарий", ModelName.ADDRESS, CalledMethod.SAVE);

		String expected = "{\"apiKey\":\"key\",\"modelName\":\"Address\",\"calledMethod\":\"save\",\"methodProperties\":{\"CounterpartyRef\":\"5ace4a2e-13ee-11e5-add9-005056887b8d\",\"StreetRef\":\"d4450bdb-0a58-11de-b6f5-001d92f78697\",\"BuildingNumber\":\"7\",\"Flat\":\"2\",\"Note\":\"Комментарий\"}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


	}
	@Test
	public void constructUpdateAddressRequest() throws Exception {

		Class[] cArg = new Class[8];


		//String cityName,
		// String cityRef
		cArg[0] = String.class;
		cArg[1] = String.class;
		cArg[2] = String.class;
		cArg[3] = String.class;
		cArg[4] = String.class;
		cArg[5] = String.class;

		cArg[6] = ModelName.class;
		cArg[7] = CalledMethod.class;


		Method method = factory.getClass().getDeclaredMethod("constructUpdateAddressRequest", cArg);
		method.setAccessible(true);

		Object result = method.invoke(factory, "5fdf0be8-c4e6-11e5-a70c-005056801333","5ace4a2e-13ee-11e5-add9-005056887b8d", "bba0d9b3-4148-11dd-9198-001d60451983", "45", "12", "Комментарий", ModelName.ADDRESS, CalledMethod.UPDATE);

		String expected = "{\"apiKey\":\"key\",\"modelName\":\"Address\",\"calledMethod\":\"update\",\"methodProperties\":{\"CounterpartyRef\":\"5ace4a2e-13ee-11e5-add9-005056887b8d\",\"Ref\":\"5fdf0be8-c4e6-11e5-a70c-005056801333\",\"StreetRef\":\"bba0d9b3-4148-11dd-9198-001d60451983\",\"BuildingNumber\":\"45\",\"Flat\":\"12\",\"Note\":\"Комментарий\"}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


	}	@Test
	public void constructDeleteAddressRequest() throws Exception {

		Class[] cArg = new Class[3];

		cArg[0] = String.class;

		cArg[1] = ModelName.class;
		cArg[2] = CalledMethod.class;


		Method method = factory.getClass().getDeclaredMethod("constructDeleteAddressRequest", cArg);
		method.setAccessible(true);

		Object result = method.invoke(factory, "d5aa1638-1dbf-11e6-a70c-005056801333", ModelName.ADDRESS, CalledMethod.DELETE);

		String expected = "{\"apiKey\":\"key\",\"modelName\":\"Address\",\"calledMethod\":\"delete\",\"methodProperties\":{\"Ref\":\"d5aa1638-1dbf-11e6-a70c-005056801333\"}}";
		Assert.assertEquals(expected, mapper.writeValueAsString(result));


	}


}