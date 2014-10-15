package com.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entities.Item;

@Repository
@Transactional
public class JpaItemDaoImpl implements ItemDao 
{
	@PersistenceContext
	private EntityManager em;

	
	@Override
	@Transactional(readOnly=true)
	public List<Item> findAll() {
		return em.createQuery("select i from Item u", Item.class).getResultList();
	}

	@Override
	public Item create(Item item) {
		if(item.getItemId() <= 0){
			em.persist(item);
		} else {
			item = em.merge(item);
		}
		return item;
	}


	@Override
	@Transactional(readOnly=true)
	public Item findItemById(Long itemID) {

		return em.find(Item.class, itemID);
	}

	@Override
	public Item update(Item item) {
	  return item = em.merge(item);
	}

	@Override
	public boolean remove(Long itemID) {
		
		boolean removed =false;
		try{
			em.remove(em.find(Item.class, itemID));
			removed =true;
		}catch(Exception exception){
			System.out.println(exception);
		}
		return removed;
	}
	
}

