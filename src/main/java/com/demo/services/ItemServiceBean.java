package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.ItemDao;
import com.demo.entities.Item;
import com.demo.repositories.ItemRepository;

@Service
@Transactional
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

	@Override
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

}
