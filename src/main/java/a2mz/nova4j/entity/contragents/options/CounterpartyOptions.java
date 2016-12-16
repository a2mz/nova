package a2mz.nova4j.entity.contragents.options;

/**
 * Created by Morozov Oleksandr on 16.12.2016.
 * 414D
 */

import com.fasterxml.jackson.annotation.JsonInclude;
		import com.fasterxml.jackson.annotation.JsonProperty;
		import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"FillingWarranty",
		"AddressDocumentDelivery",
		"CanPayTheThirdPerson",
		"CanAfterpaymentOnGoodsCost",
		"CanNonCashPayment",
		"CanCreditDocuments",
		"CanEWTransporter",
		"CanSignedDocuments",
		"HideDeliveryCost",
		"BlockInternationalSenderLKK",
		"CanSameDayDelivery",
		"CanSameDayDeliveryStandart",
		"CanForwardingService",
		"ShowDeliveryByHand",
		"DeliveryByHand",
		"LoyaltyProgram",
		"DescentFromFloor",
		"BackDeliveryValuablePapers",
		"BackwardDeliverySubtypesDocuments",
		"AfterpaymentType",
		"HaveMoneyWallets"
})
public class CounterpartyOptions {

	@JsonProperty("FillingWarranty")
	private Boolean fillingWarranty;
	@JsonProperty("AddressDocumentDelivery")
	private Boolean addressDocumentDelivery;
	@JsonProperty("CanPayTheThirdPerson")
	private Boolean canPayTheThirdPerson;
	@JsonProperty("CanAfterpaymentOnGoodsCost")
	private Boolean canAfterpaymentOnGoodsCost;
	@JsonProperty("CanNonCashPayment")
	private Boolean canNonCashPayment;
	@JsonProperty("CanCreditDocuments")
	private Boolean canCreditDocuments;
	@JsonProperty("CanEWTransporter")
	private Boolean canEWTransporter;
	@JsonProperty("CanSignedDocuments")
	private Boolean canSignedDocuments;
	@JsonProperty("HideDeliveryCost")
	private Boolean hideDeliveryCost;
	@JsonProperty("BlockInternationalSenderLKK")
	private Boolean blockInternationalSenderLKK;
	@JsonProperty("CanSameDayDelivery")
	private Boolean canSameDayDelivery;
	@JsonProperty("CanSameDayDeliveryStandart")
	private Boolean canSameDayDeliveryStandart;
	@JsonProperty("CanForwardingService")
	private Boolean canForwardingService;
	@JsonProperty("ShowDeliveryByHand")
	private Boolean showDeliveryByHand;
	@JsonProperty("DeliveryByHand")
	private Boolean deliveryByHand;
	@JsonProperty("LoyaltyProgram")
	private Boolean loyaltyProgram;
	@JsonProperty("DescentFromFloor")
	private Boolean descentFromFloor;
	@JsonProperty("BackDeliveryValuablePapers")
	private Boolean backDeliveryValuablePapers;
	@JsonProperty("BackwardDeliverySubtypesDocuments")
	private Boolean backwardDeliverySubtypesDocuments;
	@JsonProperty("AfterpaymentType")
	private String afterpaymentType;
	@JsonProperty("HaveMoneyWallets")
	private Boolean haveMoneyWallets;

	@JsonProperty("FillingWarranty")
	public Boolean getFillingWarranty() {
		return fillingWarranty;
	}

	@JsonProperty("FillingWarranty")
	public void setFillingWarranty(Boolean fillingWarranty) {
		this.fillingWarranty = fillingWarranty;
	}

	@JsonProperty("AddressDocumentDelivery")
	public Boolean getAddressDocumentDelivery() {
		return addressDocumentDelivery;
	}

	@JsonProperty("AddressDocumentDelivery")
	public void setAddressDocumentDelivery(Boolean addressDocumentDelivery) {
		this.addressDocumentDelivery = addressDocumentDelivery;
	}

	/**
	 *
	 * @return Плательщик 3е лицо
	 */
	@JsonProperty("CanPayTheThirdPerson")
	public Boolean getCanPayTheThirdPerson() {
		return canPayTheThirdPerson;
	}


