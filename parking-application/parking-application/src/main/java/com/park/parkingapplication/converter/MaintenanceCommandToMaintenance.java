/**
 * 
 */
package com.park.parkingapplication.converter;

import org.springframework.core.convert.converter.Converter;

import com.park.parkingapplication.command.MaintenanceCommand;
import com.park.parkingapplication.model.Maintenance;

/**
 * @author Gaurav Kumar
 *
 */
public class MaintenanceCommandToMaintenance implements Converter<MaintenanceCommand, Maintenance> {

	@Override
	public Maintenance convert(MaintenanceCommand source) {
		if (source == null)
			return null;

		Maintenance maintenance = new Maintenance();
		maintenance.setId(source.getId());
		maintenance.setResponseTime(source.getResponseTime());
		maintenance.setRate(source.getRate());
		maintenance.setDoorstep(source.getDoorstep());
		maintenance.setRating(source.getRating());

		return maintenance;
	}

}
