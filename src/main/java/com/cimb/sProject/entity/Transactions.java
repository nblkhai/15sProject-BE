package com.cimb.sProject.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int totalPrice;
	private boolean statusPayment;
	private String trasactionDate;
	private String trasactionDateDone;
	
	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transactions", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<TransactionDetails> transansactionDetails;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public boolean isStatusPayment() {
		return statusPayment;
	}
	public void setStatusPayment(boolean statusPayment) {
		this.statusPayment = statusPayment;
	}
	public String getTrasactionDate() {
		return trasactionDate;
	}
	public void setTrasactionDate(String trasactionDate) {
		this.trasactionDate = trasactionDate;
	}
	public String getTrasactionDateDone() {
		return trasactionDateDone;
	}
	public void setTrasactionDateDone(String trasactionDateDone) {
		this.trasactionDateDone = trasactionDateDone;
	}
	
	
}
