package br.com.luciano.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import br.com.caelum.vraptor.Convert;
import br.com.caelum.vraptor.Converter;

@Convert(Date.class)
public class DateConverter implements Converter<Date> {
	//isso altera como o vraptor converte as datas. Aqui ele converte de yyyy-MM-dd para data
	//dessa forma facilita a forma com que eu pego os dados dos input type = date do meu html
	public Date convert(String value, Class<? extends Date> arg1, ResourceBundle arg2) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(value);
		} catch (ParseException e) {
			return null;
		}

	}
}
