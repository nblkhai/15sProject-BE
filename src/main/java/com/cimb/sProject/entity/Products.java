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
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String packageName;
	private int packagePrice;
	private String packageLocation;
	private int packageDuration;
	private String packageDesc;
	private String packageCategory;
	private String packagePhotos;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "transactionDetails_id")
	private TransactionDetails transactionDetails;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Cart> cart;
	
	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name = "category_id")
	private Category category;

	
	public String getPackageCategory() {
		return packageCategory;
	}
	public void setPackageCategory(String packageCategory) {
		this.packageCategory = packageCategory;
	}
	public String getPackagePhotos() {
		return packagePhotos;
	}
	public void setPackagePhotos(String packagePhotos) {
		this.packagePhotos = packagePhotos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public int getPackagePrice() {
		return packagePrice;
	}
	public void setPackagePrice(int packagePrice) {
		this.packagePrice = packagePrice;
	}
	public String getPackageLocation() {
		return packageLocation;
	}
	public void setPackageLocation(String packageLocation) {
		this.packageLocation = packageLocation;
	}
	public int getPackageDuration() {
		return packageDuration;
	}
	public void setPackageDuration(int packageDuration) {
		this.packageDuration = packageDuration;
	}
	public String getPackageDesc() {
		return packageDesc;
	}
	public void setPackageDesc(String packageDesc) {
		this.packageDesc = packageDesc;
	}
}
