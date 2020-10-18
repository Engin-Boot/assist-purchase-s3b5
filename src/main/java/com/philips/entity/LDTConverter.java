package com.philips.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;
//import javax.persistence.Converter;
//@Converter(autoApply = true)

public class LDTConverter implements AttributeConverter<LocalDate, Date> {
	
	// application to DB
	// LocalDate into Java.SQL.Date
	@Override
	public Date convertToDatabaseColumn(LocalDate ldt) {
		if( ldt != null )
			return Date.valueOf(ldt) ;
		return null ;
	}

	// DB to application
	// SQL date into LocalDate
	@Override
	public LocalDate convertToEntityAttribute(Date sqldt) {
		if( sqldt != null )
			return sqldt.toLocalDate() ;
		return null;
	}
	
}