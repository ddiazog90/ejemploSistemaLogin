package model;

import libreriaVersion3.generic;

public class product {
	private generic<String,Integer>dt1_p;
	private generic<Double,?>dt2_p;
	public product() {
		dt1_p=new generic<>();
		dt2_p=new generic<>();
	}
	public product(int id, String name_product, String description, int stock, double price) {
		dt1_p=new generic<>(name_product,description,id,stock);
		dt2_p=new generic<>(price);
	}
	//getters and setters
	public String getNameProduct() {
		return dt1_p.getAttribute1();
	}
	public String getDescription() {
		return dt1_p.getAttribute2();
	}
	public int getIdProduct() {
		return dt1_p.getAttribute3();
	}
	public int getStock() {
		return dt1_p.getAttribute4();
	}
	public double getPrice() {
		return dt2_p.getAttribute1();
	}
	public void setNameProduct(String name_) {
		dt1_p.setAttribute1(name_);
	}
	public void setDescription(String description) {
		dt1_p.setAttribute2(description);
	}
	public void setIdProduct(int id) {
		dt1_p.setAttribute3(id);
	}
	public void setStock(int stock) {
		dt1_p.setAttribute4(stock);
	}
	public void setPrice(double price) {
		dt2_p.setAttribute1(price);
	}
	public String informationProduct() {
		return String.format("%d;%s;%s;%d;%.2f", 
							getIdProduct(),
							getNameProduct(),
							getDescription(),
							getStock(),
							getPrice());
	}
	public product getProduct(String informationProduct) {
		String [] ip=informationProduct.split(";");
		this.setIdProduct(Integer.parseInt(ip[0]));
		this.setNameProduct(ip[1]);
		this.setDescription(ip[2]);
		this.setStock(Integer.parseInt(ip[3]));
		this.setPrice(Double.parseDouble(ip[4]));
		return this;
	}








}
