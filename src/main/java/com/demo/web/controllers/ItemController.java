/**
 * 
 */
package com.demo.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public String addItemAddPage(Model model) {
		model.addAttribute("myname", "KumarVayyala");
		return "showItems";
	}
	
	
}

