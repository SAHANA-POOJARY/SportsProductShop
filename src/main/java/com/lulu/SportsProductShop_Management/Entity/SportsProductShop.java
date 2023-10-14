package com.lulu.SportsProductShop_Management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table (name="SportsProducts")
public class SportsProductShop {
	@Id
	int id;
	String productname;
	int cost ;
	String date_of_purchase;
	String deliveey_date;
	String feedback_of_customer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getDate_of_purchase() {
		return date_of_purchase;
	}
	public void setDate_of_purchase(String date_of_purchase) {
		this.date_of_purchase = date_of_purchase;
	}
	public String getDeliveey_date() {
		return deliveey_date;
	}
	public void setDeliveey_date(String deliveey_date) {
		this.deliveey_date = deliveey_date;
	}
	public String getFeedback_of_customer() {
		return feedback_of_customer;
	}
	public void setFeedback_of_customer(String feedback_of_customer) {
		this.feedback_of_customer = feedback_of_customer;
	}
	@Override
	public String toString() {
		return "SportsProductShop [id=" + id + ", productname=" + productname + ", cost=" + cost + ", date_of_purchase="
				+ date_of_purchase + ", deliveey_date=" + deliveey_date + ", feedback_of_customer="
				+ feedback_of_customer + "]";
	}
	public SportsProductShop(int id, String productname, int cost, String date_of_purchase, String deliveey_date,
			String feedback_of_customer) {
		super();
		this.id = id;
		this.productname = productname;
		this.cost = cost;
		this.date_of_purchase = date_of_purchase;
		this.deliveey_date = deliveey_date;
		this.feedback_of_customer = feedback_of_customer;
	}
	public SportsProductShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
