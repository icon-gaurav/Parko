/**
 * 
 */
package com.park.parkingapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.park.parkingapplication.model.Message;

/**
 * @author Gaurav Kumar
 *
 */
@Controller
public class HomeController {

	@RequestMapping({ "/", "/home" })
	public String home(Model model) {
		model.addAttribute("message", new Message());
		return "home";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@RequestParam("searchBox") String searchBox) {
		return "parking";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String contactForm(@ModelAttribute(value = "message") Message message) {
		// Save message to DB
		System.out.println(message);
		return "contact-form-submitted";
	}

	@RequestMapping("/services")
	public String services() {
		return "service";
	}

	@RequestMapping("/services/washing")
	public String washing() {
		return "washing";
	}

	@RequestMapping("/parking")
	public String parking() {
		return "parking";
	}

}
