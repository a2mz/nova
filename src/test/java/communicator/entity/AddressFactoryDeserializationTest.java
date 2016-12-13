package communicator.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import communicator.entity.address.save.Address;
import communicator.entity.address.save.SaveResp;
import communicator.entity.address.street.StreetResp;
import communicator.entity.address.update.UpdateResp;
import communicator.entity.address.warehouses.WarehousesResp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Morozov Oleksandr on 01.12.2016.
 * 414D
 */
public class AddressFactoryDeserializationTest {
	ObjectMapper mapper;

	@Before
	public void setUp() throws Exception {
			mapper = new ObjectMapper();
	}

	@Test
	public void constructAreaRequest() throws Exception {


		String expected = "{\n" +
				"  \"success\": true,\n" +
				"  \"data\": [\n" +
				"    {\n" +
				"      \"SiteKey\": \"408\",\n" +
				"      \"Description\": \"Відділення: вул. Ярослава Мудрого, 24\",\n" +
				"      \"DescriptionRu\": \"Отделение: ул. Ярослава Мудрого, 24\",\n" +
				"      \"Phone\": \"0-800-500-609\",\n" +
				"      \"TypeOfWarehouse\": \"9a68df70-0267-42a8-bb5c-37f427e36ee4\",\n" +
				"      \"Ref\": \"511fcfe4-e1c2-11e3-8c4a-0050568002cf\",\n" +
				"      \"Number\": \"1\",\n" +
				"      \"CityRef\": \"0db17b16-4079-11de-b509-001d92f78698\",\n" +
				"      \"CityDescription\": \"Бахмач\",\n" +
				"      \"CityDescriptionRu\": \"Бахмач\",\n" +
				"      \"Longitude\": \"32.829732928836000\",\n" +
				"      \"Latitude\": \"51.183082500800000\",\n" +
				"      \"PostFinance\": \"1\",\n" +
				"      \"BicycleParking\": \"0\",\n" +
				"      \"POSTerminal\": \"0\",\n" +
				"      \"TotalMaxWeightAllowed\": 0,\n" +
				"      \"PlaceMaxWeightAllowed\": 0,\n" +
				"      \"Reception\": {\n" +
				"        \"Monday\": \"16:00-19:00\",\n" +
				"        \"Tuesday\": \"16:00-19:00\",\n" +
				"        \"Wednesday\": \"16:00-19:00\",\n" +
				"        \"Thursday\": \"16:00-19:00\",\n" +
				"        \"Friday\": \"16:00-19:00\",\n" +
				"        \"Saturday\": \"-\",\n" +
				"        \"Sunday\": \"-\"\n" +
				"      },\n" +
				"      \"Delivery\": {\n" +
				"        \"Monday\": \"09:00-11:00\",\n" +
				"        \"Tuesday\": \"09:00-11:00\",\n" +
				"        \"Wednesday\": \"09:00-11:00\",\n" +
				"        \"Thursday\": \"09:00-11:00\",\n" +
				"        \"Friday\": \"09:00-11:00\",\n" +
				"        \"Saturday\": \"-\",\n" +
				"        \"Sunday\": \"-\"\n" +
				"      },\n" +
				"      \"Schedule\": {\n" +
				"        \"Monday\": \"09:00-19:00\",\n" +
				"        \"Tuesday\": \"09:00-19:00\",\n" +
				"        \"Wednesday\": \"09:00-19:00\",\n" +
				"        \"Thursday\": \"09:00-19:00\",\n" +
				"        \"Friday\": \"09:00-19:00\",\n" +
				"        \"Saturday\": \"09:00-15:00\",\n" +
				"        \"Sunday\": \"-\"\n" +
				"      }\n" +
				"    },\n" +
				"    {\n" +
				"      \"SiteKey\": \"12027\",\n" +
				"      \"Description\": \"Поштомат \\\"ПриватБанк\\\" №1001: вул. Жовтнева, 27\",\n" +
				"      \"DescriptionRu\": \"Почтомат \\\"ПриватБанк\\\" №1001: ул. Октябрьская, 31\",\n" +
				"      \"Phone\": \"0-800-500-609\",\n" +
				"      \"TypeOfWarehouse\": \"95dc212d-479c-4ffb-a8ab-8c1b9073d0bc\",\n" +
				"      \"Ref\": \"2b181193-3cf1-11e5-add9-005056887b8d\",\n" +
				"      \"Number\": \"1001\",\n" +
				"      \"CityRef\": \"0db17b16-4079-11de-b509-001d92f78698\",\n" +
				"      \"CityDescription\": \"Бахмач\",\n" +
				"      \"CityDescriptionRu\": \"Бахмач\",\n" +
				"      \"Longitude\": \"32.822265000000000\",\n" +
				"      \"Latitude\": \"51.181905000000000\",\n" +
				"      \"PostFinance\": \"0\",\n" +
				"      \"BicycleParking\": \"0\",\n" +
				"      \"POSTerminal\": \"0\",\n" +
				"      \"TotalMaxWeightAllowed\": \"30\",\n" +
				"      \"PlaceMaxWeightAllowed\": 0,\n" +
				"      \"Reception\": {\n" +
				"        \"Monday\": \"17:15-18:00\",\n" +
				"        \"Tuesday\": \"17:15-18:00\",\n" +
				"        \"Wednesday\": \"17:15-18:00\",\n" +
				"        \"Thursday\": \"17:15-18:00\",\n" +
				"        \"Friday\": \"17:15-18:00\",\n" +
				"        \"Saturday\": \"-\",\n" +
				"        \"Sunday\": \"-\"\n" +
				"      },\n" +
				"      \"Delivery\": {\n" +
				"        \"Monday\": \"-\",\n" +
				"        \"Tuesday\": \"-\",\n" +
				"        \"Wednesday\": \"-\",\n" +
				"        \"Thursday\": \"-\",\n" +
				"        \"Friday\": \"-\",\n" +
				"        \"Saturday\": \"-\",\n" +
				"        \"Sunday\": \"-\"\n" +
				"      },\n" +
				"      \"Schedule\": {\n" +
				"        \"Monday\": \"09:00-18:00\",\n" +
				"        \"Tuesday\": \"09:00-18:00\",\n" +
				"        \"Wednesday\": \"09:00-18:00\",\n" +
				"        \"Thursday\": \"09:00-18:00\",\n" +
				"        \"Friday\": \"09:00-18:00\",\n" +
				"        \"Saturday\": \"08:00-15:00\",\n" +
				"        \"Sunday\": \"-\"\n" +
				"      }\n" +
				"    }\n" +
				"  ],\n" +
				"  \"errors\": [],\n" +
				"  \"warnings\": [],\n" +
				"  \"info\": {\n" +
				"    \"totalCount\": 2\n" +
				"  },\n" +
				"  \"messageCodes\": [],\n" +
				"  \"errorCodes\": [],\n" +
				"  \"warningCodes\": [],\n" +
				"  \"infoCodes\": []\n" +
				"}";

		WarehousesResp out = mapper.readValue(expected, WarehousesResp.class);
     	Assert.assertNotNull(out);
     	Assert.assertEquals(out.getData().get(0).getSiteKey(), "408" );
     	Assert.assertEquals(out.getData().get(1).getSiteKey(), "12027" );

	}

