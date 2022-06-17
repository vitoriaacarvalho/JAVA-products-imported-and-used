package entities;

public class ImportedProduct extends Product{
	private Double costumsFee;

	public ImportedProduct() {
	}
	public ImportedProduct(String name, Double price, Double costumsFee) {
		super(name, price);
		this.costumsFee = costumsFee;
	}
	public Double getCostumsFee() {
		return costumsFee;
	}

	public void setCostumsFee(Double costumsFee) {
		this.costumsFee = costumsFee;
	}
	public Double totalPrice() {
		return getPrice()+costumsFee;
	}
	
	
	
	
	@Override
	public String priceTag() {
		return getName()
				+"$"
				+totalPrice()
				+String.format(" (Costums Fee: $%.2f)", costumsFee);
	}
	
	
	
	
	
}
