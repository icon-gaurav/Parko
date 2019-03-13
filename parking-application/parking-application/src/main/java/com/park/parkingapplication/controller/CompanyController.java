/**
 * 
 */
package com.park.parkingapplication.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.park.parkingapplication.command.CompanyCommand;
import com.park.parkingapplication.model.Address;
import com.park.parkingapplication.model.Category;
import com.park.parkingapplication.model.Company;
import com.park.parkingapplication.model.Status;
import com.park.parkingapplication.service.CompanyService;

/**
 * @author Gaurav Kumar
 *
 */

@Controller
public class CompanyController {
	private CompanyService companyService;

	public CompanyController(CompanyService companyService) {
		this.companyService = companyService;
	}

	@RequestMapping("/{CIN}")
	public String getCompanyByCIN(@PathVariable String CIN) {
		Company company = this.companyService.findById(CIN);
		return company.toString();
	}

	@RequestMapping(value = "/companies")
	public List<Company> getCompanies() {
		return this.companyService.findAll();
	}

	@RequestMapping(value = "/welcome")
	public String welcome(Model model) {
		Company company = new Company();
		company.setId("U72200DL2001PTC111183");
		company.setName("Ebiz.com Private Limited");
		company.setCategory(null);
		company.setStatus(Status.ACTIVE);
		Address address = new Address();
		company.setAddress(address);
		model.addAttribute("company", company);
		return "parking";
	}

	@RequestMapping(value = "/add/company", method = RequestMethod.POST)
	public String addCompany(@ModelAttribute("newCompany") CompanyCommand companyCommand, Model model) {
		CompanyCommand savedCommand = companyService.saveCompanyCommand(companyCommand);
		model.addAttribute("company", savedCommand);
		return "redirect:/company/" + savedCommand.getId() + "/show";
	}

	@RequestMapping(value = "/company/{companyid}/show", method = RequestMethod.GET)
	public String showCompany(@PathVariable("companyid") String companyid, Model model) {
		Company company = companyService.findById(companyid);
		model.addAttribute("company", company);
		return "company-view";
	}
}