	@Test
	public void  saveAddress() throws Exception {


		String expected = "{\n" +
				"\"success\": true,\n" +
				"\"data\": [\n" +
				"{\n" +
				"\"Ref\": \"503702df-cd4c-11e4-bdb5-005056801329\",\n" +
				"\"Description\": \"Бердичівська вул. 12 кв. 10 Коментар\"\n" +
				"}\n" +
				"],\n" +
				"\"errors\": [],\n" +
				"\"warnings\": [],\n" +
				"\"info\": []\n" +
				"}";

		SaveResp out = mapper.readValue(expected, SaveResp.class);
		System.out.println(out.toString());
		Assert.assertNotNull(out);
        Assert.assertEquals(out.getSuccess(), true );
     	Assert.assertEquals(out.getData().get(0).getDescription(), "Бердичівська вул. 12 кв. 10 Коментар" );
     	Assert.assertEquals(out.getData().get(0).getRef(), "503702df-cd4c-11e4-bdb5-005056801329" );

	}
@Test
	public void  updateAddress() throws Exception {
		String expected = "{\n" +
				"\"success\": true,\n" +
				"\"data\": [\n" +
				"{\n" +
				"\"Ref\": \"d5aa1638-1dbf-11e6-a70c-005056801333\"\n" +
				"}\n" +
				"],\n" +
				"\"errors\": [],\n" +
				"\"warnings\": [],\n" +
				"\"info\": []\n" +
				"}";

	UpdateResp out = mapper.readValue(expected, UpdateResp.class);

		Assert.assertNotNull(out);
        Assert.assertEquals(out.getSuccess(), true );
     	Assert.assertEquals(out.getData().get(0).getRef(), "d5aa1638-1dbf-11e6-a70c-005056801333" );
	}

@Test
	public void  deleteAddress() throws Exception {
		String expected = "{\n" +
				"\"success\": true,\n" +
				"\"data\": [\n" +
				"{\n" +
				"\"Ref\": \"d5aa1638-1dbf-11e6-a70c-005056801333\"\n" +
				"}\n" +
				"],\n" +
				"\"errors\": [],\n" +
				"\"warnings\": [],\n" +
				"\"info\": []\n" +
				"}";

	UpdateResp out = mapper.readValue(expected, UpdateResp.class);

		Assert.assertNotNull(out);
        Assert.assertEquals(out.getSuccess(), true );
     	Assert.assertEquals(out.getData().get(0).getRef(), "d5aa1638-1dbf-11e6-a70c-005056801333" );
	}



