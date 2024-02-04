package CardSalesPoint.PointOfSales.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

@Entity
public class Card  implements Serializable{
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private int id;
	private String name;
	private String imageUrl;
	private String cardCondition;
	private String type;
	private Double price;
	
	public Card() {
		
	}
	
	public Card(int id, String name, String imgUrl, String cardCondition, String type, Double price) {
		this.id = id;
		this.name = name;
		imageUrl = imgUrl;
		this.cardCondition = cardCondition;
		this.type = type;
		this.price = price;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imgUrl) {
		imageUrl = imgUrl;
	}
	public String getCardCondition() {
		return cardCondition;
	}
	public void setCardCondition(String cardCondition) {
		this.cardCondition = cardCondition;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Card [id=" + id + ", name=" + name + ", ImageUrl=" + imageUrl + ", cardCondition=" + cardCondition + ", type=" + type
				+ ", price=" + price + "]";
	}
	
	

}
