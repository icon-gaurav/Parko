/**
 * 
 */
package com.park.parkingapplication.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.park.parkingapplication.command.QueryCommand;
import com.park.parkingapplication.model.Query;

/**
 * @author Gaurav Kumar
 *
 */
@Component
public class QueryCommandToQuery implements Converter<QueryCommand, Query> {

	@Nullable
	@Override
	public Query convert(QueryCommand source) {
		if (source == null)
			return null;
		final Query query = new Query();
		query.setId(source.getId());
		query.setValue(source.getValue());
		return query;
	}

}
