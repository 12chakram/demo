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
	public String showDashboard(Model model) {
		model.addAttribute("myname", "KumarVayyala");
		return "dashboard";
	}
	
	
	@RequestMapping(value="/addItem",method = RequestMethod.GET)
	public String showItemAddPage(Model model) {
		model.addAttribute("myname", "KumarVayyala");
		return "addItem";
	}
	
	
}

