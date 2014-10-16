/**
 * 
 */
package com.demo.web.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entities.Item;
import com.demo.services.ItemService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author Kumar Vayyala
 *
 */
@Controller
@RequestMapping(value="/item")
public class ItemController 
 {
	
   private static ItemService itemService;
	
	@Autowired
	public void setItemService(ItemService itemService) {
		ItemController.itemService = itemService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showItemAddPage(Model model) {
		model.addAttribute("myname", "KumarVayyala");
		return "addItempage";
	}

	/*@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addItemAddPage(@RequestParam("itemName") String itemName,
			@RequestParam("itemType") String itemType,
			@RequestParam("description") String description,
			@RequestParam("checkInDate") String checkInDate,
			@RequestParam("PMDueDate") String PMDueDate,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {

		System.out.println("***************************");
		System.out.println(itemName);
		System.out.println(itemType);
		System.out.println(description);
		System.out.println(checkInDate);
		System.out.println(PMDueDate);

		model.addAttribute("myname", "KumarVayyala");
		return "showItems";
	}
*/	
	
	@RequestMapping(value="/create", method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Item createItem(@RequestBody String string) {
		
		System.out.println(string);
	
	       ObjectMapper mapper = new ObjectMapper();
          Item item = null;
		try {
			item = mapper.readValue(string,Item.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(item!=null){
			item = itemService.createItem(item);
		}
        return item;
    }
	
	@RequestMapping(value="/all",method = RequestMethod.GET)
	public String showAllItems(Model model) {
		
		List<Item> allItems = itemService.getAllItems();
		model.addAttribute("allItems", allItems);
		return "allItems";
	}
	
	

}

