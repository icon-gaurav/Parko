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
public class MaintenanceToMaintenanceCommand implements Converter<Maintenance, MaintenanceCommand> {

	@Override
	public MaintenanceCommand convert(Maintenance source) {
		if (source == null)
			return null;

		MaintenanceCommand maintenanceCommand = new MaintenanceCommand();
		maintenanceCommand.setId(source.getId());
		maintenanceCommand.setResponseTime(source.getResponseTime());
		maintenanceCommand.setRate(source.getRate());
		maintenanceCommand.setDoorstep(source.getDoorstep());
		maintenanceCommand.setRating(source.getRating());

		return maintenanceCommand;
	}
}
