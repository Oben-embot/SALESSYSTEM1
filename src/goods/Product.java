package goods;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private long barCode;
	private double price;
	private String manufacturedDate;
	private String expiringDate;
	private String type;

	public Product() {
	}

	public Product(String name, long barCode, double price, String manufacturedDate, String expiringDate, String type) {
		super();
		this.name = name;
		this.barCode = barCode;
		this.price = price;
		this.manufacturedDate = manufacturedDate;
		this.expiringDate = expiringDate;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBarCode() {
		return barCode;
	}

	public void setBarCode(long barCode) {
		this.barCode = barCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public String getExpiringDate() {
		return expiringDate;
	}

	public void setExpiringDate(String expiringDate) {
		this.expiringDate = expiringDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void addStocks(String name, long barCode, double price, String manufacturedDate, String expiringDate,
			String type) {
		this.setName(name);
		this.setBarCode(barCode);
		this.setPrice(price);
		this.setManufacturedDate(manufacturedDate);
		this.setExpiringDate(expiringDate);
		this.setType(type);

	}// end of product method();

	public void avaliableStocks(List<Product> products) {
		System.out.println("Avaliable Stocks");
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i) != null) {
				System.out.println(i + ".Name: " + products.get(i).getName());
				System.out.println(i + ".Bar code: " + products.get(i).getBarCode());
				System.out.println(i + ".Price: " + products.get(i).getPrice());
				System.out.println(i + ".Manufactured date: " + products.get(i).getManufacturedDate());
				System.out.println(i + ".Expiring date: " + products.get(i).getExpiringDate());
				System.out.println(i + ".Type: " + products.get(i).getType());

			} // end of if statement
		} // end of for loop for avaliableStocks
	}// end of avaliableStock method();

	public String toString() {
		return "Product [name=" + name + ",  barCode=" + barCode + ", price=" + price + ", manufacturedDate="
				+ manufacturedDate + ", expiringDate=" + expiringDate + ", type=" + type + "]";
	}// end of toStringMehod();

}// end of class
