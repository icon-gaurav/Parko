/**
 * 
 */
package com.park.parkingapplication.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
		company.setCategory(Category.BIKE);
		company.setStatus(Status.ACTIVE);
		Address address = new Address();
		company.setAddress(address);
		model.addAttribute("company", company);
		return "parking";
	}
}
