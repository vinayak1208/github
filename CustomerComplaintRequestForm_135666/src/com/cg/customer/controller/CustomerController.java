package com.cg.customer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.customer.model.Customer;
import com.cg.customer.service.ICustomerService;


@Controller
public class CustomerController {
	
	@Autowired
	ICustomerService service;
	
	@RequestMapping("/CustomerComplaintForm")
	public String FirstPage(Model model)
	{
		model.addAttribute("cust",new Customer());
		return "CustomerComplaintForm";
	}
	
	@RequestMapping("/success1")
	public String success(@ModelAttribute("cust") @Valid Customer bean,BindingResult result, Model model)
	{
		if(result.hasErrors())
		{
			return "CustomerComplaintForm";
		}
		else
		{
			service.check(bean);
			service.addDetails(bean);
			
		model.addAttribute("key", bean);
		return "success";
		}
	}
	
	@RequestMapping("/checkStatus")
	public String check()
	{
		return "checkstatus";
	}
	
	@RequestMapping("/raiseComplaint")
	public String raise()
	{
		return "redirect:CustomerComplaintForm.obj";
	}
	
	@RequestMapping("/submit")
	public String submit(@RequestParam("complainid") int complainid,Customer bean,Model model)
	{
		bean=service.find(complainid);
		model.addAttribute("key1", bean);
		return "checkstatus";
		
		
	}
	
	

}
