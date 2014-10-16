package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS")
public class Item {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long itemId;
	
	private String itemName;
	
	private String itemType;
	
	private String description;
	
	private String checkInDate;
	
	private String pMDueDate;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getpMDueDate() {
		return pMDueDate;
	}

	public void setpMDueDate(String pMDueDate) {
		this.pMDueDate = pMDueDate;
	}
	
	
}
