/**
 * 
 */
package com.park.parkingapplication.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.park.parkingapplication.command.AddressCommand;
import com.park.parkingapplication.command.CompanyCommand;
import com.park.parkingapplication.model.Company;

/**
 * @author Gaurav Kumar
 *
 */
@Component
public class CompanyToCompanyCommand implements Converter<Company, CompanyCommand> {

	@Override
	public CompanyCommand convert(Company source) {
		if (source == null)
			return null;

		CompanyCommand companyCommand = new CompanyCommand();
		AddressToAddressCommand addressToAddressCommand = new AddressToAddressCommand();
		companyCommand.setId(source.getId());
		companyCommand.setCategory(source.getCategory());
		companyCommand.setName(source.getName());
		companyCommand.setOpenTime(source.getOpenTime().toString());
		companyCommand.setCloseTime(source.getCloseTime().toString());
		companyCommand.setStatus(source.getStatus());
		companyCommand.setDescription(source.getDescription());
		AddressCommand addressCommand = addressToAddressCommand.convert(source.getAddress());
		companyCommand.setAddressCommand(addressCommand);

		return companyCommand;
	}

}
