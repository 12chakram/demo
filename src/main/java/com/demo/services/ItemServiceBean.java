package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.ItemDao;
import com.demo.entities.Item;
import com.demo.repositories.ItemRepository;

public class ItemServiceBean implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private ItemDao itemDao;
	
	@Override
	public Item getItemById(Long itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getItemByName(String itemName) {
		return itemRepository.findUserByItemName(itemName);
	}

	@Override
	public Item updateItem(Item item) {
		return itemDao.update(item);
	}

	@Override
	public boolean deleteItem(Long itemId) {
		return itemDao.remove(itemId);
	}

	@Override
	public Item createItem(Item item) {
		return itemRepository.save(item);
	}

}
