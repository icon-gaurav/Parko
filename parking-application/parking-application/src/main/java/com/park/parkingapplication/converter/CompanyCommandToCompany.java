/**
 * 
 */
package com.park.parkingapplication.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.park.parkingapplication.command.AddressCommand;
import com.park.parkingapplication.command.CompanyCommand;
import com.park.parkingapplication.converter.AddressCommandToAddress;
import com.park.parkingapplication.model.Address;
import com.park.parkingapplication.model.Company;

/**
 * @author Gaurav Kumar
 *
 */
@Component
public class CompanyCommandToCompany implements Converter<CompanyCommand, Company> {

	@Override
	public Company convert(CompanyCommand source) {
		if (source == null)
			return null;
		Company company = new Company();
		AddressCommand addressCommand = source.getAddressCommand();
		AddressCommandToAddress addressCommandToAddress = new AddressCommandToAddress();
		company.setId(source.getId());
		company.setCategory(source.getCategory());
		company.setName(source.getName());
		company.setOpenTime(source.getOpenTime());
		company.setCloseTime(source.getCloseTime());
		company.setStatus(source.getStatus());
		company.setDescription(source.getDescription());
		Address address = addressCommandToAddress.convert(addressCommand);
		company.setAddress(address);

		return company;
	}

}
