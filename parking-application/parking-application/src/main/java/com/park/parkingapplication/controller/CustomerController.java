/**
 * 
 */
package com.park.parkingapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.park.parkingapplication.command.CustomerCommand;
import com.park.parkingapplication.model.Customer;
import com.park.parkingapplication.service.CustomerService;

/**
 * @author Gaurav Kumar
 *
 */
@Controller
public class CustomerController {
	private static final String CUSTOMERFORM_URL = "signup";
	private CustomerService customerService;

	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping(value = "/newCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") CustomerCommand customerCommand,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			bindingResult.getAllErrors().forEach(error -> System.out.println(error.toString()));
			return CUSTOMERFORM_URL;
		}
		CustomerCommand savedCommand = customerService.saveCustomerCommand(customerCommand);
		return "redirect:customer/" + savedCommand.getUsername() + "/show";
	}

	@RequestMapping(value = "/login")
	public String login(Model model) {
		model.addAttribute("user", new Customer());
		return "login";
	}

	@RequestMapping(value = "/customer/{userName}/show", method = RequestMethod.GET)
	public String showByUserName(@PathVariable String userName, Model model) {
		CustomerCommand user = customerService.findCommandByUserName(userName);
		model.addAttribute("user", user);
		return "user-details";
	}

}
