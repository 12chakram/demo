/**
 * 
 */
package com.demo.web.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entities.Item;

/**
 * @author Kumar Vayyala
 *
 */
@Controller
@RequestMapping(value="/item")
public class ItemController 
 {

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
		Item item = new Item();
		item.setItemId(1L);
		item.setItemName("Kumar");
		item.setItemType("Vayyala");
		item.setDescription("KumarVayyala");
		item.setCheckInDate("10-14-2014");
		item.setpMDueDate("11-14-2016");
        return item;
    }
	
	@RequestMapping(value="/all",method = RequestMethod.GET)
	public String showAllItems(Model model) {
		System.out.println("kkkkkkkkkkkk");
		return "allItems";
	}
	
	

}

