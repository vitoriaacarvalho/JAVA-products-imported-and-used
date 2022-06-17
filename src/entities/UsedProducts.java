package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProducts extends Product{
	
	private static final SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public UsedProducts() {
	}

	public UsedProducts(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufacturedDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String priceTag() {
		return getName()
				+"(used) $ "
				+String.format("%.2f", getPrice())
				+"(manufacture date: "
				+ sdf.format(manufactureDate)
				+")";
	}
	
	
	
}
