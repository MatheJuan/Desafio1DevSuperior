package com.devlpjruan.projetoDevsuperior.models;


public class Orders {
	private int code;
	private double basic;
	private double discount;
	
	
	public Orders() {
		super();
	}
	public Orders(int code, double basic, int discount) {
		super();
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
