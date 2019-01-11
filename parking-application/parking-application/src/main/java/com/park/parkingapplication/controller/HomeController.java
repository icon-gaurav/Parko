/**
 * 
 */
package com.park.parkingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.park.parkingapplication.command.CustomerCommand;
import com.park.parkingapplication.model.Customer;
import com.park.parkingapplication.model.Maintenance;
import com.park.parkingapplication.model.Message;
import com.park.parkingapplication.model.Parking;
import com.park.parkingapplication.model.Washing;
import com.park.parkingapplication.service.CompanyService;
import com.park.parkingapplication.service.CustomerService;
import com.park.parkingapplication.service.MaintenanceService;
import com.park.parkingapplication.service.ParkingService;
import com.park.parkingapplication.service.WashingService;

/**
 * @author Gaurav Kumar
 *
 */
@Controller
public class HomeController {

	private ParkingService parkingService;
	private CompanyService companyService;
	private WashingService washingService;
	private MaintenanceService maintenanceService;
	private CustomerService customerService;

	@Autowired
	public void setParkingService(ParkingService parkingService) {
		this.parkingService = parkingService;
	}

	@Autowired
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}

	@Autowired
	public void setWashingService(WashingService washingService) {
		this.washingService = washingService;
	}

	@Autowired
	public void setMaintenanceService(MaintenanceService maintenanceService) {
		this.maintenanceService = maintenanceService;
	}

	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

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

	@RequestMapping("/location")
	public String myLocation(Model model) {
		// get my location
		// pass as parameter to function get relevant result
		List<Parking> parkingList = this.parkingService.findAll();
		List<Washing> washingList = this.washingService.findAll();
		List<Maintenance> maintenanceList = this.maintenanceService.findAll();
		model.addAttribute("parkingList", parkingList);
		model.addAttribute("washingList", washingList);
		model.addAttribute("maintenanceList", maintenanceList);
		return "location";
	}

	@RequestMapping("/signup")
	public String signUp(Model model) {
		model.addAttribute("customer", new CustomerCommand());
		return "signup";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String logIn() {
		return null;
	}
}
