package com.demo.services;

import java.util.List;

import com.demo.entities.Item;

public interface ItemService {
	
	public Item getItemById(Long itemId);
	
	public Item getItemByName (String itemName);
	
	public Item createItem(Item item);
	
	public Item updateItem(Item item);
	
	public boolean deleteItem(Long itemId);
	
	public List<Item> getAllItems();

}