	@Test
	public void  getStreet() throws Exception {
		String expected = "{\n" +
				"  \"success\": true,\n" +
				"  \"data\": [\n" +
				"    {\n" +
				"      \"Description\": \"Академічна\",\n" +
				"      \"Ref\": \"b5e79222-2d34-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Будівельників\",\n" +
				"      \"Ref\": \"7b4f37cc-6e34-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Highway\",\n" +
				"      \"StreetsType\": \"шосе\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Виноградна \",\n" +
				"      \"Ref\": \"7cff4fbd-6387-11e5-8d8d-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Вишнева\",\n" +
				"      \"Ref\": \"398aa42f-f715-11e5-899e-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Вінницька\",\n" +
				"      \"Ref\": \"9be2d800-0833-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Вузька\",\n" +
				"      \"Ref\": \"8eda7ec3-3524-11e5-add9-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Гагаріна\",\n" +
				"      \"Ref\": \"a76c21a5-0c01-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Грушевського\",\n" +
				"      \"Ref\": \"9235defa-f8b2-11e5-899e-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Дачна\",\n" +
				"      \"Ref\": \"2e3091c2-6195-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Житня\",\n" +
				"      \"Ref\": \"e54f35ea-c18e-11e4-a77a-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Квітнева \",\n" +
				"      \"Ref\": \"1e529c5c-6fba-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Кірова\",\n" +
				"      \"Ref\": \"8d5c7952-131f-11e5-add9-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Лісова\",\n" +
				"      \"Ref\": \"02cb4217-6fde-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Малиновського\",\n" +
				"      \"Ref\": \"487de665-cbf0-11e4-a77a-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Медніка\",\n" +
				"      \"Ref\": \"dbc40df2-effb-11e5-899e-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Lane\",\n" +
				"      \"StreetsType\": \"пров.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Механізаторів\",\n" +
				"      \"Ref\": \"c1b34b49-0c51-11e6-971e-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Мічуріна\",\n" +
				"      \"Ref\": \"a76c21a3-0c01-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Мічуріна\",\n" +
				"      \"Ref\": \"e65fe278-6d82-11e5-8d8d-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Lane\",\n" +
				"      \"StreetsType\": \"пров.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Молодіжна\",\n" +
				"      \"Ref\": \"a76c21a6-0c01-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Мудрого Ярослава\",\n" +
				"      \"Ref\": \"a76c21a7-0c01-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Наукова\",\n" +
				"      \"Ref\": \"b77f7846-8756-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Нова\",\n" +
				"      \"Ref\": \"b092f586-299c-11e6-9e93-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Подільська\",\n" +
				"      \"Ref\": \"b6f728cb-c58c-11e5-8478-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Прибережна \",\n" +
				"      \"Ref\": \"b94e8a22-85bf-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Різдвяний\",\n" +
				"      \"Ref\": \"07d6e15d-5af7-11e6-a9f2-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Lane\",\n" +
				"      \"StreetsType\": \"пров.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Садова \",\n" +
				"      \"Ref\": \"83c507e1-bcee-11e4-a77a-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Сімерязьєва\",\n" +
				"      \"Ref\": \"02cb4128-6fde-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Слов'янський\",\n" +
				"      \"Ref\": \"70947b70-32de-11e6-9e93-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Lane\",\n" +
				"      \"StreetsType\": \"пров.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Сонячна\",\n" +
				"      \"Ref\": \"00e70fe7-610a-11e5-8d8d-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Тимірязєва \",\n" +
				"      \"Ref\": \"02cb4007-6fde-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Шевченка\",\n" +
				"      \"Ref\": \"c2826ba6-3ced-11e5-add9-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Юності\",\n" +
				"      \"Ref\": \"6a66ce7a-2600-11e5-add9-005056887b8d\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Description\": \"Яблунева\",\n" +
				"      \"Ref\": \"0e4a2d7e-372d-11e4-acce-0050568002cf\",\n" +
				"      \"StreetsTypeRef\": \"Street\",\n" +
				"      \"StreetsType\": \"вул.\"\n" +
				"    }\n" +
				"  ],\n" +
				"  \"errors\": [],\n" +
				"  \"warnings\": [],\n" +
				"  \"info\": {\n" +
				"    \"totalCount\": 33\n" +
				"  },\n" +
				"  \"messageCodes\": [],\n" +
				"  \"errorCodes\": [],\n" +
				"  \"warningCodes\": [],\n" +
				"  \"infoCodes\": []\n" +
				"}";

		StreetResp out = mapper.readValue(expected, StreetResp.class);

		Assert.assertNotNull(out);
		Assert.assertEquals(out.getSuccess(), true );
		Assert.assertEquals(out.getData().size() ,33 );

	}




//
//	@Test
//	public void  getStreet() throws Exception {
//		String expected = "";
//		UpdateResp out = mapper.readValue(expected, UpdateResp.class);
//		Assert.assertNotNull(out);
//		Assert.assertEquals(out.getSuccess(), true );
//		Assert.assertEquals(out.getData().get(0).getRef(), "d5aa1638-1dbf-11e6-a70c-005056801333" );
//	}

//
//	@Test
//	public void  getStreet() throws Exception {
//		String expected = "";
//		UpdateResp out = mapper.readValue(expected, UpdateResp.class);
//		Assert.assertNotNull(out);
//		Assert.assertEquals(out.getSuccess(), true );
//		Assert.assertEquals(out.getData().get(0).getRef(), "d5aa1638-1dbf-11e6-a70c-005056801333" );
//	}
//




}