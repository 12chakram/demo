/**
 * 
 */
package com.demo.dao;

import java.util.List;

import com.demo.entities.Item;



/**
 * @author katsi02
 *
 */
public interface ItemDao {

	public List<Item> findAll();
	
	public Item create(Item item);
	
	public Item findItemById(Long itemID);

	public Item update(Item item);
	
	public boolean remove(Long itemID);
	
}