	@JsonProperty("CanPayTheThirdPerson")
	public void setCanPayTheThirdPerson(Boolean canPayTheThirdPerson) {
		this.canPayTheThirdPerson = canPayTheThirdPerson;
	}

	/**
	 *
	 * @return Оплата денег за товар
	 */
	@JsonProperty("CanAfterpaymentOnGoodsCost")
	public Boolean getCanAfterpaymentOnGoodsCost() {
		return canAfterpaymentOnGoodsCost;
	}

	@JsonProperty("CanAfterpaymentOnGoodsCost")
	public void setCanAfterpaymentOnGoodsCost(Boolean canAfterpaymentOnGoodsCost) {
		this.canAfterpaymentOnGoodsCost = canAfterpaymentOnGoodsCost;
	}

	/**
	 *
	 * @return Безналичный расчет
	 */
	@JsonProperty("CanNonCashPayment")
	public Boolean getCanNonCashPayment() {
		return canNonCashPayment;
	}

	@JsonProperty("CanNonCashPayment")
	public void setCanNonCashPayment(Boolean canNonCashPayment) {
		this.canNonCashPayment = canNonCashPayment;
	}

	/**
	 *
	 * @return Оформление кредита
	 */
	@JsonProperty("CanCreditDocuments")
	public Boolean getCanCreditDocuments() {
		return canCreditDocuments;
	}

	@JsonProperty("CanCreditDocuments")
	public void setCanCreditDocuments(Boolean canCreditDocuments) {
		this.canCreditDocuments = canCreditDocuments;
	}

	@JsonProperty("CanEWTransporter")
	public Boolean getCanEWTransporter() {
		return canEWTransporter;
	}

	@JsonProperty("CanEWTransporter")
	public void setCanEWTransporter(Boolean canEWTransporter) {
		this.canEWTransporter = canEWTransporter;
	}

	@JsonProperty("CanSignedDocuments")
	public Boolean getCanSignedDocuments() {
		return canSignedDocuments;
	}

	@JsonProperty("CanSignedDocuments")
	public void setCanSignedDocuments(Boolean canSignedDocuments) {
		this.canSignedDocuments = canSignedDocuments;
	}

	@JsonProperty("HideDeliveryCost")
	public Boolean getHideDeliveryCost() {
		return hideDeliveryCost;
	}

	@JsonProperty("HideDeliveryCost")
	public void setHideDeliveryCost(Boolean hideDeliveryCost) {
		this.hideDeliveryCost = hideDeliveryCost;
	}

	@JsonProperty("BlockInternationalSenderLKK")
	public Boolean getBlockInternationalSenderLKK() {
		return blockInternationalSenderLKK;
	}

	@JsonProperty("BlockInternationalSenderLKK")
	public void setBlockInternationalSenderLKK(Boolean blockInternationalSenderLKK) {
		this.blockInternationalSenderLKK = blockInternationalSenderLKK;
	}

	@JsonProperty("CanSameDayDelivery")
	public Boolean getCanSameDayDelivery() {
		return canSameDayDelivery;
	}

	@JsonProperty("CanSameDayDelivery")
	public void setCanSameDayDelivery(Boolean canSameDayDelivery) {
		this.canSameDayDelivery = canSameDayDelivery;
	}

	@JsonProperty("CanSameDayDeliveryStandart")
	public Boolean getCanSameDayDeliveryStandart() {
		return canSameDayDeliveryStandart;
	}

	@JsonProperty("CanSameDayDeliveryStandart")
	public void setCanSameDayDeliveryStandart(Boolean canSameDayDeliveryStandart) {
		this.canSameDayDeliveryStandart = canSameDayDeliveryStandart;
	}

	@JsonProperty("CanForwardingService")
	public Boolean getCanForwardingService() {
		return canForwardingService;
	}

	@JsonProperty("CanForwardingService")
	public void setCanForwardingService(Boolean canForwardingService) {
		this.canForwardingService = canForwardingService;
	}

	@JsonProperty("ShowDeliveryByHand")
	public Boolean getShowDeliveryByHand() {
		return showDeliveryByHand;
	}

