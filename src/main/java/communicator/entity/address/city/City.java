package communicator.entity.address.city;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by Morozov Oleksandr on 29.11.2016.
 * 414D
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"Description",
		"DescriptionRu",
		"Ref",
		"Delivery1",
		"Delivery2",
		"Delivery3",
		"Delivery4",
		"Delivery5",
		"Delivery6",
		"Delivery7",
		"Area",
		"Conglomerates"
})
public class City {

	@JsonProperty("Description")
	private String description;
	@JsonProperty("DescriptionRu")
	private String descriptionRu;
	@JsonProperty("Ref")
	private String ref;
	@JsonProperty("Delivery1")
	private String delivery1;
	@JsonProperty("Delivery2")
	private String delivery2;
	@JsonProperty("Delivery3")
	private String delivery3;
	@JsonProperty("Delivery4")
	private String delivery4;
	@JsonProperty("Delivery5")
	private String delivery5;
	@JsonProperty("Delivery6")
	private String delivery6;
	@JsonProperty("Delivery7")
	private String delivery7;
	@JsonProperty("Area")
	private String area;
	@JsonProperty("Conglomerates")
	private Object conglomerates;

	/**
	 *
	 * @return
	 * The description
	 */
	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}

	/**
	 *
	 * @param description
	 * The Description
	 */
	@JsonProperty("Description")
	public void setDescription(String description) {
		this.description = description;
	}

	public City withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 *
	 * @return
	 * The descriptionRu
	 */
	@JsonProperty("DescriptionRu")
	public String getDescriptionRu() {
		return descriptionRu;
	}

	/**
	 *
	 * @param descriptionRu
	 * The DescriptionRu
	 */
	@JsonProperty("DescriptionRu")
	public void setDescriptionRu(String descriptionRu) {
		this.descriptionRu = descriptionRu;
	}

	public City withDescriptionRu(String descriptionRu) {
		this.descriptionRu = descriptionRu;
		return this;
	}

	/**
	 *
	 * @return
	 * The ref
	 */
	@JsonProperty("Ref")
	public String getRef() {
		return ref;
	}

	/**
	 *
	 * @param ref
	 * The Ref
	 */
	@JsonProperty("Ref")
	public void setRef(String ref) {
		this.ref = ref;
	}

	public City withRef(String ref) {
		this.ref = ref;
		return this;
	}

	/**
	 *
	 * @return
	 * The delivery1
	 */
	@JsonProperty("Delivery1")
	public String getDelivery1() {
		return delivery1;
	}

	/**
	 *
	 * @param delivery1
	 * The Delivery1
	 */
	@JsonProperty("Delivery1")
	public void setDelivery1(String delivery1) {
		this.delivery1 = delivery1;
	}

	public City withDelivery1(String delivery1) {
		this.delivery1 = delivery1;
		return this;
	}

	/**
	 *
	 * @return
	 * The delivery2
	 */
	@JsonProperty("Delivery2")
	public String getDelivery2() {
		return delivery2;
	}

	/**
	 *
	 * @param delivery2
	 * The Delivery2
	 */
	@JsonProperty("Delivery2")
	public void setDelivery2(String delivery2) {
		this.delivery2 = delivery2;
	}

	public City withDelivery2(String delivery2) {
		this.delivery2 = delivery2;
		return this;
	}

	/**
	 *
	 * @return
	 * The delivery3
	 */
	@JsonProperty("Delivery3")
	public String getDelivery3() {
		return delivery3;
	}

	/**
	 *
	 * @param delivery3
	 * The Delivery3
	 */
	@JsonProperty("Delivery3")
	public void setDelivery3(String delivery3) {
		this.delivery3 = delivery3;
	}

	public City withDelivery3(String delivery3) {
		this.delivery3 = delivery3;
		return this;
	}

	/**
	 *
	 * @return
	 * The delivery4
	 */
	@JsonProperty("Delivery4")
	public String getDelivery4() {
		return delivery4;
	}

	/**
	 *
	 * @param delivery4
	 * The Delivery4
	 */
	@JsonProperty("Delivery4")
	public void setDelivery4(String delivery4) {
		this.delivery4 = delivery4;
	}

	public City withDelivery4(String delivery4) {
		this.delivery4 = delivery4;
		return this;
	}

	/**
	 *
	 * @return
	 * The delivery5
	 */
	@JsonProperty("Delivery5")
	public String getDelivery5() {
		return delivery5;
	}

	/**
	 *
	 * @param delivery5
	 * The Delivery5
	 */
	@JsonProperty("Delivery5")
	public void setDelivery5(String delivery5) {
		this.delivery5 = delivery5;
	}

	public City withDelivery5(String delivery5) {
		this.delivery5 = delivery5;
		return this;
	}

	/**
	 *
	 * @return
	 * The delivery6
	 */
	@JsonProperty("Delivery6")
	public String getDelivery6() {
		return delivery6;
	}

	/**
	 *
	 * @param delivery6
	 * The Delivery6
	 */
	@JsonProperty("Delivery6")
	public void setDelivery6(String delivery6) {
		this.delivery6 = delivery6;
	}

	public City withDelivery6(String delivery6) {
		this.delivery6 = delivery6;
		return this;
	}

	/**
	 *
	 * @return
	 * The delivery7
	 */
	@JsonProperty("Delivery7")
	public String getDelivery7() {
		return delivery7;
	}

	/**
	 *
	 * @param delivery7
	 * The Delivery7
	 */
	@JsonProperty("Delivery7")
	public void setDelivery7(String delivery7) {
		this.delivery7 = delivery7;
	}

	public City withDelivery7(String delivery7) {
		this.delivery7 = delivery7;
		return this;
	}

	/**
	 *
	 * @return
	 * The area
	 */
	@JsonProperty("Area")
	public String getArea() {
		return area;
	}

	/**
	 *
	 * @param area
	 * The Area
	 */
	@JsonProperty("Area")
	public void setArea(String area) {
		this.area = area;
	}

	public City withArea(String area) {
		this.area = area;
		return this;
	}

	/**
	 *
	 * @return
	 * The conglomerates
	 */
	@JsonProperty("Conglomerates")
	public Object getConglomerates() {
		return conglomerates;
	}

	/**
	 *
	 * @param conglomerates
	 * The Conglomerates
	 */
	@JsonProperty("Conglomerates")
	public void setConglomerates(Object conglomerates) {
		this.conglomerates = conglomerates;
	}

	public City withConglomerates(Object conglomerates) {
		this.conglomerates = conglomerates;
		return this;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

