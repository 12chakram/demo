package com.demo.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Item;


public interface ItemRepository extends JpaRepository<Item, Serializable> {

	
	Item findUserByItemName(String itemName);
}