	@JsonProperty("ShowDeliveryByHand")
	public void setShowDeliveryByHand(Boolean showDeliveryByHand) {
		this.showDeliveryByHand = showDeliveryByHand;
	}

	@JsonProperty("DeliveryByHand")
	public Boolean getDeliveryByHand() {
		return deliveryByHand;
	}

	@JsonProperty("DeliveryByHand")
	public void setDeliveryByHand(Boolean deliveryByHand) {
		this.deliveryByHand = deliveryByHand;
	}

	@JsonProperty("LoyaltyProgram")
	public Boolean getLoyaltyProgram() {
		return loyaltyProgram;
	}

	@JsonProperty("LoyaltyProgram")
	public void setLoyaltyProgram(Boolean loyaltyProgram) {
		this.loyaltyProgram = loyaltyProgram;
	}

	@JsonProperty("DescentFromFloor")
	public Boolean getDescentFromFloor() {
		return descentFromFloor;
	}

	@JsonProperty("DescentFromFloor")
	public void setDescentFromFloor(Boolean descentFromFloor) {
		this.descentFromFloor = descentFromFloor;
	}

	@JsonProperty("BackDeliveryValuablePapers")
	public Boolean getBackDeliveryValuablePapers() {
		return backDeliveryValuablePapers;
	}

	@JsonProperty("BackDeliveryValuablePapers")
	public void setBackDeliveryValuablePapers(Boolean backDeliveryValuablePapers) {
		this.backDeliveryValuablePapers = backDeliveryValuablePapers;
	}

	@JsonProperty("BackwardDeliverySubtypesDocuments")
	public Boolean getBackwardDeliverySubtypesDocuments() {
		return backwardDeliverySubtypesDocuments;
	}

	@JsonProperty("BackwardDeliverySubtypesDocuments")
	public void setBackwardDeliverySubtypesDocuments(Boolean backwardDeliverySubtypesDocuments) {
		this.backwardDeliverySubtypesDocuments = backwardDeliverySubtypesDocuments;
	}

	@JsonProperty("AfterpaymentType")
	public String getAfterpaymentType() {
		return afterpaymentType;
	}

	@JsonProperty("AfterpaymentType")
	public void setAfterpaymentType(String afterpaymentType) {
		this.afterpaymentType = afterpaymentType;
	}

	@JsonProperty("HaveMoneyWallets")
	public Boolean getHaveMoneyWallets() {
		return haveMoneyWallets;
	}

	@JsonProperty("HaveMoneyWallets")
	public void setHaveMoneyWallets(Boolean haveMoneyWallets) {
		this.haveMoneyWallets = haveMoneyWallets;
	}

	@Override
	public String toString() {
		return "CounterpartyOptions{" +
				"fillingWarranty=" + fillingWarranty +
				", addressDocumentDelivery=" + addressDocumentDelivery +
				", canPayTheThirdPerson=" + canPayTheThirdPerson +
				", canAfterpaymentOnGoodsCost=" + canAfterpaymentOnGoodsCost +
				", canNonCashPayment=" + canNonCashPayment +
				", canCreditDocuments=" + canCreditDocuments +
				", canEWTransporter=" + canEWTransporter +
				", canSignedDocuments=" + canSignedDocuments +
				", hideDeliveryCost=" + hideDeliveryCost +
				", blockInternationalSenderLKK=" + blockInternationalSenderLKK +
				", canSameDayDelivery=" + canSameDayDelivery +
				", canSameDayDeliveryStandart=" + canSameDayDeliveryStandart +
				", canForwardingService=" + canForwardingService +
				", showDeliveryByHand=" + showDeliveryByHand +
				", deliveryByHand=" + deliveryByHand +
				", loyaltyProgram=" + loyaltyProgram +
				", descentFromFloor=" + descentFromFloor +
				", backDeliveryValuablePapers=" + backDeliveryValuablePapers +
				", backwardDeliverySubtypesDocuments=" + backwardDeliverySubtypesDocuments +
				", afterpaymentType='" + afterpaymentType + '\'' +
				", haveMoneyWallets=" + haveMoneyWallets +
				'}';
	}
}