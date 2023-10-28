package com.logbasex.rest_number;

import org.bson.types.ObjectId;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface IsbnNumbersMapper {
	
	@Mapping(source = "isbn10", target = "isbn10")
	@Mapping(source = "isbn13", target = "isbn13")
	@Mapping(source = "id", target = "id", qualifiedByName = "objectToId")
	IsbnNumbersResponse toDto(IsbnNumbers isbnNumbers);
	
	/**
	 * <a href="https://github.com/mapstruct/mapstruct/issues/3417">...</a>
	 */
	@Named("objectToId")
	static String objectToId(ObjectId id) {
		return id.toString();
	}
}
