# API NovaPoshta


[![](https://jitpack.io/v/a2mz/nova4j.svg)](https://jitpack.io/#a2mz/nova4j)
[![MIT License](http://img.shields.io/badge/license-MIT-blue.svg?style=flat)](https://github.com/rubenlagus/TelegramBots/blob/master/LICENSE)

A simple to use library for communicate with novatoshta.ua

 
```java
    // Example 

    public class Main {
        public static void main(String[] args) {
         	SettlementsResp c = QueryFactory.withKey("key").address().getSettlements(null,null,null,null,null);
         	c.getSettlement().forEach(x-> System.out.println(x.getDescription()));
        }
    }
```

#### Адреса
Работа с адресами

* [Создать адрес контрагента (отправитель/получатель)](https://devcenter.novaposhta.ua/docs/services/556d7ccaa0fe4f08e8f7ce43/operations/556d9925a0fe4f08e8f7ce4a)
```java
SaveResp c = QueryFactory.withKey("key").address().save(...)
```
* [Редактировать адрес контрагента (отправитель/получатель)](https://devcenter.novaposhta.ua/docs/services/556d7ccaa0fe4f08e8f7ce43/operations/556d9db5a0fe4f08e8f7ce4b)
```java
UpdateResp c = QueryFactory.withKey("key").address().update(...)
```
* [Удалить адрес контрагента (отправитель/получатель)](https://devcenter.novaposhta.ua/docs/services/556d7ccaa0fe4f08e8f7ce43/operations/556da062a0fe4f08e8f7ce4c)
```java
UpdateResp c = QueryFactory.withKey("key").address().delete(...)
```
* [Справочник городов компании](https://devcenter.novaposhta.ua/docs/services/556d7ccaa0fe4f08e8f7ce43/operations/556d885da0fe4f08e8f7ce46)
```java
CityResp c = QueryFactory.withKey("key").address().getCities(null,"Бровари");
```
* [Справочник населенных пунктов Украины](https://devcenter.novaposhta.ua/docs/services/556d7ccaa0fe4f08e8f7ce43/operations/56248fffa0fe4f0da0550ea8)
```java
SettlementsResp c = QueryFactory.withKey("key").address().getSettlements(null,null,null,null,null);
```
* [Справочник географических областей Украины](https://devcenter.novaposhta.ua/docs/services/556d7ccaa0fe4f08e8f7ce43/operations/556d9130a0fe4f08e8f7ce48)
```java
AreaResp c = QueryFactory.withKey("key").address().getAreas();
```
* [Справочник отделений и типов отделений](https://devcenter.novaposhta.ua/docs/services/556d7ccaa0fe4f08e8f7ce43/operations/556d8211a0fe4f08e8f7ce45)
```java
WarehousesResp c = QueryFactory.withKey("key").address().getWarehouses("Київ", null);
```
* [Справочник улиц компании](https://devcenter.novaposhta.ua/docs/services/556d7ccaa0fe4f08e8f7ce43/operations/556d8db0a0fe4f08e8f7ce47)
```java
StreetResp c = QueryFactory.withKey("key").address().getStreet("Броварський", "ebc0eda9-93ec-11e3-b441-0050568002cf");
```

#### Контрагенты
Работа с данными Контрагента

* [Загрузить список адресов Контрагентов](https://devcenter.novaposhta.ua/docs/services/557eb8c8a0fe4f02fc455b2d/operations/557fdcb4a0fe4f105c087611)
```java
CounterpartyAddressesResp c =  QueryFactory.withKey("key").contragent().getCounterpartyAddresses("00000000-0000-0000-0000-000000000000",CounterpartyProperty.SENDER);
```
* [Загрузить список контактных лиц Контрагента](https://devcenter.novaposhta.ua/docs/services/557eb8c8a0fe4f02fc455b2d/operations/557fe424a0fe4f105c087612)
```java
CounterpartyResp c = QueryFactory.withKey("key").contragent().getCounterpartyContactPersons("00000000-0000-0000-0000-000000000000",1);
```
* [Загрузить список Контрагентов отправителей/получателей](https://devcenter.novaposhta.ua/docs/services/557eb8c8a0fe4f02fc455b2d/operations/557fd789a0fe4f105c08760f)
```java
CounterpartyResp c = QueryFactory.withKey("key").contragent().getCounterpartyOptions(CounterpartyProperty.SENDER, 1);
```
